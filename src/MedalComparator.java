import java.util.Comparator;

public class MedalComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        if(o1.getGold() != o2.getGold()) {
            return o2.getGold() - o1.getGold();
        }
        else if(o1.getSilver() != o2.getSilver()) {
            return o2.getSilver() - o1.getSilver();
        }
        else if(o1.getBronze() != o2.getBronze()) {
            return o2.getBronze() - o1.getBronze();
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
