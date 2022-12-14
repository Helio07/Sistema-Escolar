package modelo;

import java.util.List;

public class DAODisciplina {

    public List<Disciplina> getLista() {
        return Dados.ListaDisciplinas;
    }

    public boolean salvar(Disciplina obj) {
        if (obj.getIdDisciplina() == null) {
            Integer idDisciplina = Dados.ListaDisciplinas.size() + 1;
            obj.setIdDisciplina(idDisciplina);
            Dados.ListaDisciplinas.add(obj);
        }

        return true;
    }

    public boolean remover(Disciplina obj) {
        Dados.ListaDisciplinas.remove(obj);
        return true;
    }
}