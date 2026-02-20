package org.java.core.lesson6;

import org.java.core.lesson6.practiceDB.config.Config;
import org.java.core.lesson6.practiceDB.config.TxManager;
import org.java.core.lesson6.practiceDB.repository.UserRepository;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        var config = new Config(
                "jdbc:postgresql://localhost:5432/demo",
                "demo",
                "demo"
        );

//        try (var con = DbManager
//                .getConnection(config)) {
//
//            var rs = con
//                    .prepareStatement("select id, status from orders order by id limit 10")
//                    .executeQuery();
//
//            while (rs.next()) {
//                long id = rs.getLong("id");
//                String status = rs.getString("status");
//
//                System.out.println(id + " " + status);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }

//        DbManager
//                .getConnection(config)
//                .prepareStatement("select * from orders where id = ?")
//                .setInt(1, 1);

        TxManager txManager = new TxManager(config);
        UserRepository repo = new UserRepository(config, txManager);
//        repo.init();
//        repo.addUser("petya", 13);
        System.out.println(repo.getUserById(3));


    }
}
