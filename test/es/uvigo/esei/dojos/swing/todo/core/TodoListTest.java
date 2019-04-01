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
   public void testEditAt() 
        
{
    System.out.println("EditAt");
    TodoList instance = new TodoList();
    int i = 0;
    String Name = "Ravi";
    instance.add(Name);
    Name = "Voohitha";
    instance.add(Name);
    Name = "sai";
    instance.add(Name);
    String result = instance.elementAt(1);
    String newValue = "suresh";
    instance.editAt(1, newValue);
    result = instance.elementAt(1);
    System.out.println("Editing at entry ");
    assertEquals(newValue, result);
    System.out.println("entry is edited");
    
    

}

           

}
