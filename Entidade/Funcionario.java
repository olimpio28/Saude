package Entidade;

public class Funcionario {
	
    private String nome;
    int cip,area;

    public void setNome(String n) {
      nome = n;
    }
    public void setArea(int n) {
        area = n;
      }
    public void setCip(int n) {
        cip = n;
      }
    public String getNome() {
    	return nome;
	    }
    public int getArea() {
        return area;
      }
    public int getCip() {
        return cip;
      }
}
