package iset.sem31.tp3.param;
import iset.sem3.tp3.param.MathUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import java.util.Arrays;
import java.util.Collection;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
@RunWith(value = Parameterized.class)
public class TestSommeParametreParInjectionDeChamps {
    //valeur par défaut = 0
    @Parameter(value = 0)
    public int numeroA;
    @Parameter(value = 1)
    public int numeroB;
    @Parameter(value = 2)
    public int resultatAttendu;
    @Parameters(name = "{index}: testSommeParInjectionDeChamps({0}+{1}) = {2}")
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
            assertThat(MathUtils.somme(numeroA, numeroB),
            is(resultatAttendu));
}
}
