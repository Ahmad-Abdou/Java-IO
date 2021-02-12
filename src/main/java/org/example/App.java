package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
//        System.out.println(str);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2 :");
        File ReadingNames =new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Names.txt");
//        System.out.println(read2(ReadingNames));
        System.out.println("----------------------------------------------------------------------------------");


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

    public static List<String> read2(File source){
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
            String line;
            while ((line=bufferedReader.readLine())!=null){

                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
