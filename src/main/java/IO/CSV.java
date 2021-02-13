package IO;

import org.example.model.Car;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CSV {

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

    public static void copy(File destination, File source){
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination));

            byte[] buffer = new byte[1024];
            int num;
            while((num=in.read()) != -1){
                out.write(num);
                out.flush();
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void SavingToFile(List<Car> source , String path){

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));) {
            out.writeObject(source);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Car> Reading(String path){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));) {
            List<Car> destination = (List<Car>)in.readObject();

            return destination;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
