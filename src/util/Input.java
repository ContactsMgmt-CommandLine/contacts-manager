package util;
import java.util.Scanner;

public class Input {

//    All prompts are printed with .print();
//    If line break needed, add "\n" into prompt argument


    private static Scanner sc = new Scanner(System.in);

    //    BOOLEANS ----------

    public static boolean yesNo() {
        System.out.print(" [y/n] ");
        String response = sc.next();
        return (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes"));
    }

    public static boolean yesNo(String prompt) {
        System.out.print(prompt + " [y/n] ");
        String response = sc.next();
        return (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes"));
    }

//    STRINGS -----------

    public static String getString() {
        return sc.nextLine();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        if (sc.hasNext()) {
            return sc.nextLine();
        } else {
            return getString(prompt);
        }
    }
//    NUMBERS -----------

//    ------ byte

    public static byte getByte(){
        if (sc.hasNextByte()) {
            return sc.nextByte();
        } else {
            sc.next();
            return getByte();
        }
    }
    public static byte getByte(String prompt) {
        System.out.print(prompt);
        return getByte();
    }
    public static byte getByte(byte min, byte max) {
        byte userByte = getByte();
        if (userByte < min || userByte > max) {
            return getByte(min, max);
        } else {
            return userByte;
        }
    }
    public static byte getByte(byte min, byte max, String prompt) {
        System.out.print(prompt);
        return getByte(min, max);
    }

//    ------ short

    public static short getShort(){
        if (sc.hasNextShort()) {
            return sc.nextShort();
        } else {
            sc.next();
            return getShort();
        }
    }
    public static short getShort(String prompt) {
        System.out.print(prompt);
        return getShort();
    }
    public static short getShort(short min, short max) {
        short userShort = getShort();
        if (userShort < min || userShort > max) {
            return getShort(min, max);
        } else {
            return userShort;
        }
    }
    public static short getShort(short min, short max, String prompt) {
        System.out.print(prompt);
        return getShort(min, max);
    }

//    ------ int

    public static int getInt(){
        String userInput = sc.next();
        try {
            int userInt = Integer.valueOf(userInput);
            return userInt;
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Sorry, that is not an integer.");
            return getInt();
        }
//        OLDER VERSION
//        if (sc.hasNextInt()) {
//            return sc.nextInt();
//        } else {
//            sc.next();
//            return getInt();
//        }
    }
    public static int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }
    public static int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            return getInt(min, max);
        } else {
            return userInt;
        }
    }
    public static int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        return getInt(min, max);
    }

//    ------ long

    public static long getLong(){
        if (sc.hasNextLong()) {
            return sc.nextLong();
        } else {
            sc.next();
            return getLong();
        }
    }
    public static long getLong(String prompt) {
        System.out.print(prompt);
        return getLong();
    }
    public static long getLong(long min, long max) {
        long userLong = getLong();
        if (userLong < min || userLong > max) {
            return getLong(min, max);
        } else {
            return userLong;
        }
    }
    public static long getLong(long min, long max, String prompt) {
        System.out.print(prompt);
        return getLong(min, max);
    }

//    ------ float

    public static float getFloat(){
        if (sc.hasNextFloat()) {
            return sc.nextFloat();
        } else {
            sc.next();
            return getFloat();
        }
    }
    public static float getFloat(String prompt) {
        System.out.print(prompt);
        return getFloat();
    }
    public static float getFloat(float min, float max) {
        float userFloat = getFloat();
        if (userFloat < min || userFloat > max) {
            return getFloat(min, max);
        } else {
            return userFloat;
        }
    }
    public static float getFloat(float min, float max, String prompt) {
        System.out.print(prompt);
        return getFloat(min, max);
    }

//    ------ double

    public static double getDouble(){
        String userInput = sc.next();
        try {
            double userDbl = Double.valueOf(userInput);
            return userDbl;
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Sorry, that is not an Double.");
            return getDouble();
        }

//          OLD VERSION
//        if (sc.hasNextDouble()) {
//            return sc.nextDouble();
//        } else {
//            sc.next();
//            return getDouble();
//        }
    }
    public static double getDouble(String prompt) {
        System.out.print(prompt);
        return getDouble();
    }
    public static double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }
    public static double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        return getDouble(min, max);
    }

//    ---- hex

    public static int getHex() {
        String userInput = sc.next();
        try {
            int covertedInteger = Integer.valueOf(userInput, 16);
            return covertedInteger;
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Sorry, that is not an Hexadecimal.");
            return getHex();
        }
    }

    public static int getBinary() {
        String userInput = sc.next();
        try {
            int convertedBinary = Integer.valueOf(userInput, 2);
            return convertedBinary;
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Sorry, that is not a Binary.");
            return getBinary();
        }
    }

//    CHAR --------------

}
