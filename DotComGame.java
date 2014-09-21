/**
 * Created by vchoubard on 19/09/14.
 */
public class DotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();

        DotCom dotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locationCells = {randomNum, randomNum+1, randomNum+2};
        dotCom.setLocationCell(locationCells);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = dotCom.checkYourself(guess);
            numOfGuess++;

            if (result == "kill") {
                isAlive = false;
                System.out.println("you took " + numOfGuess + " guesses");
            }
        }
    }
}
