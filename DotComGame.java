import java.util.ArrayList;

/**
 * Created by vchoubard on 19/09/14.
 */
public class DotComGame {
    private int numOfGuess = 0;
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList= new ArrayList<DotCom>();

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Tuenti.com");
        DotCom two = new DotCom();
        two.setName("Vocento.com");
        DotCom three = new DotCom();
        three.setName("Orange.fr");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Try to sink them all in the fewest number of guesses.");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCell(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";

        for (DotCom dotCom : dotComsList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All dot coms are dead!");
        System.out.println("It took you " + numOfGuess + " guesses");
    }

    public static void main(String[] args) {
        DotComGame game = new DotComGame();
        game.setUpGame();
        game.startPlaying();
    }
}
