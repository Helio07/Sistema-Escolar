package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Professor implements Serializable {

    private Integer idProfessor;
    private String nome;
    private Disciplina diciplina;

    public Professor() {
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Disciplina diciplina) {
        this.diciplina = diciplina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.getIdProfessor());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professor other = (Professor) obj;
        if (!Objects.equals(this.idProfessor, other.idProfessor)) {
            return false;
        }
        return true;
    }
}

