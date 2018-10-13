package com.apps.bellatrix.booketh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.apps.bellatrix.booketh.Adapters.BookRaiseFundAdapter;

import java.util.ArrayList;

public class TrendingBooksActivity extends AppCompatActivity {

    GridView gvTrending;
    ArrayList <Book> books = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_books);

        gvTrending = findViewById(R.id.gvTrending);

        books.add(new Book("Abc", "Summary", "Ch 1", 2));
        books.add(new Book("Def", "Summary", "Ch 1", 2));
        books.add(new Book("Hij", "Summary", "Ch 1", 2));
        books.add(new Book("Klm", "Summary", "Ch 1", 2));

        BookRaiseFundAdapter adapter = new BookRaiseFundAdapter(this, R.layout.single_row_book_fund);
        gvTrending.setAdapter(adapter);
    }
}
