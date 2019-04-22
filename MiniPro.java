import java.util.*;

class MiniPro{

public static void main (String arg[]){
	Scanner ob=new Scanner(System.in);
	System.out.println("\n          \t1 Converter \n          \t2 Calculator \n          \t3 Atm \n          \t4 Trolly load \n          \t5 Marksheet");
	
	char ch=ob.next().charAt(0);
	
	switch (ch){

		case '1':
		System.out.println("\t1 feet to inches \t2 Day to Month \t3 kilo to grams");
		char s=ob.next().charAt(0);
		switch(s)
		{
		case '1':
		System.out.print("enter feet?");
		int feet=ob.nextInt();
		int inch=feet*12;
		System.out.println("Inches will be :"+inch);
		break;
		
		case'2':
		System.out.println("enter Day?");
		int day=ob.nextInt();
		int mont=day/30;
		System.out.println("Month will be :"+mont);
		break;
		
		case '3':
		System.out.print("enter Klo?");
		int k=ob.nextInt();
		int g=k*1000;
		System.out.println("grame will be :"+g);
        break;
		default:
		System.out.println("Invalid Number");
		
		}
		break;
		
		case '2':
		System.out.println("\n1 Simple Calculator \n2 Character Calculator");
		char cal=ob.next().charAt(0);
		switch (cal)
		{
			case '1':
			System.out.println("Simple Calculators");
			System.out.println("1 Addtion\n2 Multiplication\n3 Divsion\n4 Remainder");
			char aq=ob.next().charAt(0);
			switch(aq){
				case'1':
				System.out.println("Enter 1st Value");
				int a66=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b88=ob.nextInt();
				System.out.println("Addtion is: "+(a66+b88));
				break;
				case'2':
				System.out.println("Enter 1st Value");
				int a99=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b00=ob.nextInt();
				System.out.println("Multiplication is: "+(a99*b00));
				break;
				case '3':
				System.out.println("Enter 1st Value");
				int a12=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b22=ob.nextInt();
				System.out.println("Division is: "+(a12/b22));
				break;
				case'4':
				System.out.println("Enter 1st Value");
				int a33=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b44=ob.nextInt();
				System.out.println("Remainder is: "+(a33%b44));
				break;
				default:
				System.out.println("Invalid Number");
			}
			break;
			case '2':
			System.out.println("Character Calculator");
			
			System.out.println("Press + for addition\nPress - for subtraction\nPress * for multiplication\nPress / for division\nPress % for remainder");
			
			char ac=ob.next().charAt(0);
			switch(ac){
				case '+':
				System.out.println("Enter 1st Value");
				int aa=ob.nextInt();
				System.out.println("Enter 2nd value");
				int bb=ob.nextInt();
				System.out.println("Addtion is: "+(aa+bb));
				break;
				
				case '-':
				System.out.println("Enter 1st Value");
				int a1=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b1=ob.nextInt();
				System.out.println("Subtraction is: "+(a1-b1));
				break;
				case'*':
				System.out.println("Enter 1st Value");
				int a2=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b2=ob.nextInt();
				System.out.println("Multiplication is: "+(a2*b2));
				break;
				case '/':
				System.out.println("Enter 1st Value");
				int a3=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b4=ob.nextInt();
				System.out.println("Division is: "+(a3/b4));
			 break;
			 case'%':
			 System.out.println("Enter 1st Value");
				int a5=ob.nextInt();
				System.out.println("Enter 2nd value");
				int b6=ob.nextInt();
				System.out.println("Remainder is: "+(a5%b6));
					default:
				System.out.println("Invalid Number");
			  break;
				
				
			}
				default:
				System.out.println("Invalid Number");
		
		}
	break; 
			 
		case '3':
		 System.out.println("Enter  amount : ");
	int a=ob.nextInt(),b=5000;	
	System.out.println("\n5000 notes: "+a/b);
	b=a%b; //388
	System.out.println("\n1000 notes: "+b/1000);
	b=a%1000; //388
	System.out.println("\n500 notes: "+b/500);
	b=a%500; //388
	System.out.println("\n100 notes: "+b/100);
	b=b%100; //88
	System.out.println("\n50 notes: "+b/50);
	b=b%50; //38 
	System.out.println("\n20 notes: "+b/20);
	b=b%20; //18
	System.out.println("\n10 notes: "+b/10);
	b=b%10; //8
	System.out.println("\n5 coins: "+b/5);
	b=b%5; //3
	System.out.println("\n2 coins: "+b/2);
	b=b%2; //1
	System.out.println("\n1 coins: "+b/1);	
	
	break;
	case '4':
	System.out.println("Enter trolly Load");
		int v=ob.nextInt();
		
		int total=800*v;
		System.out.println("Total amount"+total);
		int Driver=150*v;
		System.out.println("Driver Salary per load"+Driver);
		
		int tax=80*v;
		System.out.println("tax per Load"+tax);
		
		int Disel=160*v;
		System.out.println("Disel consume per load litter"+Disel);
		
		int profit=total-Driver-tax-Disel;
		System.out.println("profit is"+profit);
		
			
	case '5':
	System.out.println("Enter java marks?");
		int z=ob.nextInt();
		System.out.println("Enter cpp marks?");
		int x=ob.nextInt();
	    System.out.println("Enter database marks?");
		int c=ob.nextInt();
		System.out.println("Enter android marks?");
		int d=ob.nextInt();
		System.out.println("Enter jsp marks?");
		int e=ob.nextInt();
		
		int obtaind = z+x+c+d+e;
		
		int totalmarks = 800;
		
		float per =  obtaind * 100/ totalmarks;
		
		System.out.println("Obtained: "+obtaind);
		System.out.println("\nPercentage is"+per);
		
		if(per>=0&&per<40){
		System.out.println("Fail");}
		if(per>=40&&per<60){
		System.out.println("C");}
		if(per>=60&& per<80){
		System.out.println("B");}
		if(per>=80&& per<=100){
		System.out.println("A");
		}			default:
				System.out.println("Invalid Number");
			
		break;
			

	
		 

        	
 
		

		
}
		
	
	
	
	
     
	 

}
}