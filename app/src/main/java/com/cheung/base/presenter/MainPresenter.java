/*
 *
 *  *  WHAT Confidential.
 *  *  OCO Source Materials.
 *  *  WHAT Equipment Digital Management.
 *  *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 *
 */

package com.cheung.base.presenter;


import com.cheung.base.BasePresenter;
import com.cheung.base.contract.MainContract;
import com.cheung.base.model.MainModel;


public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private MainContract.Model model;

    public MainPresenter() {
        this.model = new MainModel();
    }

    @Override
    public boolean login(String name) {
        return model.checkName();
    }
}
