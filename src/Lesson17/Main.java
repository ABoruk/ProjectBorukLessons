package Lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//first();
//second();
third();
forth();
    }
    public static void first(){
        File file=new File("File.txt");

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов живых объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
    public static void second(){
        FileReader fileReader=null;
        try {
            fileReader  = new FileReader("File.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void third(){
        Ferma ferma1=new Ferma("RUS",10);
        Ferma ferma2=new Ferma("BLR",15);
        ArrayList ferms=new ArrayList();
        ferms.add(ferma1);
        ferms.add(ferma2);
        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("FileSerialize.txt"))){
            objectOutputStream.writeObject(ferms);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void forth(){
        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("FileSerialize.txt"))) {
            List<Ferma> returnListFerma=(List<Ferma>) objectInputStream.readObject();
            System.out.println(returnListFerma.get(0));
            System.out.println(returnListFerma.get(1));
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}


