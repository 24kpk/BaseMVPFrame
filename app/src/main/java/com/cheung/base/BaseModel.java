
package com.cheung.base;

import com.cheung.base.greendao.gen.DaoSession;

/**
 * @version: V1.0
 * @createdate: 2019/12/10
 * @author: CHEUNG
 * @description: BaseModel 可在此初始化业务数据层的初始化
 */
public class BaseModel {
    public final int SQL_PARAMS_PAGE_SIZE_20 = 20;
    public DaoSession mDaoSession;

    public BaseModel() {
        mDaoSession = MMKVApp.mDaoSession;
    }
}
