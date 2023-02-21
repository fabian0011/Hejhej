import org.junit.Test;
import org.testng.Assert;

public class MorseTest {

    @Test
    public void testEnglish() {
        Logic testLogic = new Logic();

        String english = "A";

        testLogic.translateEnglish(english);

        String actual = testLogic.translateEnglish(english);
        String expected = "*- ";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMorse() {
        Logic testLogic = new Logic();

        String morse = "--**";
        testLogic.translateMorse(morse);

        String actual = testLogic.translateMorse(morse);
        String expected = "Z";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpecial() {
        Logic testLogic = new Logic();

        String wrong = "_";

        testLogic.translateMorse(wrong);

        String acutal = testLogic.translateMorse(wrong);
        String expected = "";

        Assert.assertEquals(expected, acutal);





    }
    /*@org.junit.Test
    public void divisionResult() {
        MethodClass method = new MethodClass();

        //Arrange
        int input = 2;
        int input2 = 2;

        //Act
        int actual = method.divideTwoNumbers(input, input2);
        int expected = 1;

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void getNummer() {

        //Arrange
        MethodClass method = new MethodClass();

        //Act
        int actual = method.getPrivateNumber();
        int expected = 2;

        //Assert
        Assert.assertEquals(expected, actual);
    }
}*/
}
