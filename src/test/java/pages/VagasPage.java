package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VagasPage {
    WebDriver driver;

    String clicarConcordar= "/html/body/div[1]/div";
    String pesquisarCurriculo= "//a[contains(text(),'Pesquise curriculos de profissionais fluentes em i')]";

    String palavraChave= "//body/div[4]/div[1]/div[1]/form[1]/input[3]";

    String filtrar= "//body/div[4]/div[1]/div[1]/form[1]/div[1]/input[1]";

    String selecionarCurriculo= "//a[contains(text(),'413.753')]";

    String voltarALista= "//body/div[4]/div[1]/div[1]/center[5]/input[1]";

    String clicarSegundoCurriculo= "//a[contains(text(),'502.246')]";

    String clicarInformacao= "//body/div[3]/div[1]/nav[1]/section[1]/ul[1]/li[3]/a[1]";

    String pesquisaProfMaisRequisitados= "//a[contains(text(),'Prof mais requisitados')]";

    String pesquisarSalariosMercado= "//a[contains(text(),'Clique aqui e veja a pesquisa : Salários e mercado')]";

    String pesquisarLinguagensMaisUtilizadas= "//a[contains(text(),'Linguagens de programação mais utilizadas')]";

    public VagasPage(WebDriver driverDoTeste) {
            this.driver = driverDoTeste;
    }

    public void clicarConcordar(){
        driver.findElement(By.xpath(clicarConcordar)).click();
    }
    public void pesquisarCurriculo(){
        driver.findElement(By.xpath(pesquisarCurriculo)).click();
    }
    public void palavraChave(){
        driver.findElement(By.xpath(palavraChave)).sendKeys("product owner");
    }
    public void filtrar(){
        driver.findElement(By.xpath(filtrar)).click();
    }
    public void selecionarCurriculo(){
        driver.findElement(By.xpath(selecionarCurriculo)).click();
    }
    public void voltarALista(){
        driver.findElement(By.xpath(voltarALista)).click();
    }
    public void clicarSegundoCurriculo(){
        driver.findElement(By.xpath(clicarSegundoCurriculo)).click();
    }
    public void clicarInformacao() throws InterruptedException {
        driver.findElement(By.xpath(clicarInformacao)).click();
        Thread.sleep( 3000);
    }
    public void pesquisaProfMaisRequisitados(){
        driver.findElement(By.xpath(pesquisaProfMaisRequisitados)).click();
    }
    public void pesquisarSalariosMercado(){
        driver.findElement(By.xpath(pesquisarSalariosMercado)).click();
    }
    public void pesquisarLinguagensMaisUtilizadas(){
        driver.findElement(By.xpath(pesquisarLinguagensMaisUtilizadas)).click();
    }
    }
    //https://www.apinfo.com/apinfo/














