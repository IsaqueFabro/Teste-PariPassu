package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println("Conectado com sucesso!");
            //  DAOImpls
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
