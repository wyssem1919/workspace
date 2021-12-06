package iset.sem31.tp3;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Analyseur2Test {

    @Test
    public void analyserSucces() {
        Analyseur2 a =new Analyseur2();
        String msg="Succès du deuxième test...";
        String b=msg.toLowerCase();
        String r=a.analyserSucces(b);
        //Assert.assertEquals("Attention: le message contient le mot 'Succès'", "SUCCES", r);
        Assert.assertThat("Attention: le message contient le mot 'Succès'", r, CoreMatchers.is("SUCCES"));

    }

    @Test
    public void estValide() {
        Analyseur2 a =new Analyseur2();
        boolean r = a.estValide("aaaaaaaaaa");
        //Assert.assertEquals("Attention: le message est valide...",true,r);
        Assert.assertTrue("Attention: le message est valide...",r);
    }
}