package zoo;

public abstract class Animal {
    double weight;
    int age;

    @Override
    public String toString() {
        return "Animal of class "+this.getClass().getName()+
                " with params: " +
                "weight=" + weight +
                ", age=" + age +" "    ;
    }
}
