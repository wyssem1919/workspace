package org.soa.tp2;
import junit.framework.TestCase;
public class CalculMetierTest extends TestCase {
    private CalculMetier metier;
    protected void setUp() throws Exception
    {
        super.setUp();
        metier = new CalculMetier();
    }
    public void testSomme()
    {
        assertTrue(metier.somme(5, 2) == 7);
    }
    public void testProduit()
    {
        assertTrue(metier.produit(5, 2) == 10);
    }


}
