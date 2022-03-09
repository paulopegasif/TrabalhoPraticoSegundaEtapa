package br.edu.ifsul.modelo;

import javax.swing.*;
import java.io.Serializable;

public class Proprietario implements Serializable {
    private Integer codigo;
    private String nome;
    private String cpf;


    public Proprietario(){

    }


    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public Integer getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }


}
