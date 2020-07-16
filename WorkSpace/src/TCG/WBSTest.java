package TCG;

import org.junit.Before;
import org.junit.Test;

public class WBSTest {

    private WBS wbs;

    @Before
    public void setUp() throws Exception {
        wbs = new WBS();
    }
//SPF generated test cases
    /*@Test
    public void test0() {
        wbs.launch(-2147483648,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test1() {
        wbs.launch(-2147483648,true,true,-2147483648,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test2() {
        wbs.launch(-2147483648,true,true,-2147483648,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test3() {
        wbs.launch(-2147483648,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test4() {
        wbs.launch(-2147483648,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test5() {
        wbs.launch(-2147483648,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test6() {
        wbs.launch(-2147483648,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test7() {
        wbs.launch(-2147483648,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test8() {
        wbs.launch(-2147483648,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test9() {
        wbs.launch(-2147483648,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test10() {
        wbs.launch(-2147483648,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test11() {
        wbs.launch(-2147483648,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test12() {
        wbs.launch(-2147483648,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test13() {
        wbs.launch(-2147483648,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test14() {
        wbs.launch(-2147483648,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test15() {
        wbs.launch(-2147483648,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test16() {
        wbs.launch(-2147483648,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test17() {
        wbs.launch(-2147483648,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test18() {
        wbs.launch(-2147483648,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test19() {
        wbs.launch(-2147483648,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test20() {
        wbs.launch(-2147483648,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test21() {
        wbs.launch(-2147483648,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test22() {
        wbs.launch(-2147483648,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test23() {
        wbs.launch(-2147483648,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test24() {
        wbs.launch(-2147483648,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test25() {
        wbs.launch(-2147483648,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test26() {
        wbs.launch(-2147483648,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test27() {
        wbs.launch(-2147483648,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test28() {
        wbs.launch(-2147483648,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test29() {
        wbs.launch(-2147483648,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test30() {
        wbs.launch(-2147483648,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test31() {
        wbs.launch(-2147483648,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test32() {
        wbs.launch(-2147483648,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test33() {
        wbs.launch(-2147483648,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test34() {
        wbs.launch(-2147483648,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test35() {
        wbs.launch(-2147483648,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test36() {
        wbs.launch(-2147483648,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test37() {
        wbs.launch(-2147483648,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test38() {
        wbs.launch(-2147483648,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test39() {
        wbs.launch(-2147483648,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test40() {
        wbs.launch(-2147483648,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test41() {
        wbs.launch(-2147483648,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test42() {
        wbs.launch(-2147483648,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test43() {
        wbs.launch(-2147483648,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test44() {
        wbs.launch(-2147483648,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test45() {
        wbs.launch(-2147483648,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test46() {
        wbs.launch(-2147483648,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test47() {
        wbs.launch(-2147483648,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test48() {
        wbs.launch(-2147483648,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test49() {
        wbs.launch(-2147483648,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test50() {
        wbs.launch(-2147483648,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test51() {
        wbs.launch(-2147483648,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test52() {
        wbs.launch(0,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test53() {
        wbs.launch(0,false,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test54() {
        wbs.launch(0,false,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test55() {
        wbs.launch(0,false,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test56() {
        wbs.launch(0,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test57() {
        wbs.launch(0,false,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test58() {
        wbs.launch(0,false,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test59() {
        wbs.launch(0,false,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test60() {
        wbs.launch(0,false,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test61() {
        wbs.launch(0,false,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test62() {
        wbs.launch(0,false,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test63() {
        wbs.launch(0,false,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test64() {
        wbs.launch(0,false,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test65() {
        wbs.launch(0,false,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test66() {
        wbs.launch(0,false,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test67() {
        wbs.launch(0,false,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test68() {
        wbs.launch(0,false,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test69() {
        wbs.launch(0,false,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test70() {
        wbs.launch(0,false,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test71() {
        wbs.launch(0,false,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test72() {
        wbs.launch(0,false,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test73() {
        wbs.launch(0,false,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test74() {
        wbs.launch(0,false,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test75() {
        wbs.launch(0,false,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test76() {
        wbs.launch(0,false,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test77() {
        wbs.launch(0,false,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test78() {
        wbs.launch(0,false,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test79() {
        wbs.launch(0,false,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test80() {
        wbs.launch(0,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test81() {
        wbs.launch(0,false,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test82() {
        wbs.launch(0,false,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test83() {
        wbs.launch(0,false,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test84() {
        wbs.launch(0,false,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test85() {
        wbs.launch(0,false,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test86() {
        wbs.launch(0,false,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test87() {
        wbs.launch(0,false,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test88() {
        wbs.launch(0,false,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test89() {
        wbs.launch(0,false,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test90() {
        wbs.launch(0,false,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test91() {
        wbs.launch(0,false,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test92() {
        wbs.launch(0,false,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test93() {
        wbs.launch(0,false,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test94() {
        wbs.launch(0,false,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test95() {
        wbs.launch(0,false,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test96() {
        wbs.launch(0,false,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test97() {
        wbs.launch(0,false,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test98() {
        wbs.launch(0,false,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test99() {
        wbs.launch(0,false,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test100() {
        wbs.launch(0,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test101() {
        wbs.launch(0,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test102() {
        wbs.launch(0,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test103() {
        wbs.launch(0,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test104() {
        wbs.launch(0,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test105() {
        wbs.launch(0,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test106() {
        wbs.launch(0,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test107() {
        wbs.launch(0,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test108() {
        wbs.launch(0,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test109() {
        wbs.launch(0,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test110() {
        wbs.launch(0,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test111() {
        wbs.launch(0,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test112() {
        wbs.launch(0,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test113() {
        wbs.launch(0,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test114() {
        wbs.launch(0,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test115() {
        wbs.launch(0,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test116() {
        wbs.launch(0,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test117() {
        wbs.launch(0,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test118() {
        wbs.launch(0,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test119() {
        wbs.launch(0,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test120() {
        wbs.launch(0,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test121() {
        wbs.launch(0,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test122() {
        wbs.launch(0,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test123() {
        wbs.launch(0,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test124() {
        wbs.launch(0,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test125() {
        wbs.launch(0,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test126() {
        wbs.launch(0,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test127() {
        wbs.launch(0,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test128() {
        wbs.launch(0,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test129() {
        wbs.launch(0,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test130() {
        wbs.launch(0,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test131() {
        wbs.launch(0,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test132() {
        wbs.launch(0,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test133() {
        wbs.launch(0,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test134() {
        wbs.launch(0,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test135() {
        wbs.launch(0,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test136() {
        wbs.launch(0,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test137() {
        wbs.launch(0,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test138() {
        wbs.launch(0,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test139() {
        wbs.launch(0,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test140() {
        wbs.launch(0,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test141() {
        wbs.launch(0,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test142() {
        wbs.launch(0,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test143() {
        wbs.launch(0,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test144() {
        wbs.launch(0,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test145() {
        wbs.launch(0,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test146() {
        wbs.launch(0,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test147() {
        wbs.launch(0,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test148() {
        wbs.launch(1,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test149() {
        wbs.launch(1,false,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test150() {
        wbs.launch(1,false,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test151() {
        wbs.launch(1,false,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test152() {
        wbs.launch(1,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test153() {
        wbs.launch(1,false,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test154() {
        wbs.launch(1,false,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test155() {
        wbs.launch(1,false,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test156() {
        wbs.launch(1,false,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test157() {
        wbs.launch(1,false,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test158() {
        wbs.launch(1,false,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test159() {
        wbs.launch(1,false,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test160() {
        wbs.launch(1,false,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test161() {
        wbs.launch(1,false,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test162() {
        wbs.launch(1,false,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test163() {
        wbs.launch(1,false,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test164() {
        wbs.launch(1,false,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test165() {
        wbs.launch(1,false,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test166() {
        wbs.launch(1,false,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test167() {
        wbs.launch(1,false,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test168() {
        wbs.launch(1,false,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test169() {
        wbs.launch(1,false,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test170() {
        wbs.launch(1,false,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test171() {
        wbs.launch(1,false,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test172() {
        wbs.launch(1,false,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test173() {
        wbs.launch(1,false,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test174() {
        wbs.launch(1,false,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test175() {
        wbs.launch(1,false,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test176() {
        wbs.launch(1,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test177() {
        wbs.launch(1,false,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test178() {
        wbs.launch(1,false,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test179() {
        wbs.launch(1,false,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test180() {
        wbs.launch(1,false,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test181() {
        wbs.launch(1,false,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test182() {
        wbs.launch(1,false,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test183() {
        wbs.launch(1,false,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test184() {
        wbs.launch(1,false,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test185() {
        wbs.launch(1,false,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test186() {
        wbs.launch(1,false,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test187() {
        wbs.launch(1,false,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test188() {
        wbs.launch(1,false,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test189() {
        wbs.launch(1,false,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test190() {
        wbs.launch(1,false,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test191() {
        wbs.launch(1,false,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test192() {
        wbs.launch(1,false,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test193() {
        wbs.launch(1,false,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test194() {
        wbs.launch(1,false,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test195() {
        wbs.launch(1,false,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test196() {
        wbs.launch(1,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test197() {
        wbs.launch(1,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test198() {
        wbs.launch(1,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test199() {
        wbs.launch(1,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test200() {
        wbs.launch(1,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test201() {
        wbs.launch(1,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test202() {
        wbs.launch(1,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test203() {
        wbs.launch(1,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test204() {
        wbs.launch(1,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test205() {
        wbs.launch(1,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test206() {
        wbs.launch(1,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test207() {
        wbs.launch(1,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test208() {
        wbs.launch(1,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test209() {
        wbs.launch(1,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test210() {
        wbs.launch(1,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test211() {
        wbs.launch(1,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test212() {
        wbs.launch(1,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test213() {
        wbs.launch(1,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test214() {
        wbs.launch(1,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test215() {
        wbs.launch(1,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test216() {
        wbs.launch(1,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test217() {
        wbs.launch(1,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test218() {
        wbs.launch(1,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test219() {
        wbs.launch(1,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test220() {
        wbs.launch(1,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test221() {
        wbs.launch(1,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test222() {
        wbs.launch(1,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test223() {
        wbs.launch(1,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test224() {
        wbs.launch(1,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test225() {
        wbs.launch(1,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test226() {
        wbs.launch(1,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test227() {
        wbs.launch(1,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test228() {
        wbs.launch(1,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test229() {
        wbs.launch(1,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test230() {
        wbs.launch(1,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test231() {
        wbs.launch(1,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test232() {
        wbs.launch(1,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test233() {
        wbs.launch(1,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test234() {
        wbs.launch(1,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test235() {
        wbs.launch(1,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test236() {
        wbs.launch(1,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test237() {
        wbs.launch(1,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test238() {
        wbs.launch(1,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test239() {
        wbs.launch(1,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test240() {
        wbs.launch(1,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test241() {
        wbs.launch(1,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test242() {
        wbs.launch(1,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test243() {
        wbs.launch(1,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test244() {
        wbs.launch(2,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test245() {
        wbs.launch(2,false,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test246() {
        wbs.launch(2,false,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test247() {
        wbs.launch(2,false,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test248() {
        wbs.launch(2,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test249() {
        wbs.launch(2,false,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test250() {
        wbs.launch(2,false,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test251() {
        wbs.launch(2,false,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test252() {
        wbs.launch(2,false,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test253() {
        wbs.launch(2,false,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test254() {
        wbs.launch(2,false,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test255() {
        wbs.launch(2,false,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test256() {
        wbs.launch(2,false,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test257() {
        wbs.launch(2,false,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test258() {
        wbs.launch(2,false,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test259() {
        wbs.launch(2,false,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test260() {
        wbs.launch(2,false,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test261() {
        wbs.launch(2,false,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test262() {
        wbs.launch(2,false,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test263() {
        wbs.launch(2,false,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test264() {
        wbs.launch(2,false,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test265() {
        wbs.launch(2,false,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test266() {
        wbs.launch(2,false,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test267() {
        wbs.launch(2,false,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test268() {
        wbs.launch(2,false,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test269() {
        wbs.launch(2,false,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test270() {
        wbs.launch(2,false,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test271() {
        wbs.launch(2,false,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test272() {
        wbs.launch(2,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test273() {
        wbs.launch(2,false,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test274() {
        wbs.launch(2,false,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test275() {
        wbs.launch(2,false,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test276() {
        wbs.launch(2,false,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test277() {
        wbs.launch(2,false,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test278() {
        wbs.launch(2,false,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test279() {
        wbs.launch(2,false,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test280() {
        wbs.launch(2,false,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test281() {
        wbs.launch(2,false,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test282() {
        wbs.launch(2,false,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test283() {
        wbs.launch(2,false,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test284() {
        wbs.launch(2,false,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test285() {
        wbs.launch(2,false,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test286() {
        wbs.launch(2,false,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test287() {
        wbs.launch(2,false,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test288() {
        wbs.launch(2,false,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test289() {
        wbs.launch(2,false,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test290() {
        wbs.launch(2,false,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test291() {
        wbs.launch(2,false,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test292() {
        wbs.launch(2,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test293() {
        wbs.launch(2,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test294() {
        wbs.launch(2,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test295() {
        wbs.launch(2,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test296() {
        wbs.launch(2,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test297() {
        wbs.launch(2,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test298() {
        wbs.launch(2,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test299() {
        wbs.launch(2,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test300() {
        wbs.launch(2,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test301() {
        wbs.launch(2,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test302() {
        wbs.launch(2,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test303() {
        wbs.launch(2,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test304() {
        wbs.launch(2,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test305() {
        wbs.launch(2,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test306() {
        wbs.launch(2,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test307() {
        wbs.launch(2,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test308() {
        wbs.launch(2,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test309() {
        wbs.launch(2,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test310() {
        wbs.launch(2,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test311() {
        wbs.launch(2,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test312() {
        wbs.launch(2,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test313() {
        wbs.launch(2,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test314() {
        wbs.launch(2,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test315() {
        wbs.launch(2,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test316() {
        wbs.launch(2,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test317() {
        wbs.launch(2,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test318() {
        wbs.launch(2,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test319() {
        wbs.launch(2,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test320() {
        wbs.launch(2,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test321() {
        wbs.launch(2,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test322() {
        wbs.launch(2,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test323() {
        wbs.launch(2,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test324() {
        wbs.launch(2,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test325() {
        wbs.launch(2,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test326() {
        wbs.launch(2,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test327() {
        wbs.launch(2,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test328() {
        wbs.launch(2,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test329() {
        wbs.launch(2,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test330() {
        wbs.launch(2,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test331() {
        wbs.launch(2,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test332() {
        wbs.launch(2,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test333() {
        wbs.launch(2,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test334() {
        wbs.launch(2,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test335() {
        wbs.launch(2,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test336() {
        wbs.launch(2,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test337() {
        wbs.launch(2,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test338() {
        wbs.launch(2,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test339() {
        wbs.launch(2,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test340() {
        wbs.launch(3,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test341() {
        wbs.launch(3,false,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test342() {
        wbs.launch(3,false,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test343() {
        wbs.launch(3,false,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test344() {
        wbs.launch(3,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test345() {
        wbs.launch(3,false,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test346() {
        wbs.launch(3,false,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test347() {
        wbs.launch(3,false,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test348() {
        wbs.launch(3,false,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test349() {
        wbs.launch(3,false,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test350() {
        wbs.launch(3,false,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test351() {
        wbs.launch(3,false,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test352() {
        wbs.launch(3,false,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test353() {
        wbs.launch(3,false,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test354() {
        wbs.launch(3,false,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test355() {
        wbs.launch(3,false,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test356() {
        wbs.launch(3,false,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test357() {
        wbs.launch(3,false,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test358() {
        wbs.launch(3,false,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test359() {
        wbs.launch(3,false,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test360() {
        wbs.launch(3,false,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test361() {
        wbs.launch(3,false,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test362() {
        wbs.launch(3,false,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test363() {
        wbs.launch(3,false,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test364() {
        wbs.launch(3,false,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test365() {
        wbs.launch(3,false,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test366() {
        wbs.launch(3,false,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test367() {
        wbs.launch(3,false,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test368() {
        wbs.launch(3,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test369() {
        wbs.launch(3,false,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test370() {
        wbs.launch(3,false,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test371() {
        wbs.launch(3,false,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test372() {
        wbs.launch(3,false,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test373() {
        wbs.launch(3,false,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test374() {
        wbs.launch(3,false,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test375() {
        wbs.launch(3,false,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test376() {
        wbs.launch(3,false,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test377() {
        wbs.launch(3,false,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test378() {
        wbs.launch(3,false,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test379() {
        wbs.launch(3,false,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test380() {
        wbs.launch(3,false,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test381() {
        wbs.launch(3,false,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test382() {
        wbs.launch(3,false,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test383() {
        wbs.launch(3,false,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test384() {
        wbs.launch(3,false,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test385() {
        wbs.launch(3,false,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test386() {
        wbs.launch(3,false,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test387() {
        wbs.launch(3,false,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test388() {
        wbs.launch(3,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test389() {
        wbs.launch(3,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test390() {
        wbs.launch(3,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test391() {
        wbs.launch(3,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test392() {
        wbs.launch(3,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test393() {
        wbs.launch(3,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test394() {
        wbs.launch(3,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test395() {
        wbs.launch(3,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test396() {
        wbs.launch(3,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test397() {
        wbs.launch(3,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test398() {
        wbs.launch(3,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test399() {
        wbs.launch(3,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test400() {
        wbs.launch(3,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test401() {
        wbs.launch(3,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test402() {
        wbs.launch(3,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test403() {
        wbs.launch(3,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test404() {
        wbs.launch(3,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test405() {
        wbs.launch(3,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test406() {
        wbs.launch(3,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test407() {
        wbs.launch(3,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test408() {
        wbs.launch(3,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test409() {
        wbs.launch(3,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test410() {
        wbs.launch(3,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test411() {
        wbs.launch(3,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test412() {
        wbs.launch(3,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test413() {
        wbs.launch(3,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test414() {
        wbs.launch(3,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test415() {
        wbs.launch(3,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test416() {
        wbs.launch(3,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test417() {
        wbs.launch(3,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test418() {
        wbs.launch(3,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test419() {
        wbs.launch(3,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test420() {
        wbs.launch(3,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test421() {
        wbs.launch(3,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test422() {
        wbs.launch(3,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test423() {
        wbs.launch(3,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test424() {
        wbs.launch(3,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test425() {
        wbs.launch(3,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test426() {
        wbs.launch(3,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test427() {
        wbs.launch(3,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test428() {
        wbs.launch(3,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test429() {
        wbs.launch(3,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test430() {
        wbs.launch(3,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test431() {
        wbs.launch(3,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test432() {
        wbs.launch(3,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test433() {
        wbs.launch(3,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test434() {
        wbs.launch(3,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test435() {
        wbs.launch(3,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test436() {
        wbs.launch(4,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test437() {
        wbs.launch(4,false,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test438() {
        wbs.launch(4,false,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test439() {
        wbs.launch(4,false,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test440() {
        wbs.launch(4,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test441() {
        wbs.launch(4,false,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test442() {
        wbs.launch(4,false,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test443() {
        wbs.launch(4,false,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test444() {
        wbs.launch(4,false,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test445() {
        wbs.launch(4,false,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test446() {
        wbs.launch(4,false,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test447() {
        wbs.launch(4,false,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test448() {
        wbs.launch(4,false,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test449() {
        wbs.launch(4,false,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test450() {
        wbs.launch(4,false,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test451() {
        wbs.launch(4,false,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test452() {
        wbs.launch(4,false,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test453() {
        wbs.launch(4,false,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test454() {
        wbs.launch(4,false,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test455() {
        wbs.launch(4,false,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test456() {
        wbs.launch(4,false,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test457() {
        wbs.launch(4,false,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test458() {
        wbs.launch(4,false,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test459() {
        wbs.launch(4,false,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test460() {
        wbs.launch(4,false,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test461() {
        wbs.launch(4,false,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test462() {
        wbs.launch(4,false,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test463() {
        wbs.launch(4,false,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test464() {
        wbs.launch(4,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test465() {
        wbs.launch(4,false,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test466() {
        wbs.launch(4,false,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test467() {
        wbs.launch(4,false,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test468() {
        wbs.launch(4,false,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test469() {
        wbs.launch(4,false,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test470() {
        wbs.launch(4,false,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test471() {
        wbs.launch(4,false,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test472() {
        wbs.launch(4,false,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test473() {
        wbs.launch(4,false,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test474() {
        wbs.launch(4,false,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test475() {
        wbs.launch(4,false,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test476() {
        wbs.launch(4,false,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test477() {
        wbs.launch(4,false,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test478() {
        wbs.launch(4,false,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test479() {
        wbs.launch(4,false,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test480() {
        wbs.launch(4,false,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test481() {
        wbs.launch(4,false,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test482() {
        wbs.launch(4,false,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test483() {
        wbs.launch(4,false,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test484() {
        wbs.launch(4,true,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test485() {
        wbs.launch(4,true,false,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test486() {
        wbs.launch(4,true,false,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test487() {
        wbs.launch(4,true,false,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test488() {
        wbs.launch(4,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test489() {
        wbs.launch(4,true,false,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test490() {
        wbs.launch(4,true,false,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test491() {
        wbs.launch(4,true,false,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test492() {
        wbs.launch(4,true,false,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test493() {
        wbs.launch(4,true,false,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test494() {
        wbs.launch(4,true,false,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test495() {
        wbs.launch(4,true,false,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test496() {
        wbs.launch(4,true,false,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test497() {
        wbs.launch(4,true,false,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test498() {
        wbs.launch(4,true,false,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test499() {
        wbs.launch(4,true,false,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test500() {
        wbs.launch(4,true,false,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test501() {
        wbs.launch(4,true,false,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test502() {
        wbs.launch(4,true,false,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test503() {
        wbs.launch(4,true,false,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test504() {
        wbs.launch(4,true,false,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test505() {
        wbs.launch(4,true,false,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test506() {
        wbs.launch(4,true,false,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test507() {
        wbs.launch(4,true,false,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test508() {
        wbs.launch(4,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test509() {
        wbs.launch(4,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test510() {
        wbs.launch(4,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test511() {
        wbs.launch(4,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test512() {
        wbs.launch(4,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test513() {
        wbs.launch(4,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test514() {
        wbs.launch(4,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test515() {
        wbs.launch(4,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test516() {
        wbs.launch(4,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test517() {
        wbs.launch(4,true,true,1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test518() {
        wbs.launch(4,true,true,1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test519() {
        wbs.launch(4,true,true,1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test520() {
        wbs.launch(4,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test521() {
        wbs.launch(4,true,true,2,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test522() {
        wbs.launch(4,true,true,2,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test523() {
        wbs.launch(4,true,true,2,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test524() {
        wbs.launch(4,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test525() {
        wbs.launch(4,true,true,3,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test526() {
        wbs.launch(4,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test527() {
        wbs.launch(4,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test528() {
        wbs.launch(4,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test529() {
        wbs.launch(4,true,true,4,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test530() {
        wbs.launch(4,true,true,4,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test531() {
        wbs.launch(4,true,true,4,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test532() {
        wbs.launch(-1,false,false,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }*/



