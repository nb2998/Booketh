package com.apps.bellatrix.booketh;

import java.io.Serializable;

public class Book implements Serializable {
    String name, author, summary, sampleContent;
    boolean isPublished;
    int fundingStatus, fundingDaysLeft; // 0 - never, 1- Progress, 2-over

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String summary, String sampleContent, int fundingStatus, boolean isPublished) {
        this.name = name;
        this.author = author;
        this.summary = summary;
        this.sampleContent = sampleContent;
        this.isPublished = isPublished;
        this.fundingStatus = fundingStatus;
        this.fundingDaysLeft = 43;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }

    public String getSampleContent() {
        return sampleContent;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public int getFundingStatus() {
        return fundingStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setSampleContent(String sampleContent) {
        this.sampleContent = sampleContent;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setFundingStatus(int fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

    public int getFundingDaysLeft() {
        return this.fundingDaysLeft;
    }
}
