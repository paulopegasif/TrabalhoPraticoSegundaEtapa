package br.edu.ifsul.teste;

import br.edu.ifsul.modelo.Empreiteira;
import br.edu.ifsul.modelo.Obra;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Obra obra = new Obra();
        Empreiteira empreiteira1 = new Empreiteira();


        // Lendo os dados da obra
        obra.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código da Obra:")));
        obra.setNome(JOptionPane.showInputDialog("Informe o nome da Obra:"));
        obra.setDescricao(JOptionPane.showInputDialog("Informa a descrição da Obra:"));
        obra.setCustoTotal(Double.parseDouble(JOptionPane.showInputDialog("Informe o custo total da obra:")));
        obra.setOrcamento(Double.parseDouble(JOptionPane.showInputDialog("Informe o orçamento da Obra:")));

        obra.setDataEntrega(JOptionPane.showInputDialog("Informe a data de entrega no padrão (dd/mm/yyyy:)"));


        // Lendo os dados da empreiteira
        empreiteira1.setNome(JOptionPane.showInputDialog("Informe o nome da empreiteira:"));
        empreiteira1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código da empreiteira:")));

        // Associando os dados da empreiteira a obra
        obra.setEmpreiteira(empreiteira1);

        obra.LerTerrenos(); //Chamando o metodo da classe obra
        obra.LerProprietario();
        obra.calculaMetrosQdr();
        obra.ExibirDados();










    }

}

