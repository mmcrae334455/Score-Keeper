package edu.bpi.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreWrestlerA = 0;
    int warningsWrestlerA = 0;
    int scoreWrestlerB = 0;
    int warningsWrestlerB = 0;

    TextView wrestlerAScoreTextView, wrestlerAWarningsTextView;
    TextView wrestlerBScoreTextView, wrestlerBWarningsTextView;
    Button addPointWrestlerA, addWarningWrestlerA;
    Button addPointWrestlerB, addWarningWrestlerB;
    Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wrestlerAScoreTextView = findViewById(R.id.wrestler_a_score);
        wrestlerAWarningsTextView = findViewById(R.id.wrestler_a_warnings);
        addPointWrestlerA = findViewById(R.id.add_point_wrestler_a);
        addWarningWrestlerA = findViewById(R.id.add_warning_wrestler_a);

        wrestlerBScoreTextView = findViewById(R.id.wrestler_b_score);
        wrestlerBWarningsTextView = findViewById(R.id.wrestler_b_warnings);
        addPointWrestlerB = findViewById(R.id.add_point_wrestler_b);
        addWarningWrestlerB = findViewById(R.id.add_warning_wrestler_b);

        resetButton = findViewById(R.id.reset_button);

        addPointWrestlerA.setOnClickListener(v -> {
            scoreWrestlerA++;
            displayScores();
        });

        addWarningWrestlerA.setOnClickListener(v -> {
            warningsWrestlerA++;
            displayScores();
        });

        // Wrestler B Listeners
        addPointWrestlerB.setOnClickListener(v -> {
            scoreWrestlerB++;
            displayScores();
        });

        addWarningWrestlerB.setOnClickListener(v -> {
            warningsWrestlerB++;
            displayScores();
        });

        // Reset Listener
        resetButton.setOnClickListener(v -> {
            resetScores();
        });
    }


    private void displayScores() {
        wrestlerAScoreTextView.setText(String.valueOf(scoreWrestlerA));
        wrestlerAWarningsTextView.setText("Warnings: " + warningsWrestlerA);

        wrestlerBScoreTextView.setText(String.valueOf(scoreWrestlerB));
        wrestlerBWarningsTextView.setText("Warnings: " + warningsWrestlerB);
    }

    private void resetScores() {
        scoreWrestlerA = 0;
        warningsWrestlerA = 0;
        scoreWrestlerB = 0;
        warningsWrestlerB = 0;
        displayScores();
    }
}
