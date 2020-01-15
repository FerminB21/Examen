package com.vallescastro.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPass = findViewById(R.id.edtPass);
        edtUser = findViewById(R.id.edtUser);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLog:
                if (edtUser.getText().toString().equals("admin") && edtPass.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(),"Inicio correcto",Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, Inicio.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Datos incorrectos",Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
