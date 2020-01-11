package com.example.greendaoexample;

import android.app.Application;
import android.database.sqlite.*;

public class MyApp extends Application {
    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }
    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //创建数据库app.db"
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "app.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
