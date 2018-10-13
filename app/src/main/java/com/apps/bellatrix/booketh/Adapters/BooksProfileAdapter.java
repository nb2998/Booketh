package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.R;

import java.util.ArrayList;

public class BooksProfileAdapter extends RecyclerView.Adapter<BooksProfileAdapter.BookHolder> {

    ArrayList<Book> books;
    Context context;

    public BooksProfileAdapter(ArrayList<Book> books, Context context) {
        this.books = books;
        this.context = context;
    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookHolder(LayoutInflater.from(context).inflate(R.layout.single_book_profile, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder bookHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookHolder extends RecyclerView.ViewHolder{

        public BookHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
