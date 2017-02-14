package jdbc_ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSet_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
PreparedStatement preparedStatement = connection.prepareStatement("select * from employee");
ResultSet resultSet = preparedStatement.executeQuery();
while(resultSet.next())
{
	System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getLong(3));
}
	}

}
