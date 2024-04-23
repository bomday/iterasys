package iterasys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// ctrl + shift + "o" para importar funcionalidades automaticamente

public class Consulta {
	
	String url;
	String originalHandle;
	WebDriver driver;
	
	@io.cucumber.java.Before
	public void iniciar() {
		// Estabelece url de pesquisa
		url = "https://iterasys.com.br/pt/cursos-de-teste-e-qa/";
		
		// Chrome drive estabelecido como variável de ambiente
		driver = new ChromeDriver();
		
		// Maximiza tela do chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@io.cucumber.java.After
	public void finalizar() {
		driver.quit();
	}
	
	@io.cucumber.java.en.Given("^cliente acessa site Iterasys$")
	public void cliente_acessa_site_Iterasys() throws Throwable {
		// Acessa URL
	    driver.get(url);
	    Thread.sleep(3000);
	}
	
	@io.cucumber.java.en.When("^clicar no card do curso \"([^\"]*)\"$")
	public void clicar_no_card_do_curso(String arg1) throws Throwable {
		// Aceita cookies da página
		driver.findElement(By.xpath("//span[contains(text(), 'ACEITAR')]")).click();
		
		// Captura o identificador da aba original
	    originalHandle = driver.getWindowHandle();
		
		// Clica no card do curso
	    driver.findElement(By.cssSelector("div.feature-nav-hover")).click();
	    Thread.sleep(3000);
	}
	
	@io.cucumber.java.en.Then("^apresenta pagina do curso na Udemy$")
	public void apresenta_pagina_do_curso_na_Udemy() throws Throwable {
		// Espera para que nova página seja aberta
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Reconhece janelas abertas
        Set<String> handles = driver.getWindowHandles();
        
        // Troca para a nova aba
        for (String handle : handles) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

	    // Recebe nova URL como valor
	    String currentUrl = driver.getCurrentUrl();

	    // Checa se URL atual é a esperada
	    assertTrue(currentUrl.contains("udemy.com"));

	    // Checa se título da página é "Início Rápido em Teste e QA"
	    assertEquals("Início Rápido em Teste e QA", driver.findElement(By.cssSelector("h1.ud-heading-xl.clp-lead__title.clp-lead__title--small")).getText());
	    Thread.sleep(3000);
	}
}
