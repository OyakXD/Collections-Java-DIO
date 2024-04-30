package src;

public class Livro {

    public String titulo;
    public String autor;
    public Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public String toString() {
        return "Livro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", anoPublicacao=" + anoPublicacao + '}';
    }
}
