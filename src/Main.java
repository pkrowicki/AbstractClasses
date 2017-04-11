public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Dog kajla = new Dog("Kajla");
        kajla.breathe();
        kajla.eat();
        System.out.println(kajla.getName());

        Spearrow spearrow = new Spearrow("Mike");
        spearrow.breathe();
        spearrow.eat();
        System.out.println(spearrow.getName());
        spearrow.fly();

        Penguin pingu = new Penguin("Pingu");
        pingu.breathe();
        pingu.eat();
        pingu.fly();

    }
}
