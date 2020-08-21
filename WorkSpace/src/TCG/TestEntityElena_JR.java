package TCG;

import org.junit.Test;

public class TestEntityElena_JR {
    @Test
    public void test0() {
        EntityElena entity;
        entity = new EntityElena();
        entity.updatePosition(-2147483648,0,0,0,-1,0,11,0,11,-2147483648,-2147483648);
    }

    @Test
    public void test1() {
        EntityElena entity;
        entity = new EntityElena();
        entity.updatePosition(-2147483648,1,1,-5,-1,6,1,6,1,-2147483648,-2147483648);
    }

    @Test
    public void test2() {
        EntityElena entity;
        entity = new EntityElena();
        entity.updatePosition(-2147483648,1,0,-5,-1,4,0,6,1,-2147483648,-2147483648);
    }

    @Test
    public void test3() {
        EntityElena entity;
        entity = new EntityElena();
        entity.updatePosition(-2147483648,1,1,-4,-1,4,2,4,2,-2147483648,-2147483648);
    }

    @Test
    public void test4() {
        EntityElena entity;
        entity = new EntityElena();
        entity.updatePosition(-2147483648,6,6,0,0,6,12,6,0,-2147483648,-2147483648);
    }
}
