package ru.mirea.razuvaev.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        view = findViewById(R.id.textViewSecondActivity);
        view.setText((String) getIntent().getSerializableExtra("key"));
    }

}
