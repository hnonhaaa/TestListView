package com.example.hnonhaaa.testlistview.model;

/**
 * Created by HNONHAAA on 10/29/2017.
 */

public class Animal {
    public final String name ;
    public final int picture ;//เก็บรูป ต้องเป็น int อ้างเป็น resorce id มันเป็น int

    public Animal(String name, int picture) {
        this.name = name;
        this.picture = picture;
    }
}
