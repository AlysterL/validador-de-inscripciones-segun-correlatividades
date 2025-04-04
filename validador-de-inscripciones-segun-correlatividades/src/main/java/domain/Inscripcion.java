package domain;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;

    public Inscripcion() {
        this.materias = new HashSet<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Inscripcion setAlumno(Alumno alumno) {
        this.alumno = alumno;
        return this;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public Inscripcion setMaterias(Set<Materia> materias) {
        this.materias = materias;
        return this;
    }

    public boolean aprobada() {
        Set<Materia> materiasAprobadas = this.alumno.getMateriasAprobadas();
        return this.materias.stream().allMatch(materia ->
                materiasAprobadas.containsAll(materia.getCorrelativas())
        );
    }
}
