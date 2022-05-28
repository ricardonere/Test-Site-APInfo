package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;


    String digitarPalavraChave= "//input[@id='i-busca']";
    String clicarBuscar= "//input[@id='btn-busca']";
    String clicarConcordar= "/html/body/div[1]/div";
    String limparPesquisa= "//a[contains(text(),'Limpar Pesquisa')]";

    String digitarSegundaOcupacao= "//input[@id='keyw']";

    String clicarNovaBusca= "//input[@id='']";

    String clicarFaleConosco= "//a[contains(text(),'Fale Conosco')]";

    String clicarDuvidasProfissionais= "//a[contains(text(),'Dúvidas frequentes profissionais')]";

    String clicarDicasBomCurriculo= "//h3[contains(text(),'Como fazer um bom currículo detalhado ?')]";

    public HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }

    public void digitarPalavraChave(){
        driver.findElement(By.xpath(digitarPalavraChave)).sendKeys("QA JR");
    }

    public void clicarBuscar(){
        driver.findElement(By.xpath(clicarBuscar)).click();
    }
    public void clicarConcordar(){
        driver.findElement(By.xpath(clicarConcordar)).click();
    }
    public void limparPesquisa() throws InterruptedException {
        driver.findElement(By.xpath(limparPesquisa)).click();
    }
    public void digitarSegundaOcupacao(){
        driver.findElement(By.xpath(digitarSegundaOcupacao)).sendKeys("Desenvolvedor");
    }
    public void clicarNovaBusca(){
        driver.findElement(By.xpath(clicarNovaBusca)).click();
    }
    public void clicarFaleConosco(){
        driver.findElement(By.xpath(clicarFaleConosco)).click();
    }

    public void clicarDuvidasProfissionais(){
        driver.findElement(By.xpath(clicarDuvidasProfissionais)).click();
    }
    public void clicarDicasBomCurriculo(){
        driver.findElement(By.xpath(clicarDicasBomCurriculo)).click();
    }
}