    //COLLECT_PRUNE_GUIDE tests
    @Test
    public void test0() {
        wbs.launch(-2147483648,true,true,-2147483648,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test1() {
        wbs.launch(-2147483648,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test2() {
        wbs.launch(-2147483648,true,true,-2147483648,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test3() {
        wbs.launch(-2147483648,true,true,-2147483648,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test4() {
        wbs.launch(-2147483648,true,true,3,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test5() {
        wbs.launch(-2147483648,true,true,3,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test6() {
        wbs.launch(-2147483648,true,true,3,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test7() {
        wbs.launch(-2147483648,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test8() {
        wbs.launch(-2147483648,true,true,0,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test9() {
        wbs.launch(-2147483648,true,true,0,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test10() {
        wbs.launch(-2147483648,true,true,0,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test11() {
        wbs.launch(-2147483648,true,true,4,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test12() {
        wbs.launch(-2147483648,true,true,2,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test13() {
        wbs.launch(-2147483648,true,true,1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test14() {
        wbs.launch(-2147483648,true,true,-1,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test15() {
        wbs.launch(-2147483648,true,true,-1,false,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test16() {
        wbs.launch(-2147483648,true,true,-1,true,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test17() {
        wbs.launch(-2147483648,true,true,-1,true,true,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test18() {
        wbs.launch(-2147483648,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test19() {
        wbs.launch(-2147483648,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test20() {
        wbs.launch(4,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test21() {
        wbs.launch(4,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test22() {
        wbs.launch(4,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test23() {
        wbs.launch(4,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test24() {
        wbs.launch(0,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test25() {
        wbs.launch(0,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test26() {
        wbs.launch(0,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test27() {
        wbs.launch(0,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test28() {
        wbs.launch(3,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test29() {
        wbs.launch(2,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test30() {
        wbs.launch(1,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test31() {
        wbs.launch(-1,false,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test32() {
        wbs.launch(-1,false,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test33() {
        wbs.launch(-1,true,false,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

    @Test
    public void test34() {
        wbs.launch(-1,true,true,0,false,false,-2147483648,true,true,-2147483648,true,true,-2147483648,true,true);
    }

}
