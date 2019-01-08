package mapf;
import java.io.*;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MapF{
 public static void main(String[] args) {
     try{
        FileWriter file = new FileWriter("H:\\javap\\filed\\test.txt");
        String newLine = System.getProperty("line.separator");
        Random random = new Random();
        for(int i = 0 ; i < 100000 ; i++){
            int randNumber = random.nextInt(500000);
            file.write(randNumber + newLine);
        }
         
        System.out.println("Please Enter a  Number little than 500000");
        Scanner scanner = new Scanner(System.in);
        String entered = scanner.nextLine();
        List<String> lines = Files.readAllLines(Paths.get("H:\\javap\\filed\\test.txt"));
        int j = 0;
        for(String line : lines){
            j++;
            if(line.equals(entered)){
                System.out.println("We founde this number in line(" + j + ") at this file");
                break;
            }
            else
                System.out.println("NotFonunded....");
            
        }
        file.close();
         
/*      Formatter f = new Formatter("H:\\javap\\filed\\test.txt"); // to creat the file use with Formatter.
        f.format("%s" , "Ali is good boy");
        File file =  new File("H:\\javap\\filed\\test2.txt");//creat a file object
        file.createNewFile(); // we can put this in if() to sure the file created...
        Scanner scanner = new Scanner(file); // scanner method is used for reading a file
        if(file.exists()) // exists() method for .....
            System.out.println("the file exists"); 
        else
            System.out.println("not find this file");
        System.out.println(file.getClass()); //getName() method for file name
        // and hasNext() and next() methods use for exists and read word by word fle too.
       f.close();//you must close the file then end work with file
*/
     }
     catch(Exception e){
         System.out.println(e);
    }
       
    }
}
