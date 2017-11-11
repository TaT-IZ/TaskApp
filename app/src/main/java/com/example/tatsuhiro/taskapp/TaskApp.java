package com.example.tatsuhiro.taskapp;

/**
 * Created by Tatsuhiro on 2017/10/22.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}