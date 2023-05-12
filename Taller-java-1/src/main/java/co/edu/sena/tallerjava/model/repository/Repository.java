package co.edu.sena.tallerjava.model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository<User> {
    List<User> listAllObj() throws SQLException ;

    User byIdobj(Integer id) throws  SQLException;

    int saveObj(User t) throws SQLException;

    void deleteObj(Integer id) throws  SQLException;

    User createObj(ResultSet rs) throws SQLException;

}
