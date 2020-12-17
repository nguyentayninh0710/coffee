package com.myclass.shopcoffee;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox cbPassword;
    EditText edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        cbPassword = (CheckBox) findViewById(R.id.cbShowPassword);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
    }

    public void showPassword(View view) {
        if(cbPassword.isChecked()){
            edtPassword.setTransformationMethod(null);
            edtPassword.setSelection(edtPassword.getText().length());
        }else {
            edtPassword.setTransformationMethod(new PasswordTransformationMethod());
            edtPassword.setSelection(edtPassword.getText().length());
        }
    }
    public void login(View view){
        Intent intent = new Intent(this, activity_choose_table.class);
        startActivity(intent);
    }
}