package com.example.worldlist_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.widget.Button;

public class alarmscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarmscreen);

        Button alarmbutton = (Button) findViewById(R.id.alarm_b1);
        alarmbutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(alarmscreen.this);
                builder.setMessage("알람 설정")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){

                            public void onClick(DialogInterface dialog, int i){
                                finish();
                            }
                        })
                        .setNegativeButton("No",  new DialogInterface.OnClickListener(){



                            public void onClick(DialogInterface dialog, int i){
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }
        });

        Button  alarmexitutton = (Button) findViewById(R.id.alarm_b2);
        alarmexitutton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(alarmscreen.this);
                builder.setMessage("알람 해제")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener(){

                            public void onClick(DialogInterface dialog, int i){
                                finish();
                            }
                        })
                        .setNegativeButton("No",  new DialogInterface.OnClickListener(){


                            public void onClick(DialogInterface dialog, int i){
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();


            }

        });
        Button back = (Button) findViewById(R.id.alarm_b3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });
    }
}