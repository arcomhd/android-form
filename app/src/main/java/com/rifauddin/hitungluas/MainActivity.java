package com.rifauddin.hitungluas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editPanjang, editTinggi;
    TextView textResult;

    RadioButton radioPersegi;
    RadioButton radioSegitiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPanjang = (EditText) findViewById(R.id.editPanjang);
        editTinggi = (EditText) findViewById(R.id.editTinggi);
        textResult = (TextView) findViewById(R.id.textResult);

        radioPersegi = (RadioButton) findViewById(R.id.radioPersegi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ClickReset(View view) {
        editPanjang.setText("");
        editTinggi.setText("");
        textResult.setText("");

    }

    public void ClickLuas(View view) {

        double panjang = Double.parseDouble(editPanjang.getText().toString());
        double tinggi = Double.parseDouble(editTinggi.getText().toString());
        double result = 0;

        if (radioPersegi.isChecked()) {
            result = panjang * tinggi;
        } else {
            result = panjang * tinggi * 0.5d;
        }
        textResult.setText(result + "");
    }

    public void ClickKeliling(View view) {

        double panjang = Double.parseDouble(editPanjang.getText().toString());
        double tinggi = Double.parseDouble(editTinggi.getText().toString());
        double result = 0;

        if (radioPersegi.isChecked()) {
            result = (panjang + tinggi) *2;
        } else {
            result = panjang * 3;
        }
        textResult.setText(result + "");
    }




}
