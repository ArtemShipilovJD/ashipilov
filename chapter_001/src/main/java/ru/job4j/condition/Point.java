package ru.job4j.condition;

/**
* Author Artem Shipilov (shipilov.89521049213@mail.ru) 31.07.2017
*/
 
public class Point {
   private int x;
   private int y;
 
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  
  public int getX() {
      return this.x;
  }
 
  public int getY() {
     return this.y;
	 
  public boolean is(int a, int b) {
     return this.y == this.x * a + b;
  }
}