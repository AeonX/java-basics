package aeonify;

public class Main {

    public static void main(String[] args) {
        //only one character
        //only single quotes
        //also support unicode characters. e.g Copyright character = 0090
        // width of 16 (2 bytes)
        char myChar = 's';
        char myUnicodeChar = '\u0090';

        System.out.println(myUnicodeChar);

        boolean myBoolean = true;
        //example
        boolean genderMale = true;

        //1. find the code for the registered symbol on the same line as the copyright symbol.
        //2. Create a variable of type char and assign it to the unicode value for that symbol.
        //3. Display in the screen
        char newSymbol = '\u0024';
        System.out.println(newSymbol);
    }
}
