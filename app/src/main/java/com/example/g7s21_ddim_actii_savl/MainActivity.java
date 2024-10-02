package com.example.g7s21_ddim_actii_savl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtnombre = findViewById(R.id.txtnombre);
        Button btnbuscar = findViewById(R.id.btnbuscar);
        ImageView imageView = findViewById(R.id.imageView);

        HashMap<String, String> imageMap = new HashMap<>();
        imageMap.put("aaron", "https://drive.google.com/uc?id=1fDY74jdw2q_nJ_PpmzO61ZxIHeXpX0yv");
        imageMap.put("anahi", "https://drive.google.com/uc?id=1p8g1NXQdRanzGsIU9llE2tiladLhZ1B5");
        imageMap.put("angel", "https://drive.google.com/uc?id=12EbSOvcCYGIDIDQ-5Ra9g29PhCjs0_Df");
        imageMap.put("aldair", "https://drive.google.com/uc?id=1cC285QGGG7lVFuRH32aI3xEtayUFQvrl");
        imageMap.put("adair", "https://drive.google.com/uc?id=1EMzViEG6Sc5tP_Qp3HQqIOBnZWVUoHVS");
        imageMap.put("alfredo", "https://drive.google.com/uc?id=1IzXqMYUhfcEqsRl_5Jz_81atZScSZXd0");
        imageMap.put("brayan", "https://drive.google.com/uc?id=1RDf4ryEkzJi3lewT-SNVTV_tYl-fE5OP");
        imageMap.put("carlos", "https://drive.google.com/uc?id=19IDVCF282Stu9ETpMHzy6byZVoXWHPfZ");
        imageMap.put("cesar", "https://drive.google.com/uc?id=1BvpcWOGvQB9TxbiM2bokFbSpgHWlxRki");
        imageMap.put("emiliano", "https://drive.google.com/uc?id=1t-LyHgmYcQiectBUycCNPNc-7iiKKw_H");
        imageMap.put("fabian", "https://drive.google.com/uc?id=1Wx6FU8RKlDQNz1OY8RpYfP5O19-PYWza");
        imageMap.put("jesus", "https://drive.google.com/uc?id=1s1oe6AjpYVHAb3d8XN40MYreo9p8jPXm");
        imageMap.put("juan", "https://drive.google.com/uc?id=1a3Nhbq1Pd1iNvlao1mAsD6be6zJLZnid");
        imageMap.put("leslie", "https://drive.google.com/uc?id=13AtCZ6cRN5FhuT_XuyAw98LfkXJ9XwfN");
        imageMap.put("mariana", "https://drive.google.com/uc?id=1smcm8_CRB-VBUqBSnVh64QHzxj0Vsa-6");
        imageMap.put("mauricio", "https://drive.google.com/uc?id=1riOiCECN6TpID1EU7tMCXHzYV8DD4-xR");
        imageMap.put("misael", "https://drive.google.com/uc?id=1KFxwd21gvBFodny6Q5zM_vEab0JIfzxG");
        imageMap.put("moises", "https://drive.google.com/uc?id=1SD6MsF5K1rfghl7g0CIfAsAs01a9OExR");
        imageMap.put("rafael", "https://drive.google.com/uc?id=13mzG2HNKKzMaGlKLfU6q2JDMEQmvAm9S");
        imageMap.put("victor", "https://drive.google.com/uc?id=1MWlzsWAK1ntvjA-oWX09zhKE3c9o06hk");
        imageMap.put("wendy", "https://drive.google.com/uc?id=1i6-uObnR9m3Cs_HbEJ2DlpnzwfxhLXt4");

        btnbuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String imageName = txtnombre.getText().toString();

                String imageUrl = imageMap.get(imageName);
                if (imageUrl != null) {
                    Glide.with(MainActivity.this).load(imageUrl).into(imageView);
                } else {
                    txtnombre.setError("Imagen no encontrada");
                }
            }
        });
    }
}
