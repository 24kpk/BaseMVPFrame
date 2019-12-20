/*
 *
 *  *  WHAT Confidential.
 *  *  OCO Source Materials.
 *  *  WHAT Equipment Digital Management.
 *  *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 *
 */

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
