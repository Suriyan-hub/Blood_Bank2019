package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.HomeActivity;
import com.example.myapplication.R;

import com.google.android.material.tabs.TabLayout;


public class LoginActivity extends AppCompatActivity {
    /**
        Method definition     **/

    protected void onCreate(@Nullable Bundle x)
    {
        super.onCreate(x);
        setContentView(R.layout.activity_login);//Android method

        final EditText etUsername=findViewById(R.id.editText);
        final EditText etPassword=findViewById(R.id.editText1);
        Button btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener()//Annonnymus InnerClass
        {
            @Override
            public void onClick(View v)
            {
                String username= etUsername.getText().toString();
                String password= etPassword.getText().toString();

                if(username.equals("username")&& password.equals("password"))
                {

                    Intent intent=new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast
                            .makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT)
                            .show();
                }


            }
        });
     }


}