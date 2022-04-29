package miniP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class ComplaintDetailFetcher {
	
UsBankFileRead bankfileR= new UsBankFileRead();
Scanner sc=new Scanner(System.in);

void loadData()
{
	bankfileR.fileLoader();
}

void complaintsBasedOnYear(String year)
{
	ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	int count=0;
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		
		if(complaintDetails2.getDateReceived().contains(year))
			  { 
			System.out.println("----------------------------------------------");
			System.out.println("\n");
		  		System.out.println(complaintDetails2.getIssue());
				count++;
			  }
		
	}
	if(count==0)
		System.out.println("Sorry no complaints found for this year");
	System.out.println("\n total Complaints for the entered year = "+count);
	
}
	

	
	
	
void complaintsBasedOnCompany(String u_company)
{
	int c=0;
	ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		
			if(u_company.contains(complaintDetails2.getCompany()))
			{
				System.out.println(complaintDetails2.getIssue()+" "+u_company);
				c=1;
				
			}
		
	}
	if(c!=1)
		System.out.println("please enter valid company Name");
}

void complaintsBasedOnComplaintID(String id)
{
	ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	
	int c=0;
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		if(complaintDetails2.getCompanyId().equals(id))
		{
			System.out.println(complaintDetails2.toString());
			c=1;
		}
	}
	if(c!=1)
		System.out.println("please enter valid company id");
		
}

void NoOfDaysTOCloseComplaint(String id)
{
ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	
	int c=0;
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		if(complaintDetails2.getCompanyId().equals(id))
		{
			String compResp=complaintDetails2.getCompanyResponseToConsumer();
			if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
			  {
			String dateSent=complaintDetails2.getDateSentToCompany();
			String dateRecieved=complaintDetails2.getDateReceived();
			SimpleDateFormat myFormat = new SimpleDateFormat("MM/dd/yyyy");
			
			 java.util.Date date1;
			 java.util.Date date2;
			
		        try {
					date2 = myFormat.parse(dateRecieved);
					 date1 = myFormat.parse(dateSent);
					 long difference = Math.abs(date1.getTime() - date2.getTime());
				        long differenceDates = difference / (24 * 60 * 60 * 1000);

				        //Convert long to String
				        String dayDifference = Long.toString(differenceDates);

				        System.out.println("total days ="+dayDifference);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    
			
			c=1;
			  }
		}
		
	}
	/*
	int noOfDays=0;
    int n1 = dt1.y * 365 + dt1.d;
    for (int i = 0; i < dt1.m - 1; i++) 
    {
        n1 += monthDays[i];
    }
    n1 += countLeapYears(dt1);
    int n2 = dt2.y * 365 + dt2.d;
    for (int i = 0; i < dt2.m - 1; i++)
    {
        n2 += monthDays[i];
    }
    n2 += countLeapYears(dt2);
    noOfDays=n2 - n1;
  */
}


void complaintsClosed()
{
	ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		String compResp=complaintDetails2.getCompanyResponseToConsumer();
		if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
		  {
			  System.out.println(complaintDetails2.toString());
		  }
		
		
	}

}


void complaintsReceivingTimelyResponse()
{
	ArrayList<ComplaintDetails> complaintDetails=bankfileR.GetMapBankobjcompdet();
	for (ComplaintDetails complaintDetails2 : complaintDetails) 
	{
		if(complaintDetails2.getTimelyResponse().equalsIgnoreCase("yes"))
		{
			System.out.println(complaintDetails2.toString());
		}
	}

}

public ComplaintDetailFetcher() {
	super();
}
}
