package org.pltw.examples.studenplaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button mCButton; // Create assignment button
    private Button mDButton; // Delete assignment button
    private Button mSButton; // Share button
    private Button mAssignemnt;
    private Button mCreateSubmit;
    private Button close;
    private ImageView popup;
    private ImageView aView;
    private EditText mCreateName;
    private EditText mCreateType;
    private EditText mCreateMonth;
    private EditText mCreateDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCButton = (Button) findViewById(R.id.cButton);
        mDButton = (Button) findViewById(R.id.dButton);
        mSButton = (Button) findViewById(R.id.sButton);
        mCreateSubmit = (Button) findViewById(R.id.submit);
        mAssignemnt = (Button) findViewById(R.id.Assignment);
        close = (Button) findViewById(R.id.closeButton);
        popup = (ImageView) findViewById(R.id.createPopup);
        aView = (ImageView) findViewById(R.id.aMenu);
        mCreateName = (EditText) findViewById(R.id.createName);
        mCreateType = (EditText) findViewById(R.id.createType);
        mCreateMonth = (EditText) findViewById(R.id.month);
        mCreateDay = (EditText) findViewById(R.id.day);
    }

    public void onClickCreate(View v) {
        if (popup.getVisibility() == View.VISIBLE) {

            popup.setVisibility(View.INVISIBLE);
            mCreateType.setVisibility(View.INVISIBLE);
            mCreateName.setVisibility(View.INVISIBLE);
            mCreateMonth.setVisibility(View.INVISIBLE);
            mCreateDay.setVisibility(View.INVISIBLE);
            mCreateSubmit.setVisibility(View.INVISIBLE);
        }
        else {
            popup.setVisibility(View.VISIBLE);
            mCreateType.setVisibility(View.VISIBLE);
            mCreateName.setVisibility(View.VISIBLE);
            mCreateMonth.setVisibility(View.VISIBLE);
            mCreateDay.setVisibility(View.VISIBLE);
            mCreateSubmit.setVisibility(View.VISIBLE);
        }
    }
    public void onClickSubmit(View v){
        mAssignemnt.setVisibility(View.VISIBLE);
        popup.setVisibility(View.INVISIBLE);
        mCreateType.setVisibility(View.INVISIBLE);
        mCreateName.setVisibility(View.INVISIBLE);
        mCreateMonth.setVisibility(View.INVISIBLE);
        mCreateDay.setVisibility(View.INVISIBLE);
        mCreateSubmit.setVisibility(View.INVISIBLE);
    }
    public void onClickAssignemnt(View v){
        aView.setVisibility((View.VISIBLE));
        mCreateType.setVisibility(View.VISIBLE);
        mCreateName.setVisibility(View.VISIBLE);
        mCreateMonth.setVisibility(View.VISIBLE);
        mCreateDay.setVisibility(View.VISIBLE);
    }
    public void onClickClose(View v){
        aView.setVisibility(View.INVISIBLE);
        mCreateType.setVisibility(View.INVISIBLE);
        mCreateName.setVisibility(View.INVISIBLE);
        mCreateMonth.setVisibility(View.INVISIBLE);
        mCreateDay.setVisibility(View.INVISIBLE);
    }
}