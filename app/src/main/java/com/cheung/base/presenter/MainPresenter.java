
package com.cheung.base.presenter;


import com.cheung.base.base.BasePresenter;
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
