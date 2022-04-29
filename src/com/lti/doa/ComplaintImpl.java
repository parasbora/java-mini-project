package com.lti.doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lti.model.Complaint;

public class ComplaintImpl implements ComplaintDao {
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		return con;
	}

	public List<Complaint> getComplaintsByYear(int year) {
		List<Complaint>complaints= new ArrayList<Complaint>();
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from complaints where extract(year from date_received) ="+year);
			while(rs.next()) {
				Complaint comp = new Complaint();
				comp.setCompany(rs.getString("company"));
				comp.setCompanyResponse(rs.getString("company_response_to_consumer"));
				comp.setComplaintId(rs.getInt("complaint_id"));
				comp.setDateReceived(rs.getString("date_received"));
				comp.setConsumerDisputed(rs.getString("consumer_disputed"));
				comp.setDateSent(rs.getString("date_sent_to_company"));
				comp.setIssue(rs.getString("issue"));
				comp.setSubIssue(rs.getString("sub_issue"));
				comp.setProduct(rs.getString("product"));
				comp.setState(rs.getString("state"));
				comp.setSubmittedVia(rs.getString("submitted_via"));
				comp.setZipCode(rs.getInt("zip_code"));
				comp.setSubProduct(rs.getString("sub_product"));
				comp.setTimelyResponse(rs.getString("timely_response"));
				System.out.println(comp.toString());
				complaints.add(comp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	return complaints;
		
	}

	public List<Complaint> getComplaintsByBank(String bank) {
			List<Complaint>complaints= new ArrayList<Complaint>();
			try {
				Connection con = getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from complaints where company= '" + bank+"'");
				while(rs.next()) {
					Complaint comp = new Complaint();
					comp.setCompany(rs.getString("company"));
					comp.setCompanyResponse(rs.getString("company_response_to_consumer"));
					comp.setComplaintId(rs.getInt("complaint_id"));
					comp.setDateReceived(rs.getString("date_received"));
					comp.setConsumerDisputed(rs.getString("consumer_disputed"));
					comp.setDateSent(rs.getString("date_sent_to_company"));
					comp.setIssue(rs.getString("issue"));
					comp.setSubIssue(rs.getString("sub_issue"));
					comp.setProduct(rs.getString("product"));
					comp.setState(rs.getString("state"));
					comp.setSubmittedVia(rs.getString("submitted_via"));
					comp.setZipCode(rs.getInt("zip_code"));
					comp.setSubProduct(rs.getString("sub_product"));
					comp.setTimelyResponse(rs.getString("timely_response"));
					System.out.println(comp.toString());
					complaints.add(comp);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return complaints;
	}

	public Complaint getComplaintById(int id) {
		Complaint comp = new Complaint();
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from complaints where complaint_id=" + id);
			rs.next();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return comp;
	}

	public int getDaysToResolve(int id) {
		int daysLeft=0;
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select ROUND(date_sent_to_company - date_received)+1 FROM complaints where complaint_id="+id);
			rs.next();
			daysLeft= rs.getInt(1);
			System.out.println(daysLeft);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return daysLeft;
	}

	public List<Complaint> getClosedComplaint() {
		List<Complaint>complaints= new ArrayList<Complaint>();
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from complaints where company_response_to_consumer= 'Closed' OR  company_response_to_consumer= 'Closed with explanation'");
			while(rs.next()) {
				Complaint comp = new Complaint();
				comp.setCompany(rs.getString("company"));
				comp.setCompanyResponse(rs.getString("company_response_to_consumer"));
				comp.setComplaintId(rs.getInt("complaint_id"));
				comp.setDateReceived(rs.getString("date_received"));
				comp.setConsumerDisputed(rs.getString("consumer_disputed"));
				comp.setDateSent(rs.getString("date_sent_to_company"));
				comp.setIssue(rs.getString("issue"));
				comp.setSubIssue(rs.getString("sub_issue"));
				comp.setProduct(rs.getString("product"));
				comp.setState(rs.getString("state"));
				comp.setSubmittedVia(rs.getString("submitted_via"));
				comp.setZipCode(rs.getInt("zip_code"));
				comp.setSubProduct(rs.getString("sub_product"));
				comp.setTimelyResponse(rs.getString("timely_response"));
				System.out.println(comp.toString());
				complaints.add(comp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	return complaints;
		
	}

	public List<Complaint> getTimelyResponseComplaint() {
		List<Complaint>complaints= new ArrayList<Complaint>();
		try {
			Connection con = getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from complaints where timely_response='Yes'");
			while(rs.next()) {
				Complaint comp = new Complaint();
				comp.setCompany(rs.getString("company"));
				comp.setCompanyResponse(rs.getString("company_response_to_consumer"));
				comp.setComplaintId(rs.getInt("complaint_id"));
				comp.setDateReceived(rs.getString("date_received"));
				comp.setConsumerDisputed(rs.getString("consumer_disputed"));
				comp.setDateSent(rs.getString("date_sent_to_company"));
				comp.setIssue(rs.getString("issue"));
				comp.setSubIssue(rs.getString("sub_issue"));
				comp.setProduct(rs.getString("product"));
				comp.setState(rs.getString("state"));
				comp.setSubmittedVia(rs.getString("submitted_via"));
				comp.setZipCode(rs.getInt("zip_code"));
				comp.setSubProduct(rs.getString("sub_product"));
				comp.setTimelyResponse(rs.getString("timely_response"));
				System.out.println(comp.toString());
				complaints.add(comp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	return complaints;
	}

	public int addComplaint(Complaint complaint) {
	
		try {
			Connection connection = getConnection();
			PreparedStatement psmt = connection.prepareStatement("insert into complaints values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			psmt.setInt(1, complaint.getComplaintId());
			psmt.setString(2, complaint.getDateReceived());
			psmt.setString(3, complaint.getProduct());
			psmt.setString(4, complaint.getSubProduct());
			psmt.setString(5, complaint.getIssue());
			psmt.setString(6, complaint.getSubIssue());
			psmt.setString(7, complaint.getCompany());
			psmt.setString(8, complaint.getState());
			psmt.setInt(9, complaint.getZipCode());
			psmt.setString(10, complaint.getSubmittedVia());
			psmt.setString(11, complaint.getDateSent());
			psmt.setString(12, complaint.getCompanyResponse());
			psmt.setString(13, complaint.getTimelyResponse());
			psmt.setString(14, complaint.getConsumerDisputed());
			psmt.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

}
