
package com.cheung.base.contract;


import com.cheung.base.base.BaseView;

public interface MainContract {

    interface Model {
        boolean checkName();
    }

    interface View extends BaseView {
    }

    interface Presenter {
        boolean login(String name);
    }

}
