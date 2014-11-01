package com.example.rainrunner.zizada_v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity2 extends Activity {


    Button Button_2;
    EditText Edittext_2;
    TextView TextView_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);


        Button_2 = (Button) findViewById(R.id.button);
        Edittext_2 = (EditText) findViewById(R.id.editText);
        TextView_2 = (TextView) findViewById(R.id.text_a2);


        Intent i =getIntent();


        Button_2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View vv){
                Intent NextScreen = new Intent(getApplicationContext(), MyActivity3.class);
                startActivity(NextScreen);
            }


        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
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
