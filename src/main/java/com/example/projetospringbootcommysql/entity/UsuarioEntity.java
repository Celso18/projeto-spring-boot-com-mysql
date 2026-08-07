package com.example.projetospringbootcommysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Essa anotação diz pro Spring Boot, que essa clase
// vai representar uma tabela no seu banco de dados.
@Entity
public class UsuarioEntity {
    // Colunas que serão criadas dentro da minha tabela
    @Id // chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // cria um valor automáticamente no ID
    private int id;

    private String nome;
    private String email;

    // Getters e Setters de todos os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

