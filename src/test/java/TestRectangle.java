import geometry.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {


    @Test
    public void testPerimeter1()  {
        //todo
        // метод тестирования метода1 {
        //		создаем объект Класса, настраиваем свойства
        //      w=10 l=15   perimeter = 50
        //		Assertions.assertEquals()
        //	}
        try {
            Rectangle rectangle = new Rectangle(10,15);
            Assertions.assertEquals(50, rectangle.perimetr());
        } catch (Exception e){
            System.out.println("something wrong");
        }
    }

    @Test
    public void testPerimeter2()  {

        try {
            Rectangle rectangle = new Rectangle(15,10);
            Assertions.assertEquals(50, rectangle.perimetr());
        } catch (Exception e){
            System.out.println("something wrong");
        }
    }

    @Test
    public void testArea1(){
        //todo
        //метод тестирования метода1 {
        //		создаем объект Класса, настраиваем свойства
        //      w=10 l=15   area = 150
        //		Assertions.assertEquals()
        //	}
        try {
            Rectangle rectangle = new Rectangle(10,15);
            Assertions.assertEquals(150, rectangle.area());
        } catch (Exception e){
            System.out.println("something wrong");
        }
    }

    @Test
    public void testArea2(){
        //todo
        //метод тестирования метода1 {
        //		создаем объект Класса, настраиваем свойства
        //      w=10 l=15   area = 150
        //		Assertions.assertEquals()
        //	}
        try {
            Rectangle rectangle = new Rectangle(15,10);
            Assertions.assertEquals(150, rectangle.area());
        } catch (Exception e){
            System.out.println("something wrong");
        }
    }
}