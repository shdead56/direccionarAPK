package com.example.direccionarapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
    ImageButton a,b,c,d,e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a= findViewById(R.id.btna);
        b= findViewById(R.id.btnb);
        c= findViewById(R.id.btnc);
        d= findViewById(R.id.btnd);
        e= findViewById(R.id.bntd);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent aa = getPackageManager().getLaunchIntentForPackage("com.android.gallery3d");
                    startActivity(aa);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Instala primero pe", Toast.LENGTH_SHORT).show();
                };

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bb = getPackageManager().getLaunchIntentForPackage("com.android.vending");
                startActivity(bb);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cc = getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
                startActivity(cc);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dd = getPackageManager().getLaunchIntentForPackage("com.android.camera2");
                startActivity(dd);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {
                    Uri e= Uri.parse("https://www.facebook.com/DiamanteStoreCUSCO/");
                    Intent web= new Intent(Intent.ACTION_VIEW,e);
                    startActivity(web);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Instala primero pe", Toast.LENGTH_SHORT).show();
                };

                //Intent ee = getPackageManager().getLaunchIntentForPackage("com.android.browser");
                //startActivity(ee);
               //e= Uri.parse("http://www.google.com");
                //Intent web= new Intent(Intent.ACTION_VIEW,google);

            }
        });


    }
}