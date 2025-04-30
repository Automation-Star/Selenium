package com.firstSeleniumTest;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateFromArray {

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private int age =30;


    public static void main(String[] args){

        ArrayList<Integer> findDup= new ArrayList<>();
        findDup.add(1);
        findDup.add(2);
        findDup.add(2);
        HashSet<Integer> set = new HashSet<>(findDup);
       //remove duplicates
        System.out.println(set);
        //Find size
        System.out.println(findDup.size());

        // add integer
        findDup.add(4);

        System.out.println(findDup);

    }


}


