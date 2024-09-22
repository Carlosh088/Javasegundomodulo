/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Carlos
 */
public class Funcionario extends Pessoa{
    
    private String numCracha;
    
    public Funcionario(String nome, int idade, String numCracha) {
        super(nome, idade);
        this.numCracha = numCracha;
    }

    @Override
    public String atividade() {
        return "Realizar tarefas administrativas";    
    }

    @Override
    public String getId() {
        return numCracha;   
    }
    
}
