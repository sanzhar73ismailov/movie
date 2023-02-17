package com.sanismail.movieweb.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class JsonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void jsonTest() {
    }

    @Test()
    public void givenBidirectionRelation_whenSerializing_thenException()
            throws JsonProcessingException {

        TestUser user = new TestUser(1, "John");
        TestItem item = new TestItem(2, "book", user);
        user.addItem(item);

        //String str = new ObjectMapper().writeValueAsString(item);
      //  String str = new ObjectMapper().writeValueAsString(new Temp(1, "sss"));
       String str = new ObjectMapper().writeValueAsString(user);
        System.out.println("str = " + str);
    }


}

class Temp {
    int id;
    String name;

    public Temp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
