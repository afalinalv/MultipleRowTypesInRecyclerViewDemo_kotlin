package io.github.ziginsider.multiplerowtypesinrecyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Adapter.MultipleTypesAdapter;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ButtonRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.ImageRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Data.TextRowType;
import io.github.ziginsider.multiplerowtypesinrecyclerviewdemo.Interfaces.RowType;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MultipleTypesAdapter adapter;
    List<RowType> items = new ArrayList<>();
    Random rnd = new Random(1337);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        //generate data
        for (int i = 0; i < 15; i++) {
            switch (rnd.nextInt(3)) {
                case 0 :
                    items.add(new ButtonRowType(this));
                    break;
                case 1 :
                    items.add(new ImageRowType("pic # " + String.valueOf(i)));
                    break;
                case 2 :
                    items.add(new TextRowType("Header " + String.valueOf(i),
                            "This is text " + String.valueOf(i)));
            }
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MultipleTypesAdapter(items);
        recyclerView.setAdapter(adapter);


//        RecyclerView.RecycledViewPool pool = recyclerView.getRecycledViewPool();
//        pool.setMaxRecycledViews();

    }
}
