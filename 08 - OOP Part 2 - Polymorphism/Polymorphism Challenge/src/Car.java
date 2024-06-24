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
    public double avgKmPerCharge;
    public int batterySize=6;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {

        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void drive() {

        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    public double avgKmPerLiter;
    public int batterySize=6;
    public int cylinders=6;

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

        System.out.printf("Hybrid -> %d cylinders are fired up. %n", cylinders);
        System.out.printf("Hybrid -> switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    public void drive() {

        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);

    }
}

