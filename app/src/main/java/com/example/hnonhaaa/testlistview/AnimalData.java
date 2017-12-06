package com.example.hnonhaaa.testlistview;

import com.example.hnonhaaa.testlistview.model.Animal;

import java.util.ArrayList;

/**
 * Created by HNONHAAA on 10/29/2017.
 */
//ความนนี้มีไว้เพื่อเป็น global ได้เรียกใช้ รายชื่อของlist จากทุกที่ จะได้ไม่ต้องส่งค่าหลายๆอัน ส่งแค่ index อย่างเดียว
public class AnimalData {
    /*private static AnimalData sInstance ; //use static จะสามารถ เรียกใช้ได้จากทุกควาส

    public ArrayList<Animal> animalList;




    public static AnimalData getInstance(){
        if(sInstance == null ){
            sInstance = new AnimalData();
        }
        return sInstance ;
    }*/
    public static int x;
    public static ArrayList<Animal> animalList ;

}
