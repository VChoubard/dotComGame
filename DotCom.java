import java.util.ArrayList;

/**
 * Created by vchoubard on 19/09/14.
 */
public class DotCom {
    ArrayList<Integer> locationCells = new ArrayList<Integer>();

    public void setLocationCell(int[] cells) {
        for (int cell : cells) {
            locationCells.add(cell);
        }
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        int index = locationCells.indexOf(guess);
        String result = "miss";

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }
}
