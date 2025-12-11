package com.firstSeleniumTest;

public class FindDupFromArray {
    public static void main(String[] args){
            int[] numbers = {1, 2, 3, 4, 5, 6, 3, 7, 8, 2};

            findDuplicates(numbers);

        }

        public static void findDuplicates(int[] array) {
            System.out.println("Duplicates in the array:");

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        break; // Avoid printing the same duplicate multiple times
                    }
                }
            }
        }

        
    }


