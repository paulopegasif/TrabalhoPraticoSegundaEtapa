package br.edu.ifsul.modelo;

import javax.swing.*;
import java.io.Serializable;

public class Terreno implements Serializable {
    private Integer codigo;
    private Double largura;
    private Double comprimento;
    private Double metrosQuadrados;

    Proprietario proprietario = new Proprietario(); //relacao


    //METODO CONSTRUTOR ====================
    public Terreno(){
    }




    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public Integer getCodigo(){
        return this.codigo;
    }

    public void setMetrosQuadrados(Double largura, Double comprimento){

        Double metrosQuadrados = largura * comprimento; //Calculando os metros quadrados
        this.metrosQuadrados = metrosQuadrados;
    }
    public Double getMetrosQuadrados(){
        return this.metrosQuadrados;
    }

    public void setLargura(Double largura){
        this.largura = largura;
    }
    public Double getLargura(){
        return this.largura;
    }

    public void setComprimento(Double comprimento){
        this.comprimento = comprimento;
    }
    public Double getComprimento(){
        return this.comprimento;
    }


}

