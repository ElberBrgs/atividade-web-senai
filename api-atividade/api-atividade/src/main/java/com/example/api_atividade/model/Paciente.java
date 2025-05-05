package com.example.api_atividade.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Telefone não pode ser vazio")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "CPF não pode ser vazio")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "CEP não pode ser vazio")
    private String cep;

    @Column(nullable = false)
    @Email(message = "Email inválido")
    @NotBlank(message = "Email não pode ser vazio")
    private String email;

    @Column(nullable = false)
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres")
    private String senha;

    public Paciente() {
    }

    public Paciente(Long id, String nome, String telefone, String cpf, String cep, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome não pode ser vazio") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome não pode ser vazio") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Telefone não pode ser vazio") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone não pode ser vazio") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "CPF não pode ser vazio") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF não pode ser vazio") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "CEP não pode ser vazio") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "CEP não pode ser vazio") String cep) {
        this.cep = cep;
    }

    public @Email(message = "Email inválido") @NotBlank(message = "Email não pode ser vazio") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email inválido") @NotBlank(message = "Email não pode ser vazio") String email) {
        this.email = email;
    }

    public @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
