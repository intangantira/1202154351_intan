package com.example.android.intan_1202154351_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        //transfer data antar activity serta menerima transfer dari main activity

        String tampilMenu = intent.getStringExtra("Menu");
        //mengambil nilai dari menu
        String tampilPorsi = intent.getStringExtra("Porsi");
        //mengambil nilai dari porsi
        String tempatMakan = intent.getStringExtra("Tempat");
        //mengambil nilai dari tempat
        String hargaMakan = intent.getStringExtra("Harga");
        //mengambil nilai dari harga

        int totalHarga = Integer.valueOf(tampilPorsi) * Integer.valueOf(hargaMakan);
        //untuk menghitung total harga

        TextView menu = (TextView) findViewById(R.id.tampil_menu);
        //menginisiasi objek textView tampil_menu
        TextView porsi = (TextView) findViewById(R.id.tampil_porsi);
        //menginisiasi objek textView tampil_porsi
        TextView tempat = (TextView) findViewById(R.id.tampil_tempat);
        //menginisiasi objek textView tampil_tempat
        TextView harga = (TextView) findViewById(R.id.tampil_harga);
        //menginisiasi objek textView tampil_harga

        menu.setText(tampilMenu);
        //menampilkan value dari menu
        porsi.setText(tampilPorsi);
        //menampilkan value dari porsi
        tempat.setText(tempatMakan);
        //menampilkan value dari tempat
        harga.setText(String.valueOf(totalHarga));
        //menampilkan value dari total harga

        if (totalHarga > 65500) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            //menampilkan pesan
            toast.show();
            //eksekusi
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            //menampilkan pesan
            toast.show();
            //eksekusi
        }
    }
}
