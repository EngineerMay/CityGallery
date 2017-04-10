package com.example.mayankchauhan.citygallery.Camera;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mayankchauhan.citygallery.R;

import java.io.File;

public class CameraMain extends AppCompatActivity implements View.OnClickListener {


    private EditText cam_title;
    private EditText cam_desc;
    private Button camera;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_main);

        camera = (Button) findViewById(R.id.camera);
        camera.setOnClickListener(this);
        cam_title = (EditText) findViewById(R.id.cam_title);
        cam_desc = (EditText) findViewById(R.id.cam_desc);

        sharedPreferences = getSharedPreferences("Myprefs", Context.MODE_PRIVATE);

        String t = cam_title.getText().toString();
        String d = cam_desc.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("TITLE",t);
        editor.putString("DESC",d);
        editor.commit();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 2500)
        {

        }
    }

    @Override
    public void onClick(View v) {

        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent,2500);

    }

}
