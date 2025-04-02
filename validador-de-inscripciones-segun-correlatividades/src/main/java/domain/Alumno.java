package domain;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String legajo;
    private Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getLegajo() {
        return legajo;
    }

    public Alumno setLegajo(String legajo) {
        this.legajo = legajo;
        return this;
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Alumno setMateriasAprobadas(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
        return this;
    }
}
