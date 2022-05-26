package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    String botaoAcessoProfissionais= "//a[contains(text(),'Profissionais')]";

    String botaoPesquisarVagas= "//body/div[3]/div[1]/nav[1]/section[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]";

    String digitarPalavraChave= "//input[@id='keyw']";

    String clicarPesquisarDescricao= "//input[@id='radio4']";

    String clicarPesquisarPalavra= "//input[@id='radio2']";

    String clicarFiltrar= "//input[@id='']";

    public HomePage(WebDriver driverDoTeste) {
        this.driver = driverDoTeste;
    }
    public void clicarAreaProfissionais(){
        driver.findElement(By.xpath(botaoAcessoProfissionais)).click();
    }
    public void clicarPesquisarVagas(){
        driver.findElement(By.xpath(botaoPesquisarVagas)).click();
    }
    public void digitarPalavraChave(){
        driver.findElement(By.xpath(digitarPalavraChave)).sendKeys("QA JR");
    }
    public void clicarPesquisarDescricao(){
        driver.findElement(By.xpath(clicarPesquisarDescricao)).click();
    }
    public void clicarPesquisarPalavra(){
        driver.findElement(By.xpath(clicarPesquisarPalavra)).click();
    }
    public void clicarFiltrar(){
        driver.findElement(By.xpath(clicarFiltrar)).click();
    }
    //https://www.apinfo.com/apinfo/inc/list4.cfm          site

}
