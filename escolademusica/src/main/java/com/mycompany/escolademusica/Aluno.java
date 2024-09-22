/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Carlos
 */
public class Aluno extends Pessoa{
    private String numMatricula;
    
    public Aluno(String nome, int idade, String numMatricula){
    super(nome, idade);
    this.numMatricula = numMatricula;
    }

    @Override
    public String atividade() {
        return "Frequentar aulas e praticar instrumentos.";
    }

    @Override
    public String getId() {
        return numMatricula;
    }
    
}
