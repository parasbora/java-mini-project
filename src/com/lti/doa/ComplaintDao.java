package com.lti.doa;


import java.util.List;

import com.lti.model.Complaint;

public interface ComplaintDao {
List<Complaint> getComplaintsByYear(int year);
List<Complaint> getComplaintsByBank(String bank);
Complaint getComplaintById(int id);
int getDaysToResolve(int id);
List<Complaint> getClosedComplaint();
List<Complaint> getTimelyResponseComplaint();

int addComplaint(Complaint complaint);
}
