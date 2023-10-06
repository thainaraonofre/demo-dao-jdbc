package demojdbctest.jdbc;

import demojdbctest.jdbc.model.dao.DaoFactory;
import demojdbctest.jdbc.model.dao.SellerDao;
import demojdbctest.jdbc.model.entities.Department;
import demojdbctest.jdbc.model.entities.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		Scanner sc = new Scanner(System.in);

		System.out.println("===TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);


		System.out.println("\n===TEST 2: seller findById ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n===TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n===TEST 4: seller findAll ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n===TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller. setName("Thainara Cristina");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n===TEST 6: seller delete ===");

		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");


sc.close();

	}
}
