package com.example.mayankchauhan.citygallery.Mumbai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayankchauhan.citygallery.Delhi.DelhiMain;
import com.example.mayankchauhan.citygallery.OnClickFamousView.ClickFamousActivity;
import com.example.mayankchauhan.citygallery.OnClickImageView.ClickImageActivity;
import com.example.mayankchauhan.citygallery.R;

public class MumbaiMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView mum_img;
    private TextView mum_text;
    private Button mum_butt1;
    private Button mum_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_main);

        mum_img = (ImageView) findViewById(R.id.mum_img);
        mum_butt2= (Button) findViewById(R.id.mum_butt2);
        mum_butt2.setOnClickListener(this);
        mum_text= (TextView) findViewById(R.id.mum_text);
        mum_butt1 = (Button) findViewById(R.id.mum_butt1);
        mum_butt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent;

        switch (v.getId())
        {
            case R.id.mum_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.mum_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }
    }
}
