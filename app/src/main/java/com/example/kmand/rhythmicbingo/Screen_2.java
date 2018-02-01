package com.example.kmand.rhythmicbingo;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;
import java.lang.*;
import java.util.Random;


public class Screen_2 extends AppCompatActivity {

    //boolean onKeyDown(int Keycode, KeyEvent event);
    private ToggleButton btn5,btn6,btn8,btn9,btn2,btn1,btn3,btn10,btn11,btn12,btn13,btn14,btn15,btn17;
    private ImageButton ibtn1;
    public int flag =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
        btn5=(ToggleButton)findViewById(R.id.button5);
        btn6=(ToggleButton)findViewById(R.id.button6);
        btn3=(ToggleButton)findViewById(R.id.button3);
        btn2=(ToggleButton)findViewById(R.id.button2);
        btn1=(ToggleButton)findViewById(R.id.button1);
        btn8=(ToggleButton)findViewById(R.id.button8);
        btn9=(ToggleButton)findViewById(R.id.button9);
        btn10=(ToggleButton)findViewById(R.id.button10);
        btn11=(ToggleButton)findViewById(R.id.button11);
        btn12=(ToggleButton)findViewById(R.id.button12);
        btn13=(ToggleButton)findViewById(R.id.button13);
        btn14=(ToggleButton)findViewById(R.id.button14);
        btn15=(ToggleButton)findViewById(R.id.button15);
        btn17=(ToggleButton)findViewById(R.id.button17);
        ibtn1=(ImageButton)findViewById(R.id.imageButton);

        int[] arr = new int[12];
        Random r = new Random();
        for (int i=0;i<12;i++)
        {
            int temp = r.nextInt(25);
            temp++;
            while (arraycheck(arr,temp))
            {
                temp = r.nextInt(25);
                temp++;
            }
            arr[i] = temp;

        }
        btn5.setText(Integer.toString(arr[0]));
        btn5.setTextOn(Integer.toString(arr[0]));
        btn5.setTextOff(Integer.toString(arr[0]));

        btn6.setText(Integer.toString(arr[1]));
        btn6.setTextOn(Integer.toString(arr[1]));
        btn6.setTextOff(Integer.toString(arr[1]));

        btn3.setText(Integer.toString(arr[2]));
        btn3.setTextOn(Integer.toString(arr[2]));
        btn3.setTextOff(Integer.toString(arr[2]));

        btn2.setText(Integer.toString(arr[3]));
        btn2.setTextOn(Integer.toString(arr[3]));
        btn2.setTextOff(Integer.toString(arr[3]));

        btn1.setText(Integer.toString(arr[4]));
        btn1.setTextOn(Integer.toString(arr[4]));
        btn1.setTextOff(Integer.toString(arr[4]));

        btn8.setText(Integer.toString(arr[5]));
        btn8.setTextOn(Integer.toString(arr[5]));
        btn8.setTextOff(Integer.toString(arr[5]));

        btn9.setText(Integer.toString(arr[6]));
        btn9.setTextOn(Integer.toString(arr[6]));
        btn9.setTextOff(Integer.toString(arr[6]));

        btn10.setText(Integer.toString(arr[7]));
        btn10.setTextOn(Integer.toString(arr[7]));
        btn10.setTextOff(Integer.toString(arr[7]));

        btn11.setText(Integer.toString(arr[8]));
        btn11.setTextOn(Integer.toString(arr[8]));
        btn11.setTextOff(Integer.toString(arr[8]));

        btn12.setText(Integer.toString(arr[9]));
        btn12.setTextOn(Integer.toString(arr[9]));
        btn12.setTextOff(Integer.toString(arr[9]));

        btn13.setText(Integer.toString(arr[10]));
        btn13.setTextOn(Integer.toString(arr[10]));
        btn13.setTextOff(Integer.toString(arr[10]));

        btn14.setText(Integer.toString(arr[11]));
        btn14.setTextOn(Integer.toString(arr[11]));
        btn14.setTextOff(Integer.toString(arr[11]));




        btn5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn5.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn5.setBackgroundColor(Color.GRAY);
                }
            }
        });

        btn3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn3.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn3.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn2.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn2.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn1.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn1.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn6.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn6.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn8.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn8.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn9.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn9.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn10.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn10.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn11.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn11.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn12.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn12.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn13.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn13.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn14.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn14.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn15.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn15.setBackgroundColor(Color.GRAY);
                }
            }
        });
        btn17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    btn17.setBackgroundColor(Color.RED);
                }
                else {
                    // The toggle is disabled
                    btn17.setBackgroundColor(Color.GRAY);
                }
            }
        });
        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ibtn1.getBackground().setColorFilter(0xe0d91f1f, PorterDuff.Mode.ADD);
            }
        });
       /* public boolean onKeyDown(int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                exitByBackKey();

                //moveTaskToBack(false);

                return true;
            }
            return super.onKeyDown(keyCode, event);
        }
        */
      /*  protected void exitByBackKey() {

            AlertDialog alertbox = new AlertDialog.Builder(this)
                    .setMessage("Do you want to exit application?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {

                            finish();
                            //close();


                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {

                        // do something when the button is clicked
                        public void onClick(DialogInterface arg0, int arg1) {
                        }
                    })
                    .show();

        }
*/

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

    public boolean arraycheck(int arr[],int x)
    {
        int i ;
        int flag =0;
        for (i=0;i<arr.length;i++)
        {
           if (x==arr[i])
           {
               flag=1;
               break;
           }
        }
        if (flag==1)
            return true;
        else
            return false;
    }


}








