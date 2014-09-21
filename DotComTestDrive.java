/**
 * Created by vchoubard on 21/09/14.
 */
public class DotComTestDrive {
    public static void main (String [] args) {
        DotCom dot = new DotCom();

        int[] locations = {2,3,4};
        dot.setLocationCell(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
