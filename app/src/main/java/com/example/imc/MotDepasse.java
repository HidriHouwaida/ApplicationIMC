package com.example.imc;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MotDepasse extends AppCompatActivity {
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mot_depasse);
        Button bt;
        DBLogin dbLogin=new DBLogin(this);
        email=findViewById(R.id.email);
        bt=findViewById(R.id.passe);
        bt.setOnClickListener(v -> {
            Cursor cursor=dbLogin.getMotDepasse(email.getText().toString());
            if (cursor.getCount() == 0) {
                Toast.makeText(getApplicationContext(),"Erreur",Toast.LENGTH_SHORT).show();
            } else {
                StringBuilder buffer = new StringBuilder();
                while (cursor.moveToNext()) {
                    buffer.append("MotDepasse: ").append(cursor.getString(0)).append("\n");

                }
                sendEmail(buffer.toString());

            }
        });}

    public void sendEmail(String message)
    {
        JavaMailAPi javaMailAPi=new JavaMailAPi(this,email.getText().toString(),"Votre Mot De Passe"
                ,message);
        javaMailAPi.execute();
    }
}