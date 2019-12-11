package ru.mirea.razuvaev.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity<field> extends AppCompatActivity {

    EditText field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        field = findViewById(R.id.editTextMainActivity);

    }

    public void onClickNewActivity(View view) {
        String val = field.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("key", val);
        startActivity(intent);
    }
}
