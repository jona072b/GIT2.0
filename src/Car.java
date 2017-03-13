/**
 * Created by Alberte on 13/03/2017.
 */
public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
        System.out.println("Now it is a car");
    }


    public Car() {
        System.out.println("This is not a car");
    }

    public String getName() {
        return name;
    }

}
