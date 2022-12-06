package Biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Livro[] livros;
        Livro livro=new Livro();
        livros = livro.carregaLivros("livros.txt");
        
        Leitor[] leitores;
        Leitor leitor=new Leitor(); 
        leitores = leitor.carregaLeitores("leitores.txt");
        
        Fila[] filas;
        Fila fila=new Fila(); 
        filas = fila.carregaFila("fila.txt");
        
        Operacoes operacoes;
        operacoes = new Operacoes();
        
        Scanner teclado;
        teclado = new Scanner(System.in);
       
        String opcao="";

        for(;;){
            
            System.out.println("Escolha uma opção ");
            System.out.println("1 - Listar livros ");
            System.out.println("2 - Listar livros por ordem de Titulo ");
            System.out.println("3 - Listar livros por ordem de Autor ");
            System.out.println("4 - Buscar livros ");
            
            System.out.println("5 - Buscar leitor");
            System.out.println("6 - Listar leitores por ordem de nome-FAZER");
            System.out.println("7 - Listar leitores por ordem de id-FAZER");

            System.out.println("0 - Sair");
            opcao = teclado.nextLine();

            switch(opcao){
                case "1": 
                    livro.listaLivros(livros);
                    break;
                case "2":
                    livro.listaOrdenado(livros); 
                    break;
                case "3":
                    livro.listaOrdenadoAutor(livros); 
                    break; 
                case "4":
                    operacoes.buscarLivros(livros);
                    //livro.buscar(livros); 
                case "5":
                    operacoes.buscarLeitor(leitores);
                    break; 
                case "0":
                    System.out.println("FIM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha outra opção");    
            }

        }
         
    }
    
}
