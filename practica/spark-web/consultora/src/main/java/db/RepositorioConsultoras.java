package db;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import model.Consultora;
import model.Proyecto;

public class RepositorioConsultoras implements WithGlobalEntityManager {

    public static RepositorioConsultoras instancia = new RepositorioConsultoras();

    public void agregar(Consultora consultora) {
        entityManager().persist(consultora);
    }

    public List<Consultora> listar() {
        return entityManager().createQuery("from Consultora", Consultora.class).getResultList();
    }

    public List<Consultora> filtrarPorCostoDeProyecto(BigDecimal costoEstimado) {
        // return entityManager().createQuery("from Consultora", Consultora.class).getResultList();
        return listar()
            .stream()
            .filter(c -> c.getProyectos().stream().map(Proyecto::getCostoEstimado).anyMatch(costo -> costo.equals(costoEstimado)) )
            .collect(Collectors.toList());
    }

    public Consultora buscar(long id) {
        return entityManager().find(Consultora.class, id);
    }
}
