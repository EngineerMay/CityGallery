package com.example.mayankchauhan.citygallery.Ahmedabad;

import android.content.Intent;
import android.media.Image;
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

public class AhmedabadMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView ahm_img;
    private TextView ahm_text;
    private Button ahm_butt1;
    private Button ahm_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedabad_main);

        ahm_img = (ImageView) findViewById(R.id.ahm_img);
        ahm_text = (TextView) findViewById(R.id.ahm_text);
        ahm_butt1 = (Button) findViewById(R.id.ahm_butt1);
        ahm_butt1.setOnClickListener(this);
        ahm_butt2 = (Button) findViewById(R.id.ahm_butt2);
        ahm_butt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.ahm_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.ahm_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }

    }
}
