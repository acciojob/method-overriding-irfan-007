package com.driver;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        B obj1=new B();
        System.out.println(obj1.meth());       
        B obj=new B();
        System.out.println(obj.meth());  
        
	}
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A {
    String meth(){
        return "Method is overridden in Extended class B";
    }
}
