package modelo;

import java.util.List;

public class DAOCurso {

    public List<Curso> getLista() {
        return Dados.ListaCursos;
    }

    public boolean salvar(Curso obj) {
        if (obj.getIdCurso() == null) {
            Integer idCurso = Dados.ListaCursos.size() + 1;
            obj.setIdCurso(idCurso);
            Dados.ListaCursos.add(obj);
        }

        return true;
    }

    public boolean remover(Curso obj) {
        Dados.ListaCursos.remove(obj);
        return true;
    }
}
