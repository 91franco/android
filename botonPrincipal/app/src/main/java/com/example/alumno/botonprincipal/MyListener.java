package com.example.alumno.botonprincipal;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

import java.io.File;
import java.util.jar.Manifest;

/**
 * Created by alumno on 20/10/2016.
 */
public class MyListener implements View.OnClickListener {
    public static final int CAMARA=1;
    Activity activity;
    Uri uri;
    public MyListener (Activity a){
        activity=a;
    }
    public void setImage (){
        ImageView iv = (ImageView) this.activity.findViewById(R.id.iv);
        iv.setImageURI(uri);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File imagesFolder = new File(Environment.getExternalStorageDirectory(),"MyImages");
        imagesFolder.mkdirs();
        File image= new File(imagesFolder,"image_001.jpg");
        uri = Uri.fromFile(image);

        intent.putExtra(MediaStore.EXTRA_OUTPUT,uri);

        if(ContextCompat.checkSelfPermission(activity, android.Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(activity, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(activity,
                    new String[]{android.Manifest.permission.CAMERA,android.Manifest.permission.WRITE_EXTERNAL_STORAGE},CAMARA);
           
        }else{
            activity.startActivityForResult(intent,CAMARA);
        }

    }
}
