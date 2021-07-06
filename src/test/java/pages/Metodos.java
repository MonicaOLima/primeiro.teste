package pages;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {
	
	private static final String RandomStringUtils = null;
	public static WebDriver driver;
	
	public void abrirNavegador(String site, String navegador, String descricao) {
		try {
			if (navegador == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
			} else {
				System.out.println("Opção inválida digitar CHROME");
			}
		} catch (Exception e) {
			System.out.println("***** error ***** no passo " + descricao + " " + e.getMessage());
		}

	}

	public void clicar(By elemento, String descricao) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("***** error ***** no passo " + descricao + " " + e.getMessage());
		}

	}
	
	public void escrever(By elemento, String texto, String descricao) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.out.println("***** error ***** no passo " + descricao + " " + e.getMessage());
		}

	}
	
	public void pausa(int tempo, String descricao) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			System.out.println("***** error ***** no passo " + descricao + " " + e.getMessage());
		}

	}
	
	public void fechar(String descricao) {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("****** error ****** no passo " + descricao + " " + e.getMessage());
		}
	}
	
	private static Random rand = new Random();
	private static char[] letras = "abcdefghijlmnopqrstuvxz".toCharArray();

	public String getNome() {

		StringBuffer generatedString = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			int ch = rand.nextInt(letras.length);
			generatedString.append(letras[ch]);
		}
		return generatedString.toString();
	}
	
	public void esperarElemento(By elemento, String descricao) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

		} catch (Exception e) {
			System.out.println("***** error ***** no passo " + descricao + " " + e.getMessage());
		}
	}
	
	public void screenShot(String nome) {
		   try{
		   TakesScreenshot scrShot = ((TakesScreenshot) driver);
		   File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		   File destFile = new File("./Evidencias/" + nome + ".png");
		   FileUtils.copyFile(srcFile, destFile);
		   
		}catch (Exception e) {
		  System.out.println("------ erro ao tirar screenshot ------" + e.getMessage());
		}
	}

		
	}



