package com.example.duckappfrontend;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    // Global Variables for the Mesasgse and Name
    Button buttonSubmit;
    TextView name;
    TextView messagse;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Get the Data And then send to lora

                name = (TextView) findViewById(R.id.nameInput);
                messagse = (TextView) findViewById(R.id.messagseInput);
                String nameString = name.getText().toString();
                String messagseString = messagse.getText().toString();
                Log.w("debugggg",messagseString + nameString);

            }
        });



    }





}