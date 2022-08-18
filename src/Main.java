public class Main {
    public static void main(String[] args) {
        int maxValueInteger = Integer.MAX_VALUE;
        int minValueInteger = Integer.MIN_VALUE;
        System.out.println("Max value of Integer: " + maxValueInteger);
        System.out.println("Min value of Integer: " + minValueInteger);
        System.out.println("Busted max value: " + (maxValueInteger+1));
        System.out.println("Busted min value: " + (minValueInteger-1));

        byte minValueByte = Byte.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        System.out.println("Max value if Byte is: " + maxValueByte);
        System.out.println("Min value of Byte is: " + minValueByte);

        short minValueShort = Short.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        System.out.println("Max value of Short is: " + maxValueShort);
        System.out.println("Min value Short is: " + minValueShort);

        long maxValueLong = Long.MAX_VALUE;
        long minValueLong = Long.MIN_VALUE;
        System.out.println("Max value of Long is: " + maxValueLong);
        System.out.println("Min value of Long is: " + minValueLong);

        byte byteVar = 1;
        short shortVar = 2;
        int intVar = 4;
        long longVar = 50000 + 10*(byteVar + shortVar + intVar);
        System.out.println(longVar);

        float maxValueFloat = Float.MAX_VALUE;
        float minValueFloat = Float.MIN_VALUE;
        System.out.println("Max value of Float is: " + maxValueFloat);
        System.out.println("Min value of Float is: " + minValueFloat);

        double maxValueDouble = Double.MAX_VALUE;
        double minValueDouble = Double.MIN_VALUE;
        System.out.println("Max value of Double is: " + maxValueDouble);
        System.out.println("Min value of Double is: " + minValueDouble);

        double pounds = 3.6;
        double poundsInKgs = pounds * 0.45359237;
        System.out.println(poundsInKgs);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        //char can hold unicode chars as well hence the size if 16bits. holds the extra 65k approx letters

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        //appending to a string using + is not very effective, shown just for example -> alternative is string buffer
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        //String can also hold unicode chars. its a collection of chars which can store INT_MAX number of chars. very huge !!
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        // appending any other datatype to string automatically gets type-casted to string
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}