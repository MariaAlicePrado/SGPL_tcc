package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ocorrencia")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    // FALTAM TRÊS CHAVES ESTRANGEIRAS
    @Column(nullable = false)
    public Date data;
    @Column(nullable = false, length = 1000)
    public String descricao;
    @Column(nullable = false, length = 10)
    public String andar;
    @Column(nullable = false, length = 10)
    public String periodo;
    @Column(nullable = false, length = 20)
    public String classificacao;
    @Column(nullable = false)
    public boolean cod_status;

    // GET E SET

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }
}
