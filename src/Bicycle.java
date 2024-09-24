public class Bicycle extends Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("Move your legs fast on the pedals");
    }

    @Override
    public void start()
    {
        System.out.println("Put your legs on the pedals and start moving them");
    }

    @Override
    public void stop()
    {
        System.out.println("Press the brakes on the right and left handle to stop");
    }
}
