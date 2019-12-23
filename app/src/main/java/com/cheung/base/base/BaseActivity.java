
package com.cheung.base.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * @version: V1.0
 * @createdate: 2019/12/10
 * @author: CHEUNG
 * @description: BaseActivity
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        int layoutId = getLayoutId();
        setContentView(layoutId);
        initView();
    }

    public abstract int getLayoutId();

    public abstract void initView();

}
