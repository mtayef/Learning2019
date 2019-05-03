public Class JSonJava{
	public static void main(String args[]){
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root","Internal101%");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate = curdate() Limit 1;");
		while(rs.next){
			CustomerDetails c = new CustomerDetails();
			
			//setters
			c.setCourseName(rs.getString(1));
			c.setPurchasedDate(rs.getString(2));
			c.setAmount(rs.getInt(3));
			c.setLocation(rs.getString(4));

			//getters 
			System.out.println(c.getCourseName());
			System.out.println(c.getPurchasedDate());
		}
	}
}
