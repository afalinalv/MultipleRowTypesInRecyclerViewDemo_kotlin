package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.R;

/**
 * Created by zigin on 15.11.2017.
 */

public class ViewHolderFactory {

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

    public static RecyclerView.ViewHolder create(ViewGroup parent, int viewType) {

        switch (viewType) {
            case RowType.BUTTON_ROW_TYPE:
                View buttonTypeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_button, parent, false);
                return new ViewHolderFactory.ButtonViewHolder(buttonTypeView);

            case RowType.TEXT_ROW_TYPE:
                View textTypeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_text, parent, false);
                return new ViewHolderFactory.TextViewHolder(textTypeView);

            case RowType.IMAGE_ROW_TYPE:
                View imageTypeView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_type_image, parent, false);
                return new ViewHolderFactory.ImageViewHolder(imageTypeView);

            default:
                return null;
        }
    }
}
