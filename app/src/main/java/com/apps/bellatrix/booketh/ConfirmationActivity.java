package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    double amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_activity);
        amount = getIntent().getIntExtra(getString(R.string.fundAmountIntent), 2);
    }

    @Override
    public void onBackPressed() {

        Intent goBackToWalletIntent = new Intent(ConfirmationActivity.this, TransactionHistoryActivity.class);
        goBackToWalletIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        goBackToWalletIntent.putExtra(getString(R.string.fundAmountIntent), amount);
        startActivity(goBackToWalletIntent);
    }
}
