package game.dice.com.dicegameapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;

import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    EditText edName;
    TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "introduced name", Toast.LENGTH_SHORT).show();

        edName = findViewById(R.id.editName);
        Toast.makeText(this, "introduced name", Toast.LENGTH_SHORT).show();
        Button btn = findViewById(R.id.go);
        btn.setOnClickListener(new View.OnClickListener() {


             @Override
            public void onClick(View v) {
                 String name = (String) edName.getText().toString();
                 if (name.length() >2 ) {

                     GameController controller = new GameController();
                     controller.createPlayer(name);

                     Intent tablet = new Intent(MainActivity.this, SelectPlayActivity.class);
                     startActivity(tablet);
                 } else {
                     Toast.makeText(MainActivity.this, "error name", Toast.LENGTH_SHORT).show();
                 }
             }
        });


    }
}
