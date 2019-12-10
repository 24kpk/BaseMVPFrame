/*
 *  WHAT Confidential.
 *  OCO Source Materials.
 *  WHAT Equipment Digital Management.
 *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 */

package com.cheung.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
