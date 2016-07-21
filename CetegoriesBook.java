package com.example.dhkansat.librarymenagement.Model;

/**
 * Created by DH Kansat on 7/20/2016.
 */
public class CetegoriesBook {
    private String cetegoriesNameBook;
    public String getCetegoriesNameBook(){
        return cetegoriesNameBook;
    }

    public CetegoriesBook(String cetegoriesNameBook) {
        this.cetegoriesNameBook = cetegoriesNameBook;
    }

    @Override
    public String toString() {
        return cetegoriesNameBook;
    }
}
