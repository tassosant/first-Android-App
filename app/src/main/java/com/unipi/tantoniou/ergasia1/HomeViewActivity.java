package com.unipi.tantoniou.ergasia1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeViewActivity extends AppCompatActivity {

    TextView textView;
    ArrayList<TextView> inputFields;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_view_activity);
        this.textView = findViewById(R.id.textView2);
        this.inputFields = new ArrayList<>();
        collectTheInputFields();
        initializeInputFields();

    }

    public void navigate(View view){
        this.textView.setText("Sign up was successful!");
    }

    private void collectTheInputFields(){
        this.inputFields.add(findViewById(R.id.fullnameEditText));
        this.inputFields.add(findViewById(R.id.emailEditText));
        this.inputFields.add(findViewById(R.id.phoneEditText));
        this.inputFields.add(findViewById(R.id.addressEditText));
        this.inputFields.add(findViewById(R.id.bachelorDegreeEditText));
    }

    private void initializeInputFields(){
        for(TextView inputField:this.inputFields){
            inputField.setHint(inputField.getText());
            inputField.setText("");
        }
    }




}