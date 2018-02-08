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
        String pesosAmount = getConvertedAmount(usdAmount, 18.76);
        setAmountToScreen("Pesos", pesosAmount);
    }

    public void convertYuan(View view){
        Double usdAmount = getUSDAmount(R.id.USD_Amount);
        String yuanAmount = getConvertedAmount(usdAmount, 6.32);
        setAmountToScreen("Yuan", yuanAmount);
    }

    private double getUSDAmount(int id){
        EditText usdEditText = findViewById(id);
        String usdString = usdEditText.getText().toString();
        Double usdAmount = Double.parseDouble(usdString);
        return usdAmount;
    }

    private String getConvertedAmount(Double usd, double multiplier){
        Double convertedAmount = usd * multiplier;
        String finalAmount = convertedAmount.toString();
        return finalAmount;
    }

    private void setAmountToScreen(String currencyName, String amount){
        TextView textView = findViewById(R.id.convertedResponse);
        textView.setText(currencyName + ": $" + amount);
    }
}
