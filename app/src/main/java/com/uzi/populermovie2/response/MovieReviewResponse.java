package com.uzi.populermovie2.response;


import com.uzi.populermovie2.model.Review;

import java.util.List;


public class MovieReviewResponse {
    private List<Review> results;

    public List<Review> getResults() {
        return results;
    }

    public void setResults(List<Review> results) {
        this.results = results;
    }
}
