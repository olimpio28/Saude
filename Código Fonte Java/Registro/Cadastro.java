package Registro;

import java.util.ArrayList;
import java.util.Scanner;

import Entidade.Empresa;
import Entidade.Usuario;
import Entidade.Voluntario;
import Tela.TelaEmpresa;
import Tela.TelaUsuario;
import Tela.TelaVoluntario;

public class Cadastro {
	
	Scanner input = new Scanner (System.in);
    Scanner teclado = new Scanner(System.in);    
    
    public static ArrayList<Usuario> listau = new ArrayList<Usuario>();  
    public static ArrayList<Voluntario> listacrp = new ArrayList<Voluntario>();
    public static ArrayList<Empresa> listapsicologia = new ArrayList<Empresa>();
    public static ArrayList<Empresa> listaginecologista = new ArrayList<Empresa>(); 
    public static ArrayList<Empresa> listaurologia = new ArrayList<Empresa>(); 

    public void executar() {    	      
    	      int op;

    	        System.out.println("1- Usuario");            //mec
    	        System.out.println("2- Empresa");         //mec
    	        System.out.println("3- Voluntario");            //mec
    	        System.out.println("0- Sair");            //mec

    	        System.out.println("Opcao: ");
    	        op = teclado.nextInt();

    	        if(op == 1) {
    	        	this.incluirNovoUsuario();
    	        }

    	        if(op == 2) {
    	            this.incluirNovaEmpresa();
    	          }
    	        if(op == 3) {
    	            this.incluirNovoVoluntario();
    	          }
    	        if(op == 0) {
    	        	System.out.println("Espero que tenhamos lhe ajudado de alguma forma :)");
    	          }
    	      }

    	      private void incluirNovoUsuario(){
    	  	  System.out.print("Nome de Usuario: ");
    	  	  String nome = input.nextLine();  	  
    	  	
    	  	  System.out.print("E-mail: ");
    	      String email =  teclado.next();
    	      
    	      System.out.print("Confirme E-mail: ");
    	      String emailc =  teclado.next();
    	      
    	      System.out.print("Senha: ");
    	      String senha =  input.nextLine();;
    	      
    	      System.out.print("Confirme Senha: ");
    	      String senhac =  input.nextLine();;

    	      Usuario novo = new Usuario();
    	      novo.setNome(nome);
    	      novo.setEmail(email);
    	      novo.setEmailc(emailc);
    	      novo.setSenha(senha);
    	      novo.setSenha(senhac);
    	      
    	      listau.add(novo);
    	      
    	      TelaUsuario TelaUsuario = new TelaUsuario();
    	      TelaUsuario.executar();	
    	      
    	    }
    	    
    	    private void incluirNovoVoluntario(){

    	        System.out.print("Nome do Voluntário: ");
    	        String nome = input.nextLine();;

    	        System.out.print("E-mail: ");;
    	        String email =  teclado.next();
    	        
    	        System.out.print("Confirme E-mail: ");
    	        String emailc =  teclado.next();
    	        
    	        System.out.print("Senha: ");
    	        String senha =  input.nextLine();;
    	        
    	        System.out.print("Confirmar Senha: ");
    	        String senhac =  input.nextLine();;
    	        
    	        System.out.println("Digite seu CRP: ");
    	        String crp =  input.nextLine();
    	        
    	        Voluntario novo = new Voluntario();
    	        novo.setNome(nome);
    	        novo.setEmail(email);
    	        novo.setEmailc(emailc);
    	        novo.setSenha(senha);
    	        novo.setSenhac(senhac);
    	        novo.setCrp(crp);
    	        		
    	        listacrp.add(novo);
    	    	
    	        TelaVoluntario TelaVoluntario = new TelaVoluntario();
    	        TelaVoluntario.executar();        
    	      }
    	    
    	    private void incluirNovaEmpresa(){

    	        System.out.print("Nome da Empresa: ");
    	        String nome = input.nextLine();

    	        System.out.print("CNPJ: ");
    	        int cnpj =  teclado.nextInt();
    	        
    	        System.out.print("Estado: ");
    	        String estado =  input.nextLine();
    	        
    	        System.out.print("Cidade: ");
    	        String cidade =  input.nextLine();
    	        
    	        System.out.print("Endereço: ");
    	        String endereço =  input.nextLine();
    	        
    	        System.out.print("Número: ");
    	        int numero =  teclado.nextInt();
    	        
    	        System.out.print("E-mail: ");
    	        String email =  teclado.next();
    	        
    	        System.out.print("Confirmar E-mail: ");
    	        String emailc =  teclado.next();
    	        
    	        System.out.print("Senha: ");
    	        String senha =  input.nextLine();
    	        
    	        System.out.print("Confirmar Senha: ");
    	        String  senhac=  input.nextLine();
    	        
    	        System.out.println("1- Empresa de Psicologia");
    	        System.out.println("2- Empresa Especialista em Ginecologia e Obstetrícia: ");
    	        System.out.println("3- Empresa Especialista em Urologia: ");
    	        int tecla =  teclado.nextInt();         
    	        
    	        if (tecla==1) {

    	            Empresa novo = new Empresa();
    	            novo.setNome(nome);
    	            novo.setCnpj(cnpj);
    	            novo.setEstado(estado);
    	            novo.setCidade(cidade);
    	            novo.setEndereço(endereço);
    	            novo.setNumero(numero);
    	            novo.setEmail(email);
    	            novo.setEmailc(emailc);
    	            novo.setSenha(senha);
    	            novo.setSenhac(senhac);

    	            listapsicologia.add(novo);
    	            
    	            TelaEmpresa TelaEmpresa = new TelaEmpresa();
    	            TelaEmpresa.executar();
    	      }
    	        
    	        if (tecla==2) {

    	            Empresa novo = new Empresa();
    	            novo.setNome(nome);
    	            novo.setCnpj(cnpj);
    	            novo.setEstado(estado);
    	            novo.setEmail(email);
    	            novo.setEmailc(emailc);
    	            novo.setSenha(senha);
    	            novo.setSenhac(senhac);

    	            listaginecologista.add(novo);
    	            
    	            TelaEmpresa TelaEmpresa = new TelaEmpresa();
    	            TelaEmpresa.executar();
    	      }
    	        if (tecla==3) {

    	            Empresa novo = new Empresa();
    	            novo.setNome(nome);
    	            novo.setCnpj(cnpj);
    	            novo.setEstado(estado);
    	            novo.setEmail(email);
    	            novo.setEmailc(emailc);
    	            novo.setSenha(senha);
    	            novo.setSenhac(senhac);

    	            listaurologia.add(novo);
    	            
    	            TelaEmpresa TelaEmpresa = new TelaEmpresa();
    	            TelaEmpresa.executar();
    	      }
    	    
    	}}
