public class Car extends Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("Press the gas fast");
    }

    @Override
    public void start()
    {
        System.out.println("Put the kes in the hole and turn them and press the gas");
    }

    @Override
    public void stop()
    {
        System.out.println("Press the brakes slowly");
    }
}
