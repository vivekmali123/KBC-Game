package com.intershala.javaapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class KBC {
    String highScore = "100 points";
    String name, demo, quiz;
    int age;
    String mobileNo;
    int select;
    String A= "A";
    String B= "B";
    String C= "C";
    String D= "D";
    String Ans;
    Boolean yourAns;
    int score = 0;
    Scanner s = new Scanner(System.in);
//User Information
    public void welcome(){
        System.out.println("     \n\n    ****** Welcome To Kaun Banega Crorepati ******");
        System.out.println("        Highest Score of the Game: " + highScore);
        System.out.println("Common Instructions are: \n 1. For Playing the game fill the following required details. \n 2. Here will be 10 Questions. \n 3. Each Question will carry 10 points. \n 4. After selecting Wrong answer you will loss the game. \n\n");

        System.out.println("\n Enter Your Name: ");
        name = s.nextLine();
        System.out.println("Enter Your Mobile Number: ");
        mobileNo = s.nextLine();
        System.out.println("Enter Your Age: ");
        age = s.nextInt();
    }
//Menu
       public void letsPlay(){
       System.out.println("\n Menu: \n 1. Demo Game \n 2. KBC Quiz \n 3. Help \n 4. Read Last Profile. \n 5. Quit");

       select = s.nextInt();
//Select Menu
       switch(select){
           case 1:
               System.out.println("Server Down! Play later on, you can play KBC Quiz....");
               break;
           case 2:
               System.out.println("**** Let's Play Kaun Banega Crorepati ****");
               System.out.println("\n So, Be ready to win. Your Questions are: \n");
 //1st Question
               Scanner sc=new Scanner(System.in);
               while(score<=100) {
                   System.out.println("1. In the Film 'OMG Oh My God' Kanji Bhai filed a case against whom for the damage of his shop \n due to an earthquake ?\n" +
                           "(A) Bharat Mata (B) Parliament (Bhartiya Sansad)\n" +
                           "(C) Mumbai City (D) Bhagwan (God)");
                   Ans = sc.nextLine();
                   if (Ans.equals(D)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//2nd Question
                   System.out.println("\n2. What is the new name of the Hyderabad franchise that would replace Deccan Charges in IPL6?\n" +
                           "(A) Sun Chargers (B) Nizam Jyothi\n" +
                           "(C) Andhra Aces (D) Sun risers Hyderabad");
                   Ans = sc.nextLine();
                   if (Ans.equals(D)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }

//3rd Question
                   System.out.println("\n3. In India, under which Union Ministry does the ‘Rajbhasha Vibhag’ function?\n" +
                           "(A) Home Affairs (B) HRD\n" +
                           "(C) Culture (D) Law & Justice");
                   Ans = sc.nextLine();
                   if (Ans.equals(A)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//4th Question
                   System.out.println("\n4. According to a proverb, what is said to be 'the mother of invention' ?\n" +
                           "(A) Society (B) Problem\n" +
                           "(C) Science (D) Necessity");
                   Ans = sc.nextLine();
                   if (Ans.equals(D)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//5th Question
                   System.out.println("\n5.Floor exercise, vault, and uneven bars are events in which sport ?\n" +
                           "(A) Synchronised Swimming (B) Gymnastics\n" +
                           "(C) Skating (D) Wrestling");
                   Ans = sc.nextLine();
                   if (Ans.equals(B)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//6th Question
                   System.out.println("\n6.Which actress got married to Siddharth Roy Kapur in 2012 ?\n" +
                           "(A) Prachi Desai (B) Lisa Ray\n" +
                           "(C) Vidya Balan (D) Sushmita Sen");
                   Ans = sc.nextLine();
                   if (Ans.equals(C)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//7th Question
                   System.out.println("\n7.Which among these is an Island country ?\n" +
                           "(A) Yemen (B) Maldives\n" +
                           "(C) Oman (D) Peru");
                   Ans = sc.nextLine();
                   if (Ans.equals(B)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//8th Question
                   System.out.println("\n8.what has been e currency of Greece sine 2002?\n" +
                           "(A) Euro (B) peso\n" +
                           "(C) Drachma (D) Lira");
                   Ans = sc.nextLine();
                   if (Ans.equals(A)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//9th Question
                   System.out.println("\n9.Which constituency does Abhijit Mukherjee represents in the 15th Lok Sabha ?\n" +
                           "(A) Jadavpur (B) Birbhum\n" +
                           "(C) Jangipur (D) Midnapore");
                   Ans = sc.nextLine();
                   if (Ans.equals(C)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//10th Question
                   System.out.println("\n10.which Indian sportsperson was awarded the “order of Australia” award in 2012?\n" +
                           "(A) Saina Nehwal (B) Sachin Tendulkar\n" +
                           "(C) Sania Mirza (D) Rahul Dravid");
                   Ans = sc.nextLine();
                   if (Ans.equals(B)) {
                       yourAns = true;
                       score = score + 10;
                       System.out.println("It's Right Answer !\n Your Score: " + score);
                   } else {
                       System.out.println("Sorry You are wrong ! Better Luck next Time.\nYour Score: ");
                       break;
                   }
//fineshed
                   System.out.println("\n** Congrats! You Won, You Had Built the High Score **");
                   break;
               }
               break;

           case 3:
               System.out.println(" System.out.println(\"Instructions are: \\n 1. Here will be 10 Questions. \\n 2. Each Question will carry 10 points. \\n 3. There will no negative points. \\n 4. After selecting Wrong answer you will lost the game." +
                       "\n 5. Menu will be selected once.\n 6. For changing menu you need to restart Game.");
               break;
           case 4:
               File kbc = new File("C:\\Users\\admin\\Desktop\\kbc.txt");
               Scanner s = new Scanner(System.in);
               while (s.hasNextLine()) {
                   String str = s.nextLine();
                   System.out.println(str);
               }
               break;
           case 5:
               break;
       }
   }

    public void writeFile(){
        System.out.println(score);
        FileWriter fw= null;
        try {
            fw = new FileWriter("C:\\Users\\admin\\Desktop\\kbc.txt");
           // Scanner scan = new Scanner(fw);
            fw.write( " High Score: " + highScore + "\n\n Name of user: " + name + "\n Age of user: " + age + "\n Mobile Number of user: " + mobileNo +
                    "\n\n Your Score is: " + score);

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void readFile(){

    }*/

   public static void main(String[] args) {
	  KBC kbc=new KBC();
	  kbc.welcome();
       kbc.letsPlay();
	  kbc.writeFile();
	  //kbc.readFile();

   }
}
