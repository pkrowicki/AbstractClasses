/**
 * Created by Pawel Krowicki on 12.04.2017.
 */
public class Spearrow extends Bird {

    public Spearrow(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is now flyyyyying");
    }
}
