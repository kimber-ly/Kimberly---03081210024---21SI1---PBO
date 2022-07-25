import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class readwrite {

    public static void daftarfam (ArrayList<Family> Family) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input Data Kamar Family Room");
        System.out.println("----------------------");
        System.out.print("Kode      : ");
        String kode = keyboard.next();
        Family.add(new Family( kode));
        
        try (FileWriter fam = new FileWriter("D:\\UPH\\SEM AKSEL\\PBO\\UAS\\Project Uas-Kim\\src\\Family.txt", true)) {
            fam.append("\n" + kode );
        }
        
    }
    public static void display() throws Exception{
        try (BufferedReader read = new BufferedReader(new FileReader("D:\\UPH\\SEM AKSEL\\PBO\\UAS\\Project Uas-Kim\\src\\Family.txt"))) {
            String s = "";
            while ((s = read.readLine())!= null)
            {
                String data[] = s.split(",");
               
                for(int x=0; x<data.length;x++)
                { 
                    System.out.print("|" +data[x] + "\t|");
                }
                System.out.println();
            }
        }
    }
}

