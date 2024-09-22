/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.escolademusica;
import java.util.ArrayList;
/**
 *
 * @author Carlos
 */
public class Escolademusica {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Aluno("João", 15, "1243"));
        pessoas.add(new Professor("Pedro", 30, "553678"));
        pessoas.add(new Funcionario("José",  40, "34452"));
        
        for(Pessoa pessoa : pessoas){
        System.out.println(pessoa.atividade());
        System.out.println("Identificador: " + pessoa.getId());
        }
    }
}
