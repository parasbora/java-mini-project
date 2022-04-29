package miniP;
import java.util.Map.Entry;
import java.util.*;
import java.util.Date;
/*
1.Display all the complaints based on the year provided by the user High--done
2.Display all the complaints based on the name of the bank provided by the user High--done
3.Display complaint based on the complaint id provided by the user High--not done
4.Display number of days took by the Bank to close the complaint Medium---not done
5. Display all the complaints closed/closed with explanation Medium
6. Display all the complaints which received a timely response Medium----done
7. Take input from user for storing new complaints Low*/ //----done
public class UserQueries {
	
complaintsFileLoader load= new complaintsFileLoader();
Scanner sc=new Scanner(System.in);

void loadData()
{
	load.fileLoader();
}

void complaintsBasedOnYear(String year)
{
	for (Entry<String, Complaintdata> entry :load.GetMapBankobjcompdet().entrySet()) 
	{
		if(entry.getValue().dateReceived.contains(year))
			  { 
		  		System.out.println(entry.getValue().issue+"---- "+entry.getValue().dateReceived);
			  }
	}
	
}
	

	
	
	
void complaintsBasedOnCompany(String company)
{
for (Entry<String, Complaintdata> entry :load.GetMapBankobjcompdet().entrySet()) 
{
  if(entry.getValue().companyname.contains(company))
  {
	  System.out.println(entry.getValue().issue + "----"+ entry.getValue().companyname);}
//  }
//  else
//	  System.out.println("nothing");
  
}
}

void complaintsBasedOnComplaintID(String id)
{
for (Entry<String, Complaintdata> entry :load.GetMapBankobjcompdet().entrySet()) 
{
 if(load.GetMapBankobjcompdet().containsKey(id))
	//if(load.GetMapBankobjcompdet().containsValue(id))
	{
	  System.out.println(entry.getValue().dateReceived + "--- "+ entry.getValue().product+"--- "+entry.getValue().subProduct+"--- "+entry.getValue().issue+" ---"+entry.getValue().subIssue+"--- "+entry.getValue().companyname+"--- "+entry.getValue().ZIPcode+" ---"+entry.getValue().state+" ---"+entry.getValue().submittedVia+"--- "+entry.getValue().dateSentToCompany+"--- "+entry.getValue().companyResponseToConsumer+"--- "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed+"--- "+load.GetMapBankobjcompdet().values());
  }
//  else
//  {
//	  	System.out.println("Complaint ID does not exists.");
//	  
//  }
}
}

void NoOfDaysTOCloseComplaint(String id)
{
  
}


void complaintsClosed(String uid)
{
for (Entry<String, Complaintdata> entry :load.GetMapBankobjcompdet().entrySet()) 
{
	String compResp=entry.getValue().companyResponseToConsumer;
  
if(entry.getKey().equals(uid)) {
	  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
	  {
	  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().companyname+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
  }}
 // else
 // {
	//  	System.out.println("Complaint ID does not exists.");
	  
 // }
}

}


void complaintsReceivingTimelyResponse(String id)
{
for (Entry<String, Complaintdata> entry :load.GetMapBankobjcompdet().entrySet()) 
{
	if(entry.getValue().timelyResponse.equals("Yes"))
	{
		System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().companyname+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
	}
}
}

public void newcomplaintentry() {
	complaintsFileLoader com = complaintsFileLoader();
Scanner sc = new Scanner(System.in);
String dateReceived, product, subProduct, issue, subIssue, company, state, ZIPcode, submittedVia, dateSentToCompany, companyResponseToConsumer, timelyResponse,consumerDisputed,complaintid;
Complaintdata obj2= new Complaintdata();

	System.out.println("*****enter complaint details******");
	System.out.println("enter datareceived :");
	dateReceived=sc.next();
	
	System.out.println("enter product:");
	obj2.dateReceived=sc.next();
	System.out.println("enter subproduct:");
	obj2.subProduct= sc.next();
	System.out.println("enter issue:");
	obj2.issue= sc.next();
	System.out.println("enter subissue");
	obj2.subIssue=sc.next();
	System.out.println("enter company:");
	obj2.companyname= sc.next();
	System.out.println("enter state");
	obj2.state =sc.next();
	System.out.println("enter Zipcode: ");
	obj2.ZIPcode = sc.next();
	System.out.println("enter submittedvia: ");
	obj2.submittedVia= sc.next();
	System.out.println("enter datasenttocompany :");
	obj2.dateSentToCompany= sc.next();
	System.out.println("enter company response :");
	obj2.companyResponseToConsumer=sc.next();
	System.out.println("enter timely response :");
	obj2.timelyResponse=sc.next();
	System.out.println("enter consumer disputed:");
	obj2.consumerDisputed=sc.next();
	System.out.println("enter complaintid :");
	obj2.complaintid=sc.next();
	com.newdataentry("4",obj2);
	}
private complaintsFileLoader complaintsFileLoader() {
	// TODO Auto-generated method stub
	return null;
}

public UserQueries() {
	super();
}
}