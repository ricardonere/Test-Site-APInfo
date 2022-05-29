package scenarios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.VagasPage;

import java.util.concurrent.TimeUnit;

public class TesteVagas {
    WebDriver driver;
    VagasPage vagasPage;

    @Before
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        vagasPage = new VagasPage(driver);
        driver.get("https://www.apinfo.com/apinfo/");
    }

    @Test
    public void TesteVagas() throws InterruptedException {

        vagasPage.clicarConcordar();
        vagasPage.pesquisarCurriculo();
        vagasPage.palavraChave();
        vagasPage.filtrar();
        vagasPage.selecionarCurriculo();
        vagasPage.voltarALista();
        vagasPage.clicarSegundoCurriculo();
        vagasPage.clicarInformacao();
        vagasPage.pesquisaProfMaisRequisitados();
        vagasPage.pesquisarSalariosMercado();
        vagasPage.pesquisarLinguagensMaisUtilizadas();
    }
}