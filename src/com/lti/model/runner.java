package com.lti.model;

import com.lti.doa.ComplaintImpl;

public class runner {
	public static void main(String[] args) {
		ComplaintImpl c = new ComplaintImpl();
		
//		
//		c.getDaysToResolve(480974);

		c.getComplaintsByYear(2013);

//		c.getTimelyResponseComplaint();
//
//		c.getClosedComplaint();
//
//		c.getComplaintsByBank("Citibank");
	}
}
