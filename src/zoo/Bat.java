package zoo;

public class Bat extends Mammal implements IFlier{
    @Override
    public void feedChild() {
        System.out.println("писк-писк-писк");
    }

    public void fly()
    {
        System.out.println("bat flies");
    }
}
