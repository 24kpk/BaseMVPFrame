/*
 *
 *  *  WHAT Confidential.
 *  *  OCO Source Materials.
 *  *  WHAT Equipment Digital Management.
 *  *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 *
 */

package com.cheung.base;

import android.os.Bundle;

/**
 * @version: V1.0
 * @createdate: 2019/12/10
 * @author: CHEUNG
 * @description: BaseMvpFragment
 */
public abstract class BaseMvpFragment<T extends BasePresenter> extends BaseFragment implements BaseView {
    protected T mPresenter;

    public abstract void createPresenter();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPresenter();
    }

    @Override
    public void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
