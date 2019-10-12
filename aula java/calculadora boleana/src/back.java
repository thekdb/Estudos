
public class back {
	
	private int n1;
	private int n2;
	
public boolean setn1(int n1){	

	if (n1>0 && n1<100) {
		return true;
}
	else
		return false;
}	
public boolean  setn2(int n2){	

	if (n2>0 && n2<100) {
	return true;}
	else
	return false;
}
public int soma() {
	return this.n1+n2;}

public int produto() {
	return this.n1*n2;}
}