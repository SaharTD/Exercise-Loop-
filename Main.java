import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

//        1.Write a program that prints the numbers from 1 to 100 such that:
//      --  If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
//              --  If the number is a multiple of 5, you need to print "Buzz" instead of that
//        number.
//              --  If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
//        instead of that number.
//




        /* programmer comments : I used for loop to print the numbers from 1 to 0
         and if and if else statements to put the condition before the print statement.
         */


        /// //the code////

//        for (int i = 1; i <= 100; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print(" FizzBuzz" + "\n");

//  find out if a number is multiply of a number we take the reminder if its equals to zero then is true
//  the first if contains the specific condition which is more completed , i multiply of 3 AND 5

//            } else if (i % 3 == 0) {
//                System.out.print(" Fuzz" + "\n");

// the else if contains the less specific condition i multiply of 3
//            } else if (i % 5 == 0) {
//                System.out.print(" Buzz" + "\n");

// the else if contains the less specific condition i multiply of 5

           // }
      //  }


        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////


//
//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT


        /// //the code////
          /// /// defined a char to print the reversed string . then used the for loop to iterate on the size of the String
        // the counter incrementing to start from the end
        
       System.out.print("Please enter a text to reverse it : ");
       String txt = input.nextLine();

       char reversed_word;
        for (int i = txt.length() - 1; i >= 0; i--) {

        reversed_word = txt.charAt(i);
           System.out.print(""+reversed_word);
        }
  

        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////



//
//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.


         /// //the code////

//
//        System.out.println(" please enter a number to find its factorial :");
//        int number = input.nextInt();
//        int factorial_numb =1;
//        //I added a counter for the factorial number  starting from 1 because zero multiply by any number will give us zero
//
//        for (int i =1 ; i <= number; i++) {
//            // the i counter start from 1
//            // the i will iterate until it reaches the number entered by the user
//            factorial_numb=factorial_numb * i;
//            // for each number the factorial_numb will multiply  by the incremented i until it reaches the condition (i <= number) and store it .
//
//        }
//        System.out.println("Factorial of " +number +
//                "\n"+ " = " +factorial_numb );
// I printed the factorial




        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////

//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method)

        /// //the code////


//        System.out.println(" please enter 2 numbers to find the power of number raised to the power of another  :" +"\n"+
//                "enter the base : ");
//     int number1_base = input.nextInt();
//
//        System.out.println("enter the power : ");
//        int number2_power = input.nextInt();
//
//
//        // took 2 numbers from the user
//
//
//        // this a counter for the increment
//        int count = 1;
//        //this is a variable to store the final result of the multiplication
//        int result=1;
//
//          while (count<= number2_power){
//              //while the count is less than or equal to the power the base will multiply by itself
//              result *= number1_base; // both the result and number1_base so its like multiplied by its self
//              count++;
//
//          }
//        System.out.println("The result: "+ result);
//
//
//
        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.

        /// //the code////
//
//        int sum=0;
//        int number=0;
//        int positive_sum=0;
//         int negative_sum=0;
//
//       do {
//           System.out.println("enter a number or zero to quit: ");
//           number = input.nextInt();
//           if (number % 2 == 0 && number != 0) {
//               positive_sum+=number;
//           } else if (number % 2 != 0) {
//               negative_sum +=number;
//
//           }
//
//       }while ( number != 0 && number >=0);
//       System.out.println("the positive numbers sum : "+positive_sum);
//      System.out.println("the negative numbers sum : "+negative_sum);



/// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////

//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.
//

        /// //the code////

        System.out.println("enter positive integer : ");
          int n = input.nextInt();

        boolean prime = true;

        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                prime = false;

            }
        }

        if((n > 1) && (prime = true))
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }




        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////
//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.
//        Expected Output:
//        Week 1
//        Day1
//                Day2
//        Day3
//                Day4
//        Day5
//                Day6
//        Day7
//        Week 2
//        Day1
//                Day2


        /// //the code////

//
//        int weak =0;
//        int days =0;
//
//        for (int i = 1; i <= 4 ; i++) {
//// the first loop to print the weaks from 1 to 4
//            System.out.println("Weak number : " +i);
//            // the second loop is nested, and it prints the days from 1 to 7
//            for (int j = 1; j <=7 ; j++) {
//                System.out.println("Day : " +j);
//            }
//        }
//
//

        /// //////////////////////////// ////////////////////////////////////////////////////////////////////////////////////////////


//        8.Write a program that's check if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left.


    /// /// I`m going to reverse the word first then compare the reversed word with the original word

        System.out.println("Please enter word to check if palindrome or not  : ");
        String Pword = input.nextLine();

        char reversed_word = 0;
        String palindrome_word = "";

        for (int i = Pword.length() - 1; i >= 0; i--) {

            reversed_word = Pword.charAt(i);//saved each char in the reversed word
            palindrome_word += String.valueOf(reversed_word); // added the char as string and stored in the variable palindrome_word
        }


        // string to store the reversed word
        if (palindrome_word.equalsIgnoreCase(Pword)) { // if the reversed word equals the original word the flag will be true else it will be false
            System.out.println("The word :  " + Pword + "\n " + "is palindrome word ");
        } else System.out.println("The word :  " + Pword + "\n " + "is palindrome NOT  word ");


    }
    




}










