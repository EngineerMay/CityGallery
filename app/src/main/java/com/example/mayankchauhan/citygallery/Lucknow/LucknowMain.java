package com.example.mayankchauhan.citygallery.Lucknow;

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

public class LucknowMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView luc_img;
    private TextView luc_text;
    private Button luc_butt1;
    private Button luc_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucknow_main);

        luc_butt1 = (Button) findViewById(R.id.luc_butt1);
        luc_butt1.setOnClickListener(this);
        luc_butt2 = (Button) findViewById(R.id.luc_butt2);
        luc_butt2.setOnClickListener(this);
        luc_img = (ImageView) findViewById(R.id.luc_img);
        luc_text = (TextView) findViewById(R.id.luc_text);
    }

    @Override
    public void onClick(View v) {


        Intent intent;

        switch (v.getId())
        {
            case R.id.luc_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.luc_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }
    }
}
