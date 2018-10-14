package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.R;
import com.apps.bellatrix.booketh.TrendingBooksActivity;
import com.apps.bellatrix.booketh.User;

import java.util.ArrayList;

public class BookRaiseFundAdapter extends RecyclerView.Adapter<BookRaiseFundAdapter.BookHolder> {

    ArrayList<Book> books;
    Context context;

    User user;

    public BookRaiseFundAdapter(ArrayList<Book> books, Context context, Intent intent) {
        this.books = books;
        this.context = context;
        user = (User) intent.getSerializableExtra(context.getString(R.string.userLogin));

    }

    @NonNull
    @Override
    public BookHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new BookHolder(LayoutInflater.from(context).inflate(R.layout.single_row_book_fund, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookHolder bookHolder, final int i) {
        bookHolder.ivBook.setImageDrawable(context.getDrawable(R.drawable.book_sample));
        bookHolder.tvBookName.setText(books.get(i).getName());
        bookHolder.bookLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TrendingBooksActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class BookHolder extends RecyclerView.ViewHolder{

        ImageView ivBook;
        TextView tvBookName;
        LinearLayout bookLayout;

        public BookHolder(@NonNull View itemView) {
            super(itemView);

            ivBook = itemView.findViewById(R.id.ivBook);
            tvBookName = itemView.findViewById(R.id.tvBookName);
            bookLayout = itemView.findViewById(R.id.bookLayout);
        }
    }
}
