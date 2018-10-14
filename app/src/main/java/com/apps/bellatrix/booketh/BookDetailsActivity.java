package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {

    TextView tvTitle, tvSynopsis, tvGenre, tvStory, tvFunding;
    Button btnFund;
    Book book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        tvTitle = findViewById(R.id.tvTitle);
//        tvGenre = findViewById(R.id.tvGenre);
        tvStory = findViewById(R.id.tvStory);
        tvSynopsis = findViewById(R.id.tvSynopsis);
        btnFund = findViewById(R.id.btnFund);

        book = (Book) getIntent().getSerializableExtra(getString(R.string.bookIntent));
        tvTitle.setText(book.getName());
        tvSynopsis.setText(book.getSummary());
        tvStory.setText(book.getSampleContent());
        tvGenre.setText("Thriller");

        int fundingStatus = book.fundingStatus;

        if(fundingStatus == 0){
            tvFunding.setVisibility(View.GONE);
            findViewById(R.id.tvFundingHeading).setVisibility(View.GONE);
        } else if(fundingStatus == 1){
            tvFunding.setText(book.getFundingDaysLeft()+" days left");
            btnFund.setVisibility(View.VISIBLE);
            btnFund.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookDetailsActivity.this, FundFormActivity.class);
                    intent.putExtra(getString(R.string.bookIntent), book);
                    startActivity(intent);
                }
            });

        } else{

        }
    }
}
