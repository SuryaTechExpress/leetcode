package corejava.has_a_relation;
// Composition example
public class Composition {
    public static void main(String[] args) {
        // Create a new car
        Car myCar = new Car();
        // Start and stop the car
        myCar.startCar();
        myCar.stopCar();
    }
}

// Engine class (part of Car)
class Engine{
    private boolean isRunning;

    // Engine constructor
    public Engine(){
        this.isRunning = false;
    }

    // Start the engine
    public void start(){
        isRunning = true;
        System.out.println("Engine started");
    }

    // Stop the engine
    public void stop(){
        isRunning = false;
        System.out.println("Engine stopped");
    }
}


// Car class composed of Engine
class Car{
    private Engine engine; // Composition

    // Car constructor
    public Car(){
        this.engine = new Engine();
    }

    // Start the car
    public void startCar(){
        engine.start();
        System.out.println("Car started");
    }

    // Stop the car
    public void stopCar(){
        engine.start();
        System.out.println("Car stopped");
    }
}