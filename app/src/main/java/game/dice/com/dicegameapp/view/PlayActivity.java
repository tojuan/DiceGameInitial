package game.dice.com.dicegameapp.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;
import game.dice.com.dicegameapp.application.GameDTO;

public class PlayActivity extends AppCompatActivity {

    TextView textView;
    Button btn;
    TextView diceResult;
    ImageView view1;
    ImageView view2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        btn = findViewById(R.id.button);
        diceResult = findViewById(R.id.dice_Result);
        view1 = findViewById(R.id.imageView);
        view2 = findViewById(R.id.imageView2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    playGame();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private int imageViewDiceSide(int value) {
        switch (value) {
            case 1:
                return R.drawable.die_red_rojo_1a;
            case 2:
                return R.drawable.die_red_rojo_2a;
            case 3:
                return R.drawable.die_red_rojo_3a;
            case 4:
                return R.drawable.die_red_rojo_4a;
            case 5:
                return R.drawable.die_red_rojo_5a;
            default:
                return R.drawable.die_red_rojo_6a;
        }
    }

    private void messageResult(boolean hasWon) {

        if (hasWon) {
            diceResult.setText("Result 7, you win"+"\n");
        } else {
            diceResult.setText("Bad Result, repeat");
        }
    }

    private void playGame() throws Exception {
        GameController controller = new GameController();
        GameDTO game = controller.playGame();
        messageResult(game.hasWon());

        view1.setImageResource(imageViewDiceSide(game.getDice1()));
        view2.setImageResource(imageViewDiceSide(game.getDice2()));



        //diceResult.setText(controller.getPlayerToString()+ "player es: "+controller.getPlayerName());

    }






}
