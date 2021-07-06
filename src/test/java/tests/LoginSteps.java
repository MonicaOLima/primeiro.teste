package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Elementos;
import pages.Metodos;

public class LoginSteps extends Elementos {
	
	Metodos metodo = new Metodos();
	Elementos account = new Elementos();
	
	@Given("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		metodo.abrirNavegador("http://advantageonlineshopping.com/", "CHROME", "acessando site da loja");
	}

	@When("informar usuario valido")
	public void informar_usuario_valido() {
		
		account.preencher();
	}

	@When("senha invalida")
	public void senha_invalida() {
		account.preencher();
	}

	@Then("visualizo a mensagem Invalid credentials")
	public void visualizo_a_mensagem_invalid_credentials() {
		metodo.screenShot("teste");
	    metodo.fechar("teste finalizado");
	}

}
