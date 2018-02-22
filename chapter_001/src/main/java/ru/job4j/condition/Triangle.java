import static java.lang.Math //������� ������ �.�. ����������� sqrt
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
/**
* ����� ���������� ������������� �� ������ ������.
*
* �������.
*
* (ab + ac + bc) / 2
*
* @param ab ���������� ����� ������� a b
* @param ac ���������� ����� ������� a c
* @param bc ���������� ����� ������� b c
* @return ��������.
*/
public double period(double ab, double ac, double bc) {
    return  (ab + ac + bc) / 2;
}

public double area() {
    double rsl = sqrt(p(p - ab)(p - bc)(p - ac));
    double ab = this.a.distanceTo(this.b);
    double ac = this.a.distanceTo(this.c);
    double bc = this.b.distanceTo(this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
		double S;
		p = p/2;
		s=sqrt(p(p - ab)(p - bc)(p - ac));

    }
    return rsl;
}

private boolean exist(double ab, double ac, double bc, double p) {
    (p > ab) && (p > ac) && (p > bc);
     
    return false;
   }
}
