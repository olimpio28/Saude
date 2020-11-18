package Tela;

import java.util.Scanner;

import Registro.Cadastro;
import Registro.Login;

public class TelaInicial {
	
	public static void main(String[] args) {
		 {
			
			try (Scanner teclado = new Scanner(System.in)) {
				int si = 0;
				  
				  System.out.println("1- Login");
				  System.out.println("2- Cadastre-se");
				  
				  System.out.println("Digite uma opção: ");
				  si = teclado.nextInt();
				
			 if (si==1) {
				 	Login Login = new Login();
					Login.executar();				  
				  }

			 if (si==2) {
					Cadastro Cadastro = new Cadastro();
					Cadastro.executar();
				  }
		}}


	}

}
