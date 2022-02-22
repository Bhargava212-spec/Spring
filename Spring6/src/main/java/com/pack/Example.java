package com.pack;

public class Example {
	
   private String message;

   public String getMessage() {
	return message;
  }

   public void setMessage(String message) {
	this.message = message;
  }
   
   public void customInit() {
	   System.out.println("Example Bean is Initialized");
   }
     
   public void customDestroy() {
	   System.out.println("Example Bean is destroyed");
   }
   
  }
