import java.sql.*;

class ConexaoBanco {
  public Connection conexao; 
  
  public ConexaoBanco() {
    try {
      Class.forName("org.sqlite.JDBC");
    
    this.conexao = DriverManager.getConnection("jdbc:sqlite:database/imdb.sqlite");
    } catch(Exception e) {
      System.out.println("Deu ruim!");
      System.out.println(e.getMessage());
    }
  }
}