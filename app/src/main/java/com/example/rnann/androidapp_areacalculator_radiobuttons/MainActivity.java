package com.example.rnann.androidapp_areacalculator_radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
        calculate = (Button) findViewById(R.id.CalculateButton);

        // Done with Accessing!!

        // Retrieving the radio group programmatically!!

        RadioGroup rg = (RadioGroup) findViewById(R.id.RadioGroup);

        //Registering a handler that listens to changes in the radio group!!

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                switch (checkedId) {

                    case R.id.TriangleRadioButton:
                    {
                       calculate.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               if (lengthOneValueEditText.getText().toString().equals(null)||lengthOneValueEditText.getText().toString().equals("")||lengthTwoValueEditText.getText().toString().equals(null)||lengthTwoValueEditText.getText().toString().equals("")){
                                   Toast.makeText(MainActivity.this,"Please Enter values in  Length1 and Length2 respectively!!", Toast.LENGTH_SHORT).show();
                               }else {

                                   length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                                   length2 = Double.parseDouble(lengthTwoValueEditText.getText().toString());

                                   //Done reading Input values entered by the User!!


                                   //printing the values read to logcat to check functioning of the App

                                   Log.d("rahul", "length1 is :" + length1);
                                   Log.d("rahul", "length2 is :" + length2);

                                   // Done checking, Values got printed  in the LogCat!!

                                   //Calculating the area
                                   area = 0.5 * length1 * length2;
                                   Log.d("rahul", "triangle area is :" + area);



                                   //converting area from double to string -> to display the result as text on the result Text View
                                   result = Double.toString(area);


                                   resultValueTextView.setText(result);

                                   //Calculated area and printed it on the Area Result Text View!!

                               }
                           }
                       });
                    }

                    //End of Triangle Area Calculation logic!!

                    case R.id.SquareRadioButton:
                    {
                        calculate.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {


                                //Reading the input length values

                                if (lengthOneValueEditText.getText().toString().equals(null)||lengthOneValueEditText.getText().toString().equals("")||lengthOneValueEditText.getText().toString().equals(".")){

                                    Toast.makeText(MainActivity.this,"Please Enter value in  Length1 respectively!!", Toast.LENGTH_SHORT).show();

                                }else {


                                    //(lengthOneValueEditText.getText().toString()) gets the input value as string and thus we are parsing string to double

                                    length1 = Double.parseDouble(lengthOneValueEditText.getText().toString());
                                    lengthTwoValueEditText.setText("");

                                    //Done reading Input values entered by the User!!


                                    //printing the values read to logcat to check functioning of the App

                                    Log.d("rahul", "length1 is :" + length1);
                                    Log.d("rahul", "length2 is :" + length2);

                                    // Done checking, Values got printed  in the LogCat!!

                                    //Calculating the area
                                    area = length1 * length1;
                                    Log.d("rahul", "square area is :" + area);



                                    //converting area from double to string -> to display the result as text on the result Text View
                                    result = Double.toString(area);


                                    resultValueTextView.setText(result);

                                    //Calculated area and printed it on the Area Result Text View!!

                                }

                            }
                        });
                    }

                    //End of Square Area Calculation LOgic!!
                }

            }
        });




    }
}
