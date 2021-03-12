import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

	private Connection connection = null;


	public MySQLAdsDao(Config config){
		try {
			DriverManager.registerDriver(new Driver());
			connection = DriverManager.getConnection(
					config.getUrl(),
					config.getUser(),
					config.getPassword()
			);

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	@Override
	public List<Ad> all() {
		List<Ad> ads = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM ads");
			while(rs.next()){
				ads.add(new Ad(
						rs.getLong("id"),
						rs.getLong("user_id"),
						rs.getString("title"),
						rs.getString("description")
				));
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}

		return ads;
	}

	@Override
	public Long insert(Ad ad) {

		String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = statement.getGeneratedKeys();
			rs.next();
			System.out.println("Inserted a new ad.  Ad ID: " + rs.getLong(1));
			return rs.getLong(1);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

}

