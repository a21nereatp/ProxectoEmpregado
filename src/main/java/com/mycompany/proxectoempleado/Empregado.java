/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectoempleado;

/**
 *
 * @author Usuario
 */
public class Empregado {
    
    private int id;

    private String nome;

    private String apelido1;

    private String apelido2;

    private double salario;

    public Empregado(int id, String nome, String apelido1, String apelido2, double salario) {
        this.id = id;
        this.nome = nome;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getApelido2() {
        return apelido2;
    }

    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String amosarNomeCompleto(){
        return "Empregado"+nome+""+apelido1+""+apelido2;
    }
    
    @Override
    public String toString() {
        return "Empregado{" + "id=" + id + ", nome=" + nome + ", apelido1=" + apelido1 + ", apelido2=" + apelido2 + ", salario=" + salario + '}';
    }

    public double obterSalarioAnual(){
    double resultado=salario*12;
    return resultado;
    }
    
}
