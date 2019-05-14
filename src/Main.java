import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        System.out.println("Hello World!");

//        Exercise 1:
//        Create a function that returns an array from 0 to 100. Print the array in another function.
//        ArrayList<Integer> returnedArray = ex1();
//        printEx1(returnedArray);
//
//        Exercise 2:
//        Create a function that has a loop that quits with ‘q’. If the user doesn't enter 'q', ask them to input another string.
//
//        Exercise 3:
//        Create an array of 5 numbers. Using a loop, print the elements in the array reverse order. Do not use a function
//
//        Exercise 4:
//        Create a function that will have a hard coded array then ask the user for a number. Use the userInput to state how many numbers in an array are higher, lower, or equal to it.
//        Ex4();
//
//                Exercise 5
//        Create a function that will have a hard coded array of Kenn, Kevin, and Erin several times in the array. Print out how many times Kenn, Kevin, or Erin appears in an array.
        Ex5();
    }

    private static ArrayList<Integer> ex1(){
        ArrayList<Integer> zeroTo100 = new ArrayList<Integer>();
        int count  = 0;
        while(count<=100){
            zeroTo100.add(count);
            count++;
        }
        return zeroTo100;
    }

    private static void printEx1(ArrayList<Integer> array){
        for(Integer eachNumber: array)
            System.out.println(eachNumber);
    }

    private static void Ex4(){
        Scanner read = new Scanner(System.in);
//        Exercise 4:
//        Create a function that will have a hard coded array then ask the user for a number. Use the userInput to state how many numbers in an array are higher, lower, or equal to it.
        System.out.println("Enter a number");
        Integer userInput = read.nextInt();

        ArrayList<Integer> codedArray = new ArrayList<Integer>();
        Integer[] test = {1,2,3,4,5,6,7};
        codedArray.addAll(Arrays.asList(test));
        Integer higher = 0;
        Integer lower = 0;
        Integer equal = 0;

        for(Integer eachNumber: codedArray){
            if(eachNumber > userInput)
                higher++;
            else if(eachNumber < userInput)
                lower++;
            else
                equal++;
        }

        System.out.println("There were "+ higher+ " higher, " + lower + " lower, " + equal + " equal");
    }

    private static void Ex5(){
//        Create a function that will have a hard coded array of Kenn, Kevin, and Erin several times in the array. Print out how many times Kenn, Kevin, or Erin appears in an array.
        ArrayList<String> nameCountArray = new ArrayList<String>();
        String[] test = {"Kenn", "Kevin", "Erin", "Kevin", "Erin", "Kevin"};
        nameCountArray.addAll(Arrays.asList(test));
        Integer erinCount = 0;
        Integer kevinCount = 0;
        Integer kennCount = 0;

        for(String eachName: nameCountArray){
            if(eachName.equals("Erin"))
                erinCount++;
            else if(eachName.equals("Kevin"))
                kevinCount++;
            else if(eachName.equals("Kenn"))
                kennCount++;
        }

        System.out.println("There were "+ kennCount+ " Kenns, " + kevinCount + " Kevins, and " + erinCount + " Erins");

    }
}
