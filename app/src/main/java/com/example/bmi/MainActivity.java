package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Tinggi, Berat;
    TextView hasil;
    String calculation, BMIhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Berat = findViewById(R.id.Berat);
        Tinggi = findViewById(R.id.Tinggi);
        hasil = findViewById(R.id.hasil);
    }

    public void HitungBMI(View view) {
        String jb = Berat.getText().toString();
        String jt = Tinggi.getText().toString();

        float nb = Float.parseFloat(jb);
        float nt = Float.parseFloat(jt) / 100;

        float bmi = nb / (nt * nt);

        if(bmi<18.5){
            BMIhasil = "Kurang Berat Badan";
        }else if (bmi >= 18.5 && bmi<24.9){
            BMIhasil = "Ideal";
        }else if (bmi >= 25.0 && bmi<29.9){
            BMIhasil = "Kelebihan Berat Badan";
        }else{
            BMIhasil = "Obesitas";
        }

        calculation = "Result: \n\n" + bmi + "\n" +BMIhasil;

        hasil.setText(calculation);

    }
}
