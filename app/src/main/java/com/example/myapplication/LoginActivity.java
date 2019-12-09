package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {
    /**
        Method definition     **/


    protected void onCreate(@Nullable Bundle x) {
        super.onCreate(x);
        setContentView(R.layout.activity_login);//Android method

    }  /* final EditText etUsername=findViewById(R.id.editText);





        final EditText etPassword=findViewById(R.id.editText1);
        Button btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener()//Annonnymus InnerClass
        {
            @Override
            public void onClick(View v)
            {
                String username= etUsername.getText().toString();
                String password= etPassword.getText().toString();

                // TODO Perform User Validation

               /* Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.github.com/")
                        .build();*/

                /** Toast
                    .makeText(getApplicationContext(),username,Toast.LENGTH_SHORT)
                    .show();//Method Chaining
                 Toast
                    .makeText(getApplicationContext(),password,Toast.LENGTH_LONG)
                    .show(); **/


            }//
       // });//


   /** public void processSignupLinkClick(View view)
    {
        Intent intent=new Intent(this,RegistrationActivity.class);//created intent object
        startActivity(intent);  //start the activity
    } **/
//}