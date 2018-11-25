package tutorial33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner_Tutorial33{
    public  static void main (String[] args) throws FileNotFoundException {
        String fileNameSameProject = "JavaInfo.txt";
        //create a file object, object which will act, actually be the kind of java representation of your file
        File textFile = new File(fileNameSameProject);
        //reading a file in java can be done using Scanner, Buffered Reader or FileReader
        //reading textFile object using Scanner class
        Scanner in = new Scanner(textFile);

        //read file line by line till it has a NextLine and print it
        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }
        in.close();

        System.out.println();

        //use absolute path to read file name, when file reside on different folder, not project folder
        //---------------------use \\ or / for nn printing characters---------------------
        String fileNameDiffrentProject = "C:\\Users\\dimuthuPC\\Desktop\\Java\\test\\Example.txt";
        File exampleFle = new File(fileNameDiffrentProject);
        Scanner in2 = new Scanner(exampleFle);

        while (in2.hasNext()){
            if (in2.hasNextInt()){
                int line = in2.nextInt();
                System.out.println(line);
            }
            else{
                in2.nextLine();
            }
        }
        in2.close();

        String fileNameDiffrentProject2 = "C:/Users/dimuthuPC/Desktop/Java/test/example2.txt";
        File example2File = new File(fileNameDiffrentProject2);
        Scanner in3 = new Scanner(example2File);

        int value = in3.nextInt();
        System.out.println("Read value : " + value);

        //carriage return and line feed --- unnecessary line read
        //this will read character return and line feed, it will read new line character
        in3.nextLine();

        int count = 2;
        while(in3.hasNextLine()){
            String line = in3.nextLine();
            System.out.println(count + " :  " +line);
            count++;
        }
        in3.close();
    }
}