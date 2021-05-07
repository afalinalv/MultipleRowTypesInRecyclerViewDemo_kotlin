package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory.ImageViewHolder

/**
 * Created by zigin on 14.11.2017.
 */
class ImageRowType(private val text: String) : RowType {
    override val itemViewType: Int
        get() = RowType.Companion.IMAGE_ROW_TYPE

    override fun onBindViewHolder(viewHolder: ViewHolder?) {
        val imageViewHolder = viewHolder as ImageViewHolder?
        imageViewHolder!!.textView2.text = text
    }
}