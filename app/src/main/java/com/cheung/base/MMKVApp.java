package com.cheung.base;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.cheung.base.greendao.DaoManager;
import com.cheung.base.greendao.gen.DaoSession;
import com.tencent.mmkv.MMKV;

/**
 * @createdate: 2019/12/16
 * @author: CheungChong
 * @description: describe the business of the class.
 */
public class MMKVApp extends Application {
    public static DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        // 设置初始化的根目录
        String rootDir = MMKV.initialize(this);
        Log.i("CHONGZI", "mmkv root: " + rootDir);
        initGreenDao(this);
    }


    private void initGreenDao(Context context)
    {
        DaoManager mManager = DaoManager.getInstance();
        mManager.init(context);
        mDaoSession = mManager.getDaoSession();
    }
}
