/**
 * Created by Pawel Krowicki on 12.04.2017.
 */
public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, just like in the Dog case");
    }

    public abstract void fly();
}
