package org.example;

import IO.CSV;
import JsonIO.JsonIO;
import org.example.model.Car;
import org.example.model.Owner;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CSV cs = new CSV();


        File toRead = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Read-Exercise1.txt");
        System.out.println("Exercise 1 :");
        String str = cs.read(toRead);
//        System.out.println(str);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 2 :");
        File ReadingNames = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\Names.txt");
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
        cs.write(destination, list);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 4 :");
        File copyDestination = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\FolderDestination");
        File copySource = new File("C:\\Users\\kyoub\\IdeaProjects\\Java I\\Java-IO\\FileToCopy");
        cs.copy(copyDestination, copySource);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 5 :");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("JSR345", "Bmw", "R56"));
        cars.add(new Car("HSU457", "Audi", "Y4"));
        cars.add(new Car("ORT643", "Ford", "T8"));
        CSV.SavingToFile(cars, "carList.ser");
        List<Car> list2 = CSV.Reading("carList.ser");
        for (Car c : list2) {
            System.out.println(c.toString());
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Exercise 6 :");
        List<Car> cars2 = new ArrayList<>();
        cars2.add(new Car("HFW125", "BMW", "T35", LocalDate.parse("2010-05-09"),
                new Owner("Simon", LocalDate.parse("1980-05-06"))));
        cars2.add(new Car("KFT736", "Audi", "R8", LocalDate.parse("2012-02-11"),
                new Owner("Jack", LocalDate.parse("1987-10-09"))));
        JsonIO jsonIO = new JsonIO();
        jsonIO.serializeToJson(cars2, new File("cars.json"));
        jsonIO.deserialize(new File("cars.json"));
        cars2.forEach(System.out::println);


    }


}

