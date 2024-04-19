package iterasys;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// ctrl + shift + "o" para importar funcionalidades automaticamente

public class Consulta {
	
	String url;
	WebDriver driver;
	
	
	@Before
	public void iniciar() {
		// Estabelece url de pesquisa
		url = "https://iterasys.com.br/pt/cursos-de-teste-e-qa/";
		// Chrome drive estabelecido como variável de ambiente
		driver = new ChromeDriver();
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	
	@Given("^cliente acessa site Iterasys$")
	public void cliente_acessa_site_Iterasys() throws Throwable {
	    driver.get(url);
	}
	
	@When("^clicar no card do curso \"([^\"]*)\"$")
	public void clicar_no_card_do_curso(String arg1) throws Throwable {
	    driver.findElement(By.cssSelector("div.feature-nav-hover")).click();
	}
	
	@Then("^apresenta pagina do curso na Udemy$")
	public void apresenta_pagina_do_curso_na_Udemy() throws Throwable {
		assertTrue("Título da página está incorreto!", driver.getTitle().contentEquals("Início Rápido em Teste e QA"));
		Thread.sleep(3000);
	}
}
