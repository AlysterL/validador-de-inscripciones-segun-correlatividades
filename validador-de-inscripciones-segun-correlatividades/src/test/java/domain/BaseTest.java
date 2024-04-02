package domain;

import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.Set;

public abstract class BaseTest {
    protected Materia ayed;
    protected Materia pdep;
    protected Materia dds;
    protected Materia am1;
    protected Materia am2;

    @BeforeEach
    public void inicializarTests() {
        Set<Materia> correlativasAyED = new HashSet<>();
        this.ayed = new Materia()
                .setNombre("AyED")
                .setCorrelativas(correlativasAyED);

        Set<Materia> correlativasPdeP = new HashSet<>();
        correlativasPdeP.add(ayed);
        this.pdep = new Materia()
                .setNombre("PdeP")
                .setCorrelativas(correlativasPdeP);

        Set<Materia> correlativasDDS = new HashSet<>();
        correlativasDDS.add(ayed);
        correlativasDDS.add(pdep);
        this.dds = new Materia()
                .setNombre("DDS")
                .setCorrelativas(correlativasDDS);

        Set<Materia> correlativasAM1 = new HashSet<>();
        this.am1 = new Materia()
                .setNombre("AM1")
                .setCorrelativas(correlativasAM1);

        Set<Materia> correlativasAM2 = new HashSet<>();
        correlativasAM2.add(am1);
        this.am2 = new Materia()
                .setNombre("AM2")
                .setCorrelativas(correlativasAM2);
    }
}
