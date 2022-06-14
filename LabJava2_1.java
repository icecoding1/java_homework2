public class LabJava2_1 {

    public static void main(String[] args) {
        byte largestByte = Byte.MAX_VALUE;
        short largesShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;
        char aChar = 'S';
        boolean aBoolean = true;

        System.out.println(largestByte);
        System.out.println(largesShort);
        System.out.println(largestInteger);
        System.out.println(largestLong);
        System.out.println(largestFloat);
        System.out.println(largestDouble);

        if(Character.isUpperCase(aChar)) {
            System.out.println("The character" + aChar + "is upper case.");
        } else {
            System.out.println("The caracter" + aChar + "is lower case.");
        }
        System.out.print("The value of aBoolean is " + aBoolean);
    }

}
