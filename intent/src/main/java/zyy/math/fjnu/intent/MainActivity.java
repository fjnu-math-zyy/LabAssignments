package zyy.math.fjnu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText urlEditText;
    Button urlButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urlEditText = findViewById(R.id.editText);
        urlButton = findViewById(R.id.editButton);
        urlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = urlEditText.getText().toString();
                Intent intent = new Intent();

                Uri uri = Uri.parse(url);

                intent.setData(uri);

                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);
            }
        });
    }
}
