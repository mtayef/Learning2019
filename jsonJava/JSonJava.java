package jsonJava;
import com.fasterxml.jackson.databind;

public Class JSonJava{
	public static void main(String args[]){
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		
		CustomerDetails c = new CustomerDetails();
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business", "root","Internal101%");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where location = 'Asia' and purchasedDate = curdate();");
		
		
		while(rs.next){			
			//setters
			c.setCourseName(rs.getString(1));
			c.setPurchasedDate(rs.getString(2));
			c.setAmount(rs.getInt(3));
			c.setLocation(rs.getString(4));

			//getters 
			System.out.println(c.getCourseName());
			System.out.println(c.getPurchasedDate());
		}
		ObjectMapper o = new ObjectMapper();
		o.writeValue(new File(""),c);
		con.close();
	}
}
