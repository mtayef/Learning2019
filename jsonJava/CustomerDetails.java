public Class CustomerDetails{

	//change query at the end add Limit 1

	private String courseName;
	private String purchasedDate;
	private int amount;
	private String location;

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	public String getPurchasedDate() {
		return purchasedDate;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public int getAmount() {
		return amount;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
}
