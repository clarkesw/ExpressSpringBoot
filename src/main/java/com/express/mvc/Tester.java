package com.express.mvc;


public class Tester {
    public static void main(String[] args) {
        
    }
}

class BeachBike extends Bike{

    @Override
    public void changeGear() {
        System.out.println("Only 3 gears");
    }
}

abstract class Bike{
    int gears;
    
    public void hillClimb(){
        System.out.println("Push Hard ");
    }
    
    public abstract void changeGear(); 
}