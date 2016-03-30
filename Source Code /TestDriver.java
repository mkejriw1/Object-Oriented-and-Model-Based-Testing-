import java.io.*;
import java.util.*;
public class TestDriver extends GasPump {
	
	public static void main(String[] args)throws IOException {
		GasPump g=new GasPump();
		float a,b,d,cash;
		int x;
		//display of my information 
		System.out.println("Mallika Kejriwal");
		System.out.println("A20365044");
		System.out.println("CS 525 - Main Project");
		System.out.println("Driver for the GasPump Class"); 
		Scanner input=new Scanner(System.in);
		int i = 0;
		System.out.println("\n"+"Press enter to continue");
	    System.in.read();
		while(i==0)
		{
		//options for user to select
		System.out.println();
		System.out.println("Select option from below");
		System.out.println("1.Activate");
		System.out.println("2.PayCredit");
		System.out.println("3.Reject");
		System.out.println("4.Approved");
		System.out.println("5.PayCash");
		System.out.println("6.Cancel");
		System.out.println("7.Regular");
		System.out.println("8.Super");
		System.out.println("9.Diesel");
		System.out.println("10.StartPump");
		System.out.println("11.PumpLiter");
		System.out.println("12.StopPump");
		System.out.println("13.NoRecipt");
		System.out.println("14.Reciept");
		System.out.println("15.TurnOff");	
		System.out.println("");
		System.out.println("");
		System.out.println("Testing Related Methods");
		System.out.println("16.Show_Price");
		System.out.println("17.Show_Selected_Price");
		System.out.println("18.Show_State");
		System.out.println("19.Show No of Gallons Pumped");
		System.out.println("20.Get Total");
		System.out.println("21.Payment Method");
		System.out.println("");
		System.out.println("");
		System.out.println("22.Quit Gas Pump Driver");
	
		x=input.nextInt();
		//switch cases for each input user gives
		
		switch(x)
		{
		case 1: System.out.println("You selected Activate");
		System.out.println("Enter regular price ");
		a = input.nextFloat();
		System.out.println("Enter super price ");
		b = input.nextFloat();
		System.out.println("Enter diesel price ");
		d = input.nextFloat();
		System.out.println("Return Value is"+g.Activate(a,b,d));
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 2:System.out.println("You have selected to pay by credit");
		System.out.println("Return Value is"+g.PayCredit());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 3:System.out.println("Your card has been rejected");
		System.out.println("Return Value is"+g.Reject());
		break;
		
		case 4: System.out.println("Your card is approved");
		System.out.println("Return Value is"+g.Approved());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 5: System.out.println("You selected to pay by cash");
		System.out.println("Enter Cash");
		cash = input.nextFloat();
		
		System.out.println("Return Value is"+g.PayCash(cash));
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 6: System.out.println("You selected cancel");
		System.out.println("Return Value is"+g.Cancel());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 7: System.out.println("You selected Regular type");
		System.out.println("Return Value is"+g.Regular());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 8: System.out.println("You selected Super type");
		System.out.println("Return Value is"+g.Super());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 9: System.out.println("You selected Diesel type");
		System.out.println("Return Value is"+g.Diesel());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 10: System.out.println ("You have selected to start pump");
		System.out.println("Return Value is"+g.StartPump());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 11:System.out.println("You selected pump liter");
		System.out.println("Return Value is"+g.PumpLiter());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 12:System.out.println("You selected stop pump ");
		System.out.println("Return Value is"+g.StopPump());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 13: System.out.println("You selected No reciept");
		System.out.println("Return Value is"+g.NoReceipt());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 14: System.out.println("You selected reciept");
		System.out.println("Return Value is"+g.Receipt());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		case 15: System.out.println("You selected Turn Off");
		System.out.println("Return Value is"+g.TurnOff());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method getregularprice , getDieselPrice , getSuperPrice  is called
		case 16: System.out.println("Following are the prices of Gasoline");
		System.out.println("nRegular Price: "+g.getRegularPrice()+"\nSuper Price: "+g.getSuperPrice()+"\nDeisel Price: "+g.getDieselPrice());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method getPrice is called
		case 17: System.out.println("This is the selected gasoline price");
		System.out.println("The price of selected gasoline is "+g.getPrice());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method State is called
		case 18: System.out.println("Get State is called ");
		int dt=g.State();
		if (dt == -2)
		{
			System.out.println("State is : Exit");
		}
		else if (dt == -1)
		{
			System.out.println("State is : Entry");
		}
		else
		{
			System.out.println("State is : " +g.State());
		}
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method getNumberOfGallons is called
		case 19: System.out.println("No of gallons pumped is called");
		System.out.println("Number of Gallons pumped: "+g.getNumberOfGallons());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method getTotal is called
		case 20: System.out.println("Total is called");
		System.out.println("Total is"+g.getTotal());
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		//testing oriented method getW is called
		case 21: System.out.println("Pay by cash/credit is called");
		int method = g.getW();
		if (method == 0)
		{
			System.out.println("Payment mode is  : CASH");
		}
		else
		{
			System.out.println("Payment mode is  : CREDIT CARD");
		}
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
	    break;
		
		
		case 22: System.out.println("Your program is now shutting down");
		i = 1;
		break;
		
		
		default: System.out.println("Please enter the valid option");
		System.out.println("\n"+"PRESS ANY KEY TO CONTINUE...");
	    System.in.read();
		break;
		
		
		}
		 System.out.println("-----------------------------------------------------------------");
		}

 }
}
