
public class Series {

	private int i1=0;
	private int i2=0;
	private int passo=0;
	
	public void setI1 (int i1) {
		this.i1 = i1;
	}
	
	public void setI2 (int i2) {
		this.i2 = i2;}
		
	public void setPasso (int passo) {
		if (passo <= 0) {
		   this.passo = 1;}
		else
			this.passo = passo;}
	
	public String mostraSerie() {
		String s="";
				int i=0;
				if (this.i1<this.i2) {
					i=this.i1;
					while (i<=this.i2) {
						s+=i+";";
						i+=this.passo;
						
					}
				}
				else
				{
					i=this.i1;
					while (i>this.i2) {
						s+=i+";";
						i-=this.passo;
					}
				}
				return s;
	}
					}
				
		
	
	 //  System.out.println(s1.mostraSerie());

	
	

