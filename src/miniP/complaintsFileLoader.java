package miniP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

 class Complaintdata {
String dateReceived, product, subProduct, issue, subIssue, companyname, state, ZIPcode, submittedVia, dateSentToCompany, companyResponseToConsumer, timelyResponse,consumerDisputed;
String complaintid;
}
 
public class complaintsFileLoader {

	 String path="C:\\Users\\paras\\Downloads";
HashMap <String, Complaintdata> MapBankobjcompdet = new HashMap<>();
public void fileLoader() {
 String path="C:\\Users\\paras\\Downloads";
 String line="";
 
 try {
	BufferedReader bf=new BufferedReader(new FileReader(path));
	while ((line=bf.readLine())!=null)
	{   
		
		
		String[] elements=line.split(",");
		Complaintdata obj=new Complaintdata();
		obj.dateReceived=elements[0];
		obj.product=elements[1];
		obj.subProduct=elements[2];
		obj.issue=elements[3];
		obj.subIssue=elements[4];
		obj.companyname=elements[5];
		obj.state=elements[6];
		obj.ZIPcode=elements[7];
		obj.submittedVia=elements[8];
		obj.dateSentToCompany=elements[9];
		obj.companyResponseToConsumer=elements[10];
		obj.timelyResponse=elements[11];
		obj.consumerDisputed=elements[12];
		obj.consumerDisputed=elements[12];
		
		MapBankobjcompdet.put(elements[13],obj); 
	}
	bf.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
 
 
}

HashMap<String,Complaintdata> GetMapBankobjcompdet(){
	
	return MapBankobjcompdet;
	
}

public void newdataentry(String a, Complaintdata obj3) {
try{
	
		
		//String[] elements=line1.split(",");
//		Complaintdata obj1=new Complaintdata();
//		obj1.dateReceived=dR;
//		obj1.product=pro;
//		obj1.subProduct=subPro;
//		obj1.issue=iss;
//		obj1.subIssue=subIss;
//		obj1.companyname=compa;
//		obj1.state=sta;
//		obj1.ZIPcode=Zcode;
//		obj1.submittedVia=submitVia;
//		obj1.dateSentToCompany=dSentToCompany;
//		obj1.companyResponseToConsumer=companyResponseToConsumer;
//		obj1.timelyResponse=timeResponse;
//		obj1.consumerDisputed=consuDisputed;
		//obj.consumerDisputed=elements[12];
		
		//((obj1) MapBankobjcompdet).add(ComplID,obj1); 
		MapBankobjcompdet.put(obj3.complaintid, obj3);
	
//	bf.close();
	
} 
catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
}
