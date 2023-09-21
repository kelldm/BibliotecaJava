/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBiblioteca;

public class Revista extends Livro
{
    private String ISSN;
    
    public Revista()
    {
        
    }
    
    public Revista(String ISSN, String nomelivro, String autor, String ISBN, String ano, String editora, String prateleira, String seção, String CDD, int edição) {
        super(nomelivro, autor, ISBN, ano, editora, prateleira, seção, CDD, edição);
        this.ISSN = ISSN;
    }
 
    public String getISSN() 
    {
        return ISSN;
    }
 
    public void setISSN(String ISSN) 
    {
        this.ISSN = ISSN;
    }
}
