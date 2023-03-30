package zoo;

public class Whale extends Mammal implements ISwimmer{
    @Override
    public void feedChild() {
        System.out.println("whale feeds her child in the water");
    }

    @Override
    public void swim() {
        System.out.println("Whale swims");
    }
}
