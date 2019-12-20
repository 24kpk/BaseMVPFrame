/*
 *  WHAT Confidential.
 *  OCO Source Materials.
 *  WHAT Equipment Digital Management.
 *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 */

package com.cheung.base.base;


/**
 * @version: V1.0
 * @createdate: 2019/12/10
 * @author: CHEUNG
 * @description: BasePresenter 业务定义基类
 */
public class BasePresenter<V extends BaseView> {
    protected V mView;

    /**
     * 绑定View，一般在初始化中调用该方法
     *
     * @param view
     */
    public void attachView(V view) {
        this.mView = view;
    }

    /**
     * 解除绑定，一般在onDestroy中调用
     */
    public void detachView() {
        this.mView = null;
    }

    /**
     * 判定View是否绑定
     *
     * @return
     */
    public boolean isViewAttached() {
        return mView != null;
    }
}
