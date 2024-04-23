package assignment;

import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Menu {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter1 = new FileWriter("EvenNumber.txt");
            BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);

            FileWriter fileWriter2 = new FileWriter("OddNumber.txt");
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
            for (int i = 1; i <= 100; i++) {
                if(i%2==0){
                    bufferedWriter1.write(String.valueOf(i));
                    bufferedWriter1.write(" ");
                    if(i%20==0){
                        bufferedWriter1.newLine();
                    }
                }else{
                    bufferedWriter2.write(String.valueOf(i));
                    bufferedWriter2.write(" ");
                    if(i%20==1){
                        bufferedWriter2.newLine();
                    }
                }
            }
            Scanner in=new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1. Even Number");
            System.out.println("2. Odd Number");
            System.out.println("3. Exit");
            System.out.println("Please Enter your choice: ");

            int ch= in.nextInt();

            switch (ch)
            {
                case 1:
                    FileReader fileReader = new FileReader("EvenNumber.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    while ((line = bufferedReader.readLine()) != null)
                    {
                        System.out.println(line);
                    }
                    bufferedReader.close();
                    break;

                case 2:
                    FileReader fileReader1 = new FileReader("OddNumber.txt");
                    BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
                    String line1;
                    while ((line1 = bufferedReader1.readLine()) != null)
                    {
                        System.out.println(line1);
                    }
                    bufferedReader1.close();

                default:
                    System.out.println("Invalid Option. Please Try Again");

            }
            bufferedWriter1.newLine();
            bufferedWriter1.close();
            bufferedWriter2.newLine();
            bufferedWriter2.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}