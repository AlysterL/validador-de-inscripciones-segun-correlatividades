package domain;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia() {
        this.correlativas = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Materia setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public Materia setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
        return this;
    }
}
