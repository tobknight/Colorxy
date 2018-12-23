package com.colorxy.www.colorxy.Library

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.colorxy.www.colorxy.Adapter.ColorAdapter
import com.colorxy.www.colorxy.R
import java.util.ArrayList
import android.R.menu


class ColorLibraryActivity : AppCompatActivity() {

//    例子 以及Kotlin val为read-only 等同于final static / constant
//    private val mData: List<Animal>? = null
//    private val mContext: Context? = null
//    private val mAdapter: AnimalAdapter? = null
//    private val list_animal: ListView? = null


    /**Instance of ColorLibrary*/
    private val colorlibrary: ColorLibrary = ColorLibrary.getInstance();
    /**ColorLibrary Shelf*/
    private val shelf: List<Color> = colorlibrary.shelf;
    /**Context*/
    private var context: Context = this@ColorLibraryActivity
    /**Color Adapter*/
    private var mAdapter: ColorAdapter = ColorAdapter(shelf as ArrayList<Color>?)
    /**List view*/
    private var list_color: ListView = ListView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_library)

//        mContext = this@MainActivity
//        list_animal = findViewById(R.id.list_animal) as ListView
//        mData = LinkedList<Animal>()
//        mData.add(Animal("狗说", "你是狗么?", R.mipmap.ic_icon_dog))
//        mData.add(Animal("牛说", "你是牛么?", R.mipmap.ic_icon_cow))
//        mData.add(Animal("鸭说", "你是鸭么?", R.mipmap.ic_icon_duck))
//        mData.add(Animal("鱼说", "你是鱼么?", R.mipmap.ic_icon_fish))
//        mData.add(Animal("马说", "你是马么?", R.mipmap.ic_icon_horse))
//        mAdapter = AnimalAdapter(mData as LinkedList<Animal>, mContext)
//        list_animal.setAdapter(mAdapter)
        context = this@ColorLibraryActivity
        list_color = findViewById(R.id.list_color) as ListView
        mAdapter = ColorAdapter(shelf as ArrayList<Color>?)
        this.list_color.setAdapter(mAdapter)

    }

    // create an action bar button
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mymenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // handle button activities
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()

        if (id == R.id.mybutton) {
            // do something here
        }
        return super.onOptionsItemSelected(item)
    }
}
