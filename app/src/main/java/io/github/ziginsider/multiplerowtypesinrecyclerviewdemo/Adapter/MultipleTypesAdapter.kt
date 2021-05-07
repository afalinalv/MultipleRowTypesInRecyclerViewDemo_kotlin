package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory.create
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType


/**
 * Created by zigin on 14.11.2017.
 */
class MultipleTypesAdapter(private val dataSet: List<RowType>) :
    RecyclerView.Adapter<ViewHolder?>() {
    override fun getItemViewType(position: Int): Int {
        return dataSet[position].itemViewType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return create(parent, viewType)!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        dataSet[position].onBindViewHolder(holder)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}
