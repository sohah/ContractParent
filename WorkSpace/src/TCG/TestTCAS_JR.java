package TCG;

import org.junit.Test;

public class TestTCAS_JR {
    @Test
    public void test0() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,0,0,0,1,1);
    }

    @Test
    public void test1() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,2,0,0,0,1,1);
    }

    @Test
    public void test2() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,541,640,0,1,1);
    }

    @Test
    public void test3() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,2,541,640,0,1,1);
    }

    @Test
    public void test4() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,-1,541,640,0,1,1);
    }

    @Test
    public void test5() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,-1,641,740,0,1,1);
    }

    @Test
    public void test6() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,-1,641,740,0,1,1);
    }

    @Test
    public void test7() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,1,400,499,0,1,1);
    }

    @Test
    public void test8() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,401,500,0,1,1);
    }

    @Test
    public void test9() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,1,401,500,0,1,1);
    }

    @Test
    public void test10() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,300,399,0,1,1);
    }

    @Test
    public void test11() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,301,400,0,1,1);
    }

    @Test
    public void test12() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,0,301,400,0,1,1);
    }

    @Test
    public void test13() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,300,400,0,1,1);
    }

    @Test
    public void test14() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,0,300,400,0,1,1);
    }

    @Test
    public void test15() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,400,500,0,1,1);
    }

    @Test
    public void test16() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,-1,0,400,500,0,1,1);
    }

    @Test
    public void test17() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,400,500,0,1,1);
    }

    @Test
    public void test18() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,500,600,0,1,1);
    }

    @Test
    public void test19() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,1,500,600,0,1,1);
    }

    @Test
    public void test20() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,500,600,0,1,1);
    }

    @Test
    public void test21() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,640,740,0,1,1);
    }

    @Test
    public void test22() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,-1,2,640,740,0,1,1);
    }

    @Test
    public void test23() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,3,640,740,0,1,1);
    }

    @Test
    public void test24() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,3,740,840,0,1,1);
    }

    @Test
    public void test25() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,-1,3,740,840,0,1,1);
    }

    @Test
    public void test26() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,1,0,0,1,0);
    }

    @Test
    public void test27() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,401,400,0,1,0);
    }

    @Test
    public void test28() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,0,401,400,0,1,0);
    }

    @Test
    public void test29() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,1,401,400,0,1,0);
    }

    @Test
    public void test30() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,501,500,0,1,0);
    }

    @Test
    public void test31() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-1,0,0,1,501,500,0,1,0);
    }

    @Test
    public void test32() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,2,501,500,0,1,0);
    }

    @Test
    public void test33() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,641,640,0,1,0);
    }

    @Test
    public void test34() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,2,641,640,0,1,0);
    }

    @Test
    public void test35() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,3,641,640,0,1,0);
    }

    @Test
    public void test36() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,3,741,740,0,1,0);
    }

    @Test
    public void test37() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,1,3,741,740,0,1,0);
    }

    @Test
    public void test38() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,399,740,0,1,0);
    }

    @Test
    public void test39() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,0,400,740,0,1,0);
    }

    @Test
    public void test40() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,-1,0,400,740,0,1,0);
    }

    @Test
    public void test41() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,400,740,0,1,0);
    }

    @Test
    public void test42() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,1,500,740,0,1,0);
    }

    @Test
    public void test43() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,-1,1,500,740,0,1,0);
    }

    @Test
    public void test44() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,500,740,0,1,0);
    }

    @Test
    public void test45() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,2,640,740,0,1,0);
    }

    @Test
    public void test46() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,2,640,740,0,1,0);
    }

    @Test
    public void test47() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,3,640,740,0,1,0);
    }

    @Test
    public void test48() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,0,0,0,3,740,740,0,1,0);
    }

    @Test
    public void test49() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,1,0,0,3,740,740,0,1,0);
    }

    @Test
    public void test50() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,-1,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,1,1,-2147483648);
    }

    @Test
    public void test51() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,-2147483648,0,-2147483648,-2147483648,-2147483648,-2147483648,1,1,-2147483648);
    }

    @Test
    public void test52() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,0,0,0,-2147483648,0,1);
    }

    @Test
    public void test53() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,0,301,400,-2147483648,0,1);
    }

    @Test
    public void test54() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,0,301,400,-2147483648,0,1);
    }

    @Test
    public void test55() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,301,400,-2147483648,0,1);
    }

    @Test
    public void test56() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,401,500,-2147483648,0,1);
    }

    @Test
    public void test57() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,1,401,500,-2147483648,0,1);
    }

    @Test
    public void test58() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,401,500,-2147483648,0,1);
    }

    @Test
    public void test59() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,541,640,-2147483648,0,1);
    }

    @Test
    public void test60() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,2,541,640,-2147483648,0,1);
    }

    @Test
    public void test61() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,541,640,-2147483648,0,1);
    }

    @Test
    public void test62() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,641,740,-2147483648,0,1);
    }

    @Test
    public void test63() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,-1,0,0,3,641,740,-2147483648,0,1);
    }

    @Test
    public void test64() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,-1,0,399,740,-2147483648,0,1);
    }

    @Test
    public void test65() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,0,400,740,-2147483648,0,1);
    }

    @Test
    public void test66() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,0,400,740,-2147483648,0,1);
    }

    @Test
    public void test67() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,1,400,740,-2147483648,0,1);
    }

    @Test
    public void test68() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,500,740,-2147483648,0,1);
    }

    @Test
    public void test69() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,1,500,740,-2147483648,0,1);
    }

    @Test
    public void test70() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,2,500,740,-2147483648,0,1);
    }

    @Test
    public void test71() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,640,740,-2147483648,0,1);
    }

    @Test
    public void test72() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,2,640,740,-2147483648,0,1);
    }

    @Test
    public void test73() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,640,740,-2147483648,0,1);
    }

    @Test
    public void test74() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,740,840,-2147483648,0,1);
    }

    @Test
    public void test75() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,-1,3,740,840,-2147483648,0,1);
    }

    @Test
    public void test76() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,0,1,0,-2147483648,0,0);
    }

    @Test
    public void test77() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,0,401,400,-2147483648,0,0);
    }

    @Test
    public void test78() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,0,401,400,-2147483648,0,0);
    }

    @Test
    public void test79() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,401,400,-2147483648,0,0);
    }

    @Test
    public void test80() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,501,500,-2147483648,0,0);
    }

    @Test
    public void test81() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,1,501,500,-2147483648,0,0);
    }

    @Test
    public void test82() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,501,500,-2147483648,0,0);
    }

    @Test
    public void test83() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,641,640,-2147483648,0,0);
    }

    @Test
    public void test84() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,1,2,641,640,-2147483648,0,0);
    }

    @Test
    public void test85() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,-1,0,0,3,641,640,-2147483648,0,0);
    }

    @Test
    public void test86() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,741,740,-2147483648,0,0);
    }

    @Test
    public void test87() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,-1,0,0,3,741,740,-2147483648,0,0);
    }

    @Test
    public void test88() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,-1,0,399,740,-2147483648,0,0);
    }

    @Test
    public void test89() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,0,400,740,-2147483648,0,0);
    }

    @Test
    public void test90() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,0,400,740,-2147483648,0,0);
    }

    @Test
    public void test91() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,1,400,740,-2147483648,0,0);
    }

    @Test
    public void test92() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,1,500,740,-2147483648,0,0);
    }

    @Test
    public void test93() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,1,500,740,-2147483648,0,0);
    }

    @Test
    public void test94() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,2,500,740,-2147483648,0,0);
    }

    @Test
    public void test95() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,2,640,740,-2147483648,0,0);
    }

    @Test
    public void test96() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,-1,2,640,740,-2147483648,0,0);
    }

    @Test
    public void test97() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,-1,3,640,740,-2147483648,0,0);
    }

    @Test
    public void test98() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,0,0,0,3,740,740,-2147483648,0,0);
    }

    @Test
    public void test99() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,1,0,0,3,740,740,-2147483648,0,0);
    }

    @Test
    public void test100() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,-1,0,-2147483648,601,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
    }

    @Test
    public void test101() {
        tcas tcas;
        tcas = new tcas();
        tcas.sym1(601,0,0,-2147483648,601,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648,-2147483648);
    }
}
