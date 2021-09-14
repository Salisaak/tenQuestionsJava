import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class javaTwentyQues {

    public static int getLastIndex(String[] names) {

        int nameIndex = names.length - 1;

        String index = names[nameIndex];               //Question 1

        int lastIndex = index.lastIndexOf("y");

        System.out.print("Last Index was ");

        return lastIndex;
    }

    public static int getSecondToLastIndex(String[] names) {
        int nameIndex = names.length - 2;

        String index = names[nameIndex];

        int lastIndex = index.lastIndexOf("v");//Question 2

        System.out.print("Index 2nd to last was ");

        return lastIndex;
    }

    public static String getFirstElement(String[] names) {

        String furstElement = names[0];

        System.out.print("First name was ");                //Question 3

        return furstElement;
    }

    public static String getLastElement(String[] names) {

        String element_name = names[4];                     //Question 4

        System.out.print("Last name was ");

        return element_name;
    }

    public static String getSecondToLastElement(String[] names) {
        String element_name = names[3];

        System.out.print("Name 2nd to last was ");               //Question 5

        return element_name;
    }

    public static int getSum(int[] ints) {

        int sum = 0;

        for (int s = 0; s < ints.length; s++) {

            sum = sum + ints[s];                            //Question 6
        }

        System.out.print("The sum is ");
        return sum;
    }

    public static int getAverage(int[] ints) {

        int average = 0;
                                                                //Question 7
        for (int a = 0; a < ints.length; a++) {

            average += ints[a];

        }

        int theAverage = average / ints.length;

        System.out.print("Average is ");

        return theAverage;
    }

    public static String extractAllOddNumbers(int[] numbers) {
        String sentence = "Extracted odd numbers";                  //Question 8

        for (int o = 0; o <= numbers.length; o++) {

            if (o % 2 == 1) {
                System.out.println(o);
            }

        }

        return sentence;
    }

    public static String extractAllEvenNumbers(int[] numbers) {

        String sentence = "Extracted even numbers";                 //Question 9

        for (int e = 0; e <= numbers.length; e++) {

            if (e % 2 == 0) {

                System.out.println(e);
            }

        }

        return sentence;
    }


    public static boolean contains(String[] names, String element) {

        for (int i = 0; i < names.length; i++) {
            String name = names[i];                                         //Question 10

            if (name.equals(element)) {

                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String[] leNames = {"Jodak", "LeVania", "Kaine", "Emil", "Yoko-Taro"};
        int[] leNumbas = {7, 34, 82, 13, 8};


        System.out.println((getLastIndex(leNames)));            //Question 1

        System.out.println((getSecondToLastIndex(leNames)));       //Question 2

        System.out.println((getFirstElement(leNames)));             //Question 3

        System.out.println((getLastElement(leNames)));              //Question 4

        System.out.println((getSecondToLastElement(leNames)));          //Question 5

        System.out.println((getSum(leNumbas)));                         //Question 6

        System.out.println((getAverage(leNumbas)));                 //Question 7

        System.out.println((extractAllOddNumbers(leNumbas)));          //Question 8

        System.out.println((extractAllEvenNumbers(leNumbas)));  //Question 9

        System.out.println((contains(leNames, "Kota")));        //Question 10

    }
}