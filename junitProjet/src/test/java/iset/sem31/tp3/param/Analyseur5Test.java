package iset.sem31.tp3.param;
import iset.sem31.tp3.Analyseur3;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class Analyseur5Test {

    Analyseur3 a3= null;

    //default value = 0
    @Parameter (value=0)
    public String message;

    // Collection des valeurs de test
    @Parameters(name = "{index}: testDomain - {0}")
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]{
                { "Succès"},
                {"succès de test paramétré"},
                {"succès...."}
        });
    }

    @Test
    public void estSucces()
    {
        System.out.println("****** méthode test (estSucces)...");
        a3=new Analyseur3() ;
        a3.setMessage(message);
        Assert.assertEquals("Attention: le message ne contient pas le mot 'Succès'", "SUCCES", a3.analyserSucces());
    }
}