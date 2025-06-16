package org.example.model;

import java.sql.Date;
import java.util.List;

public class Aluguel {
    private int id;
    private int clienteId;
    private Date data;
    private List<Filme> filmes;

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getClienteId() { return clienteId; }
    public void setClienteId(int clienteId) { this.clienteId = clienteId; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public List<Filme> getFilmes() { return filmes; }
    public void setFilmes(List<Filme> filmes) { this.filmes = filmes; }

    @Override
    public String toString() {
        return "Aluguel ID: " + id + ", Cliente: " + clienteId + ", Data: " + data;
    }
}
