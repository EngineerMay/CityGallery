package com.example.mayankchauhan.citygallery.OnClickImageView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mayankchauhan.citygallery.R;

public class ClickImageActivity extends AppCompatActivity {

    private RecyclerView re_view;
    private ImageRecycler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_image);

        re_view = (RecyclerView) findViewById(R.id.re_view);
        re_view.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        re_view.setLayoutManager(layoutManager);

        adapter = new ImageRecycler(ImagesListData.getImagee(),this);
        re_view.setAdapter(adapter);

    }
}
