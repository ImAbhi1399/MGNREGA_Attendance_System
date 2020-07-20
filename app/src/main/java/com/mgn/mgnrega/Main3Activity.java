package com.mgn.mgnrega;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.BitSet;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    ImageView imgd;
    private long exit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.buttoncapture);
        b2=findViewById(R.id.btdone);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        imgd= (ImageView) findViewById(R.id.image_view);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap=(Bitmap)data.getExtras().get("data");
        imgd.setImageBitmap(bitmap);
    }
    public void openActivity6(){
        Intent intent=new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
    public void openActivity1(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.home){
            openActivity1();
        }
        if(id==R.id.exit){
            finishAffinity();
        }
        return super.onOptionsItemSelected(item);
    }

}
