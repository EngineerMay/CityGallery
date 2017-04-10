package com.example.mayankchauhan.citygallery.Delhi;

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

public class DelhiMain extends AppCompatActivity implements View.OnClickListener{

    private ImageView del_img;
    private TextView del_text;
    private Button del_butt1;
    private Button del_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi_main);

        del_img = (ImageView) findViewById(R.id.del_img);
        del_text = (TextView) findViewById(R.id.del_text);
        del_butt1 = (Button) findViewById(R.id.del_butt1);
        del_butt1.setOnClickListener(this);
        del_butt2 = (Button) findViewById(R.id.del_butt2);
        del_butt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId())
        {
            case R.id.del_butt1:
                intent = new Intent(DelhiMain.this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.del_butt2:
                intent = new Intent(DelhiMain.this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }

    }
}
