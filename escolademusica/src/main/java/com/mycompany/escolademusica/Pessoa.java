/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolademusica;

/**
 *
 * @author Carlos
 */
public abstract class Pessoa implements Identificavel{
    protected String nome;
    protected int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public abstract String atividade();
}
