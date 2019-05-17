package com.yanhua.hotrepair;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
/**
 * Created by king on 2019/5/17.
 */
public class BaseHotRepairApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        MultiDex.install(this);
        super.attachBaseContext(base);
    }
}
