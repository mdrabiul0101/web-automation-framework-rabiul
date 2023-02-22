package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameworkTest {

    @Test
    public void test1(){
        System.out.println("Framework is up and running!!!");
        Assert.assertEquals(5,5);
    }
    @Test
    public void test2(){ System.out.println("testing push!!");
        Assert.assertEquals(true,true);}
}
