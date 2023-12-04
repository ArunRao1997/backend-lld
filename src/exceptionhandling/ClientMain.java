package src.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        File f = new File("Abc.txt");
        FileReader fr = new FileReader(f);
        fr.read();

        try{
            System.out.println("Hi");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = x/y;
            System.out.println(c);
            System.out.println("Bye");
            System.exit(1);
        }catch (ArithmeticException e){
            System.out.println("Divide by zero not allowed");
        } finally {
            System.out.println("Finally Executed");
        }
        System.out.println("Ciao");




    }
}
