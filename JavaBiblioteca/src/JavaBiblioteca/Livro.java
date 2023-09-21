package JavaBiblioteca;


public class Livro 
{
    private String nomelivro,autor, ISBN,ano, editora,prateleira,seção,CDD; 
    private int edição;
    
    public Livro()
    {
        
    }
    
    public Livro(String nomelivro, String autor, String ISBN, String ano, String editora, String prateleira, String seção, String CDD, int edição) {
        this.nomelivro = nomelivro;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ano = ano;
        this.editora = editora;
        this.prateleira = prateleira;
        this.seção = seção;
        this.CDD = CDD;
        this.edição = edição;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    public void setSeção(String seção) {
        this.seção = seção;
    }

    public void setCDD(String CDD) {
        this.CDD = CDD;
    }

    public void setEdição(int edição) {
        this.edição = edição;
    }  
    
    public String getNomelivro() {
        return nomelivro;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAno() {
        return ano;
    }

    public String getEditora() {
        return editora;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public String getSeção() {
        return seção;
    }

    public String getCDD() {
        return CDD;
    }

    public int getEdição() {
        return edição;
    }

    
}
