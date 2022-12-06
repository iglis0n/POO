package Biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Livro[] livros;
        Livro livro=new Livro();
        livros = livro.carregaLivros("livros.txt");
        
        Operacoes operacoes;
        operacoes = new Operacoes();
        
        Scanner teclado;
        teclado = new Scanner(System.in);
       
        String opcao="";

        for(;;){
            
            System.out.println("Escolha uma opção ");
            System.out.println("1 - Listar todos os livros ");
            System.out.println("2 - Listar todos livros por ordem de titulo ");
            System.out.println("3 - Listar todos os livros por ordem de Autor ");
            System.out.println("4 - Buscar todos os livros ");
            System.out.println("0 - Fechar/Sair");
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
