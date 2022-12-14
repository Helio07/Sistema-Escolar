package modelo;

import java.util.List;

public class DAOProfessor {

    public List<Professor> getLista() {
        return Dados.ListaProfessores;
    }

    public boolean salvar(Professor obj) {
        if (obj.getIdProfessor() == null) {
            Integer idProfessor = Dados.ListaProfessores.size() + 1;
            obj.setIdProfessor(idProfessor);
            Dados.ListaProfessores.add(obj);
        }

        return true;
    }

    public boolean remover(Professor obj) {
        Dados.ListaProfessores.remove(obj);
        return true;
    }
}
