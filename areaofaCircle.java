package JavaWeek2Tut;
import java.util.Scanner;

public class areaofaCircle {
    public static final float PI=3.141592653589793f;
    public static float radius;
    public static void main(String[] args) {
        Scanner diameter=new Scanner(System.in);
        System.out.println("Enter diameter value of the circle: ");
        float value=diameter.nextFloat();
        float radius=value/2;
        float Area=calArea(radius);
        System.out.println("Area of the circle: "+ Area);
    }
    public static float calArea(float radius){
        float Area=PI*(radius*radius);
        return Area;
    }

}
