package com.driver;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
      
      Product p=new Product();
         System.out.println( p.product(1,2));
         System.out.println(p.product(1,2,3));
         System.out.println(p.product(23.22,34.22));
     
    }
    public static class Product{
        public int product(int x, int y) {
            return x+y;
        }
        
    
   //  @overloaded
      public int product(int x, int y, int z) {
          return x+y+z;
          
      }
    //  @overloaded
      public double product(double x, double y) {
          return x+y;
          
      }
      }
}

