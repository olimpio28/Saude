package Tela;

import java.util.ArrayList;

import java.util.Scanner;

import Entidade.Consulta;
import Entidade.Empresa;
import Registro.Cadastro;

public class TelaUsuario {
	
	public static ArrayList<Consulta> consultas = new ArrayList<Consulta>(); 
	

		
	static Scanner teclado = new Scanner(System.in);
	static Scanner input = new Scanner (System.in);
    
    	public void executar(){
    		    		
    		 boolean sair = false;
    	      int op;
    	      
      		  System.out.println("1- Chat Voluntário");
      		  System.out.println("2- Clínicas Especializadas");
      		  System.out.println("3- Menu");
      		  System.out.println("0- Sair");
      		  
      		  int dig = teclado.nextInt();
      		  
      		 if(dig == 0) {
 	        	System.out.println("Esperamos ter ajudado de alguma forma :)");
 	        	sair = true;}
      		  
      		  if (dig==1) {
      		  System.out.println("EM BREVE");}
      		  
      		  if (dig==2){
        			for(Empresa listp : Cadastro.listapsicologia){
          				System.out.println("Lista Psicologia: "+listp.getNome());}
          			
          	    	for(Empresa listu : Cadastro.listaurologia){
          	    		System.out.println("Lista Urologia: "+listu.getNome());}
          
          	    	for(Empresa listg : Cadastro.listaginecologista){
          	  			System.out.println("Lista Ginecologia e Obstetrícia: "+listg.getNome());}  
          	    	}
      		  if (dig==3) {
      		  
      		  
    	      while(!sair){

    	        System.out.println("1- Nova Consulta");            
    	        System.out.println("2- Lista de Consulta");         
    	        System.out.println("3- Cancelar Consulta");          
    	        System.out.println("0- Sair");              
    	        op = teclado.nextInt();

    	        if(op == 1) {
    	          this.NovaConsulta();
    	        }

    	        if(op == 2) {
    	          this.ListaConsulta();
    	        }

    	        if(op == 3) {
    	          this.CancelarConsulta();
    	        }

    	        if(op == 0) {
    	        	System.out.println("Esperamos ter ajudado de alguma forma :)");
    	          sair = true;
    	        }}}}
    	        

    	    private void NovaConsulta(){
    	    	  System.out.println("Nome: ");
    		      String nome = input.nextLine();

    		      System.out.print("Cpf:");
    		      int cpf =  teclado.nextInt();
    		      
    		      System.out.print("Sexo:");
    		      String sexo =  input.nextLine();

    		      System.out.print("Clinica:");
    		      String clinica =  input.nextLine();
    		      
    		      Consulta novo = new Consulta();
    		      novo.setNome(nome);
    		      novo.setCpf(cpf);
    		      novo.setSexo(sexo);
    		      novo.setClinica(clinica);

    		      consultas.add(novo);

    	    }

    	    private void ListaConsulta(){
    	    	
    	  		  System.out.println("Lista de Consulta:");

    	  		  if(consultas.size() > -1) {
    	  		  int cont = 1;
    	  		  for(Consulta atemp : consultas) {
    	  		  System.out.println(cont++ + ") " + atemp.getNome() + " (CPF: " + atemp.getCpf() + ")" + "(Clinica: "+ atemp.getClinica()+")");    	  		  
    	  		        }
    	  		      } else {
    	  		        System.out.println("Nenhuma Consulta");
    	  		      }
    	    }
    	    
    	    private void CancelarConsulta(){

    	    	this.ListaConsulta();
      		      System.out.print("Selecionar: ");
      		      int posicao = teclado.nextInt();

      		      consultas.remove(posicao-1);

      		      System.out.println("Removido, Glória");
    	    }

  	    }
