
public class tryoutCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0){
			System.out.println("enter 4 intgers");
		}
		else if(args.length == 4){
			double numerator1 = Double.parseDouble(args[0]);
			double Denominator1 = Double.parseDouble(args[1]);
			double numerator2 = Double.parseDouble(args[2]);
			double denominator2 = Double.parseDouble(args[3]);
			double fraction1 = numerator1/Denominator1;
			double fraction2 = numerator2/denominator2;
		double a = fraction1+fraction2;
		double b = fraction1-fraction2;
		double c = fraction1*fraction2;
		double d = fraction1/fraction2;
		System.out.println("sum is "+a +"\n"+"difference is " + b + "\n" + "product is "+ c + "\n" + "diference is "+d);
		}
		else System.out.println("enter 4 intgers");
	}
	
}
