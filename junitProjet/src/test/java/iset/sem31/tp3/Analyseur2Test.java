package iset.sem31.tp3;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;




public class Analyseur2Test {

    @Test
    public void estSucces() {
        Analyseur2 a =new Analyseur2();
        String r= a.analyserSucces("succès du deuxième test...");
        // Assert.assertEquals("Attention: le message contient le mot 'Succès'", "SUCCES", r);
        Assert.assertThat("Attention: le message contient le mot 'Succès'", r, CoreMatchers.is("SUCCES"));

    }

    @Test
    public void estValide() {
        Analyseur2 a =new Analyseur2();
        boolean r = a.estValide("aaaaaaaaa");
        // Assert.assertEquals("Attention: le message est valide...",true,r);
        Assert.assertTrue("Attention: le message est valide...",r);

    }
}