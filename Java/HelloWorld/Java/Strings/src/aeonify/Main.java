package aeonify;

public class Main {

    public static void main(String[] args) {
	//primitive types are
        //basic types
        /*
        * byte
        * short
        * int
        * long
        * float
        * double
        * char
        * boolean
        * */

        //string
        //a string is a sequence of characters
        //not really primitive but a class, but you can count it as a primitive type
        String myString = "This is a string";
        System.out.println(myString);

        String numberString = "250.55";
        //will concatenate the two strings
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        //will concatenate the number and string again ans: 1050
        // true for all data type as well
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
