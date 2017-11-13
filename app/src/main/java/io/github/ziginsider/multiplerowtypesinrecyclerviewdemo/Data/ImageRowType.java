package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

/**
 * Created by zigin on 14.11.2017.
 */

public class ImageRowType implements RowType {

    private String text;

    public ImageRowType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
