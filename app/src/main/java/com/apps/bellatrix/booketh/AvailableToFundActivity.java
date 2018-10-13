package com.apps.bellatrix.booketh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.apps.bellatrix.booketh.Adapters.BookRaiseFundAdapter;

import java.util.ArrayList;

public class AvailableToFundActivity extends AppCompatActivity {

    RecyclerView recViewTrending, recViewPromoted, recViewRecent;

    ArrayList<Book> trendingBooks= new ArrayList<>(), promotedBooks = new ArrayList<>(), recentbooks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_to_fund);

        recViewRecent = findViewById(R.id.recViewRecents);
        recViewTrending = findViewById(R.id.recViewTrending);
        recViewPromoted = findViewById(R.id.recViewPromoted);

        BookRaiseFundAdapter trendingAdapter = new BookRaiseFundAdapter(trendingBooks, this);
        BookRaiseFundAdapter recentAdapter = new BookRaiseFundAdapter(recentbooks, this);
        BookRaiseFundAdapter promotedAdapter = new BookRaiseFundAdapter(promotedBooks, this);

        recViewPromoted.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewPromoted.setAdapter(promotedAdapter);

        recViewTrending.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewTrending.setAdapter(trendingAdapter);

        recViewRecent.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewRecent.setAdapter(recentAdapter);

    }
}
