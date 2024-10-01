package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Professor")
public class Professor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long rm;

    @Column(nullable = false)
    public Long senha;
    @Column(nullable = false, length = 40)
    public String nome;
    @Column(nullable = false)
    public boolean cod_status;

    // GET E SET

    public Long getRm() {
        return rm;
    }

    public void setRm(Long rm) {
        this.rm = rm;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }
}
