package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data;

import android.support.v7.widget.RecyclerView;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

/**
 * Created by zigin on 14.11.2017.
 */

public class TextRowType implements RowType {

    private String header;
    private String text;

    public TextRowType(String header, String text) {
        this.header = header;
        this.text = text;
    }

    @Override
    public int getItemViewType() {
        return RowType.TEXT_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.TextViewHolder textViewHolder = (ViewHolderFactory.TextViewHolder) viewHolder;
        textViewHolder.headerTextView.setText(header);
        textViewHolder.textView1.setText(text);
    }
}
