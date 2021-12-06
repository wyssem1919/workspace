package iset.sem31.tp3;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class Analyseur4Test {


    @BeforeClass
    public static void beforeClass() throws Exception {
         Analyseur3 a=new Analyseur3 ();
    }


    @AfterClass
    public static void afterClass() throws Exception {
     Analyseur3  a=null;
    }
}