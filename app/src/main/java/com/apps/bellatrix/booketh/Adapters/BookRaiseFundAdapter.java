package com.apps.bellatrix.booketh.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.apps.bellatrix.booketh.Book;
import com.apps.bellatrix.booketh.R;

import java.util.ArrayList;

public class BookRaiseFundAdapter extends ArrayAdapter<Book> {

    ArrayList<Book> books;
    Context context;

    public BookRaiseFundAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    class BookHolder extends RecyclerView.ViewHolder{

        public BookHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
