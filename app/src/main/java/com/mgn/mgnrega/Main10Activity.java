package com.mgn.mgnrega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {
    Button b1;
    private  long exit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        b1=findViewById(R.id.donebt2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });

    }
    public void openActivity8(){
        Intent intent=new Intent(this,Main8Activity.class);
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
