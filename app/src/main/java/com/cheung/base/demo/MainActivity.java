package com.cheung.base.demo;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cheung.base.BaseMvpActivity;
import com.cheung.base.contract.MainContract;
import com.cheung.base.presenter.MainPresenter;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainContract.View, View.OnClickListener {
    Button loginBtn;
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
        loginBtn = findViewById(R.id.login);

        loginBtn.setOnClickListener(this);
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                boolean isSec = mPresenter.login("参数1");
                if(isSec) {
                    showToast("TRUE");
                }else {
                    showToast("FALSE");
                }
                break;
        }
    }
}
