import java.util.Scanner;

public class TestaCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
Calculadora c;
double x,y;
System.out.println("Valor 1:");
x=s.nextDouble();
System.out.println("Valor 2:");
y=s.nextDouble();
c= new Calculadora (x,y);
System.out.println(c.n1+"+"+c.n2+"="+c.soma());
System.out.println(c.n1+"*"+c.n2+"="+c.produto());
System.out.println(c.n1+"^"+c.n2+"="+c.potencia());



	}

}
