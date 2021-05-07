package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces

import androidx.recyclerview.widget.RecyclerView.ViewHolder

/**
 * Created by zigin on 13.11.2017.
 */
interface RowType {
    val itemViewType: Int
    fun onBindViewHolder(viewHolder: ViewHolder?)

    companion object {
        const val BUTTON_ROW_TYPE = 0
        const val IMAGE_ROW_TYPE = 1
        const val TEXT_ROW_TYPE = 2
    }
}