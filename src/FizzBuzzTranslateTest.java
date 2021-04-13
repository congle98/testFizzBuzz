import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void traslate() {
        String desiredResult = null;
        String actualResult = FizzBuzzTranslate.traslate(4);
        assertEquals(desiredResult,actualResult);
    }
    @org.junit.jupiter.api.Test
    void traslateFizzBuzz() {
        String desiredResult = "FizzBuzz";
        String actualResult = FizzBuzzTranslate.traslate(15);
        assertEquals(desiredResult,actualResult);
    }
    @org.junit.jupiter.api.Test
    void traslateFizz() {
        String desiredResult = "Fizz";
        String actualResult = FizzBuzzTranslate.traslate(9);
        assertEquals(desiredResult,actualResult);
    }
    @org.junit.jupiter.api.Test
    void traslateBuzz() {
        String desiredResult = "Buzz";
        String actualResult = FizzBuzzTranslate.traslate(20);
        assertEquals(desiredResult,actualResult);
    }
}