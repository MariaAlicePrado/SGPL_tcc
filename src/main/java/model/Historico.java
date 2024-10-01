package model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Historico")
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    // FALTAM DUAS CJAVES ESTRANGEIRAS
    @Column(nullable = false)
    public Date data_inicio;
    @Column(nullable = false)
    public Date data_encerramento;
    @Column(nullable = false)
    public String devolucao;
    @Column(nullable = false)
    public boolean cod_status;

    // GET E SET


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_encerramento() {
        return data_encerramento;
    }

    public void setData_encerramento(Date data_encerramento) {
        this.data_encerramento = data_encerramento;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }
}
