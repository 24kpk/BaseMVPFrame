/*
 *  WHAT Confidential.
 *  OCO Source Materials.
 *  WHAT Equipment Digital Management.
 *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 */

package com.cheung.base;

import android.os.Bundle;

/**
 * @version: V1.0
 * @createdate: 2019/12/10
 * @author: CHEUNG
 * @description: BaseMvpActivity
 */
public abstract class BaseMvpActivity<T extends BasePresenter> extends BaseActivity implements BaseView {

    protected T mPresenter;

    public abstract void createPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        createPresenter();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
