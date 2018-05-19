package com.example.nindu.campuswatcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button butt1=(Button)findViewById(R.id.vbut);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,Vandalism.class);
                startActivity(int1);
            }
        });

        Button butt3=(Button)findViewById(R.id.lbut);

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,LostItems.class);
                startActivity(int1);
            }
        });

        Button butt4=(Button)findViewById(R.id.obut);

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity.this,Other.class);
                startActivity(int1);
            }
        });

        Button butt2=(Button)findViewById(R.id.bbut);

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(MainActivity.this,Bullying.class);
                startActivity(int1);


        }});
    };
}