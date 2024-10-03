import geometry.DownLoader;
import geometry.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test_downLoader {

    @Test
    public void testDownload1() {

        Assertions.assertThrows(Exception.class,
                () -> {
                    ArrayList<Rectangle> list1 = DownLoader.makeListRect("abracadabra");
                });
    }

    @Test
    public void testDownload2() {
        Assertions.assertDoesNotThrow(() -> {
            ArrayList<Rectangle> list1 = DownLoader.makeListRect("Input.txt");
        });
    }

    @Test
    public void testDownload3() {
        try {
            ArrayList<Rectangle> list1 = DownLoader.makeListRect("Input.txt");
            Assertions.assertEquals(3, list1.size());
        } catch (Exception e) {
            System.out.println("something wrong");
        }
    }

    // запись в файл
    @Test
    public  void writeCarsFile(){
        //в первой строке файла пусть будет количество машин
        //в каждой следующей строке файла пусть будут 3 слова, разделенные пробелами - характеристики машины

        try{

            String filename = "example1.txt";
            FileWriter fileWriter = new FileWriter(filename);
            //запись на каждую строку экземпляра класса
            fileWriter.write("1,2 12,3\n");
            fileWriter.write("1,2 12,3");
            // закрытие файла -
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("что-то не так с записью в файл");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assertions.assertThrows(Exception.class, () -> {
            ArrayList<Rectangle> list2 = DownLoader.makeListRect("example1.txt");
        });

        //todo удалить временный файл

    }


}