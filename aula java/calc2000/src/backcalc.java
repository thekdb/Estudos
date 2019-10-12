
public class backcalc {
	
	private int n1;
	private int n2;
	
public void setn1(int n1){
	if (n1>0 && n1<100)
		this.n1=n1;
	else
		this.n1=0;}

public void setn2(int n2){
	if (n2>0 && n2<100)
		this.n2=n2;
	else
		this.n2=0;}

public int soma() {
	return this.n1+this.n2;}

public int produto() {
	return this.n1*n2;}
}

