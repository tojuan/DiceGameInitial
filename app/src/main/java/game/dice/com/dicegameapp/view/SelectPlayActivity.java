package game.dice.com.dicegameapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;
import game.dice.com.dicegameapp.domain.Game;

public class SelectPlayActivity extends AppCompatActivity {

    TextView label;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "play dice", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_tablet);


            GameController controller = new GameController();
            String player1 = controller.getPlayerName();
            label= findViewById(R.id.textResult);
            label.setText("hola "+player1);

            Button btn = findViewById(R.id.buttonPlay);
            btn.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {


                        Intent tablet = new Intent(SelectPlayActivity.this, PlayActivity.class);
                        startActivity(tablet);


                    }
            });


        }

    }
