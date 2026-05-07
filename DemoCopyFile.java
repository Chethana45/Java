import java.io.*;
import java.util.Scanner;

public class DemoCopyFile {
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the source file name: ");
            String source = scan.nextLine();
            System.out.print("Enter the destination file name: ");
            String destination = scan.nextLine();
            FileReader fr = new FileReader(source+".txt");
            FileWriter fw = new FileWriter(destination+".txt");
            FileWriter fw1 = new FileWriter("detect.txt");

            int c, count = 0;

            while((c=fr.read())!=-1){
                char ch = (char) c;
                fw.write(ch);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' ||
                ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                    fw1.write(ch);
                    count++;
                }
            }
            System.out.println("File copied successfully...");

            System.out.println("\nTotal number of vowels in the file is "+ count);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
 