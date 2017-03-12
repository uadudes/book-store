package com.uadudes.book_store.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

   @RequestMapping(value = "/test", method = RequestMethod.GET)
   public String index()
   {
      return "Book-store is responding, hooray!";
   }
}
