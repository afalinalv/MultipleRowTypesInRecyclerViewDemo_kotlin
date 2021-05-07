package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

/**
 * Created by zigin on 14.11.2017.
 */

public class ButtonRowType implements RowType {

    private Context context;

    public ButtonRowType(Context context) {
        this.context = context;
    }

    public View.OnClickListener getOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    public int getItemViewType() {
        return RowType.BUTTON_ROW_TYPE;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder) {
        ViewHolderFactory.ButtonViewHolder buttonViewHolder = (ViewHolderFactory.ButtonViewHolder) viewHolder;
        buttonViewHolder.button.setOnClickListener(getOnClickListener());
    }
}
