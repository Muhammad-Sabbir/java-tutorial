public class Car {
    public String description;

//    public Car(){};

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car startEngine Method");
    }

    public void drive(){
        System.out.println("Car drive Method and Type is " + getClass().getSimpleName());
        runEngine();
    };

    protected void runEngine(){
        System.out.println("Car runEngine");
    };
}

class GasPowerCar extends Car {
    public double avgKmPerLiter;
    public int cylinders=6;

    public GasPowerCar(String description) {
        super(description);
    }
    public GasPowerCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    public void drive() {
       System.out.printf("Gas -> usage exceeds the average: %2f %n", avgKmPerLiter);

    }
}

class ElectricCar extends Car{
    public double avgKmPerLiter;
    public int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerLiter, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("ElectricCar startEngine Method");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("ElectricCar drive Method");
    }
}

class HybridCar extends Car{
    public double avgKmPerLiter;
    public int batterySize;
    public int cylinders;

    public HybridCar(String description) {
        super(description);
    }
    public HybridCar(String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("HybridCar startEngine Method");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("HybridCar drive Method");
    }
}

