package com.example.mayankchauhan.citygallery.FirstRecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mayankchauhan.citygallery.FirstRecycler.CityData;
import com.example.mayankchauhan.citygallery.FirstRecycler.RecyclerAdapterCity;
import com.example.mayankchauhan.citygallery.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapterCity adapterCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        adapterCity = new RecyclerAdapterCity(CityData.getData(),this);
        recyclerView.setAdapter(adapterCity);
    }
}
