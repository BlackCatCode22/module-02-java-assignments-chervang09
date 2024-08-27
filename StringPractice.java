// cV 8/27/24
// StringPractice.java



public class StringPractice {
    public static void main(String[] args) {

        System.out.printf("\nWelcome to My String Practice Program!\n");

        // Create a String object
        String myPracticeStr;
        myPracticeStr = "Hello From My STRING practice program!";

        System.out.println("\n myPracticeStr is : " + myPracticeStr );


        // Use a few String methods
        // a method is a object-oriented language name for a function\
        // method always have a pair of () attached to them
        //
        // Use the toLowerCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // Prove it...
        System.out.println("myNewStr is: " + myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("myNewStr is: " + myNewStr);

        // Use the length method
        // Create an int variable, because the length() method returns an int
        int myInt = 0;

        // Find the length of our object.

        myInt = myPracticeStr.length();
        // Prove it!
        System.out.println("\n The length of " + myPracticeStr + " is " + myInt);

        // .contains()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");
        System.out.println("\n The Value of isItThere is: " + isItThere);

        // charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);
        // Output the result
        System.out.println("\n The char at index " + anotherInt + " is " + myChar);

        // .indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\n The index of STR is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;

        oneMoreInt = myPracticeStr.indexOf("m");
        System.out.println("\n OneMoreInt is: " + oneMoreInt);

        // SubString!!
        String myLastStrObject;

        myLastStrObject = myPracticeStr.substring(0,myPracticeStr.indexOf("STR"));
        System.out.println("\n myLastStrObject is: " + myLastStrObject);












    }
}