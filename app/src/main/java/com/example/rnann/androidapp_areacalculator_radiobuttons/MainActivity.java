package com.example.rnann.androidapp_areacalculator_radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Declaring the view variables globally -> to make life easier

    EditText lengthOneValueEditText;
    EditText lengthTwoValueEditText;

    TextView resultValueTextView;

    RadioButton triangle;
    RadioButton square;
    RadioButton circle;
    RadioButton rectangle;
    RadioButton clear;

    Button calculate;

    double  length1;
    double  length2;

    double area;

    String result;

    // Done With Declaration!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Programmatically accessing the elements via their id located in R file

        lengthOneValueEditText = (EditText) findViewById(R.id.Length1EditText);
        lengthTwoValueEditText = (EditText) findViewById(R.id.Length2EditText);

        resultValueTextView = (TextView) findViewById(R.id.AreaResultTextView);

        triangle = (RadioButton) findViewById(R.id.TriangleRadioButton);
        square = (RadioButton) findViewById(R.id.SquareRadioButton);
        circle= (RadioButton) findViewById(R.id.CircleRadioButton);
        rectangle = (RadioButton) findViewById(R.id.RectangleRadioButton);
        clear = (RadioButton) findViewById(R.id.ClearAllRadioButton);

        // Done with Accessing!!


    }
}
