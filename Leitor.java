package Biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Leitor {
    
    private int id;
    private String nome;

    public Leitor() {
        this.id = 0;
        this.nome = "";
    } 
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Leitor[] carregaLeitores(String fileName){
        File file = new File(fileName);
        Leitor leitor=new Leitor();
        Leitor[] leitores;
        Operacoes operacoes;
        operacoes=new Operacoes();
        leitores = new Leitor[operacoes.contaLinhas(file)];
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bf = new BufferedReader(isr);
            String linha;
            linha=bf.readLine();
            int linhas=0;
            while(true){
                linha=bf.readLine();
                if(linha==null)
                    break;
                String[] dados=linha.split(";");
                leitor=new Leitor();
                leitor.setId(Integer.parseInt(dados[0]));
                leitor.setNome(dados[1]);
                leitores[linhas]=leitor;
                linhas++;
            }
            bf.close();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return leitores;
    }
    
    public Leitor buscarPorId(Leitor[] leitores,int idBuscar){
        Leitor l = new Leitor();
        for (Leitor leitor : leitores) {
            if(leitor.getId()==idBuscar){
                id = leitor.getId();
                nome = leitor.getNome();
                System.out.println("Id......:"+id);
                System.out.println("Nome...:"+nome);
                System.out.println("----------------");
                l.setId(id);
                l.setNome(nome);
            }
        }

    public void buscar(Leitor[] leitores, String nome){    
        for (Leitor leitores : leitores) {
            if(leitor.getNome().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Id......:"+leitor.getId());
                System.out.println("Título..:"+leitor.getNome());
                System.out.println("----------------");
            }
            //buscar por autores que tenham parte daquilo que foi digitado, por exmeplo pode digitar apenas o sobre nome
            if(livro.getAutor().toLowerCase().contains(nome.toLowerCase())){
                System.out.println("Id......:"+livro.getId());
                System.out.println("Título..:"+livro.getTitulo());
                System.out.println("Autor...:"+livro.getAutor());
                System.out.println("----------------");
            }
        }
        
    }
        return l;
    }
    
}
