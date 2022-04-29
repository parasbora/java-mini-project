package miniP;

import java.util.Scanner;
/*
1.Display all the complaints based on the year provided by the user High--done
2.Display all the complaints based on the name of the bank provided by the user High--done
3.Display complaint based on the complaint id provided by the user High--done
4.Display number of days took by the Bank to close the complaint Medium---
5. Display all the complaints closed/closed with explanation Medium
6. Display all the complaints which received a timely response Medium----done
7. Take input from user for storing new complaints Low*/
public class UserUI {
public static void main(String[] args) {
 
	UserQueries fetch= new UserQueries();
	fetch.loadData();
	Scanner sc=new Scanner(System.in);
	System.out.println("Welcome to Complaints Analyzer v1.0!");
	System.out.println("Enter your option between 1 to 8");
	System.out.println("1.Display all the complaints based on the year provided by the user ");
	System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
	System.out.println("3.Display complaints based on the complaint id provided by the user ");
	System.out.println("4.Display number of days took by the Bank to close the complaint ");
	System.out.println("5.Display all the complaints closed/closed with explanation ");
	System.out.println("6.Display all the complaints which received a timely response ");
	System.out.println("7. Take input from user for storing new complaints(for new complaints)");
	System.out.println("enter ur choice:");
	int option=sc.nextInt();
	sc.nextLine();
	
	switch(option)
	{
	case 1: 
		System.out.println("Enter year");
		String year=sc.next();
		fetch.complaintsBasedOnYear(year);
	break;
	case 2:
		System.out.println("Enter company name");
	    String company=sc.next(); 
		fetch.complaintsBasedOnCompany(company);
	break;
	case 3: 
		System.out.println("Enter complaint ID");
		String id=sc.next();
		fetch.complaintsBasedOnComplaintID(id);
	break;
	case 4: 
		System.out.println("Enter complaint ID");
		String compid=sc.next();
		fetch.NoOfDaysTOCloseComplaint(compid);
	break;
	case 5: 
		System.out.println("Enter complaint ID");
		String uid=sc.next();
		fetch.complaintsClosed(uid);
	break;
	case 6: 
		System.out.println("Enter complaint ID");
		String timely_compid=sc.next();
		fetch.complaintsReceivingTimelyResponse(timely_compid);
	break;
	case 7: 
		fetch.newcomplaintentry();
	default: System.out.println("Enter valid option");
	
	}
	sc.close();

}
}