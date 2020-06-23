package com.rohit.device_layout_javacode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView mShowSize;
    private boolean mFragment;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowSize=findViewById(R.id.showLayout);
        mButton=findViewById(R.id.Button1);
        click();
    }

    public void click(){
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScreenUtility mScreenUtility=new ScreenUtility(MainActivity.this);
                mShowSize.setText(String.format("Width : %s, Height: %s",
                mScreenUtility.getDbheight(),mScreenUtility.getDbwidth()));
                if(mScreenUtility.getDbwidth() >=800){
                    mFragment=true;
                }
                Toast.makeText(getApplicationContext(),"Using Fragment?" +mFragment,Toast.LENGTH_SHORT).show();
            }

        });
    }
}
