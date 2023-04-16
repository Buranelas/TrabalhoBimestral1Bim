package com.mycompany.trabalhoanderson;

import java.util.ArrayList;
import model.Cliente;
import model.Endereco;
import model.FormaPagamento;
import model.ItemVenda;
import model.Livraria;
import model.Livro;
import model.Venda;

public class Main {

   public static void main(String[] args) {
       
       //Criando a Livraria
       Livraria livraria = new Livraria("Livraria Barão");
       
       //Criando os Livros da Livraria
       
       //Primeiro Livro
       
       Livro livro1 = new Livro();
       livro1.setEditora("Rocco");
       livro1.setNrPaginas(225);
       livro1.setQtdEstoque(2);
       livro1.setTitulo("Harry Potter");
       livro1.setVlrVenda(119.90);
       
       ArrayList<String> autores1 = new ArrayList<String>();
       autores1.add("Guilherme");
       autores1.add("J. K. Rowlling");
        livro1.setAutor(autores1);
       
       ArrayList<String> generos1 = new ArrayList<String>();
       generos1.add("Comédia");
       generos1.add("Ação");
       livro1.setGenero(generos1);

       
       //Segundo Livro
       
       Livro livro2 = new Livro();
      
       livro2.setEditora("Panini");
       livro2.setNrPaginas(300);
       livro2.setQtdEstoque(5);
       livro2.setTitulo("Em busca de um Porque");
       livro2.setVlrVenda(139.90);
       
       ArrayList<String> autores2 = new ArrayList<String>();
       autores2.add("Roberto");
       autores2.add("Joana");
       livro2.setAutor(autores2);
       
       ArrayList<String> generos2 = new ArrayList<String>();
       generos2.add("Romance");
       generos2.add("Mistério");
       livro2.setGenero(generos2);
       
       //Terceiro Livro

       Livro livro3 = new Livro();
       livro3.setEditora("Elma");
       livro3.setNrPaginas(127);
       livro3.setQtdEstoque(7);
       livro3.setTitulo("O Amanhã não será descoberto");
       livro3.setVlrVenda(79.90);
       
       ArrayList<String> autores3 = new ArrayList<String>();
       autores3.add("Bruno");
       autores3.add("Paulo Miranda");
       livro3.setAutor(autores3);
       
       ArrayList<String> generos3 = new ArrayList<String>();
       generos3.add("Aventura");
       generos3.add("Ficção");
       livro3.setGenero(generos3);
       
       //Criando os Clientes para a Livraria
       Cliente cliente1 = new Cliente("João");
       cliente1.setEndereco(new Endereco("842", "R. do Rosário", "Jd. Pancera", "Toledo", "PR", "Brasil"));
       cliente1.setCpf("126.323.839-43");
       cliente1.setTelefone("(45)99862-9234");
       
       Cliente cliente2 = new Cliente("Bruno");
       cliente2.setEndereco(new Endereco("736", "R. Guaíra", "Jd. Gisela", "Toledo", "PR", "Brasil"));
       cliente2.setCpf("718,152.619-09");
       cliente2.setTelefone("(45)99909-4433");
       
       //Criando as Vendas
       ItemVenda item1 = new ItemVenda();
       item1.setLivro(livro1);
       item1.setQuantidade(2);
       item1.setVlDesconto(3);
       item1.setVlTotal(livro1);
       item1.setVlUnitario(livro1.getVlrVenda());
       
       ItemVenda item2 = new ItemVenda();       
       item2.setLivro(livro2);
       item2.setQuantidade(1);
       item2.setVlDesconto(1);
       item2.setVlTotal(livro2);
       item2.setVlUnitario(livro2.getVlrVenda());
       
       ItemVenda item3 = new ItemVenda();
       item3.setLivro(livro3);
       item3.setQuantidade(4);
       item3.setVlDesconto(2);
       item3.setVlTotal(livro3);
       item3.setVlUnitario(livro3.getVlrVenda());
       
       ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
       itens.add(item1);
       itens.add(item2);
       itens.add(item3);
       
       //Criando Formas De Pagamento
       FormaPagamento forma1 = new FormaPagamento();
       forma1.setParcelas(1);
       forma1.setTipoPagamento("Dinheiro");
       forma1.setVlrPago(119.90);
       
       FormaPagamento forma2 = new FormaPagamento();
       forma2.setParcelas(1);
       forma2.setTipoPagamento("Cartão de Crédito");
       forma2.setVlrPago(129.90);
       
       FormaPagamento forma3 = new FormaPagamento();
       forma3.setParcelas(1);
       forma3.setTipoPagamento("Pix");
       forma3.setVlrPago(100);
       
       ArrayList<FormaPagamento> formasPagamento = new ArrayList<FormaPagamento>();
       formasPagamento.add(forma1);
       formasPagamento.add(forma2);
       formasPagamento.add(forma3);
       
       //Realizando a Venda
       Venda venda = new Venda();
       venda.setCliente(cliente1);
       venda.setFormasPagamento(formasPagamento);
       venda.setItens(itens);
       venda.setValorTotal(itens);
       venda.gerarEstoque(itens);
       
       //Resumo de Venda
       System.out.println(venda.toString());
       
    }
    
}
