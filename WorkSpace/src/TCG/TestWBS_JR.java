package TCG;

import org.junit.Before;
import org.junit.Test;

public class TestWBS_JR {

//    private WBS wbs;

    @Before
    public void setUp() throws Exception {
//        wbs = new WBS();
    }

    @Test
    public void test0() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(4, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test1() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(3, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test2() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(2, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test3() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(1, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test4() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(5, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test5() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(0, true, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test6() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(0, true, true, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test7() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(4, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test8() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(2, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test9() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(1, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }

    @Test
    public void test10() {
        WBS wbs;
        wbs = new WBS();
        wbs.launch(1, false, true, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false, -2147483648, false, false);
    }
}
