package com.example.linearlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.FileNameMap;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // التطبيق يدعم العربية والانجليزية
        //تعريف obj  من كل عنصر سوف يستخدم برمجيا باستخدتم id

        // Lookup EditText reference
        EditText Fname = (EditText) findViewById(R.id.et_fname);
        EditText Lname = (EditText) findViewById(R.id.et_lname);
        TextView hi =(TextView)  findViewById(R.id.tv_add_corcte);
        // Lookup Button reference
        Button btnadd = (Button) findViewById(R.id.btn_add);
        Button btnexit = (Button) findViewById(R.id.btn_exit);


        //اضافة خاصة عند الضغط ونقر على الزر شو يعمل

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String frn = Fname.getText().toString() ;
                String lan = Lname.getText().toString() ;
                String hello = hi.getText().toString() ;

                // here we handle the event

                Toast.makeText(MainActivity.this, hello + " " +frn +" "+lan +" 💚",Toast.LENGTH_LONG).show();
            }
        });


    }
}



