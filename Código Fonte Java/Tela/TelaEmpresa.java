package Tela;

import java.util.ArrayList;
import java.util.Scanner;

import Entidade.Funcionario;

public class TelaEmpresa {
	
public static ArrayList<Funcionario> listafuncionariopsi = new ArrayList<Funcionario>(); 
public static ArrayList<Funcionario> listafuncionariogin = new ArrayList<Funcionario>(); 
public static ArrayList<Funcionario> listafuncionariouro = new ArrayList<Funcionario>(); 

	
	Scanner input = new Scanner (System.in);
    Scanner teclado = new Scanner(System.in);
    
    boolean sair = false;

    
    	public void executar(){
    		    		
    	  while(!sair){
  		  System.out.println("1- Adicionar Funcionário");  	
  		  System.out.println("2- Consultas");
  		  System.out.println("3- Consultas Marcadas");
  		  System.out.println("0- Sair");
  		  int dig = teclado.nextInt();
  	 		  
  		  
          if(dig == 0) {        	  
   	        System.out.println("Esperamos ter ajudado de alguma forma :)");
            sair = true;}
  			  
  		  
  		  if (dig==1) {
  		  System.out.println("Nome Completo: "); 
  		  String nome =  input.nextLine();
  		  System.out.println("Área de profissão:");
  		  System.out.println("1- Psicologia");
  		  System.out.println("2- Ginecologia e Obstetrícia ");
  		  System.out.println("3- Urologia ");
		  int area =  input.nextInt();
  		  System.out.println("Número do CIP: ");
		  int cip =  input.nextInt();
		  
		  if (area==1) {

	            Funcionario novo = new Funcionario();
	            novo.setNome(nome);
	            novo.setArea(area);
	            novo.setCip(cip);

	            listafuncionariopsi.add(novo);} 
		  if (area==2) {

	            Funcionario novo = new Funcionario();
	            novo.setNome(nome);
	            novo.setArea(area);
	            novo.setCip(cip);

	            listafuncionariogin.add(novo);} 
		  if (area==3) {

	            Funcionario novo = new Funcionario();
	            novo.setNome(nome);
	            novo.setArea(area);
	            novo.setCip(cip);

	            listafuncionariouro.add(novo);} }
          
          if (dig==2) {
        	  System.out.println("Em Breve");}
          if (dig==3) {
        	  System.out.println("Em Breve");}
          }

    	}
}
