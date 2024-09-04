package com.express.mvc;

public class GFG{ 
    public static void main (String[] args) throws ClassNotFoundException { 
  
        Class<?> myClass = String.class;
        System.out.println("Name: " + myClass.getName());
        System.out.println("Simple name: " + myClass.getSimpleName());
        System.out.println("Superclass: " + myClass.getSuperclass());
        
        Class cls = Class.forName("com.express.mvc.OuterClass");
        System.out.println("OuterClass: " + cls.arrayType());
//        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
//        nestedObject.display();        
    } 
} 

//  Name: java.lang.String
//  Simple name: String
//  Superclass: class java.lang.Object
//  OuterClass: class [Lcom.express.mvc.OuterClass;
class OuterClass {

    private static int outerStaticVar = 10;
    private int outerInstanceVar = 20;

    // Static Nested Class
    public static class StaticNestedClass {

        public void display() {
            // Can access static members of the outer class
            System.out.println("Outer Static Var: " + outerStaticVar);

            // Cannot access instance members of the outer class directly
         //   System.out.println("Outer Instance Var: " + outerInstanceVar); // This would be an error
        }
    }
}

//        List<Product> products = Arrays.asList(
//            new Product("Laptop", 1500),
//            new Product("Smartphone", 800),
//            new Product("Tablet", 400),
//            new Product("Monitor", 300)
//        );
//        IntSummaryStatistics summary = products.stream()
//                .collect(Collectors.summarizingInt(Product::getPrice));
//        System.out.println(summary.getAverage());

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }
    
}

// This code is contributed by shivanisinghss2110
