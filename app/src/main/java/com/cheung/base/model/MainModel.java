/*
 *  WHAT Confidential.
 *  OCO Source Materials.
 *  WHAT Equipment Digital Management.
 *  © Copyright WanHe Advanced Technology Ltd. 2019.
 *  The source code for this program is not published or otherwise divested of its trade secrets, irrespective of what has been deposited with the P.R.China Copyright Office.
 */

package com.cheung.base.model;


import com.cheung.base.BaseModel;
import com.cheung.base.contract.MainContract;

public class MainModel extends BaseModel implements MainContract.Model {

    @Override
    public boolean checkName() {
        //请求网络或数据库
        return false;
    }
}
