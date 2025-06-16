package org.example.dao;

import org.example.model.Aluguel;
import java.sql.Connection;
import java.util.Collection;

public interface AluguelDAO {
    void insert(Connection conn, Aluguel aluguel) throws Exception;
    Integer getNextId(Connection conn) throws Exception;
    void update(Connection conn, Aluguel aluguel) throws Exception;
    void delete(Connection conn, Aluguel aluguel) throws Exception;
    Aluguel find(Connection conn, Integer idAluguel) throws Exception;
    Collection<Aluguel> list(Connection conn) throws Exception;
}
