package org.pltw.examples.studenplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mCButton; // Create assignment button
private Button mDButton; // Delete assignment button
private Button mSButton; // Share button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCButton = (Button) findViewById(R.id.cButton);
        mDButton = (Button) findViewById(R.id.dButton);
        mSButton = (Button) findViewById(R.id.sButton);
    }
    public void onClickCreate(View v){
        startActivity(new Intent(MainActivity.this,Pop.class))
    }
}

