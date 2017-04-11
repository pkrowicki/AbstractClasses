import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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

//        GENERICS
        System.out.println("*******************************************");

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Pawel");
        items.add(4);
        items.add(5);

        printDoubled(items);

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer tim = new BaseballPlayer("Tim");
        SoccerPlayer mark = new SoccerPlayer("Mark");

        Team javaLovers = new Team("JAVELIN");
        javaLovers.addPlayer(joe);
        javaLovers.addPlayer(tim);
        javaLovers.addPlayer(mark);

        System.out.println(javaLovers.teamSize());

    }

    private static void printDoubled(ArrayList<Integer> n){
        for(int i : n){
            System.out.println( i * 2);
        }
    }

}
