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
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Factory.ViewHolderFactory;
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
        return dataSet.get(position).getItemViewType();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return ViewHolderFactory.create(parent, viewType);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        dataSet.get(position).onBindViewHolder(holder);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
