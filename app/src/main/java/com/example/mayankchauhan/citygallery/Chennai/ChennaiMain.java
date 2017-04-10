package com.example.mayankchauhan.citygallery.Chennai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mayankchauhan.citygallery.OnClickFamousView.ClickFamousActivity;
import com.example.mayankchauhan.citygallery.OnClickImageView.ClickImageActivity;
import com.example.mayankchauhan.citygallery.R;

public class ChennaiMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView che_img;
    private TextView che_text;
    private Button che_butt1;
    private Button che_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chennai_main);

        che_butt1 = (Button) findViewById(R.id.che_butt1);
        che_butt1.setOnClickListener(this);
        che_butt2 = (Button) findViewById(R.id.che_butt2);
        che_butt2.setOnClickListener(this);
        che_img = (ImageView) findViewById(R.id.che_img);
        che_text = (TextView) findViewById(R.id.che_text);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.che_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.che_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }

    }
}
