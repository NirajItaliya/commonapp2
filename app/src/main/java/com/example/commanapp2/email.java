package com.example.commanapp2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class email extends AppCompatActivity {
    Button email;
    EditText editText, editText2, editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        email = findViewById(R.id.email1);
        editText = findViewById(R.id.edittext);
        editText2 = findViewById(R.id.edittext2);
        editText3 = findViewById(R.id.edittext3);

        email.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(View v) {
                String a = editText.getText().toString();
                String b = editText2.getText().toString();
                String c = editText3.getText().toString();

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("email"));
                String[] s = {a};
                i.putExtra(Intent.EXTRA_EMAIL, s);
                i.putExtra(Intent.EXTRA_SUBJECT, b);
                i.putExtra(Intent.EXTRA_TEXT, c);
                i.setType("message/rfc822");
                Intent chooser = Intent.createChooser(i, "Launch Email");
                startActivity(chooser);
            }
        });
    }
}