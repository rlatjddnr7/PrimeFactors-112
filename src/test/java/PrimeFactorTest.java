import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeFactorTest {

    @Test
    public void test1() {
        PrimeFactor primefactor = new PrimeFactor();
        assertEquals(Arrays.asList(), primefactor.of(1));

    }

    @Test
    public void testPrimefactorOf2() {
        PrimeFactor primefactor = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(2), primefactor.of(2));
    }
}