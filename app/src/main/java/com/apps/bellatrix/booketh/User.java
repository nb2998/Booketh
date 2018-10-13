package com.apps.bellatrix.booketh;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    String name;
    double ratingAsWriter;
    int levelAsFundRaiser;
    ArrayList<Book> booksWritten;
    int noOfFundsRaised;

    public User(String name, double ratingAsWriter, int levelAsFundRaiser, ArrayList<Book> booksWritten, int noOfFundsRaised) {
        this.name = name;
        this.ratingAsWriter = ratingAsWriter;
        this.levelAsFundRaiser = levelAsFundRaiser;
        this.booksWritten = booksWritten;
        this.noOfFundsRaised = noOfFundsRaised;
    }

    public String getName() {
        return name;
    }

    public double getRatingAsWriter() {
        return ratingAsWriter;
    }

    public int getLevelAsFundRaiser() {
        return levelAsFundRaiser;
    }

    public ArrayList<Book> getBooksWritten() {
        return booksWritten;
    }

    public int getNoOfFundsRaised() {
        return noOfFundsRaised;
    }
}
