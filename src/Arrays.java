// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Arrays {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        double [] myArray;
        myArray = new double[10];
        for (int i =0; i< myArray.length; i++){
            myArray[i] = Math.random();
            System.out.println("array[" +  i + "] = " + myArray[i]);
        }
        double max = java.util.Arrays.stream(myArray).max().getAsDouble();
        System.out.println("max = " + max);
        double min = java.util.Arrays.stream(myArray).min().getAsDouble();
        System.out.println("min = " + min);
        double sr = java.util.Arrays.stream(myArray).average().getAsDouble();
        System.out.println("sr = " + sr);
        //System.out.println(myArray[i]);

    }
}