/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
   public void testMoveDown() 
{


    System.out.println("movedown");
    int i = 0;
    TodoList instance = new TodoList();
    String name = "vothaiho";
    instance.add(name);
    name = "ravi";
    instance.add(name);
    instance.moveDown(0);
    String expResult = "vothaiho";
    String result =  instance.elementAt(1);
    assertEquals(expResult, result);
   System.out.println("entry is moved down");
}
    
           

}
