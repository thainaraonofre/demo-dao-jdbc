package demojdbctest.jdbc.model.dao;


import demojdbctest.jdbc.model.entities.Department;
import demojdbctest.jdbc.model.entities.Seller;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
