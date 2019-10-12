
public class testasalario {

	public static void main (String[]args) {
		salario s= newsalario();
		s.set vh (10);
		s.set nh (100);
		System.out.println("R$"+s.calcsal());
	}
}

