import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    FilmeDAO filmeDAO = new FilmeDAO();

    //Quero consultar o banco trazendo todos os filmes..
    ArrayList<Filme> filmeLista = filmeDAO.getAll();
    for (Filme filme: filmeLista) {
      System.out.println(filme);
    }

    //Como fica para inserir filme agora..
    Filme novoFilme = new Filme(0, "A Fuga das Galinhas", (short) 2000);
    filmeDAO.add(novoFilme);

    //Quero consultar o banco trazendo todos os filmes..
    filmeLista = filmeDAO.getAll();
    for (Filme filme: filmeLista) {
      System.out.println(filme);
    }    
    
  }
}