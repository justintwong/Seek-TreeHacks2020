package uk.co.appoly.sceneform_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                EditText userName = findViewById(R.id.username);
                String username = userName.getText().toString();
                Log.d("TAG", "blah blah " + username);
                Intent intent = new Intent(NameActivity.this, LocationActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });
    }
}
