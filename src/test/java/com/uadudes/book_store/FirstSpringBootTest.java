package com.uadudes.book_store;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class FirstSpringBootTest
{

   @Test
   public void test()
   {
      System.out.println("First test completed!");
   }
}
