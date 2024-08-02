package com.example.beasiswaapps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.beasiswaapps.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private EditText nameEditText;
    private EditText ageEditText;
    private EditText descriptionEditText;
    private Button submitButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        ageEditText = findViewById(R.id.age);
        descriptionEditText = findViewById(R.id.description);
        submitButton = findViewById(R.id.submit);
        resultTextView = findViewById(R.id.result);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String age = ageEditText.getText().toString();
                String description = descriptionEditText.getText().toString();

                String result = "Nama: " + name + "\nUmur: " + age + "\nKeterangan: " + description + "\n\nData terkirim, menunggu proses verifikasi.";
                resultTextView.setText(result);
            }
        });
    }
}
