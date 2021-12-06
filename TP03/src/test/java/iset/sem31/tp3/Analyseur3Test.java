package iset.sem31.tp3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Analyseur3Test {
    Analyseur3 a3= null;
    @Test
    public void analyserSucces() {
        System.out.println("****** méthode test (estSucces)...");
        a3.setMessage("Succès du deuxième test...");
        Assert.assertEquals("Attention: le message contient le mot 'Succès'", "SUCCES", a3.analyserSucces());

    }

    @Test
    public void estValide() {
        System.out.println("****** méthode test (estValide)...");
        a3=new Analyseur3();
        a3.setMessage("aaaaaaaaaa");
        Assert.assertTrue("Attention: le message est pas valide...",a3.estValide());
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Avant chaque exécution d'une méthode test...");
        a3=new Analyseur3();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Après chaque exécution d'une méthode test...");
        a3=null;
    }
}