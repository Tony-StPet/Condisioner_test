import org.example.Condey;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_condey {

    @Test
    public void testConstruction(){
        Assertions.assertDoesNotThrow(() -> {
            org.example.Condey condey = new Condey(20, 30, "heat");
        });
    }

    @Test
    public void test_2(){
        Condey cond = new Condey(20, 30, "heat");
    Assertions.assertTrue((cond.t2 - cond.t1)> 0);

    }
    @Test
    public void test_3_heat() {
        Condey cond = new Condey(20, 30, "heat");
        Assertions.assertEquals(30, cond.heat());
    }

    @Test
    public void test_4_freeze() {
        Condey cond = new Condey(30, 20, "freeze");
        Assertions.assertEquals(20, cond.freeze());
    }

    @Test
    public void test_5_work() {
        Condey cond = new Condey(30, 20, "freeze");
        Assertions.assertEquals(20, cond.work());
    }
    @Test
    public void test_51_work() {
        Condey cond = new Condey(20, 25, "freeze");
        Assertions.assertEquals(20, cond.work());
    }

    @Test
    public void test_6_work() {
        Condey cond = new Condey(20, 30, "heat");
        Assertions.assertEquals(30, cond.work());
    }

    @Test
    public void test_7_fan() {
        Condey cond = new Condey(15, 15, "fan");
        Assertions.assertEquals(15, cond.fan());
    }

    @Test
    public void test_8_work() {
        Condey cond = new Condey(15, 20, "fan");
        Assertions.assertEquals(15, cond.work());
    }

    @Test
    public void test_9_work() {
        Condey cond = new Condey(15, 25, "auto");
        Assertions.assertEquals(25, cond.work());
    }

    @Test
    public void test_10_work() {
        Condey cond = new Condey(29, 14, "auto");
        Assertions.assertEquals(14, cond.work());
    }


}
