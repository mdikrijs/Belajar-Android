package com.example.biodatadikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtNim = (EditText) findViewById(R.id.edt_nim);
        final EditText edtNama = (EditText) findViewById(R.id.edt_nama);
        final EditText edtKelas = (EditText) findViewById(R.id.edt_kelas);
        final EditText edtTanggal = (EditText) findViewById(R.id.edt_tanggal);
        btSimpan = (Button) findViewById(R.id.btn_simpan);

        btSimpan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Simpan.class);
                intent.putExtra("NIM", edtNim.getText().toString());
                intent.putExtra("NAMA", edtNama.getText().toString());
                intent.putExtra("KELAS", edtKelas.getText().toString());
                intent.putExtra("TANGGAL LAHIR", edtTanggal.getText().toString());

                String snim = edtNim.getText().toString().trim();
                String snama = edtNama.getText().toString().trim();
                String skelas = edtKelas.getText().toString().trim();
                String stanggal = edtTanggal.getText().toString().trim();

                boolean isEmptyFields = false;
                if (TextUtils.isEmpty(snim)) {
                    isEmptyFields = true;
                    edtNim.setError("Nim harus diisi");
                }
                if (TextUtils.isEmpty(snama)) {
                    isEmptyFields = true;
                    edtNama.setError("Nama harus diisi");
                }
                if (TextUtils.isEmpty(skelas)) {
                    isEmptyFields = true;
                    edtKelas.setError("Kelas harus diisi");
                }
                if (TextUtils.isEmpty(stanggal)) {
                    isEmptyFields = true;
                    edtTanggal.setError("Tanggal Lahir harus diisi");
                }
                startActivity(intent);
            }
        });

    }



}
