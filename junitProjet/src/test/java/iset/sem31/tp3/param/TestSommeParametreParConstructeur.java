package iset.sem31.tp3.param;

import iset.sem3.tp3.param.MathUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
@RunWith(value = Parameterized.class)


public class TestSommeParametreParConstructeur {
    private int numeroA;
    private int numeroB;
    private int resultatAttendu;
    //Injection par constructeur
    //Pa exemple {8, 2, 10}, numeroA = 8, numeroB = 2, resultatAttendu = 10
    public TestSommeParametreParConstructeur(int numeroA, int numeroB, int
            resultatAttendu) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.resultatAttendu = resultatAttendu;
    }
    @Parameters(name = "{index}: testSomme({0}+{1}) = {2}")

    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }
    @Test
    public void testSommeDeuxNombres() {
        assertThat(MathUtils.somme(numeroA, numeroB), is(resultatAttendu));
    }


}