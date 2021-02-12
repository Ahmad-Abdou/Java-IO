package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        File toRead = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Read-Exercise1.txt") ;
        System.out.println("Exercise 1 :");
        String str = read(toRead);
        System.out.println(str);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2 :");


    }
    public static String read(File source){

        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(source)) {
            int num;
            while ((num = fileReader.read()) != -1) {
                char letter = (char) num;
                sb.append(letter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }



}
