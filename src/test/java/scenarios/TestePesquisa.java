package scenarios;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestePesquisa {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
        driver.get("https://www.apinfo.com/apinfo/inc/list4.cfm");
    }
    @Test
    public void TestePesquisa()throws InterruptedException{
    homePage.clicarAreaProfissionais();
    homePage.clicarPesquisarVagas();
    homePage.digitarPalavraChave();
    homePage.clicarPesquisarDescricao();
    homePage.clicarPesquisarPalavra();
    homePage.clicarFiltrar();





    }
}
