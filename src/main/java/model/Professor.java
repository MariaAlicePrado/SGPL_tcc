package model;

public class Professor{

    public Long rm;
    public Long senha;
    public String nome;
    public boolean cod_status;

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
