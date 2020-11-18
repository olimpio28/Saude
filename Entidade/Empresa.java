package Entidade;

public class Empresa {

	    public String nome, email,emailc,senha,senhac, estado, cidade, endereço;
	    private int cnpj,numero;	    
	    
	    public void setNome(String n) {
	        nome = n;
	      }
	    
	    public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEndereço() {
			return endereço;
		}

		public void setEndereço(String endereço) {
			this.endereço = endereço;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public void setCnpj(int n) {
	        cnpj = n;
	      }
	    
	    public void setEmail(String n) {
	        email = n;
	      }
	    public void setEmailc(String n) {
	        emailc = n;
	      }
	    public void setSenha(String n) {
	        senha = n;
	      }
	    public void setSenhac(String n) {
	            senhac = n;
	      }
	    public void setEstado(String n) {
	        estado = n;
	      }
	    public String getNome() {
	        return nome;
	      }
	    public int getCnpj() {
	        return cnpj;
	      }
	    public String getEmail() {
	        return email;
	      }
	    public String getEmailc() {
	        return emailc;
	      }
	    public String getSenha() {
	        return senha;
	      }
	    public String getSenhac() {
	        return senhac;
	      }
	    public String getEstado() {
	        return estado;
	      }
	}
