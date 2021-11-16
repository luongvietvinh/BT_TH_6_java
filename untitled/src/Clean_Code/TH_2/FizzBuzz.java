package Clean_Code.TH_2;

public class FizzBuzz {
public static String fizzbuzz (int number) {
    if (number % 3 == 0 && number % 5 == 0)
        return "fizzbuzz";
    if (number % 3 == 0)
        return "fizz";
    if (number % 5 == 0)
        return "buzz";
    return number + "";
}

    public static String fizzBuzz(int number) {
        return null;
    }
}
