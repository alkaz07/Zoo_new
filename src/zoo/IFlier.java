package zoo;

public interface IFlier {
    void fly();
    default void takeOff()
    {
        System.out.println("something takes off");
    }
    default void land(){}
}
