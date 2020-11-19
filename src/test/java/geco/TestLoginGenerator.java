package geco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLoginGenerator {
    LoginService loginService = new LoginService(new String[] {"JROL",
            "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});

    @Test
    public void CT1(){
        LoginGenerator generator = new LoginGenerator(loginService);
        assertEquals("paul durand added",
               generator.generateLoginForNomAndPrenom("Duran","Paul"),"PDUR");
    }
    @Test
    public void CT2(){
        LoginGenerator generator = new LoginGenerator(loginService);
        assertEquals("John Ralling added",
                generator.generateLoginForNomAndPrenom("Ralling","John"),"JRAL1");
    }
    @Test
    public void CT3(){
        LoginGenerator generator = new LoginGenerator(loginService);
        assertEquals("Jean Rolling added",
                generator.generateLoginForNomAndPrenom("Rolling","Jean"),"JROL1");
    }
    @Test
    public void CT4(){
        LoginGenerator generator = new LoginGenerator(loginService);
        assertEquals("Paul dùran added",
                generator.generateLoginForNomAndPrenom("Dùran","Paul"),"PDUR");
    }

}
