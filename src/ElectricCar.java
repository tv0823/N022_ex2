public class ElectricCar extends Car
{
    @Override
    public void accelerate()
    {
        System.out.println("Im accelerating by pressing the magnet option");
    }

    @Override
    public void start()
    {
        System.out.println("Put key card on the plat form");
    }

    @Override
    public void stop()
    {
        System.out.println("Put out the key card");
    }
}
