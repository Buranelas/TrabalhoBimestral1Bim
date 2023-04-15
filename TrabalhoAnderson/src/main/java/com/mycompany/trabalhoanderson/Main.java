/*
Os projetos devem possuir todas as classes com construtores contendo todos os atributos e um
construtor vazio, getters e setters. 
Na classe principal (Main) devem ser construídos todos os objetos e seus valores 
afim de simular uma venda real no sistema.
A venda simulada deve conter 
3 livros - *Classe Livro* --
2 Formas de Pagamento - *Classe FormaDePagamento*
Ao final deve se imprimir todas a venda utilizando 
O método toString da classe que representa a venda e todos - *Classe Venda*
os dados dos objetos devem ser retornados

Quando um cliente chega até a livraria, Anderson cadastra ou atualiza os dados do
cliente, incluindo dados de endereço (Rua, número, Bairro, Estado e Pais)
- *Classe Endereco e Classe Cliente*

valor total de venda do item
((Vl. unitário – Vl. Desconto) * Qtd Venda do Item). - *Metodo calcularTotal*

Após a realização da venda a Quantidade em estoque do Item deve ser decrescida de
acordo com a quantidade vendida. - *Metodo quantidadeEstoque*


*/

package com.mycompany.trabalhoanderson;

import model.Cliente;
import model.Endereco;
import model.FormaPagamento;
import model.Livro;


public class Main {

    public static void main(String[] args) {
        
        Endereco e1 = new Endereco(842, "R. do Rosário", "Jd. Pancera", "Toledo", "PR", "Brasil");
        Endereco e2 = new Endereco(764, "R. Guaíra", "Jd. Gisela", "Toledo", "PR", "Brasil");
        
        Cliente c1 = new Cliente("João", e1, "45998629234", "12632383943");
        Cliente c2= new Cliente("Roberto", e2, "45999776643", "71815267298");
        
        Livro l1 = new Livro("Harry Potter", "Rocco", "J. K. Rowling", "Romance", 124, 5, 59.90);
        Livro l2 = new Livro("O Diáio Perdido", "Alex", "Alex Hirsch", "Aventiura", 90, 2, 49.80);
        
        FormaPagamento f1 = new FormaPagamento();
        
        
    }
}
