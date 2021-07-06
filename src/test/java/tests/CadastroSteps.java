package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Elementos;
import pages.Metodos;

public class CadastroSteps {

	Metodos metodo = new Metodos();
	Elementos account = new Elementos();

	@Given("que esteja na tela de cadastro de cliente")
	public void que_esteja_na_tela_de_cadastro_de_cliente() {

		metodo.abrirNavegador("http://advantageonlineshopping.com/", "CHROME", "acessando site da loja");
	}

	@When("informar todos os dados obrigatorios")
	public void informar_todos_os_dados_obrigatorios() {

		account.criarConta("teste1@teste.com.br", "Moni@123", "Moni@123", "Jarval", "Cardoso", "11940053248", "Brazil",
				"São Paulo", "Rua João Rodrigues Chaves", "SP", "02834170");
	}

	@Then("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() {

		account.validarUser();
	}
}