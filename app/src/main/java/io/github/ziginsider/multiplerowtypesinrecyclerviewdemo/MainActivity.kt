package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo

import android.os.Bundle
import android.view.View
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ButtonRowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ImageRowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.TextRowType
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter.MultipleTypesAdapter

// https://ziginsider.github.io/Multiple_Row_Types_In_Recyclerview/
// https://github.com/ziginsider/MultipleRowTypesInRecyclerViewDemo.git

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MultipleTypesAdapter
    var items: MutableList<RowType> = ArrayList()
    var rnd = Random(1337)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView

        //generate data
        for (i in 0..540) {
            when (rnd.nextInt(3)) {
                0 -> items.add(ButtonRowType(this))
                1 -> items.add(ImageRowType("pic # $i"))
                2 -> items.add(TextRowType("Header № $i","This is text № $i"))
            }
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        adapter = MultipleTypesAdapter(items)
        recyclerView.adapter = adapter

//        val pool = recyclerView.recycledViewPool
//        pool.setMaxRecycledViews()

    }
}