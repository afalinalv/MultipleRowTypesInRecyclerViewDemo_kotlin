package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter.MultipleTypesAdapter
import android.os.Bundle
import android.view.View
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ButtonRowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ImageRowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.TextRowType
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.*

// https://github.com/ziginsider/MultipleRowTypesInRecyclerViewDemo.git
class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var adapter: MultipleTypesAdapter? = null
    var items: MutableList<RowType> = ArrayList()
    var rnd = Random(1337)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView


        //generate data
        for (i in 0..14) {
            when (rnd.nextInt(3)) {
                0 -> items.add(ButtonRowType(this))
                1 -> items.add(ImageRowType("pic # $i"))
                2 -> items.add(
                    TextRowType(
                        "Header $i",
                        "This is text $i"
                    )
                )
            }
        }
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        adapter = MultipleTypesAdapter(items)
        recyclerView!!.adapter = adapter


//        RecyclerView.RecycledViewPool pool = recyclerView.getRecycledViewPool();
//        pool.setMaxRecycledViews();
    }
}