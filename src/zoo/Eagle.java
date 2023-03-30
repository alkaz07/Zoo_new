package zoo;

public class Eagle extends Bird implements IFlier{
    @Override
    public void makeEgg() {

    }

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }
}
