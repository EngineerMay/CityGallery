package com.example.mayankchauhan.citygallery.Banglore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mayankchauhan.citygallery.OnClickFamousView.ClickFamousActivity;
import com.example.mayankchauhan.citygallery.OnClickImageView.ClickImageActivity;
import com.example.mayankchauhan.citygallery.R;

public class BangloreMain extends AppCompatActivity implements View.OnClickListener {

    private Button ban_butt1;
    private Button ban_butt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglore_main);

        ban_butt1 = (Button) findViewById(R.id.ban_butt1);
        ban_butt1.setOnClickListener(this);
        ban_butt2 = (Button) findViewById(R.id.ban_butt2);
        ban_butt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent;

        switch (v.getId())
        {
            case R.id.ban_butt1:
                intent = new Intent(this, ClickImageActivity.class);
                startActivity(intent);
                break;
            case R.id.ban_butt2:
                intent = new Intent(this, ClickFamousActivity.class);
                startActivity(intent);
                break;
        }
    }
}
