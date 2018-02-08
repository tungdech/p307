package com.room.manager.p307;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Ứng dụng
 * Created by tungts on 2/8/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .name("P307.realm")
                .build();
        Realm.setDefaultConfiguration(config);
    }
}
