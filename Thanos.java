import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero, Hero t1) {
                return hero.getName().compareTo(t1.getName());
            }
        };
        Map<Hero, Flower> party = new TreeMap<>(comparator);
        party.put(hulk, rose);

        party.put(thor, rose);
        party.put(scarletWitch, rose);
        party.put(vision, tulip);
        party.put(captainAmerica, lily);
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);


        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        for (Hero hero : party.keySet()) {
            Flower flow = party.get(hero);
            if (flow.getName().equals("begonia")) {
                System.out.println("la fleur Begonia existe !");
            } else {
                System.out.println("la fleure Begonia n'existe pas dans le tableau");
            }
        }
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        System.out.println(party.containsValue(begonia));
        for (Hero hero : party.keySet()) {
            Flower flow = party.get(hero);
                System.out.println(flow.getName());

        }
    }


}

