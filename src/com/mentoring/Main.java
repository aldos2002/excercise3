package com.mentoring;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();

        while(true) {
            list.add(new Object());

            if(list.size() == 100){
                list.clear();
            }
        }
    }

}