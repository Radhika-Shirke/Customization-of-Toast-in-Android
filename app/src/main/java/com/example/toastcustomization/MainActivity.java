package com.example.toastcustomization;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.btnToast);

        //Default Toast
        // Toast.makeText(this, "This is my Toast", Toast.LENGTH_LONG).show();


        //Custom Toast

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = new Toast(getApplicationContext());  //creating object for toast

                View view = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup)findViewById(R.id.viewContainer));

                toast.setView(view);

                TextView txtMsg = view.findViewById(R.id.txtMsg);

                txtMsg.setText("message sent successfully!");

                toast.setDuration(Toast.LENGTH_LONG);

                toast.setGravity(Gravity.CENTER,0, 0 );

                toast.show();

            }
        });


    }
}