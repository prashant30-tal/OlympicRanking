import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OlympicRanking {

    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("USA", 39, 41, 33));
        countries.add(new Country("China", 38, 32, 18));
        countries.add(new Country("Japan", 27, 14, 17));
        countries.add(new Country("Great Britain", 20, 21, 22));
        countries.add(new Country("Russia", 20, 28, 23));
        countries.add(new Country("India", 20, 28, 23));


        Collections.sort(countries, new MedalComparator());

        for (int i = 0; i < countries.size(); i++) {
            System.out.println((i + 1) + ". " + countries.get(i));
        }
    }
}
