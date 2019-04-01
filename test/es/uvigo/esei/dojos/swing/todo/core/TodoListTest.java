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
   public void testMoveUp() 
{
    System.out.println("moveup");
    int i = 0;
    TodoList instance = new TodoList();
    String name = "vothaiho";
    instance.add(name);
    name = "ravi";
    instance.add(name);
    instance.moveUp(1);
    String expResult = "ravi";
    String result =  instance.elementAt(0);
    assertEquals(expResult, result);
   System.out.println("entry is moved up");
}

    
           
        
    
    

@Test
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



@Test
public void testAdd()
{
    System.out.println("Add");
    TodoList instance = new TodoList();
     String name = "vothaiho";
    instance.add(name);
    int i = instance.size();
    assertTrue(i > 0);
    System.out.println("entry is added");
}

@Test
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

@Test
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

@Test
public void testSize() 
{
    System.out.println("size");
    TodoList instance = new TodoList();
    String name = "voohitha";
    instance.add(name);
    name = "ravi";
    instance.add(name);
    int expResult = 2;
    int result = instance.size();
    assertEquals(expResult, result);
    System.out.println("list size is"+result);
}
    
}
