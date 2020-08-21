import org.junit.Before;
import org.junit.Test;


//coverage 83% 31/37
public class tcasTestJR {

    private tcas tcas;

    @Before
    public void setUp() throws Exception {
        tcas = new tcas();
    }
    @Test
    public void test0() {
        tcas.sym1(601,-1,-1,0,0,-1,-1,741,740,0,1,1);
    }

    @Test
    public void test1() {
        tcas.sym1(601,-1,-1,0,0,1,2,640,639,0,1,1);
    }

    @Test
    public void test2() {
        tcas.sym1(601,-1,-1,0,0,-1,2,640,639,0,1,1);
    }

    @Test
    public void test3() {
        tcas.sym1(601,-1,-1,0,0,1,2,640,640,0,1,1);
    }

    @Test
    public void test4() {
        tcas.sym1(601,-1,-1,0,0,0,2,640,740,0,1,1);
    }

    @Test
    public void test5() {
        tcas.sym1(601,-1,-1,0,0,0,0,400,500,0,1,1);
    }

    @Test
    public void test6() {
        tcas.sym1(601,-1,-1,0,0,-1,0,400,500,0,1,1);
    }

    @Test
    public void test7() {
        tcas.sym1(601,-1,-1,0,0,1,0,399,399,0,1,1);
    }

    @Test
    public void test8() {
        tcas.sym1(601,-1,-1,0,0,1,1,499,499,0,1,1);
    }

    @Test
    public void test9() {
        tcas.sym1(601,-1,-1,0,0,1,1,739,739,1,1,1);
    }

    @Test
    public void test10() {
        tcas.sym1(601,-1,0,0,0,1,1,739,739,1,1,1);
    }

    @Test
    public void test11() {
        tcas.sym1(601,-1,1,0,0,1,1,500,499,1,2,0);
    }

    @Test
    public void test12() {
        tcas.sym1(601,-1,1,0,601,1,1,740,739,-1,0,0);
    }

    @Test
    public void test13() {
        tcas.sym1(601,0,1,0,601,1,1,740,739,-1,0,0);
    }
}
