package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {

    TextView tvTitle, tvSynopsis, tvGenre, tvStory, tvFunding;
    Button btnFund;
    Book book;
    ImageView ivCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        tvTitle = findViewById(R.id.tvTitle);
//        tvGenre = findViewById(R.id.tvGenre);
        tvFunding = findViewById(R.id.tvFunding);
        tvStory = findViewById(R.id.tvStory);
        tvSynopsis = findViewById(R.id.tvSynopsis);
        btnFund = findViewById(R.id.btnFund);
        ivCover = findViewById(R.id.ivCover);

        book = (Book) getIntent().getSerializableExtra(getString(R.string.bookIntent));
        tvTitle.setText(book.getName());
        tvSynopsis.setText(book.getSummary());
        tvStory.setText(book.getSampleContent());
        ivCover.setImageDrawable(getDrawable(book.getImgsrc()));
//        tvGenre.setText("Thriller");


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
            tvFunding.setText("Funding period over.");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_share_book, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuShare) {

            ShareCompat.IntentBuilder.from(this)
                    .setType("text/plain")
                    .setChooserTitle("Choose the app")
                    .setText("Hey, I wrote a book named "+book.getName()+" and looking for funding. Would you be able to help me out?")
                    .startChooser();
//            Intent intent = new Intent(Intent.ACTION_SEND);
//            intent.setType("text/plain");
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Hey, I wrote a book named "+book.getName()+" and looking for funding. Would you be able to help me out?");
//
//            startActivity(Intent.createChooser(intent, "Choose any one"));
            return true;
        }
        return false;
    }
}
