/**
 * Created by Pawel Krowicki on 12.04.2017.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good with that... :(");
    }
}
