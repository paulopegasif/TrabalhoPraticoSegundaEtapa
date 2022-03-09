package br.edu.ifsul.modelo;

import javax.swing.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Obra  implements Serializable {
    private Integer codigo;
    private String nome;
    private String descricao;
    private Calendar dataEntrega = Calendar.getInstance();
    private String dataEntrada;
    private Double orcamento;
    private Double custoTotal;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    Empreiteira empreiteira; //relacao

    List<Terreno> listaTerrenos = new ArrayList<>(); //Lista de terrenos
    Terreno terreno1 = new Terreno();
    Terreno terreno2 = new Terreno();
    Terreno terreno3 = new Terreno();

    List<Proprietario> listaProprietarios = new ArrayList<>(); //Lista de proprietários
    Proprietario proprietario1 = new Proprietario();
    Proprietario proprietario2 = new Proprietario();
    Proprietario proprietario3 = new Proprietario();




    //METODO CONSTUTOR =====================
    public Obra(){

    }


    //GETTERS E SETTERS

    public void setEmpreiteira(Empreiteira empreiteira){
        this.empreiteira = empreiteira;
    }
    public Empreiteira getEmpreiteira(){
        return this.empreiteira;
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

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setDataEntrega(String dataEntrada){
        this.dataEntrada = dataEntrada;

        try{
            dataEntrega.setTime(sdf.parse(dataEntrada));
        } catch (ParseException e) {
            System.out.println("Erro ao converter a data!!!");
            e.printStackTrace();
        }

    }
    public Calendar getDataEntrega(){
        return this.dataEntrega;
    }

    public void setOrcamento(Double orcamento){
        this.orcamento = orcamento;
    }
    public Double getOrcamento(){
        return this.orcamento;
    }

    public void setCustoTotal(Double custoTotal){
        this.custoTotal = custoTotal;
    }
    public Double getCustoTotal(){
        return this.custoTotal;
    }


    // METODOS ====================================
    public void LerTerrenos(){
        System.out.println("---- LENDO O TERRENO 1 -------");
        terreno1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do terreno 1:")));
        terreno1.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do terreno 1:")));
        terreno1.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do terreno 1:")));

        System.out.println("---- LENDO O TERRENO 2 -------");
        terreno2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do terreno 2:")));
        terreno2.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do terreno 2:")));
        terreno2.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do terreno 2:")));

        System.out.println("---- LENDO O TERRENO 3 -------");
        terreno3.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do terreno 3:")));
        terreno3.setLargura(Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do terreno 3:")));
        terreno3.setComprimento(Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do terreno 3:")));

        listaTerrenos.add(terreno1);
        listaTerrenos.add(terreno2);
        listaTerrenos.add(terreno3);


    }
    public void LerProprietario(){
        System.out.println("---- LENDO O PROPRIETARIO 1 -------");
        proprietario1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do proprietário 1:")));
        proprietario1.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário 1:"));
        proprietario1.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário 1:"));

        System.out.println("---- LENDO O PROPRIETARIO 2 -------");
        proprietario2.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do proprietário 2:")));
        proprietario2.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário 2:"));
        proprietario2.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário 2:"));

        System.out.println("---- LENDO O PROPRIETARIO 3 -------");
        proprietario3.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código do proprietário 3:")));
        proprietario3.setNome(JOptionPane.showInputDialog("Informe o nome do proprietário 3:"));
        proprietario3.setCpf(JOptionPane.showInputDialog("Informe o CPF do proprietário 3:"));

        listaProprietarios.add(proprietario1);
        listaProprietarios.add(proprietario2);
        listaProprietarios.add(proprietario3);

    }




    public void ExibirDados(){
        System.out.println("------------ DADOS DA OBRA -------------");
        System.out.println("Código da Obra: " + getCodigo());
        System.out.println("Nome da obra: " + getNome());
        System.out.println("Descrição da obra: " + getDescricao());
        System.out.println("Data de entrega da obra: " + sdf.format(getDataEntrega().getTime()));
        System.out.println("Orçamento da obra: " + getOrcamento());
        System.out.println("Custo total da obra: " + getCustoTotal());
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("------------ EMPREITEIRA ----------------");
        System.out.println("Código da Empreiteira: " + empreiteira.getCodigo());
        System.out.println("Nome da Empreiteira: " + empreiteira.getNome());
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("------------ TERRENO 1 ----------------");
        System.out.println("Código do Terreno 1: " + terreno1.getCodigo());
        System.out.println("Largura do Terreno 1: " + terreno1.getLargura());
        System.out.println("Comprimento do Terreno 1: " + terreno1.getComprimento());
        System.out.println("Metros quadrados do Terreno 1: " + terreno1.getMetrosQuadrados());
        System.out.println("Nome do Proprietario: " + proprietario1.getNome());
        System.out.println("Código do Proprietario: " + proprietario1.getCodigo());
        System.out.println("CPF do Proprietario: " + proprietario1.getCpf());
        System.out.println();
        System.out.println("------------ TERRENO 2 ----------------");
        System.out.println("Código do Terreno 2: " + terreno2.getCodigo());
        System.out.println("Largura do Terreno 2: " + terreno2.getLargura());
        System.out.println("Comprimento do Terreno 2: " + terreno2.getComprimento());
        System.out.println("Metros quadrados do Terreno 2: " + terreno2.getMetrosQuadrados());
        System.out.println("Nome do Proprietario: " + proprietario2.getNome());
        System.out.println("Código do Proprietario: " + proprietario2.getCodigo());
        System.out.println("CPF do Proprietario: " + proprietario2.getCpf());
        System.out.println();
        System.out.println("------------ TERRENO 3 ----------------");
        System.out.println("Código do Terreno 3: " + terreno3.getCodigo());
        System.out.println("Largura do Terreno 3: " + terreno3.getLargura());
        System.out.println("Comprimento do Terreno 3: " + terreno3.getComprimento());
        System.out.println("Metros quadrados do Terreno 3: " + terreno3.getMetrosQuadrados());
        System.out.println("Nome do Proprietario: " + proprietario3.getNome());
        System.out.println("Código do Proprietario: " + proprietario3.getCodigo());
        System.out.println("CPF do Proprietario: " + proprietario3.getCpf());
        System.out.println();
        System.out.println("------------ METRAGEM TOTAL ----------------");
        System.out.println("Total de: " + calcularMetragemTotal() + " metros quadrados.");

    }
    public void calculaMetrosQdr(){
        terreno1.setMetrosQuadrados(terreno1.getLargura(), terreno1.getComprimento());
        terreno2.setMetrosQuadrados(terreno2.getLargura(), terreno2.getComprimento());
        terreno3.setMetrosQuadrados(terreno3.getLargura(), terreno3.getComprimento());
    }
    public Double calcularMetragemTotal(){
        //Double metragemTotal;
        return terreno1.getMetrosQuadrados() + terreno2.getMetrosQuadrados() + terreno3.getMetrosQuadrados();

        // Pegar a variável "metros quadrados" de cada terreno e somar.
    }

}
