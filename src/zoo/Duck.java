package zoo;

public class Duck extends Bird implements IFlier, ISwimmer {
    @Override
    public void makeEgg() {
        System.out.println("Duck brings 3-8 eggs");
    }

    public void walk(){
        System.out.println("top-top");
    }

    public void fly(){
        System.out.println("duck flies");
    }

    public void swim(){
        System.out.println("duck swims");
    }
    public void dive(){
        System.out.println("duck dives. bul-bul");
    }
}
