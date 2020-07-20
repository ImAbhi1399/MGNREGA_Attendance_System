package com.mgn.mgnrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5;
    private long exit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        b1 = findViewById(R.id.bt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        b2 = findViewById(R.id.removebtn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });
        b3 = findViewById(R.id.statusbtn);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();
            }
        });
        b4 = findViewById(R.id.logic);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity11();
            }
        });
        b5 = findViewById(R.id.logoutbtn);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void openActivity9() {
        Intent intent = new Intent(this, Main9Activity.class);
        startActivity(intent);
    }
    public void openActivity10() {
        Intent intent = new Intent(this, Main10Activity.class);
        startActivity(intent);
    }
    public void openActivity11() {
        Intent intent = new Intent(this, Main11Activity.class);
        startActivity(intent);
    }
    public void openActivity1() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onBackPressed(){

        if(exit1 + 2000 >System.currentTimeMillis())
        {
            super.onBackPressed();
            finishAffinity();

        }
        else{
            Toast.makeText(getBaseContext(),"PRESS BACK AGAIN",Toast.LENGTH_SHORT).show();
        }
        exit1=System.currentTimeMillis();
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
