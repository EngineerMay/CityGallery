package com.example.mayankchauhan.citygallery.Hyderabad;

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

public class HyderabadMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView hye_img;
    private TextView hye_text;
    private Button hye_butt1;
    private Button hye_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad_main);

        hye_img = (ImageView) findViewById(R.id.hye_img);
        hye_butt1 = (Button) findViewById(R.id.hye_butt1);
        hye_butt1.setOnClickListener(this);
        hye_butt2 = (Button) findViewById(R.id.hye_butt2);
        hye_butt2.setOnClickListener(this);
        hye_text = (TextView) findViewById(R.id.hye_text);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.hye_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.hye_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }
    }
}
