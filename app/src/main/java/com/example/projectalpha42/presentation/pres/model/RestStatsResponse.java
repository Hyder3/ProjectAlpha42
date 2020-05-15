package com.example.projectalpha42.presentation.pres.model;

import java.util.List;

public class RestStatsResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<Stats> results;

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Stats> getResults() {
        return results;
    }
}
