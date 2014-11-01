package com.example.rainrunner.zizada_v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends Activity {


    Button button_new_account;
    EditText inputName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


        button_new_account = (Button) findViewById(R.id.button);
        button_new_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nextScreen = new Intent(getApplicationContext(), MyActivity2.class);

                startActivity(nextScreen);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);


            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
