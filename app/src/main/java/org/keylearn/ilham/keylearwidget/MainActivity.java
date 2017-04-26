package org.keylearn.ilham.keylearwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonKirim = (Button)findViewById(R.id.buttonKirim);
        final TextView textViewNama = (TextView)findViewById(R.id.textViewNama);
        final EditText editTextNama = (EditText) findViewById(R.id.editTextNama);

        buttonKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewNama.setText(editTextNama.getText().toString());
            }
        });
    }
}
