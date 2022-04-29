package com.lti.model;

public class Complaint {
	public Complaint() {

	}

	public Complaint(String dateReceived, String product, String subProduct, String issue, String subIssue,
			String company, String state, int zipCode, String submittedVia, String dateSent, String companyResponse,
			String timelyResponse, String consumerDisputed, int complaintId) {
		super();
		this.complaintId = complaintId;
		this.dateReceived = dateReceived;
		this.product = product;
		this.subProduct = subProduct;
		this.issue = issue;
		this.subIssue = subIssue;
		this.company = company;
		this.state = state;
		this.zipCode = zipCode;
		this.submittedVia = submittedVia;
		this.dateSent = dateSent;
		this.companyResponse = companyResponse;
		this.timelyResponse = timelyResponse;
		this.consumerDisputed = consumerDisputed;
		
	}

	@Override
	public String toString() {
		return "Complaint [dateReceived=" + dateReceived + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", zipCode=" + zipCode + ", submittedVia=" + submittedVia + ", dateSent=" + dateSent
				+ ", companyResponse=" + companyResponse + ", timelyResponse=" + timelyResponse + ", consumerDisputed="
				+ consumerDisputed + ", complaintId=" + complaintId + "]";
	}

	private String dateReceived;
	private String product;
	private String subProduct;
	private String issue;
	private String subIssue;
	private String company;
	private String state;
	private int zipCode;
	private String submittedVia;
	private String dateSent;
	private String companyResponse;
	private String timelyResponse;
	private String consumerDisputed;
	private int complaintId;

	public String getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(String subProduct) {
		this.subProduct = subProduct;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getSubIssue() {
		return subIssue;
	}

	public void setSubIssue(String subIssue) {
		this.subIssue = subIssue;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getSubmittedVia() {
		return submittedVia;
	}

	public void setSubmittedVia(String submittedVia) {
		this.submittedVia = submittedVia;
	}

	public String getDateSent() {
		return dateSent;
	}

	public void setDateSent(String dateSent) {
		this.dateSent = dateSent;
	}

	public String getCompanyResponse() {
		return companyResponse;
	}

	public void setCompanyResponse(String companyResponse) {
		this.companyResponse = companyResponse;
	}

	public String getTimelyResponse() {
		return timelyResponse;
	}

	public void setTimelyResponse(String timelyResponse) {
		this.timelyResponse = timelyResponse;
	}

	public String getConsumerDisputed() {
		return consumerDisputed;
	}

	public void setConsumerDisputed(String consumerDisputed) {
		this.consumerDisputed = consumerDisputed;
	}

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

}
