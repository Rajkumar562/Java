package Abstraction;

public class Repair
{
    public static void RepairCar(Car car)
    {
        System.out.println("Car is repaired");
    }
    public static void main()
    {
        WagonR wagonR=new WagonR();
        Audi audi = new Audi();
        audi.honk();
        wagonR.honk();
        audi.accelerate();
        RepairCar(wagonR);
        RepairCar(audi);
    }
}