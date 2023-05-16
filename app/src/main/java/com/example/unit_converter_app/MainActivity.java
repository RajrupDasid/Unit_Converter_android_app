package com.example.unit_converter_app;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView3); // empty textview widget that will fill up with calculations later on
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Processing", Toast.LENGTH_SHORT).show(); // toast is to display messages on display
               String s =  editText.getText().toString();
               int kg =Integer.parseInt(s);
               double pound  = 2.205 * kg;
               textview.setText("The converted value is"+ " " +pound);
            }
        });
    }

}