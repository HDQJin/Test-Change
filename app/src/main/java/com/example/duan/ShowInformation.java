package com.example.duan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

public class ShowInformation extends AppCompatActivity {
    private TextView textViewUsername, textViewEmail, textViewFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_information);
        textViewFullName = (TextView) findViewById(R.id.textViewFullName);
        textViewUsername = (TextView) findViewById(R.id.textViewUsername);
        textViewEmail = (TextView) findViewById(R.id.textViewEmail);

        Intent intent = getIntent();
        String FullName = intent.getStringExtra("getFullName");
        String Username = intent.getStringExtra("getUsername");
        String Email = intent.getStringExtra("getEmail");

        textViewFullName.setText(FullName);
        textViewUsername.setText(Username);
        textViewEmail.setText(Email);



//        String fullname,username,password,email;
//
////        username = "rin";
////
////        Handler handler = new Handler(Looper.getMainLooper());
////        handler.post(new Runnable() {
////            @Override
////            public void run() {
////                //Starting Write and Read data with URL
////                //Creating array for parameters
////                String[] field = new String[1];
////                field[0] = "username";
////                //Creating array for data
////                String[] data = new String[1];
////                data[0] = username;
////                PutData putData = new PutData("http://192.168.1.10/loginregister/show.php", "POST", field, data);
////            }
////        });
//
//        textViewUsername.setText(" ");
    }
}