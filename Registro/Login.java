package Registro;

import java.util.Scanner;

import Tela.TelaUsuario;

public class Login {
	
    Scanner in = new Scanner(System.in);
    String email,senha;
    
    public void executar() {

    	
        System.out.println("Login: ");
        String login = in.nextLine();
	 
        System.out.println("Senha: ");
        String senha = in.nextLine();
        if(login.equals("Andre") && senha.equals("Engenharia")){
            System.out.printf("Usuário %s logado com sucesso.\n", login);
            TelaUsuario TelaUsuario = new TelaUsuario();
            TelaUsuario.executar();
}
        else
        {
            System.out.println("Login ou senha inválidos!");
		 	Login Login = new Login();
			Login.executar();	
        }
}}
