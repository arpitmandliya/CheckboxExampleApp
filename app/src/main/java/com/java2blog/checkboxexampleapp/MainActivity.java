package com.java2blog.checkboxexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    CheckBox india,china,nepal,bhutan;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        //Getting references of all CheckBoxes and Button from the activty_main.xml file
        india=(CheckBox)findViewById(R.id.checkBoxIndia);
        china=(CheckBox)findViewById(R.id.checkBoxChina);
        nepal=(CheckBox)findViewById(R.id.checkBoxNepal);
        bhutan=(CheckBox)findViewById(R.id.checkBoxBhutan);
        button=(Button)findViewById(R.id.button1);

        //Add listener on button click
        button.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Selected Countries:");
                if(india.isChecked()){
                    result.append("\nIndia");

                }
                if(china.isChecked()){
                    result.append("\nChina");

                }
                if(nepal.isChecked()){
                    result.append("\nNepal");
                }
                if(bhutan.isChecked()){
                    result.append("\nBhutan");
                }

                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}
