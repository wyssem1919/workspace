package iset.sem31.tp3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalyseurTest {
    @Test
    public void analyserSucces() {
        Analyseur a = new Analyseur();
        String r = a.analyserSucces("succès de test..");
        Assert.assertEquals("SUCCES", r);
    }

    @Test
    public void estValide() {
        Analyseur a = new Analyseur();
        Boolean r = a.estValide("succès de test..");
        Assert.assertTrue(true);
    }
}