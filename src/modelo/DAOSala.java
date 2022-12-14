package modelo;

import java.util.List;

public class DAOSala {

    public List<Sala> getLista() {
        return Dados.ListaSalas;
    }

    public boolean salvar(Sala obj) {
        if (obj.getNumeroSala() == null) {
            Integer numeroSala = Dados.ListaSalas.size() + 1;
            obj.setNumeroSala(numeroSala);
            Dados.ListaSalas.add(obj);
        }

        return true;
    }

    public boolean remover(Sala obj) {
        Dados.ListaSalas.remove(obj);
        return true;
    }
}