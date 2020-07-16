import org.junit.Before;
import org.junit.Test;

public class TestCasePerfTest {

    private TestCasePerf testcaseperf;

    @Before
    public void setUp() throws Exception {
        testcaseperf = new TestCasePerf();
    }

    @Test
    public void test0() {
        testcaseperf.unoptimalDFS(0,0);
    }

    @Test
    public void test1() {
        testcaseperf.unoptimalDFS(1,-2);
    }

    @Test
    public void test2() {
        testcaseperf.unoptimalDFS(1,2);
    }

    @Test
    public void test3() {
        testcaseperf.unoptimalDFS(1,-3);
    }

    @Test
    public void test4() {
        testcaseperf.unoptimalDFS(1,0);
    }

    @Test
    public void test5() {
        testcaseperf.unoptimalDFS(0,2);
    }

    @Test
    public void test6() {
        testcaseperf.unoptimalDFS(-1,2);
    }

    @Test
    public void test7() {
        testcaseperf.unoptimalDFS(-1,-2);
    }

    @Test
    public void test8() {
        testcaseperf.unoptimalDFS(-2,0);
    }

    @Test
    public void test9() {
        testcaseperf.unoptimalDFS(0,1);
    }

    @Test
    public void test10() {
        testcaseperf.unoptimalDFS(-1,0);
    }

}
