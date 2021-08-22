package student;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mathe {
	public static void main(String []args) {
		DecimalFormat form=new DecimalFormat("0.00");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextInt();
		double height=sc.nextInt();
		Circle obj=new Circle(radius);
		Cyllinder obj2=new Cyllinder(height);
		System.out.println("Cirlce: radius="+radius+" colour=red");
		System.out.println("Cyllinder: radius=1.0 colour=red height="+height);
		System.out.println(form.format(obj.getArea()));
		System.out.println(form.format(obj2.getArea()));
		System.out.println(form.format(obj2.getVolume()));
	}

}
