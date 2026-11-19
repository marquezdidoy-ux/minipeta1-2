package com.example.minipeta;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.minipeta.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set up click listeners for the Challenge cards and buttons
        binding.btnViewGenMath.setOnClickListener(v -> 
            Toast.makeText(this, "GenMath selected", Toast.LENGTH_SHORT).show()
        );

        binding.btnViewComProg.setOnClickListener(v -> 
            Toast.makeText(this, "ComProg selected", Toast.LENGTH_SHORT).show()
        );

        binding.btnViewLifeCareer.setOnClickListener(v -> 
            Toast.makeText(this, "Life & Career Skills selected", Toast.LENGTH_SHORT).show()
        );

        binding.btnViewCommunications.setOnClickListener(v -> 
            Toast.makeText(this, "Effective Communications selected", Toast.LENGTH_SHORT).show()
        );

        binding.btnNotification.setOnClickListener(v -> 
            Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show()
        );

        binding.btnSettings.setOnClickListener(v -> 
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
        );
    }
}