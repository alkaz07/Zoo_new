package zoo;

public class Bat extends Mammal implements IFlier{
    @Override
    public void feedChild() {
        System.out.println("����-����-����");
    }

    public void fly()
    {
        System.out.println("bat flies");
    }
}
