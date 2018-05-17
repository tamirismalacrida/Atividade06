package exercicio06;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamiris
 */
public class CalculadoraDeSalariosTest {
        
    public CalculadoraDeSalariosTest() {
    }
    
    /*
    Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20%
    caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso.
    
    Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja
    maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
    
    Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o
    salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
    
    Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o 
    salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.
    */
    
   @Test
    public void testDesenvolvedor() {
        CalculadoraDeSalarios calcSalario = new CalculadoraDeSalarios();  
        Funcionario func = new Funcionario("Tamiris", "tamirismalacrida@gmail.com", 2000.00, "DESENVOLVEDOR");        
        assertEquals(1800.00, calcSalario.calculaSalario(func), 1);
    }
    
    @Test
    public void testDBA() {
        CalculadoraDeSalarios calcSalario = new CalculadoraDeSalarios();  
        Funcionario func = new Funcionario("Tamiris", "tamirismalacrida@gmail.com", 3000.00, "DBA");        
        assertEquals(2250.00, calcSalario.calculaSalario(func), 1);
    }
    
 
    @Test
    public void testTestador() {
        CalculadoraDeSalarios calcSalario = new CalculadoraDeSalarios();  
        Funcionario func = new Funcionario("Tamiris", "tamirismalacrida@gmail.com", 1500.00, "TESTADOR");                    
        assertEquals(1275.00, calcSalario.calculaSalario(func), 1);
    }
    
    @Test
    public void testGerente() {
        CalculadoraDeSalarios calcSalario = new CalculadoraDeSalarios();  
        Funcionario func = new Funcionario("Tamiris", "tamirismalacrida@gmail.com", 10500.00, "GERENTE");
        assertEquals(7350.00, calcSalario.calculaSalario(func), 1);
    }
        
}
