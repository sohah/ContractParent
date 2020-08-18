import org.junit.Before;
import org.junit.Test;

public class WBSTestJR {

    private WBSMultipleSteps wbs;

    @Before
    public void setUp() throws Exception {
        wbs = new WBSMultipleSteps();
    }

    @Test
    public void test0() {
        wbs.launch(4,false,false,1,true,true,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test1() {
        wbs.launch(4,false,false,3,true,true,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test2() {
        wbs.launch(4,true,true,3,false,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test3() {
        wbs.launch(3,true,true,2,true,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test4() {
        wbs.launch(3,true,true,1,true,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test5() {
        wbs.launch(1,false,false,1,true,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test6() {
        wbs.launch(-1,true,false,3,false,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }

    @Test
    public void test7() {
        wbs.launch(-1,false,false,0,false,false,-2147483648,false,false,-2147483648,false,false,-2147483648,false,false);
    }
}
