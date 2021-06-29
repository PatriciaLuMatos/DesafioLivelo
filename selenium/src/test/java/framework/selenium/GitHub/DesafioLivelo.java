package framework.selenium.GitHub;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesafioLivelo {
	
	static WebDriver driver;		
	public static void main(String[] args) {
		AdicionarCarrinho();
	
	}
	public static void AdicionarCarrinho() {
		
//Abrir Navegador Chrome
	System.getProperty("webdriver.Chrome.driver", "C:/chromedriver.exe");
	driver = new ChromeDriver();

//Acessar loja Livelo e escolher um item
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.livelo.com.br");
	driver.findElement(By.xpath("//*[@id=\"input-search\"]")).sendKeys("Smartphone Motorola Moto G20 Azul 64GB, 4GB RAM, Tela de 6.5”, Câmera Traseira Quádrupla, Android 11 e Processador Octa Core");
	driver.findElement(By.id("span-searchIcon")).click();
	
//Incluir o item escolhido no carrinho	
	driver.findElement(By.cssSelector("div:nth-child(3) > .icon-x")).click();
    driver.findElement(By.id("CC-product-list-name-LVL32595079-00")).click();
    driver.findElement(By.id("cc-prodDetails-addToCart")).click();
}
}