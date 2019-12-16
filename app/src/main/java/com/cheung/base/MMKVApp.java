package com.cheung.base;
/*
 *  WHAT Confidential.
 *  OCO Source Materials.
 *  WHAT Equipment Digital Management.
 *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 */

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.tencent.mmkv.MMKV;

/**
 * @createdate: 2019/12/16
 * @author: CheungChong
 * @description: describe the business of the class.
 */
public class MMKVApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Context context = this;
        // 设置初始化的根目录
        String rootDir = MMKV.initialize(this);
        Log.i("CHONGZI", "mmkv root: " + rootDir);

    }
}
