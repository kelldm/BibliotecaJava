package JavaBiblioteca;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner inp = new Scanner(System.in);
    static Livro[ ] livros = new Livro[1000];
    static Revista[] revistas= new Revista[1000];
    static String retorno;
    static int i=0,j=0;
        
    public static void cadastrarLivro()
    {
        try
        {
            String nomelivro,autor, ISBN,ano, editora,prateleira,seção,CDD;
            int edição;

            System.out.println("Informe o nome do livro: ");
            nomelivro=inp.next();

            System.out.println("Informe o nome do autor: ");
            autor=inp.next();

            System.out.println("Informe o ISBN: ");
            ISBN=inp.next();

            System.out.println("Informe o ano de publicação: ");
            ano=inp.next();

            System.out.println("Informe a editora: ");
            editora=inp.next();

            System.out.println("Informe a edição: ");
            edição=inp.nextInt();

            System.out.println("Informe a prateleira: ");
            prateleira=inp.next();

            System.out.println("Informe a seção: ");
            seção=inp.next();

            System.out.println("Informe o CDD: ");
            CDD=inp.next();

            livros[i]=new Livro(nomelivro, autor, ISBN, ano, editora, prateleira, seção, CDD, edição); 

            i++;
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro. Contate o suporte! 1*" +e.toString() );        
        }
    }
    
    public static void cadastrarRevista()
    {
       try
       {
            String ISSN, nomelivro, autor, ISBN,ano, editora, prateleira, seção, CDD;
            int edição;

            System.out.println("Informe o nome da revista: ");
            nomelivro=inp.next();

            System.out.println("Informe o nome do autor: ");
            autor=inp.next();

            System.out.println("Informe o ISSN: ");
            ISSN=inp.next();
            ISBN="-";

            System.out.println("Informe o ano de publicação: ");
            ano=inp.next();

            System.out.println("Informe a editora: ");
            editora=inp.next();

            System.out.println("Informe a edição: ");
            edição=inp.nextInt();

            System.out.println("Informe a prateleira: ");
            prateleira=inp.next();

            System.out.println("Informe a seção: ");
            seção=inp.next();

            System.out.println("Informe o CDD: ");
            CDD=inp.next();

            revistas[j]=new Revista(ISSN,nomelivro, autor, ISBN, ano, editora, prateleira, seção, CDD, edição); 

            j++;  
       }
       catch (Throwable e)
       {            
            System.out.println("Ocorreu algum erro. Contate o suporte! 2*" +e.toString() );        
       }     
    }
    
    public static void procurarLivroRevista(String chave)
    {
        try
        {
            for(int k=0;k<i;k++)
            {
                        if(livros[k].getNomelivro().toLowerCase().indexOf(chave.toLowerCase())>=0 ||
                                livros[k].getAutor().toLowerCase().indexOf(chave.toLowerCase())>=0)
                        {
                              System.out.println("Livro: " + (k+1));
                              System.out.println(livros[k].getNomelivro()+", " + 
                                           livros[k].getAutor()+", " +
                                           livros[k].getISBN()+", " +
                                           livros[k].getAno()+", " +
                                           livros[k].getEditora()+", " +
                                           livros[k].getPrateleira()+", " +
                                           livros[k].getSeção()+", " +
                                           livros[k].getCDD()+", " +                                     
                                           livros[k].getEdição());
                        }                    
            }

            for(int k=0;k<j;k++)
            {
                        if(revistas[k].getNomelivro().toLowerCase().indexOf(chave.toLowerCase())>=0 ||
                                revistas[k].getAutor().toLowerCase().indexOf(chave.toLowerCase())>=0)
                        {
                              System.out.println("Revista: " + (k+1));
                              System.out.println(revistas[k].getNomelivro()+", " + 
                                           revistas[k].getAutor()+", " +
                                           revistas[k].getISBN()+", " +
                                           revistas[k].getAno()+", " +
                                           revistas[k].getEditora()+", " +
                                           revistas[k].getPrateleira()+", " +
                                           revistas[k].getSeção()+", " +
                                           revistas[k].getCDD()+", " +                                     
                                           revistas[k].getEdição());
                        }
            }
            retorno="";
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro. Contate o suporte! 3*" +e.toString() );        
        }             
    }

    public static void salvarArquivo(){
        try{
            FileWriter arquivo=new FileWriter(new File("C:\\bd", "livros.txt"));
            int k;
            for(k=0;k< i; k++){
                arquivo.write(livros[k].getNomelivro()+","+
                        livros[k].getAutor() + ","+
                        livros[k].getISBN() + ","+
                        livros[k].getAno() + ","+
                        livros[k].getEditora() + ","+
                        livros[k].getPrateleira() + ","+
                        livros[k].getSeção() + ","+
                        livros[k].getCDD() + ","+
                        livros[k].getEdição() + ","+
                        ",\n");
            }
            arquivo.close();
            FileWriter arquivo1= new FileWriter(newFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void listarLivrosRevistas()
    {
        try
        {
            int k;
            for (k = 0; k < i; k++) {
                System.out.println("Livro: " + (k + 1));
                System.out.println(livros[k].getNomelivro() + ", "
                        + livros[k].getAutor() + ", "
                        + livros[k].getISBN() + ", "
                        + livros[k].getAno() + ", "
                        + livros[k].getEditora() + ", "
                        + livros[k].getPrateleira() + ", "
                        + livros[k].getSeção() + ", "
                        + livros[k].getCDD() + ", "
                        + livros[k].getEdição());
            }

            for (k = 0; k < j; k++) {
                System.out.println("Revista: " + (k + 1));
                System.out.println(revistas[k].getNomelivro() + ", "
                        + revistas[k].getAutor() + ", "
                        + revistas[k].getISSN() + ", "
                        + revistas[k].getAno() + ", "
                        + revistas[k].getEditora() + ", "
                        + revistas[k].getPrateleira() + ", "
                        + revistas[k].getSeção() + ", "
                        + revistas[k].getCDD() + ", "
                        + revistas[k].getEdição());
            }

            retorno = "";
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro. Contate o suporte! 4*" +e.toString() );        
        }      
    }
    
    public static void memóriaUsada()
    {
        try
        {
            System.out.println("Total de memória Livros= 1000");
            System.out.println("Usado: " + i);
            System.out.println("Livre: " + (1000 - i));
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("Total de memória Revistass= 1000");
            System.out.println("Usado= " + j);
            System.out.println("Livre= " + (1000 - j));
            System.out.println("");
            System.out.println("");
            System.out.println("");

            retorno = ""; 
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro. Contate o suporte! 5*" +e.toString() );        
        }  
    }



    
    public static void apagarItemLista()
    {
        try
        {
            System.out.println("1- Livro 2-Revista");
            retorno=inp.next();
            
            /******************************
             Exclusão de livro
             ******************************/             
            if (retorno.equals("1")) 
            {   
                System.out.println("1- Lista 2-Palavra chave");
                retorno=inp.next();
            
                if (retorno.equals("1")) 
                {                  
                    int k;
                    for (k = 0; k < i; k++) {
                        System.out.println("Livro: " + (k + 1));
                        System.out.println(livros[k].getNomelivro() + ", "
                                + livros[k].getAutor() + ", "
                                + livros[k].getISBN() + ", "
                                + livros[k].getAno() + ", "
                                + livros[k].getEditora() + ", "
                                + livros[k].getPrateleira() + ", "
                                + livros[k].getSeção() + ", "
                                + livros[k].getCDD() + ", "
                                + livros[k].getEdição());
                    }

                    retorno = inp.next();
                    if (Integer.parseInt(retorno) <= i
                            && Integer.parseInt(retorno) >= 1) {
                        i--;
                        for (k = Integer.parseInt(retorno) - 1; k <= i; k++) {
                            livros[k] = livros[k + 1];
                        }
                        livros[k + 1] = null;
                    } else {
                        System.out.println("Fora da faixa!!!");
                    }
                }
                else  if (retorno.equals("2")) 
                {
                    System.out.println("Palavra chave: ");
                    retorno=inp.next();
                    
                    for(int k=0;k<i;k++)
                    {
                        if(livros[k].getNomelivro().toLowerCase().indexOf(retorno.toLowerCase())>=0 ||
                                livros[k].getAutor().toLowerCase().indexOf(retorno.toLowerCase())>=0)
                        {
                              System.out.println("Livro: " + (k+1));
                              System.out.println(livros[k].getNomelivro()+", " + 
                                           livros[k].getAutor()+", " +
                                           livros[k].getISBN()+", " +
                                           livros[k].getAno()+", " +
                                           livros[k].getEditora()+", " +
                                           livros[k].getPrateleira()+", " +
                                           livros[k].getSeção()+", " +
                                           livros[k].getCDD()+", " +                                     
                                           livros[k].getEdição());
                        }                    
                    }
                    
                    System.out.println("Posição: ");
                    retorno = inp.next();
                    if (Integer.parseInt(retorno) <= i
                            && Integer.parseInt(retorno) >= 1) 
                    {
                        int k;
                        i--;
                        for (k = Integer.parseInt(retorno) - 1; k <= i; k++) 
                        {
                            livros[k] = livros[k + 1];
                        }
                        livros[k + 1] = null;
                    } 
                    else 
                    {
                        System.out.println("Fora da faixa!!!");
                    }                    
                }
                else
                {
                       System.out.println("Opção inválida!");
                }           
                                                
            } 
            /******************************
             Exclusão de revista
             ******************************/
            else if (retorno.equals("2")) 
            {                
                System.out.println("1- Lista 2-Palavra chave");
                retorno=inp.next(); 
                
                if (retorno.equals("1")) 
                {
                    int k;
                    for (k = 0; k < j; k++) {
                        System.out.println("Revista: " + (k + 1));
                        System.out.println(revistas[k].getNomelivro() + ", "
                                + revistas[k].getAutor() + ", "
                                + revistas[k].getISSN() + ", "
                                + revistas[k].getAno() + ", "
                                + revistas[k].getEditora() + ", "
                                + revistas[k].getPrateleira() + ", "
                                + revistas[k].getSeção() + ", "
                                + revistas[k].getCDD() + ", "
                                + revistas[k].getEdição());
                    }

                    retorno = inp.next();
                    if (Integer.parseInt(retorno) <= j && Integer.parseInt(retorno) >= 1) {
                        j--;
                        for (k = Integer.parseInt(retorno) - 1; k <= j; k++) {
                            revistas[k] = revistas[k + 1];
                        }
                        revistas[k + 1] = null;
                    } else {
                        System.out.println("Fora da faixa! Tente novamente ");
                    }
                }
                else  if (retorno.equals("2")) 
                {
                    System.out.println("Palavra chave: ");
                    retorno=inp.next();
                    
                    for(int k=0;k<i;k++)
                    {
                        if(revistas[k].getNomelivro().toLowerCase().indexOf(retorno.toLowerCase())>=0 ||
                                revistas[k].getAutor().toLowerCase().indexOf(retorno.toLowerCase())>=0)
                        {
                              System.out.println("Revista: " + (k+1));
                              System.out.println(revistas[k].getNomelivro()+", " + 
                                           revistas[k].getAutor()+", " +
                                           revistas[k].getISSN()+", " +
                                           revistas[k].getAno()+", " +
                                           revistas[k].getEditora()+", " +
                                           revistas[k].getPrateleira()+", " +
                                           revistas[k].getSeção()+", " +
                                           revistas[k].getCDD()+", " +                                     
                                           revistas[k].getEdição());
                        }                    
                    }
                    
                    System.out.println("Posição: ");
                    retorno = inp.next();
                    if (Integer.parseInt(retorno) <= i
                            && Integer.parseInt(retorno) >= 1) 
                    {
                        int k;
                        j--;
                        for (k = Integer.parseInt(retorno) - 1; k <= i; k++) 
                        {
                           revistas[k] = revistas[k + 1];
                        }
                        revistas[k + 1] = null;
                    } 
                    else 
                    {
                        System.out.println("Fora da faixa!!!");
                    }                    
                }
                else
                {
                       System.out.println("Opção inválida!");
                }           
                

            } 
            else 
            {
                System.out.println("Opção inválida!");
            }
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro :( Contate o suporte! 6*" +e.toString() );
        }  
        
    }
    
    public static void ordenarLivrosRevistas()
    {
        try
        {
          for (int k = 0; k < (i - 1); k++) {
               for (int z = 0; z < (i - 1); z++) {
                   Livro aux = new Livro();
                   Livro aux1 = new Livro();
                   aux = livros[z];
                   aux1 = livros[z + 1];
                   if (aux.getNomelivro().toLowerCase().compareTo(aux1.getNomelivro().toLowerCase()) > 0) {
                       livros[z] = aux1;
                       livros[z + 1] = aux;
                   }
               }
           }

           for (int k = 0; k < (j - 1); k++) {
               for (int z = 0; z < (j - 1); z++) {
                   Revista aux = new Revista();
                   Revista aux1 = new Revista();
                   aux = revistas[z];
                   aux1 = revistas[z + 1];
                   if (aux.getNomelivro().toLowerCase().compareTo(aux1.getNomelivro().toLowerCase()) > 0) {
                       revistas[z] = aux1;
                       revistas[z + 1] = aux;
                   }
               }
           }
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro :( Contate o suporte! 7*" +e.toString() );
        }  
       
    }
    
    public static void menu()
    {
        try
        {
            System.out.println("*******************************");
            System.out.println("*Sistema de Cadastro de Livros*");
            System.out.println("*******************************");
            System.out.println("[1] Cadastrar livro/revista");
            System.out.println("[2] Procurar livro/revista");
            System.out.println("[3] Listar livros/revista");
            System.out.println("[4] Quantidade cadastrada/livre");
            System.out.println("[5] Excluir livro/revista");
            System.out.println("[6] Ordenar livros/revista");
            System.out.println("[7] Encerrar programa");
            retorno = inp.next();  
        }
        catch (Throwable e)
        {            
            System.out.println("Ocorreu algum erro :( Contate o suporte! 8*" +e.toString() );
        }  
    }
    
    public static void main(String[] args) 
    {   
        do
        {
           menu();
           
            /*  1 - Cadastro de livro/revista    */
            if (retorno.equals("1"))                
            {
                System.out.println("[1]Livro / [2]Revista");
                retorno=inp.next();
                
                if(retorno.equals("1"))
                {
                    cadastrarLivro();
                }
                else if (retorno.equals("2"))
                {
                    cadastrarRevista();                    
                }
                else
                {
                    System.out.println("Opção inválida! ");
                }
                retorno="";
            }            
            
            /*  2 - Procurar livros/revistas  */
            if (retorno.equals("2"))
            {                
                System.out.println("Informe a palavra chave: ");
                String chave=inp.next();                
                procurarLivroRevista(chave);
            }
                
            /*  3 - Listar livros/revistas  */
            if (retorno.equals("3"))
            {
                listarLivrosRevistas();
            }           
                      
            /*  4 - Listar memória usada    */
            if (retorno.equals("4"))
            {
                memóriaUsada();                
            }
            
            /* 5 -  Apagar item da lista memória usada    */
            if (retorno.equals("5"))
            {                
                apagarItemLista();
            }
            
            /* 6 - Ordenação de livros    */
            if (retorno.equals("6"))
            {
                ordenarLivrosRevistas();
            }           
            
        }while(!retorno.equals("7"));
        
        System.out.println("Encerrando programa...Até logo!");
    }    
}
