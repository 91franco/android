package com.example.alumno.botonprincipal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i ;
    MyListener myListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        myListener = new MyListener(this);
        fab.setOnClickListener(myListener);


    }
    @Override
    protected void onActivityResult(int resquestCode, int resultCode,Intent data){
        if(resquestCode==MyListener.CAMARA){
            if(resultCode== Activity.RESULT_OK){
                myListener.setImage();
                Log.d("llego","img");
            }
        }
    }
}
