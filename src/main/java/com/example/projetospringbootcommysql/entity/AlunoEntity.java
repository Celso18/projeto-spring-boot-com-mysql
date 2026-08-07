package com.example.projetospringbootcommysql.entity; // Ajuste para o pacote correto do seu projeto

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alunos")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Integer idade;
    private String registroAluno;
    private String emailInstitucional;
    private String turma;
    private String periodo;
    private String apresentacao;

    // Construtor Padrão (Obrigatório para o JPA)
    public AlunoEntity() {
    }

    // Construtor Completo (Opcional, útil para testes)
    public AlunoEntity(Long id, String nome, Integer idade, String registroAluno,
                       String emailInstitucional, String turma, String periodo, String apresentacao) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.registroAluno = registroAluno;
        this.emailInstitucional = emailInstitucional;
        this.turma = turma;
        this.periodo = periodo;
        this.apresentacao = apresentacao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRegistroAluno() {
        return registroAluno;
    }

    public void setRegistroAluno(String registroAluno) {
        this.registroAluno = registroAluno;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }
}

