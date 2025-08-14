package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ATest {
    private A a;

    @Before
    public void before() throws Exception {
        this.a = new A();
    }

    @Test
    public void testX1() {
        B esperado = new B();
        B obtenido = this.a.getB();
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "a{b=b{}}";
        String obtenido = this.a.toString().toLowerCase();
        Assert.assertEquals(esperado, obtenido);
    }
}
