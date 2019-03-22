package org.pltw.examples.studenplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button mCButton; // Create assignment button
    private Button mDButton; // Delete assignment button
    private Button mSButton; // Share button
    private ImageView popup;
    private EditText mCreateName;
    private EditText mCreateType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCButton = (Button) findViewById(R.id.cButton);
        mDButton = (Button) findViewById(R.id.dButton);
        mSButton = (Button) findViewById(R.id.sButton);
        popup = (ImageView) findViewById(R.id.createPopup);
        mCreateName = (EditText) findViewById(R.id.createName);
        mCreateType = (EditText) findViewById(R.id.createType);
    }

    public void onClickCreate(View v) {
        if (popup.getVisibility() == View.VISIBLE) {

            popup.setVisibility(View.INVISIBLE);
            mCreateType.setVisibility(View.INVISIBLE);
            mCreateName.setVisibility(View.INVISIBLE);
        }
        else {
            popup.setVisibility(View.VISIBLE);
            mCreateType.setVisibility(View.VISIBLE);
            mCreateName.setVisibility(View.VISIBLE);
        }
    }
}