package com.example.projectalpha42.presentation.pres.model;

import java.util.List;

public class RestTypesResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<Types> results;

    public Integer getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<Types> getResults() {
        return results;
    }
}
