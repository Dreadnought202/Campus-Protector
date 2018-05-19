package com.example.nindu.campuswatcher;

import android.content.Intent;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.R.attr.action;
import static android.R.attr.start;

public class FirstPage extends AppCompatActivity {
    private Button butt1;

    Button btnpic;
    ImageView imgTakenPic;
private static final int CAM_REQUEST=1313;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        Button butt1=(Button)findViewById(R.id.but1);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(FirstPage.this,MainActivity.class);
                startActivity(int1);
            }
        });

        Button btnCamera = (Button)findViewById(R.id.btnCamera);
        imageView = (ImageView)findViewById(R.id.imageView);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });
    }

    ImageView imageView;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap =(Bitmap)data.getExtras().get("data");
        imageView.setImageBitmap(bitmap);

    }
}
