package com.sanismail.movieweb.util;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class TestUser {
    public int id;
    public String name;
    @JsonManagedReference
    public List<TestItem> userItems = new ArrayList<>();

    public TestUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(TestItem item) {
        userItems.add(item);
    }
}
