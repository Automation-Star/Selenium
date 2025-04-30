package com.firstSeleniumTest;

import java.util.ArrayList;
import java.util.Collections;

public class JavaPrac2 {
    public static void main(String[] args) {
        findSecondLargestNum();

    }
        //Find the second-largest number in an ArrayList.
        public static  void findSecondLargestNum() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(30);
            list.add(40);
            Collections.sort(list);
            int largest = list.get(list.size()-1);
            System.out.println(largest);
            int secondLargest = Integer.MIN_VALUE;

            for(int i = list.size()-2;i>=0;i--){

             if (list.get(i)<largest){
                 secondLargest = list.get(i);

                 break;
             }
            }
            System.out.println("Second Largest Number: " + secondLargest);
        }
}
