package com.example.kmand.rhythmicbingo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class Screen_1 extends AppCompatActivity {
   private  Button button1;
   private ToggleButton btn66;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_1);
        button1 = (Button) findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Screen_1.this, Screen_2.class));
                finish();
            }
        });
      btn66=(ToggleButton) findViewById(R.id.toggleButton);
      btn66.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
          public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if (isChecked) {
                  // The toggle is enabled
                  btn66.setBackgroundColor(Color.RED);
              }
              else {
                  // The toggle is disabled
                  btn66.setBackgroundColor(Color.GRAY);
              }
          }
      });


    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Exit");
        builder.setMessage("Do you want to exit this? ");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                finish();
                // MyActivity.super.onBackPressed();
            }
        });
        builder.setNegativeButton("No",null); {
            //public void onClick(DialogInterface dialog, int id) {;
            builder.show();
        }
    }
}
