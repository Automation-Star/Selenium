package com.firstSeleniumTest;


    class Employee {
        public void introduce() {

            System.out.println("I am an employee.");
        }
    }

    // Subclass overriding introduce()
    class Developer extends Employee {
        @Override
        public void introduce() {

            System.out.println("I am a developer.");
        }
    }

    public class MethodOverridingExample {
        public static void main(String[] args) {
            Employee emp = new Developer(); // Employee reference but Developer object
            emp.introduce(); // Output: "I am a developer."
        }
    }

    class School{
        public void introduce(){

            System.out.println("Say hello to students");
        }
    }

class Teacher extends School {
    @Override
    public void introduce() {

        System.out.println("Say hello to Teacher");
    }
}


