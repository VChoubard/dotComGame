import java.util.ArrayList;

/**
 * Created by vchoubard on 19/09/14.
 */
public class DotCom {
    ArrayList<String> locationCells = new ArrayList<String>();
    String name;

    public void setLocationCell(ArrayList<String> cells) {
            locationCells = cells;
    }

    public String checkYourself(String stringGuess) {
        int index = locationCells.indexOf(stringGuess);
        String result = "miss";

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Outch you sunk " + name + " :(");
            } else {
                result = "hit";
            }
        }
        return result;
    }

    public void setName(String s) {
        name = s;
    }
}
