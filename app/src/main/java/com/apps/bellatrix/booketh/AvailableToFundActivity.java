package com.apps.bellatrix.booketh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.apps.bellatrix.booketh.Adapters.BookPageAdapter;
import com.apps.bellatrix.booketh.Adapters.BookRaiseFundAdapter;

import java.util.ArrayList;

import static android.support.v7.widget.StaggeredGridLayoutManager.HORIZONTAL;

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

        BookRaiseFundAdapter trendingAdapter = new BookRaiseFundAdapter(trendingBooks, this, getIntent());
        BookRaiseFundAdapter recentAdapter = new BookRaiseFundAdapter(recentbooks, this, getIntent());
        BookRaiseFundAdapter promotedAdapter = new BookRaiseFundAdapter(promotedBooks, this, getIntent());
        trendingAdapter.setHasStableIds(true);
        recentAdapter.setHasStableIds(true);
        promotedAdapter.setHasStableIds(true);

        recViewPromoted.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewPromoted.setAdapter(promotedAdapter);

        recViewTrending.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewTrending.setAdapter(trendingAdapter);

        recViewRecent.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recViewRecent.setAdapter(recentAdapter);

        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 2, true, R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false,  R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false,  R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, true, R.drawable.b));
        trendingBooks.add(new Book("Wicked Wide Wonderful", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.b));

        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 3, true, R.drawable.c));
        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.c));
        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.c));
        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.c));
        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.c));
        promotedBooks.add(new Book("Dialogue Concerning The Imminent Apocalypse", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 1, false, R.drawable.c));

        recentbooks.add(new Book("The Omens of a Crown", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 2, true, R.drawable.d));
        recentbooks.add(new Book("The Omens of a Crown", "Book tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined.", "Ch 1", 2, false, R.drawable.d));
        recentbooks.add(new Book("The Omens of a Crown", "Summary", "Ch 1", 2, false, R.drawable.d));
        recentbooks.add(new Book("The Omens of a Crown", "Summary", "Ch 1", 2, false, R.drawable.d));
        recentbooks.add(new Book("The Omens of a Crown", "Summary", "Ch 1", 1, true, R.drawable.d));

        trendingAdapter.notifyDataSetChanged();
        promotedAdapter.notifyDataSetChanged();
        recentAdapter.notifyDataSetChanged();


    }
}
