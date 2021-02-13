package org.example;

import Util.CSV;
import org.example.model.Car;

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
        CSV cs = new CSV();


        File toRead = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Read-Exercise1.txt") ;
        System.out.println("Exercise 1 :");
        String str = cs.read(toRead);
//        System.out.println(str);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2 :");
        File ReadingNames =new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Names.txt");
//        System.out.println(cs.read2(ReadingNames));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 3 :");
        Collection<String> list = new ArrayList<>();
        list.add("Mehrdad");
        list.add("Simon");
        list.add("Tom");
        list.add("Jack");
        list.add("Gorge");
        File destination = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Exercise3.txt");
        cs.write(destination,list);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4 :");
        File copyDestination = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\FolderDestination");
        File copySource = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\FileToCopy");
        cs.copy(copyDestination,copySource);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5 :");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(12345,"Bmw",2007));
        cars.add(new Car(46457,"Audi",2009));
        cars.add(new Car(87643,"Ford",2011));

        CSV.SavingToFile(cars,"carList.ser");
        List<Car>list2 =  CSV.Reading("carList.ser");
        for(Car c : list2){
            System.out.println(c.toString());
        }




    }


}

