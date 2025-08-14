package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BTest {
    private B b;

    @Before
    public void before() throws Exception {
        this.b = new B();
    }

    @Test
    public void testToString() {
        String esperado = "b";
        String obtenido = this.b.toString().toLowerCase();
        Assert.assertEquals(esperado, obtenido);
    }
}