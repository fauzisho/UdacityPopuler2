package com.uzi.populermovie2.response;


import com.uzi.populermovie2.model.MovieVideo;

import java.util.List;

public class MovieTrailersResponse {
    private int id;
    private List<MovieVideo> results;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MovieVideo> getResults() {
        return results;
    }

    public void setResults(List<MovieVideo> results) {
        this.results = results;
    }
}
