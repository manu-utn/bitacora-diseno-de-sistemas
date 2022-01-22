package app;

import org.uqbarproject.jpa.java8.extras.EntityManagerOps;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;

import model.Alumno;
import model.Cursada;
import model.Hobbie;
import model.Materia;
import model.MateriaElectiva;
import model.MateriaObligatoria;

public class Migration implements WithGlobalEntityManager, EntityManagerOps, TransactionalOps {

    public static void main(String[] args) {
        new Migration().init();
    }

    public void init() {
        withTransaction(() -> {
            Materia gdd = new MateriaObligatoria("gdd", false);
            Materia tadp = new MateriaElectiva("tadp");

            Cursada gdd_1C_2020 = new Cursada(gdd);
            persist(gdd_1C_2020);

            Cursada gdd_2C_2020 = new Cursada(gdd);
            persist(gdd_2C_2020);

            Cursada tadp_1C_2020 = new Cursada(tadp);
            persist(tadp_1C_2020);

            Cursada tadp_2C_2020 = new Cursada(tadp);
            persist(tadp_2C_2020);

            Alumno alumno2 = new Alumno("samuel");

            Alumno alumno1 = new Alumno("pedrito");
            alumno2.agregarCompaniero(alumno2);

            alumno1.agregarHobbie(new Hobbie("bailar"));
            alumno1.agregarHobbie(new Hobbie("correr"));

            alumno1.agregarCursada(gdd_1C_2020);
            alumno1.agregarCursada(tadp_1C_2020);
            alumno1.setCursadaFavorita(tadp_2C_2020);

            alumno1.agregarCursada(gdd_2C_2020);
            alumno1.agregarCursada(tadp_2C_2020);

            persist(alumno1);

            // alumno 2
            alumno2.setCursadaFavorita(tadp_2C_2020);
            alumno2.agregarHobbie(new Hobbie("bailar"));
            alumno2.agregarHobbie(new Hobbie("correr"));

            alumno2.agregarCursada(gdd_1C_2020);
            alumno2.agregarCursada(tadp_1C_2020);

            alumno2.agregarCompaniero(alumno1);

            alumno2.agregarCursada(gdd_2C_2020);
            alumno2.agregarCursada(tadp_2C_2020);
            persist(alumno2);

            Alumno alumno3 = new Alumno("fede");
            alumno3.agregarHobbie(new Hobbie("bailar"));
            alumno3.agregarHobbie(new Hobbie("correr"));

            alumno3.setCursadaFavorita(tadp_2C_2020);

            alumno2.agregarCompaniero(alumno1);

            alumno3.agregarCursada(gdd_2C_2020);
            alumno3.agregarCursada(tadp_2C_2020);
            persist(alumno3);

            // Proyecto proyecto = new Proyecto("Proyecto 1", new BigDecimal(1000));
            // persist(proyecto);

            // Consultora consultora = new Consultora("Nombre consultora", 10);
            // consultora.asignar(proyecto);
            // persist(consultora);

            // Proyecto proyecto2 = new Proyecto("Proyecto 2", new BigDecimal(2000));
            // persist(proyecto2);

            // Proyecto proyecto3 = new Proyecto("Proyecto 3", new BigDecimal(3000));
            // persist(proyecto3);
        });
    }
}
