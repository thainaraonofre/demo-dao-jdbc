package demojdbctest.jdbc;

import demojdbctest.jdbc.model.dao.DaoFactory;
import demojdbctest.jdbc.model.dao.SellerDao;
import demojdbctest.jdbc.model.entities.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		Seller seller = sellerDao.findById(3);

		System.out.println(seller);


	}

}
