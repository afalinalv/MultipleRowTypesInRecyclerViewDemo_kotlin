package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data;

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

    public String getHeader() {
        return header;
    }

    public String getText() {
        return text;
    }
}
