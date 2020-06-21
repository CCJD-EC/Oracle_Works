package Exercise_04;

import javax.swing.JOptionPane;

public class SquareRoot {
	
	double a;
	double b;
	double c;
	
	public SquareRoot(double a, double b, double c) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
		this.c = c;
	
	}
	
	public void getSquaresRoot() {
		int count = 0;
		try {
			for(double root: calculate())
				JOptionPane.showMessageDialog(null, "X"+(count+1)+" is: "+root);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Don't exist squareroots");
		}
	}
	public void getSquareRoot() {
		try{
			for(double root: calculate())
			JOptionPane.showMessageDialog(null, "X1"+"is: "+root);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Don't exist squareroots");
		}
	}
		
	public double getDiscriminate() {
		return Math.pow(this.b, 2) - (4* this.a *this.c) ;
	}
	
	public boolean hasSquaresRoot() {
		if (getDiscriminate() >= 0 ) return true;
		
		return false;
	}
	
	public boolean hasSquareRoot() {
		if (getDiscriminate() == 0 ) return true;
		
		return false;
	}
	public double[] calculate() {
		if(hasSquaresRoot()) {
			double [] x = new double[2];
			x[0] = ((-this.b) + (Math.sqrt(getDiscriminate())))/(2*this.a);
			x[1] = ((-this.b) - (Math.sqrt(getDiscriminate())))/(2*this.a);
			System.out.println("X1 is: "+ x[0]+ (x[0]==x[1] ? " ":"\n"
						  +"X2 is: "+ x[1]));
			return x;
		}else {
			System.out.println("The discriminate is negative");
		}
		return null;
	}
	
	

}
