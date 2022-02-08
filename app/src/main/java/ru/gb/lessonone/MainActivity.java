package ru.gb.lessonone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Activity Main
    private TextView mainText;
    private Button changeTextButton;
    private Button returnTextButton;
    private EditText editTextForm;
    private Switch switchOne;

    // Second Layout
    private TextView header;
    private EditText first_one;
    private EditText second_one;
    private EditText third_one;
    private EditText fourth_one;
    private EditText fifth_one;
    private EditText sixth_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        changeTextButton = findViewById(R.id.changeText);
        returnTextButton = findViewById(R.id.returnTextButton);
        editTextForm = findViewById(R.id.editTextForm);

        header = findViewById(R.id.header);
        first_one = findViewById(R.id.first_one);
        second_one = findViewById(R.id.second_one);
        third_one = findViewById(R.id.third_one);
        fourth_one = findViewById(R.id.fourth_one);
        fifth_one = findViewById(R.id.fifth_one);
        sixth_one = findViewById(R.id.sixth_one);


        changeTextButton.setOnClickListener(v -> mainText.setText("Better app"));
        returnTextButton.setOnClickListener(v -> mainText.setText("App"));
        editTextForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextForm.setText("");
            }
        });

    }
}