package aeonify;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 2f;
        //width of int = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Convert a given number of pounds to a kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // NOTES: 1 pound is equal to 0.45359237

        int pounds = 200;
        double formula = 0.45359237d;
        double conversion = pounds * formula;

        System.out.println(conversion);
    }
}
