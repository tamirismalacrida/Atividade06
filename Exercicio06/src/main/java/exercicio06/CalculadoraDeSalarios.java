/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio06;

/**
 *
 * @author Tamiris
 */
class CalculadoraDeSalarios {
    
    public double calculaSalario(Funcionario func)
    {
        double salarioCalc = 0;
        
        if(func.getCargo() == "DESENVOLVEDOR")
        {
            if(func.getSalarioBase() >= 3000.00)               
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.2);  
            else
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.1); 
        }
        if(func.getCargo() == "DBA")
        {
            if(func.getSalarioBase() >= 2000.00)               
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.25);  
            else
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.15); 
        }
        if(func.getCargo() == "TESTADOR")
        {
             if(func.getSalarioBase() >= 2000.00)               
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.25);  
            else
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.15); 
        }
        if(func.getCargo() == "GERENTE")
        {
            if(func.getSalarioBase() >= 5000.00)               
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.3);  
            else
                salarioCalc = func.getSalarioBase() - (func.getSalarioBase() * 0.2); 
        }
                
        return salarioCalc;
    }
}
