package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ButtonRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ImageRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.TextRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.R;

/**
 * Created by zigin on 14.11.2017.
 */

public class MultipleTypesAdapter extends RecyclerView.Adapter {

    private List<RowType> dataSet;

    public MultipleTypesAdapter(List<RowType> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public int getItemViewType(int position) {
        if (dataSet.get(position) instanceof ButtonRowType) {
            return RowType.BUTTON_ROW_TYPE;
        } else if (dataSet.get(position) instanceof ImageRowType) {
            return RowType.IMAGE_ROW_TYPE;
        } else if (dataSet.get(position) instanceof TextRowType) {
            return RowType.TEXT_ROW_TYPE;
        } else {
            return -1;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == RowType.BUTTON_ROW_TYPE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_button, parent, false);
            return new ButtonViewHolder(view);
        } else if (viewType == RowType.IMAGE_ROW_TYPE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_image, parent, false);
            return new ImageViewHolder(view);
        } else if (viewType == RowType.TEXT_ROW_TYPE) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_text, parent, false);
            return new TextViewHolder(view);
        } else {
            return null;
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ButtonViewHolder) {
            ((ButtonViewHolder) holder).button.setOnClickListener(((ButtonRowType) dataSet.get(position)).getOnClickListener());
        } else if (holder instanceof ImageViewHolder) {
            ((ImageViewHolder) holder).textView2.setText(((ImageRowType) dataSet.get(position)).getText());
        } else if (holder instanceof TextViewHolder) {
            ((TextViewHolder) holder).headerTextView.setText(((TextRowType) dataSet.get(position)).getHeader());
            ((TextViewHolder) holder).textView1.setText(((TextRowType) dataSet.get(position)).getText());
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ButtonViewHolder extends RecyclerView.ViewHolder {

        public Button button;

        public ButtonViewHolder(View itemView) {
            super(itemView);
            button = (Button) itemView.findViewById(R.id.button);
        }
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {

        public TextView headerTextView;
        public TextView textView1;

        public TextViewHolder(View itemView) {
            super(itemView);
            headerTextView = (TextView) itemView.findViewById(R.id.header);
            textView1 = (TextView) itemView.findViewById(R.id.text);
        }

    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView textView2;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            textView2 = (TextView) itemView.findViewById(R.id.text_image);
        }
    }
}
