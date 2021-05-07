package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory.TextViewHolder

/**
 * Created by zigin on 14.11.2017.
 */
class TextRowType(private val header: String, private val text: String) : RowType {
    override val itemViewType: Int
        get() = RowType.Companion.TEXT_ROW_TYPE

    override fun onBindViewHolder(viewHolder: ViewHolder?) {
        val textViewHolder = viewHolder as TextViewHolder?
        textViewHolder!!.headerTextView.text = header
        textViewHolder.textView1.text = text
    }
}