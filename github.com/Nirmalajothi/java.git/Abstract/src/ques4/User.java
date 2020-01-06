package ques4;

public abstract class User {

	private String userName;
	private String emailID;
	private String mobileNo;
	private float bCash;
	private Booking[] bookingList;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public float getBCash() {
		return bCash;
	}
	public void setBCash(float bCash) {
		this.bCash = bCash;
	}
	public Booking[] getBookingList() {
		return bookingList;
	}
	public void setBookingList(Booking[] bookingList) {
		this.bookingList = bookingList;
	}
	
	public void updateDetails(String details) {
		String[] str=details.split(" ");
		this.setUserName(str[0]);
		this.setEmailID(str[1]);
		this.setMobileNo(str[2]);
	}
	public void rechargeBCash(float amount) {
		this.setBCash(amount);
	}
	
	public abstract float bookRoom(Booking details);
	public abstract float cancelBooking(String bDate);
}