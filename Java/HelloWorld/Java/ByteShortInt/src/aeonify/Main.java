package aeonify;

public class Main {

    public static void main(String[] args) {
        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        //byte more efficient
        //when lot of calculation, better to use byte since it is allocating less
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        //will get error , b/c converting value to int
        //byte myNewByteValue = (myByteMinValue/2);
        byte myNewByteValue = (byte) (myByteMinValue / 2);

        // short has a width of 16
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;

        //long has a width of 64, max value 2^53
        long myLongMaxValue = 100L;


        //1. Create a byte variable and set it to any valid byte number
        byte myNewByteVar = 125;

        //2. Create a short variable and set it to any valid short number
        short myNewShortNumber = 25;

        //3. Create an int variable and set it to any valid integer number
        int myNewIntNumber = 103;

        //4. Create a variable of type long and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int
        long myNewLongNumber = 50000L + 10L * (myNewByteVar + myNewShortNumber + myNewIntNumber);

        System.out.println(myNewLongNumber);


    }
}
