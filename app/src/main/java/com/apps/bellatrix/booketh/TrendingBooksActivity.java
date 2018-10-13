package com.apps.bellatrix.booketh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.GridView;

import com.apps.bellatrix.booketh.Adapters.BookPageAdapter;

import java.util.ArrayList;

public class TrendingBooksActivity extends AppCompatActivity {

    RecyclerView recViewTrending;
    ArrayList <Book> books = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending_books);

        recViewTrending = findViewById(R.id.recViewTrending);

        books.add(new Book("Abc", "Summary", "Ch 1", 2));
        books.add(new Book("Def", "Summary", "Ch 1", 1));
        books.add(new Book("Def", "Summary", "Ch 1", 1));
        books.add(new Book("Def", "Summary", "Ch 1", 1));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Def", "Summary", "Ch 1", 1));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Hij", "Summary", "Ch 1", 3));
        books.add(new Book("Klm", "Summary", "Ch 1", 1));
        books.add(new Book("Klm", "Summary", "Ch 1", 1));

        BookPageAdapter adapter = new BookPageAdapter(books, this);
        recViewTrending.setLayoutManager(new StaggeredGridLayoutManager(5, StaggeredGridLayoutManager.HORIZONTAL));
        recViewTrending.setAdapter(adapter);
    }
}
