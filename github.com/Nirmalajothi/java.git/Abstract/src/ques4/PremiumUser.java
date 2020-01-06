package ques4;

public class PremiumUser extends User {

	private int discount;
	private int coupon;
	private boolean isNextBookingFree;
	
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public boolean isNextBookingFree() {
		return isNextBookingFree;
	}

	public void setNextBookingFree(boolean isNextBookingFree) {
		this.isNextBookingFree = isNextBookingFree;
	}

	public void addCoupon() {
		this.setCoupon(40);
	}
	
	public void applyDiscount(float amount) {
	this.setBCash(this.getBCash()+amount);
	}
	
	
	public float bookRoom(Booking details) {
		
		Booking[] r=new Booking[100];
		float cash=0;
		for(int i=0;i<r.length;i++) {
			r[i].setBookingID(details.getBookingID());
			r[i].setBookingDate(details.getBookingDate());
			if(this.coupon==1) {
			r[i].setbCashPaid(details.getbCashPaid()-this.coupon);
			if(i==4)
			r[i].setbCashPaid(0);
	}
			cash=r[i].getbCashPaid();
		}
		return cash;
	}

	public float cancelBooking(String bDate) {
		Booking[] star=this.getBookingList();
		float cash=0;
		for(int i=0;i<star.length;i++) {
			if(bDate.equalsIgnoreCase(star[i].getBookingDate())) {
				System.out.println("Booking Cancelled");
			cash= (float) (0.5*star[i].getbCashPaid());
			this.coupon=(int) cash;
			setNextBookingFree(true);
		}
		
		}
		return cash;
	}

}