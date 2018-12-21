package com.colorxy.www.colorxy.Library

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.colorxy.www.colorxy.Library.ui.platter.PlatterFragment

class PlatterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.platter_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PlatterFragment.newInstance())
                .commitNow()
        }
    }

}
