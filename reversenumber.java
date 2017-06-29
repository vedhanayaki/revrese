package guviset3;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int a,b,c=0,d;
a=s.nextInt();
b=a;
while(a>0){
	d=a%10;
	c=(c*10)+d;
	a=a/10;
}
System.out.println("reverse number"+c);
}

	}


