public class Motorcycle extends Vehicle
{
    @Override
    public void accelerate()
    {
        System.out.println("turn the right handel down");
    }

    @Override
    public void start()
    {
        System.out.println("put one leg on the floor and one on the motorcycle and turn the right handle down");
    }

    @Override
    public void stop()
    {
        System.out.println("Turn the left handle up and put one leg on the floor");
    }
}
