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
   public void testRemoveAt() 
{
    System.out.println("removeAt");
    int i = 0;
    TodoList instance = new TodoList();
    String name = "voohitha";
    instance.add(name);
    int size1 = instance.size();
    instance.removeAt(0);
    int size2 = instance.size();
    assertTrue(size2<size1);
    System.out.println("entry is removed");
}

           

}
