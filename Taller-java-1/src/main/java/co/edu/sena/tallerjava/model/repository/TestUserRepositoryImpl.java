package co.edu.sena.tallerjava.model.repository;

import co.edu.sena.tallerjava.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========== saveObj Insert =========="); // Insert
        User userInsert = new User();
        userInsert.setUser_firstname ("Luna");
        userInsert.setUser_lastname("FOFO");
        userInsert.setUser_email("lunaFofO@gLoQueSea.com");
        userInsert.setUser_password("asdfg12345");
        repository.saveObj(userInsert);
        userInsert.setUser_firstname("PepE");
        userInsert.setUser_lastname("PepO");
        userInsert.setUser_email("PepE@gLoQueSea.com");
        userInsert.setUser_password("asdfg12355");
        repository.saveObj(userInsert);

        System.out.println("========== ListAllObj  ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj  ==========");
        System.out.println(repository.byIdobj(1));
        System.out.println();

        System.out.println("========== saveObj  ==========");

        User userUpdate = new User();

        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("jorge");
        userUpdate.setUser_lastname("Palacios");
        userUpdate.setUser_email("jorge@example.com");
        userUpdate.setUser_password("12345asdfg");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();


        System.out.println("========== deleteObj  ==========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
} //TestUserRepositoruImpl
