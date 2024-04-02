package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ValidadorCorrelatividadesTestCase extends BaseTest {
    @Test
    public void materiaCumpleCorrelativas() {
        Set<Materia> materiasAprobadas0 = new HashSet<>();
        materiasAprobadas0.add(am1);
        Alumno alumno0 = new Alumno()
                .setNombre("Jon Snow")
                .setLegajo("1143")
                .setMateriasAprobadas(materiasAprobadas0);

        Set<Materia> materiasAprobadas1 = new HashSet<>();
        materiasAprobadas1.add(ayed);
        Alumno alumno1 = new Alumno()
                .setNombre("Khal Drogo")
                .setLegajo("1189")
                .setMateriasAprobadas(materiasAprobadas1);

        Assertions.assertTrue(alumno0.cumpleCorrelativas(am2));
        Assertions.assertFalse(alumno1.cumpleCorrelativas(dds));
    }

    @Test
    public void inscripcionAprobada() {
        Set<Materia> materiasAInscribir0 = new HashSet<>();
        materiasAInscribir0.add(dds);

        Set<Materia> materiasAInscribir1 = new HashSet<>();
        materiasAInscribir1.add(dds);
        materiasAInscribir1.add(am2);

        Set<Materia> materiasAprobadas0 = new HashSet<>();
        materiasAprobadas0.add(ayed);
        materiasAprobadas0.add(pdep);
        Alumno alumno0 = new Alumno()
                .setNombre("Jon Snow")
                .setLegajo("1143")
                .setMateriasAprobadas(materiasAprobadas0);
        Inscripcion inscripcion0 = new Inscripcion()
                .setAlumno(alumno0)
                .setMaterias(materiasAInscribir0);

        Set<Materia> materiasAprobadas1 = new HashSet<>();
        materiasAprobadas1.add(ayed);
        Alumno alumno1 = new Alumno()
                .setNombre("Khal Drogo")
                .setLegajo("1189")
                .setMateriasAprobadas(materiasAprobadas1);
        Inscripcion inscripcion1 = new Inscripcion()
                .setAlumno(alumno1)
                .setMaterias(materiasAInscribir0);

        Set<Materia> materiasAprobadas2 = new HashSet<>();
        materiasAprobadas2.add(ayed);
        materiasAprobadas2.add(am1);
        Alumno alumno2 = new Alumno()
                .setNombre("Arya Stark")
                .setLegajo("1254")
                .setMateriasAprobadas(materiasAprobadas2);
        Inscripcion inscripcion2 = new Inscripcion()
                .setAlumno(alumno2)
                .setMaterias(materiasAInscribir1);

        Set<Materia> materiasAprobadas3 = new HashSet<>();
        materiasAprobadas3.add(ayed);
        materiasAprobadas3.add(pdep);
        materiasAprobadas3.add(am1);
        Alumno alumno3 = new Alumno()
                .setNombre("Tyrion Lannister")
                .setLegajo("1233")
                .setMateriasAprobadas(materiasAprobadas3);
        Inscripcion inscripcion3 = new Inscripcion()
                .setAlumno(alumno3)
                .setMaterias(materiasAInscribir1);

        Assertions.assertTrue(inscripcion0.aprobada());
        Assertions.assertFalse(inscripcion1.aprobada());
        Assertions.assertFalse(inscripcion2.aprobada());
        Assertions.assertTrue(inscripcion3.aprobada());
    }
}
