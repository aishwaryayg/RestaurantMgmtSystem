package Console;

import java.util.Scanner;

public class FinalRMS {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalRMS r=new FinalRMS();
		char ch;
		int b1=0;
		int b2=0;
		int b3=0;
		int b4=0;
		int b5,b6;
		int bill=0;
		
		System.out.println("Welcome to Anonymous Resaturant\n");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your choice\n1.Table Service\n2.Take Away\n3.Reserve Table\n");
		int choice=sc.nextInt();
	
		switch(choice) {
		case 1:System.out.println("Your choice is Table Service\n");
		break;
		
		case 2:System.out.println("Your choice is Take Away\n");
		break;
		
		case 3:System.out.println("Your choice is Reserve Table\n");
		System.out.println("Please enter your details");
		System.out.println("Name");
		String name=sc.next();
		System.out.println("PNo");
		long phone_no=sc.nextLong();
		System.out.println("Address");
		String address=sc.next();
		System.out.println("1.AC-300\n2.Non-AC-150");
		int type=sc.nextInt();
		switch(type) {
		case 1:System.out.println("AC");
		b5=300;
		System.out.println("The Table is reserved and amount is : " +b5);
		break;
		case 2:System.out.println("Non-AC");
		b6=150;
		System.out.println("The Table is reserved and amount is : " +b6);
		break;
		default:System.out.println("Not Available");
		}	
		break;
		default:System.out.println("Not Available");
		}
		
		
		if(choice==1 || choice==2 ) 
		{
			do {
			System.out.println("Please select type of food\n1.Veg\n2.Non-Veg\n3.Bevarges\n4.Dessert\n");
			int food_id=sc.nextInt();
			switch(food_id) {
			case 1: System.out.println("You have choosen Veg\n");
			String Veg[]= {"Roti		15","Chapati	10","Curry		60","Dal		50","Fried Rice	80","Jeera Rice	80","Curd Rice	60"};
			for (int i=0; i<Veg.length; i++)  
			{  
			System.out.println(i+1+"."+ Veg[i]); 
			}
			System.out.println();
	
				System.out.println("Select the food you want");
				int j=sc.nextInt();
				System.out.println("Enter the quantity");
				int number=sc.nextInt();
				int amt[]= {15,10,60,50,80,80,60};
				for(int k=0;k<amt.length+1;k++) {
				if(k+1==j) {
					 b1=amt[k]*number;
				System.out.println("Total amount " + b1);
				}
				}
			break;
			case 2:System.out.println("You have choosen Non-Veg");
			String NVeg[]= {"Butter Chicken	150","Chicken Fry		120","Biryani		200","Mutton Korma		250","Fish Fry		300"};
				for (int i=0; i<NVeg.length; i++)  
				{  
				System.out.println(i+1 +" "+NVeg[i]);  
				}  
				System.out.println();
				System.out.println("Select the food you want");
				int m=sc.nextInt();
				System.out.println("Enter the quantity");
				int number1=sc.nextInt();
				int amt1[]= {150,120,200,250,300};
				for(int k=0;k<amt1.length+1;k++) {
				if(k+1==m) {
					 b2=amt1[k]*number1;
				System.out.println("Total amount " + b2);
				}
				}
				
			break;
			case 3:System.out.println("You have choosen Bevarges");
			String Bvg[]= {"Badam Milk	15","Tea		15","Coffee	15","Cold Drinks	20","Liquior	200","Juice		50"};
			for (int i=0; i<Bvg.length; i++)  
			{  
			System.out.println(i+1 +" "+Bvg[i]);  
			}  
			System.out.println();
			System.out.println("Select the bevarges you want");
			int n=sc.nextInt();
			System.out.println("Enter the quantity");
			int number2=sc.nextInt();
			int amt2[]= {15,15,15,20,200,50};
			for(int k=0;k<amt2.length+1;k++) {
			if(k+1==n) {
				 b3=amt2[k]*number2;
			System.out.println("Total amount " + b3);
			}
			}
			break;
			case 4:System.out.println("You have choosen Dessert");
			 String Dst[]= {"Ice-cream	50","Halwa		120","Peda		150","Kowa		250","Ladoo		200","Jalebi	40","Cake		100"};
			for (int i=0; i<Dst.length; i++)  
			{  
			System.out.println(i+1 +" "+Dst[i]);  
			}  
			System.out.println();
			System.out.println("Select the dessert you want");
			 int p=sc.nextInt();
			System.out.println("Enter the quantity");
			int number3=sc.nextInt();
			int amt3[]= {50,120,150,250,200,40,100};
			for(int k=0;k<amt3.length+1;k++) {
			if(k+1==p) {
				 b4=amt3[k]*number3;
			System.out.println("Total amount " + b4);
			}
			}
			break;
			default:System.out.println("Not Available");
			
		}
			 System.out.println("do you want to continue(y/n)");
			    ch=sc.next().charAt(0);
			    
			}
		
		    while(ch=='y'||ch=='Y');
			bill=b1+b2+b3+b4;
			System.out.println("Total bill is : " + bill);		
		}
		
		//bill=b1+b2+b3+b4;
			//System.out.println("Total bill is : " + bill);			
	}

}
