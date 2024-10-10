package sgpl.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ambiente")
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(nullable = false, length = 15)
    public String nome;
    @Column(nullable = false)
    public int localAmbiente;
    @Column(nullable = false)
    public String statusLaboratorio;

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

    public int getLocalAmbiente() {
        return localAmbiente;
    }

    public void setLocalAmbiente(int localAmbiente) {
        this.localAmbiente = localAmbiente;
    }

    public String getStatusLaboratorio() {
        return statusLaboratorio;
    }

    public void setStatusLaboratorio(String statusLaboratorio) {
        this.statusLaboratorio = statusLaboratorio;
    }
}