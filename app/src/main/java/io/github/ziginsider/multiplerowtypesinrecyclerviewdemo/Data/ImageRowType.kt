package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data;

import android.support.v7.widget.RecyclerView;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

/**
 * Created by zigin on 14.11.2017.
 */

public class ImageRowType implements RowType {

    private String text;

    public ImageRowType(String text) {
        this.text = text;
    }

    @Override
    public int getItemViewType() {
        return RowType.IMAGE_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.ImageViewHolder imageViewHolder = (ViewHolderFactory.ImageViewHolder) viewHolder;
        imageViewHolder.textView2.setText(text);
    }
}
