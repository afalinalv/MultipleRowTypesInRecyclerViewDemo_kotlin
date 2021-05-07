package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType
import androidx.recyclerview.widget.RecyclerView.ViewHolder

import android.view.ViewGroup
import android.view.LayoutInflater
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.R
import android.widget.TextView

import android.view.View
import android.widget.Button
import android.widget.ImageView

/**
 * Created by zigin on 15.11.2017.
 */
object ViewHolderFactory {
    fun create(parent: ViewGroup, viewType: Int): ViewHolder? {
        return when (viewType) {
            RowType.BUTTON_ROW_TYPE -> {
                val buttonTypeView =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.row_type_button, parent, false)
                ButtonViewHolder(buttonTypeView)
            }
            RowType.TEXT_ROW_TYPE -> {
                val textTypeView =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.row_type_text, parent, false)
                TextViewHolder(textTypeView)
            }
            RowType.IMAGE_ROW_TYPE -> {
                val imageTypeView =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.row_type_image, parent, false)
                ImageViewHolder(imageTypeView)
            }
            else -> null
        }
    }

    class ButtonViewHolder(itemView: View) : ViewHolder(itemView) {
        var button: Button

        init {
            button = itemView.findViewById<View>(R.id.button) as Button
        }
    }

    class TextViewHolder(itemView: View) : ViewHolder(itemView) {
        var headerTextView: TextView
        var textView1: TextView

        init {
            headerTextView = itemView.findViewById<View>(R.id.header) as TextView
            textView1 = itemView.findViewById<View>(R.id.text) as TextView
        }
    }

    class ImageViewHolder(itemView: View) : ViewHolder(itemView) {
        var imageView: ImageView
        var textView2: TextView

        init {
            imageView = itemView.findViewById<View>(R.id.image) as ImageView
            textView2 = itemView.findViewById<View>(R.id.text_image) as TextView
        }
    }
}