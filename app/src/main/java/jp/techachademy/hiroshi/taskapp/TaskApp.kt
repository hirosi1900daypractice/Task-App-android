package jp.techachademy.hiroshi.taskapp

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class TaskApp: Application() {
    override fun onCreate(){
        super.onCreate()
        Realm.init(this)
    }

}