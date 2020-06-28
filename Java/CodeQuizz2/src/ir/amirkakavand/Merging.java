package ir.amirkakavand;

import java.io.*;

public class Merging
{
    public static void main(String[] args) throws IOException
    {

        PrintWriter pw = new PrintWriter("export.txt");


        BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("in2.txt"));

        String line = br.readLine();
        String line2 = br2.readLine();


        while (line != null && line2 != null)
        {
            pw.println(line);
            pw.println(line2);
            line = br.readLine();
            line2 = br2.readLine();
        }



        pw.flush();

        br.close();
        br2.close();
        pw.close();

        System.out.println("Merged successfully");
    }
}