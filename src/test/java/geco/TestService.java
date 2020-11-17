package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestService {
    String[] login = new String[3];

    @Before
    public void init(){

        login[0] = "123";
        login[1] = "abc";
        login[2] = "soleil";
    }


    @Test
    public void testLoginService(){
        LoginService loginService = new LoginService(login);
        assertEquals("initialisation login",loginService.loginsExistants.get(0), login[0]);
    }
    @Test
    public void testLoginExists(){
        LoginService loginService = new LoginService(login);
        assertTrue("soleil is in login",loginService.loginExists("soleil"));
    }
    @Test
    public void testAddLogin(){
        LoginService loginService = new LoginService(login);
        loginService.addLogin("last");
        assertEquals("add element", loginService.loginsExistants.get(3),"last");
    }
    @Test
    public void testFindAllLoginsStartingWith(){
        LoginService loginService = new LoginService(login);
        assertEquals("prefix sol", loginService.findAllLoginsStartingWith("sol").get(0),"soleil");
    }


    @Test
    public void testFindAllLogins(){
        LoginService loginService = new LoginService(login);
        assertEquals("prefix sol", loginService.findAllLogins(),loginService.loginsExistants);
    }



}
