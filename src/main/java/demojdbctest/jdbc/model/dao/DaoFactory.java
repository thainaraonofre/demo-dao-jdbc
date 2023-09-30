package demojdbctest.jdbc.model.dao;


import demojdbctest.jdbc.db.DB;
import demojdbctest.jdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
