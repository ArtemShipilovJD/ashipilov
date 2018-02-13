import static java.lang.Math //добавил импорт т.к. успользовал sqrt
package ru.job4j.condition; 

public class Triangle {
   private Point a;
   private Point b;
   private Point c;

   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

public double period(double ab, double ac, double bc) {
    double p=(double ab+double ac+double bc)/2;
    return double p;
}

public double area() {
    double rsl = S;
    double ab = this.a.distanceTo(this.b);
    double ac = this.a.distanceTo(this.c);
    double bc = this.b.distanceTo(this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
       double p==p/2;
       S=sqrt(p(p-double ab)(p-double bc)(p-double ac));
       rsl=S;
    }
    return rsl;
}

private boolean exist(double ab, double ac, double bc) {
     while(double ab>0, double ac>0, double bc>0){
     
    return false;
   }
}
