package demojdbctest.jdbc;

import demojdbctest.jdbc.model.dao.DaoFactory;
import demojdbctest.jdbc.model.dao.DepartmentDao;
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
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        Scanner sc = new Scanner(System.in);

		/*System.out.println("=== TESTS SELLER ===");

		System.out.println("===TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);


		System.out.println("\n===TEST 2: seller findByDepartment ===");
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

		System.out.println("\n===TEST 4: seller insert ===");
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
		System.out.println("Delete completed");*/


        System.out.println("=== TESTS DEPARTMENT ===");

        System.out.println("===TEST 1: department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);


        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }


        System.out.println("\n=== TEST 3: insert =======");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: update =======");
        Department dep2 = departmentDao.findById(5);
        dep2.setName("Developer");
        departmentDao.update(dep2);
        System.out.println("Update completed");


        System.out.println("\n===TEST 5: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");


        sc.close();

    }
}
