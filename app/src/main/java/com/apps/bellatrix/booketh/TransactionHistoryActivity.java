package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class TransactionHistoryActivity extends AppCompatActivity {

    TextView tvEthBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);

        tvEthBalance = findViewById(R.id.tvEthBalance);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());


        Double initialAmt = Double.parseDouble(sharedPreferences.getString(getString(R.string.fundAmountIntent), "120"));

        Intent receivedIntent = getIntent();
        if(receivedIntent != null && receivedIntent.getStringExtra(getString(R.string.confirmationIntent))!=null){
            double amt = receivedIntent.getDoubleExtra(getString(R.string.fundAmountIntent), 2);
            Double remainAmt = initialAmt - amt;
            tvEthBalance.setText(String.valueOf(remainAmt));

            sharedPreferences.edit().putString(getString(R.string.sharedPrefAmt), Double.toString(remainAmt)).apply();
        } else {
            tvEthBalance.setText(sharedPreferences.getString(getString(R.string.sharedPrefAmt), "120"));
        }

        Log.d("TAG", "onCreate: "+getIntent().getDoubleExtra(getString(R.string.fundAmountIntent), 2));
    }
}
