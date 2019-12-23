
package com.cheung.base.model;


import com.cheung.base.BaseModel;
import com.cheung.base.contract.MainContract;
import com.cheung.base.greendao.gen.UserDao;

public class MainModel extends BaseModel implements MainContract.Model {

    UserDao userDao;
    public MainModel() {
        userDao = mDaoSession.getUserDao();
    }

    @Override
    public boolean checkName() {
        //请求网络或数据库
        return false;
    }
}
