package qts_aps2_testes;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAPS {
    
      static WebDriver driver = null;
      
      private static String namePaginaPrincipal ;
    
      public TesteAPS() {}
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        namePaginaPrincipal = driver.getWindowHandle();
    }
    
    @Test
    public void testCamposValidos(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("21");
        salvar.click();
         
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
        alert.accept();
         
         
    }
    
    @Test
    public void testNomeVazio(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("21");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Preencha o campo nome"));
    }
    
    @Test
    public void testEnderecoVazio(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("21");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Preencha o campo endereco"));
    }
    
    @Test
    public void testSexoVazio(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("");
        campoIdade.sendKeys("21");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Selecione um valor para o campo sexo"));
    }
    
    @Test
    public void testIdadeVazia(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Preencha o campo idade, somente com numeros"));
    }
    
    @Test
    public void testIdadeComLetras(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("vinte e um");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Preencha o campo idade, somente com numeros"));
    }
    @Test
    public void testIdadeAbaixoDeZero(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
        
    	WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
        WebElement salvar = driver.findElement(By.id("salvar"));
        campoNome.sendKeys("mariana");
        campoEndereco.sendKeys("gravatai");
        campoSexo.sendKeys("f");
        campoIdade.sendKeys("-1");
        salvar.click();
         
        String mensagemErro =  driver.getPageSource();
        Assert.assertTrue(mensagemErro.contains("Preencha o campo idade com valores acima de 0"));
    }
    @Test
    public void testValidaTituloPag(){
    	driver.get("C:\\Users\\Mariana\\eclipse-workspace\\qts_aps2\\src\\trabalhoAPS.html");
    	String tituloExperado ="Trabalho 2-1"; 
        
      Assert.assertEquals(tituloExperado,driver.getTitle());
    }
}