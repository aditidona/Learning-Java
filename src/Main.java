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
        
    }
}