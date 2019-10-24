package com.example.biodatadikri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.biodatadikri.R;

public class Simpan extends AppCompatActivity {

    public static String EXTRA_NIM="extra_nim";
    public static String EXTRA_NAMA="extra_nama";
    public static String EXTRA_KELAS="extra_kelas";
    public static String EXTRA_TANGGAL="extra_tanggal";
    private TextView simpan_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simpan);
        TextView tnim = (TextView) findViewById(R.id.t_nim);
        TextView tnama = (TextView) findViewById(R.id.t_nama);
        TextView tkelas= (TextView) findViewById(R.id.t_kelas);
        TextView ttanggal = (TextView) findViewById(R.id.t_tanggal);

        tnim.setText(getIntent().getStringExtra("NIM"));
        tnama.setText(getIntent().getStringExtra("NAMA"));
        tkelas.setText(getIntent().getStringExtra("KELAS"));
        ttanggal.setText(getIntent().getStringExtra("TANGGAL LAHIR"));
    }
}
