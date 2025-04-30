package com.firstSeleniumTest;

//public class MixMethodsExample {
class GetterSetter {
    private String name;
// constructer



    // Getter for name
    public String getName() {
        return name;
    }

    // Create setter
    public void setName(String name) {
        this.name = name;
    }
}

        // Main class to demonstrate usage
        public class MixMethodsExample {
            public static void main(String[] args) {
                GetterSetter person = new GetterSetter();


                // Set values using setters
                person.setName("Alice");
                System.out.println(person.getName());

            }
        }
