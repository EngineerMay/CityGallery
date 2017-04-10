package com.example.mayankchauhan.citygallery.Kolkata;

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

public class KolkataMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView kol_img;
    private TextView kol_text;
    private Button kol_butt1;
    private Button kol_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata_main);

        kol_img = (ImageView) findViewById(R.id.kol_img);
        kol_text = (TextView) findViewById(R.id.kol_text);
        kol_butt1 = (Button) findViewById(R.id.kol_butt1);
        kol_butt2 = (Button) findViewById(R.id.kol_butt2);
        kol_butt2.setOnClickListener(this);
        kol_butt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.kol_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.kol_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }

    }
}
