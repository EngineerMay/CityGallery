package com.example.mayankchauhan.citygallery.OnClickFamousView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mayankchauhan.citygallery.R;

public class ClickFamousActivity extends AppCompatActivity {

    private RecyclerView recy_vi;
    private FamousRecycler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_famous);
        recy_vi = (RecyclerView) findViewById(R.id.recy_vi);
        recy_vi.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recy_vi.setLayoutManager(layoutManager);
        adapter = new FamousRecycler(FamousPlacesData.getData(),this);
        recy_vi.setAdapter(adapter);

    }
}
