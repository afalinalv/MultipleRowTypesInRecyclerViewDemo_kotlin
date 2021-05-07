package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data

import android.content.Context
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.widget.Toast
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory.ButtonViewHolder

import android.view.View

/**
 * Created by zigin on 14.11.2017.
 */
class ButtonRowType(private val context: Context) : RowType {
    val onClickListener: View.OnClickListener
        get() = View.OnClickListener {
            Toast.makeText(context, "Click!", Toast.LENGTH_SHORT).show()
        }
    override val itemViewType: Int
        get() = RowType.Companion.BUTTON_ROW_TYPE

    override fun onBindViewHolder(viewHolder: ViewHolder?) {
        val buttonViewHolder = viewHolder as ButtonViewHolder?
        buttonViewHolder!!.button.setOnClickListener(onClickListener)
    }
}