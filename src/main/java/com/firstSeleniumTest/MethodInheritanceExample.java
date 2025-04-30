package com.firstSeleniumTest;

import com.google.common.annotations.VisibleForTesting;

// Superclass: Product
   class Product {
        private String name;
        private double price;
// Initialize the object of a method
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
// Created a method

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
        }
    }

    // Subclass: ElectronicProduct inherits from Product
    class ElectronicProduct extends Product {
        private String brand;

        public ElectronicProduct(String name, double price, String brand) {
            super(name, price); // Call to superclass constructor
            this.brand = brand;
        }

        public void displayBrand() {

            System.out.println("Brand: " + brand);
        }
    }

    // Subclass: ClothingProduct inherits from Product
    class ClothingProduct extends Product {
        private String size;

        public ClothingProduct(String name, double price, String size) {
            super(name, price); // Call to superclass constructor
            this.size = size;
        }

        public void displaySize() {
            System.out.println("Size: " + size);
        }
    }


    public class MethodInheritanceExample {
        public static void main(String[] args) {
            ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.00, "Dell");
            ClothingProduct shirt = new ClothingProduct("T-shirt", 29.99, "M");

            Product pr = new Product("samsung" , 26000);
            pr.displayDetails();
            laptop.displayDetails(); // Inherited method from Product
            laptop.displayBrand(); // Method specific to ElectronicProduct

            System.out.println(); // Blank line for separation

            shirt.displayDetails(); // Inherited method from Product
            shirt.displaySize(); // Method specific to ClothingProduct


        }
    }



//class product {
//    String name;
//    double price;
//
//    // object initialize
//    public product(String name, double price) {
//        this.name = name;
//        this.price = price;
//
//        // creating a method
//    }
//
//    public void displayDetails() {
//        System.out.println("print name:" + name);
//        System.out.println("print name:" + price);
//
//    }
//
//}
//        class electronicProduct extends product{
//       String brand;
//
//       public electronicProduct(String name , double price , String brand){
//           super(name, price);
//           this.brand=brand;
//       }
//
//       public void DisplayElectronicDetails(){
//           System.out.println("print brand:" + brand);
//       }
//
//        }
//
//
//
//
