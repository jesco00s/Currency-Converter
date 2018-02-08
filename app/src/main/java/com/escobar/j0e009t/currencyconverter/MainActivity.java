package com.escobar.j0e009t.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertPesos(View view){
        Double usdAmount = getUSDAmount(R.id.USD_Amount);
        Double pesosAmount = (usdAmount) * 18.76;
        String pesosString = pesosAmount.toString();

        TextView textView = findViewById(R.id.convertedResponse);
        textView.setText("Pesos: $" + pesosString);
    }

    public void convertYuan(View view){
        Double usdAmount = getUSDAmount(R.id.USD_Amount);
        Double yuanAmount = (usdAmount) * 6.32;
        String yenString = yuanAmount.toString();

        TextView textView = findViewById(R.id.convertedResponse);
        textView.setText("Yuan: $" + yenString);
    }

    private double getUSDAmount(int id){
        EditText usdEditText = findViewById(id);
        String usdString = usdEditText.getText().toString();
        Double usdAmount = Double.parseDouble(usdString);
        return usdAmount;
    }
}
