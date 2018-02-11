import static org.hamcrest.number.IsCloseTo.closeTo;

����������� ��������� ����������� ���������� hamcrest-all.jar

<dependency>
    <groupId>org.hamcrest</groupId>
    <artifactId>hamcrest-all</artifactId>
    <version>1.3</version>
    <scope>test</scope>
</dependency>

������ �������������

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {
 @Test
 public void whenAreaSetThreePointsThenTriangleArea() {
 // ������� ��� ������� ������ Point.
 Point a = new Point(0, 0);
 Point b = new Point(0, 2);
 Point c = new Point(2, 0);
 // ������� ������ ����������� � �������� � ���� ������� �����.
 Triangle triangle = new Triangle(a, b, c);
 // ��������� �������.
 double result = triangle.area();
 // ������ ��������� ���������.
 double expected = 2D;
 //��������� ��������� � ��������� ��������.
 assertThat(result, closeTo(expected, 0.1));
 }
}
