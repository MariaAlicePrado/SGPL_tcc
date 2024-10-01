package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Maquina")
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    // FALTA UMA CHAVE ESTRANGEIRA
    @Column(nullable = false)
    public Long patrimonio;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false)
    public boolean cod_status;

    // GET E SET

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Long patrimonio) {
        this.patrimonio = patrimonio;
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
