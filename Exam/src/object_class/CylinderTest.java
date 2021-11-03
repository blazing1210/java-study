package object_class;

public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.radius=4;
		c.height=5;
		System.out.printf("원기둥의 부피:%.2f\n",c.getVolume());
		System.out.printf("원기둥의 겉넓이:%.2f\n",c.getArea());
	}

}
class Cylinder{
	double radius;
	double height;
	double pi=Math.PI;
	public Double getVolume() {
		
		return pi*radius*radius*height;
	}
	public Object getArea() {
	
		return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
	}
	
}