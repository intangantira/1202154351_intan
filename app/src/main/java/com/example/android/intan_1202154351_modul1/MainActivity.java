package com.example.android.intan_1202154351_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText makan;
    private EditText porsiM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makan = findViewById(R.id.makanan);
        //menginisiasi objek editText makanan
        porsiM = findViewById(R.id.porsi);
        //menginisiasi objek esitText porsi

    }
    public void launcheat (View view) {

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        //transfer data antar activity

        String makanan =makan.getText().toString();
        //EditText makan kita simpan terlebih dahulu pada variabel nama sebelum di tampilkan pada objek tampil
        String porsi = porsiM.getText().toString();
        //EditText porsi kita simpan terlebih dahulu pada variabel nama sebelum di tampilkan pada objek tampil

        intent.putExtra("Harga", "50000");
        //dikirimkan informasi berupa data Harga dengan nilai String “50000”
        intent.putExtra("Menu", makanan);
        //dikirimkan informasi berupa data Harga dengan String makanan
        intent.putExtra("Porsi", porsi);
        //dikirimkan informasi berupa data Porsi dengan String porsi
        intent.putExtra("Tempat", "Eatbus");
        //dikirimkan informasi berupa data Tempat dengan String "Eatbus"
        startActivity(intent);
        //untuk menjalankan intent tersebut
    }

    public void launchab(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String makanan = makan.getText().toString();
        //EditText makan kita simpan terlebih dahulu pada variabel nama sebelum di tampilkan pada objek tampil
        String porsi = porsiM.getText().toString();
        //EditText porsi kita simpan terlebih dahulu pada variabel nama sebelum di tampilkan pada objek tampil

        intent.putExtra("Harga", "30000");
        ////dikirimkan informasi berupa data Harga dengan nilai String “30000”
        intent.putExtra("Menu", makanan);
        //dikirimkan informasi berupa data Harga dengan String makanan
        intent.putExtra("Porsi", porsi);
        //dikirimkan informasi berupa data Porsi dengan String porsi
        intent.putExtra("Tempat", "Abnormal");
        //dikirimkan informasi berupa data Tempat dengan String "Abnormal"
        startActivity(intent);
        //untuk memulai menjalankan intent
    }
}
