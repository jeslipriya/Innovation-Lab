class Vehicle{
    public void start(){
        System.out.println("start method from Vehicle class");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("start method from Car class");
        super.start();
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("start method from Bike class");
        super.start();
    }
}

class Main{
    public static void main(String arg[]){
        
        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}