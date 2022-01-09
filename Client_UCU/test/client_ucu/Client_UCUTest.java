/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_ucu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class Client_UCUTest {
    
    Client client= new Client();
    
    public Client_UCUTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        client.startConnection("127.0.0.1", 6666);
    }
    
    @After
    public void tearDown() {
        client.stopConnection();
    }

    /**
     * Test of main method, of class Client_UCU.
     */
    @Test
    public void testMain() {
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");
    
        assertEquals("Recibido hello", resp1);
        assertEquals("Recibido world", resp2);
        assertEquals("Recibido !", resp3);
        assertEquals("good bye", resp4);
    }
    
}
