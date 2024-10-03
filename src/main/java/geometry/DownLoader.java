package geometry;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;



public class DownLoader {

    public static ArrayList<Rectangle> makeListRect(String fname) throws Exception {
        ArrayList<Rectangle> listRect = new ArrayList<>();


            Scanner scanner = new Scanner(new File(fname));
            while (scanner.hasNext()) {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    String[] mass = line.split(" ");
                    double a = Double.parseDouble(mass[0]);
                    double b = Double.parseDouble(mass[1]);
                    Rectangle reckt = new Rectangle(a, b);
                    listRect.add(reckt);
                }
            }
        return listRect;
    }

}