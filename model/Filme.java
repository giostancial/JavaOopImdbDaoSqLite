class Filme {
  private int id;
  private String titulo;
  private short ano;

  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public short getAno() {
	return ano;
}
public void setAno(short ano) {
	this.ano = ano;
}

  public Filme(int id, String titulo, short ano) {
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
  }

  public Filme(){
    
  }
  
  public String toString() {
    return(this.id+" - "+this.titulo+" ("+this.ano+")");
  }
}