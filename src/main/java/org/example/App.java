package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
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
        System.out.println("Exercise 3 :");
        Collection<String> list = new ArrayList<>();
        list.add("Mehrdad");
        list.add("Simon");
        list.add("Tom");
        list.add("Jack");
        list.add("Gorge");
        File destination = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Exercise3.txt");
        write(destination,list);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4 :");




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

    public static Collection<String> write(File destination , Collection<String> source){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination));
            for(String str : source){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
          return source;
    }
}
