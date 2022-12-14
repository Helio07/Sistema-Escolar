package modelo;

import java.util.List;

public class DAOAluno {

    public List<Aluno> getLista() {
        return Dados.ListaAlunos;
    }

    public boolean salvar(Aluno obj) {
        if (obj.getMatricula() == null) {
            Integer matricula = Dados.ListaAlunos.size() + 1;
            obj.setMatricula(matricula);
            Dados.ListaAlunos.add(obj);
        }

        return true;
    }

    public boolean remover(Aluno obj) {
        Dados.ListaAlunos.remove(obj);
        return true;
    }
}
