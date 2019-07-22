package com.ghost.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mFnum, mSnum;
    Button mcalculate;
    TextView mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFnum = findViewById(R.id.edtfnum);
        mSnum = findViewById(R.id.edtsnum);
        mcalculate =findViewById(R.id.btncalculate);
        mAnswer = findViewById(R.id.tvjibu);

        mcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the number from the user
                String numberone=mFnum.getText().toString();
                String numbertwo =mSnum.getText().toString();
                // check if the user is submitting empty fiels
                if (numberone.isEmpty()||numbertwo.isEmpty()){
                    Toast.makeText(MainActivity.this, "fil all inputs", Toast.LENGTH_SHORT).show();
                }else {
                    // convert the received data to a double
                    Double numberonecon=Double.parseDouble(numberone);
                    Double numbertwocon = Double.parseDouble(numbertwo);

                    // finally get the answer

                    Double answer = numberonecon+numbertwocon;

                    //display the answer on the textview

                    mAnswer.setText(String.valueOf(answer));
                    mFnum.setText("");
                    mSnum.setText("");
                }
            }
        });
    }
}
