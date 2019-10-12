
public class TestaCalc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculadora c1=new Calculadora (3,3);
Calculadora c2=new Calculadora (1,99);

System.out.println(c1.n1+"+"+c1.n2+"="+c1.soma());
System.out.println(c1.n1+"*"+c1.n2+"="+c1.produto());
System.out.println(c1.n1+"^"+c1.n2+"="+c1.potencia());
System.out.println(c2.n1+"+"+c2.n2+"="+c2.soma());
System.out.println(c2.n1+"*"+c2.n2+"="+c2.produto());
System.out.println(c2.n1+"^"+c2.n2+"="+c2.potencia());
	}

}
