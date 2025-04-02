package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ValidadorCorrelatividadesTestCase extends BaseTest {

    @Test
    public void inscripcionAprobada() {
        Set<Materia> materiasAInscribir = new HashSet<>();
        materiasAInscribir.add(dds);
        materiasAInscribir.add(am2);

        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(ayed);
        materiasAprobadas.add(pdep);
        materiasAprobadas.add(am1);
        Alumno alumno = new Alumno()
                .setNombre("Jon Snow")
                .setLegajo("1143")
                .setMateriasAprobadas(materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion()
                .setAlumno(alumno)
                .setMaterias(materiasAInscribir);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionDesaprobada() {
        Set<Materia> materiasAInscribir = new HashSet<>();
        materiasAInscribir.add(dds);
        materiasAInscribir.add(am2);

        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(ayed);
        Alumno alumno = new Alumno()
                .setNombre("Khal Drogo")
                .setLegajo("1189")
                .setMateriasAprobadas(materiasAprobadas);
        Inscripcion inscripcion = new Inscripcion()
                .setAlumno(alumno)
                .setMaterias(materiasAInscribir);

        Assertions.assertFalse(inscripcion.aprobada());
    }
}
