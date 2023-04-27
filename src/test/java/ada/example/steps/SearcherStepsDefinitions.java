package ada.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearcherStepsDefinitions {

    WebDriver driver;
    String baseUrl = "https://www.reclameaqui.com.br/";

    @Before
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Dado("que o usuário acessa a página inicial")
    public void queOUsuarioEstaNaPaginaInicial() {
        driver.get(baseUrl);
    }

    @Quando("o usuário clica no campo de busca")
    public void oUsuarioClicaNoCampoDeBusca() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("ssc-bALXmG eLEBKx")).click();
    }

   
    }
