package com.sanismail.movieweb.util;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class TestItem {
    public int id;
    public String itemName;
    @JsonBackReference
    public TestUser owner;

    public TestItem(int id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public TestItem(int id, String itemName, TestUser owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
