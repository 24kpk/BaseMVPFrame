package com.cheung.base.demo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.cheung.base.base.BaseMvpActivity;
import com.cheung.base.contract.MainContract;
import com.cheung.base.presenter.MainPresenter;
import com.tencent.mmkv.MMKV;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View, View.OnClickListener {
    @BindView(R.id.view_pager2)
    ViewPager2 viewPager2;

    @BindView(R.id.btn_load)
    Button btnLoad;
    MMKV kv = MMKV.defaultMMKV();
    @Override
    public void createPresenter() {
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        btnLoad.setOnClickListener(this);
        viewPager2.setOrientation(ViewPager2.ORIENTATION_VERTICAL);
        List<String> da = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            da.add("STR:" + i);
        }
        ViewPage2Adapter adapter = new ViewPage2Adapter(da, mContext);
        viewPager2.setAdapter(adapter);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                Log.d("CHONGZI", "第" + position + "页");
                kv.putInt("POSITION",position);
                kv.putString("CHONGZI","第" + position + "页");
            }

        });
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
//        kv.clearAll();
        Log.d("CHONGZI","KEY:CHONGZI  VALUE:"+kv.getString("CHONGZI",""));
//        for (String s : kv.allKeys()) {
//            Log.d("CHONGZI","KEY:"+s +"  VALUE:"+kv.getInt(s,-1));
//            Log.d("CHONGZI","STRING KEY:"+s +"  VALUE:"+kv.getString(s,""));
//        }
//        kv.clearAll();
    }

    class ViewPage2Adapter extends RecyclerView.Adapter<ViewPage2Adapter.PagerViewHolder> {
        private List<String> mDatas;
        private Context context;

        public ViewPage2Adapter(List<String> data, Context context) {
            this.mDatas = data;
            this.context = context;
        }

        @NonNull
        @Override
        public PagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new PagerViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull PagerViewHolder holder, int position) {
            holder.textView.setText(mDatas.get(position));
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        class PagerViewHolder extends RecyclerView.ViewHolder {
            TextView textView;

            public PagerViewHolder(@NonNull View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.item_tv);
            }
        }
    }
}
