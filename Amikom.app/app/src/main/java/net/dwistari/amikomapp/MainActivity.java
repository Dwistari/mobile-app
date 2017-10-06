package net.dwistari.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String msg = "--Amikom App :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = (EditText) findViewById(R.id.user);
        final EditText pwd = (EditText) findViewById(R.id.pwd);
        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Amikom", user.getText().toString());
                Log.d("Amikom", pwd.getText().toString());

                Toast.makeText(getApplicationContext(),user.getText().toString())+"is Logged in..",
                    Toast.LENGTH_SHORT.show();
                ;

            }
        });
    }


}