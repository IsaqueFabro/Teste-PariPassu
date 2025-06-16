package org.example.model;

public class Filme {
    private int id;
    private String titulo;
    private int ano;
    private double preco;

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return id + ": " + titulo + " (" + ano + ") R$" + preco;
    }
}