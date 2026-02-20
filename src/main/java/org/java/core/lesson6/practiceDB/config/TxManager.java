package org.java.core.lesson6.practiceDB.config;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.function.Consumer;

@AllArgsConstructor
public class TxManager {
    private Config config;

    public void inTx(
            Consumer<Connection> func
    ) {
        try (var con = DbManager.getConnection(config)) {
            boolean oldCommit = con.getAutoCommit();
            con.setAutoCommit(false);

            try {
                func.accept(con);
                con.commit();
            } catch (Exception ex) {
                try {
                    con.rollback();
                } catch (SQLException e) {
                    e.addSuppressed(ex);
                }
            } finally {
                con.setAutoCommit(oldCommit);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
