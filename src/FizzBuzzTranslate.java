public class FizzBuzzTranslate {
    static String traslate(int number){
        if(number>0){
            boolean FizzBuzz = number % 3 == 0 && number % 5 == 0;
            boolean Buzz = number % 5 == 0;
            boolean Fizz = number % 3 == 0;
            if (FizzBuzz){
                return "FizzBuzz";
            }
            else {

                if(Buzz){
                    return "Buzz";
                }
                else {
                    if(Fizz){
                        return "Fizz";
                    }
                }
            }
            return null;
        }
        return null;
    }
}
