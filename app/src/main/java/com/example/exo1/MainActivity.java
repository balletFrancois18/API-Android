package com.example.exo1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnRouge;
    private Button btnVert;
    private Button btnBleu;
    private LinearLayout mainLayout; // Référence au fond principal

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Assurez-vous que le bon layout est chargé

        // Récupération des widgets depuis le fichier XML
        mainLayout = findViewById(R.id.mainLayout); // Utilisation de l'ID correct pour mainLayout
        btnRouge = findViewById(R.id.btnRouge);
        btnVert = findViewById(R.id.btnVert);
        btnBleu = findViewById(R.id.btnBleu);

        // Ajout des listeners pour chaque bouton
        btnRouge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Changer le fond en rouge
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
            }
        });

        btnVert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Changer le fond en vert
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

        btnBleu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Changer le fond en bleu
                mainLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
            }
        });
    }
}
