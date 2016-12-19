package com.neodream.esperamier.h2o;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * 项目名称：H2O
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2016/12/18 16:04
 * 修改人：Administrator
 * 修改时间：2016/12/18 16:04
 * 修改备注：
 */
public class H2oApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
