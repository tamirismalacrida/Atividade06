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
class Funcionario {
    
    String nome;
    String email;
    double salarioBase;
    String cargo;
    
    Funcionario(String pNome, String pEmail, double pSalarioBase, String pCargo) 
    {
        nome = pNome;
        email= pEmail;
        salarioBase = pSalarioBase;
        cargo = pCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
