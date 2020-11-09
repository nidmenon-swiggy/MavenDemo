package Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {

    @BeforeTest
    public void bt()
    {
        System.out.println("this is first");
    }
    @AfterTest
    public void at()
    {
        System.out.println("this is third");
    }

    @Test
    public void testcase1()
    {
        System.out.println("this is second");
    }


}
