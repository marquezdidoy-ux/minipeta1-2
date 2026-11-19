package com.example.minipeta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set up click listeners for dashboard cards
        View cardAssignments = findViewById(R.id.cardAssignments);
        View cardChallenges = findViewById(R.id.cardChallenges);
        View cardMessages = findViewById(R.id.cardMessages);
        View cardLearn = findViewById(R.id.cardLearn);

        if (cardAssignments != null) {
            cardAssignments.setOnClickListener(v -> 
                Toast.makeText(this, "Assignments clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (cardChallenges != null) {
            cardChallenges.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            });
        }

        if (cardMessages != null) {
            cardMessages.setOnClickListener(v -> 
                Toast.makeText(this, "Messages clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (cardLearn != null) {
            cardLearn.setOnClickListener(v -> 
                Toast.makeText(this, "Learn clicked", Toast.LENGTH_SHORT).show()
            );
        }

        View btnNotificationMain = findViewById(R.id.btnNotificationMain);
        View btnSettingsMain = findViewById(R.id.btnSettingsMain);

        if (btnNotificationMain != null) {
            btnNotificationMain.setOnClickListener(v -> 
                Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show()
            );
        }

        if (btnSettingsMain != null) {
            btnSettingsMain.setOnClickListener(v -> 
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
            );
        }
    }
}