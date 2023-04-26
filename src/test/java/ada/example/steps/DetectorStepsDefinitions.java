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


/**
 HG6R2 - Detector de sites
 Como usuário, mesmo que não esteja logado
 Quero realizar validação de sites
 Para validar se site é confiável ou não
 r1: Na tela de detecção de sites deve haver uma breve explicação de como realizar a validação
 r2: Ao analisar site, deve exibir detalhes da análise pelos critérios: Tempo de registro, Origem do site e Análise da url
 r3: Caso não seja possível analisar o site, deve exibir mensagem informando para o usuário(Ex: "facebook.com") e deve sugerir analisar outro site

 */

public class DetectorStepsDefinitions {

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

    @Dado("que o usuário está na página inicial")
    public void queOUsuárioEstáNaPáginaInicial() {
        driver.get(baseUrl);
    }
    @Quando("clicar no Detector de Site Confiável")
    public void clicarNoDetectorDeSiteConfiável() {
        driver.findElement(By.xpath("//*[@id=\"homeConsumerShortcutList\"]/div[2]/div/a[3]")).click();
    }

    @Entao("aparece a explicação de como realizar a validação")
    public void apareceAExplicaçãoDeComoRealizarAValidação() throws InterruptedException {
        Thread.sleep(2000);
        //Assertions.assertEquals(driver.getCurrentUrl(), "https://www.reclameaqui.com.br/detector-site/");
        String mensagem = driver.findElement(By.className("go3852279214")).getText();
        Assertions.assertEquals( mensagem, "Cole aqui o link da loja ou site e descubra se ele é confiável");

    }

    @E("digitar a url {string} de um site no campo")
    public void digitarAUrlDeUmSiteNoCampo(String site) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("dZYaIm")).sendKeys(site);
    }

    @E("clicar no botão Analisar site")
    public void clicarNoBotãoAnalisarSite() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("go3502579223")).click();
    }

    @Entao("aparece a mensagem {string}")
    public void apareceAMensagemNãoEncontramosInformaçõesSuspeitas(String texto) throws InterruptedException {
        Thread.sleep(4000);
        String mensagem = driver.findElement(By.className("go1086141068")).getText();
        Assertions.assertTrue(mensagem.contains(texto));
    }


    @Entao("deve conter os campos registro de site, origem de site, e análise do endereço de site")
    public void deveConterOsCamposRegistroDeSiteOrigemDeSiteEAnáliseDoEndereçoDeSite() throws InterruptedException {
        Thread.sleep(6000);
        boolean registroDeSite = driver.findElement(By.className("go2716339389")).isDisplayed();
        Assertions.assertTrue(registroDeSite);
        boolean origemDoSite = driver.findElement(By.className("go2716339389")).isDisplayed();
        Assertions.assertTrue(origemDoSite);
        boolean analiseDoSite = driver.findElement(By.className("go2716339389")).isDisplayed();
        Assertions.assertTrue(analiseDoSite);


    }

    @Entao("aparece a o botão de Analisar outro site")
    public void apareceAOBotãoDeAnalisarOutroSite() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.className("go3775204054")));
        boolean novaPesquisa = driver.findElement(By.className("go3775204054")).isDisplayed();
        Assertions.assertTrue(novaPesquisa);
    }

    @E("digitar a url {string}")
    public void digitarAUrlUrl(String site) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.className("dZYaIm")).sendKeys(site);
    }


}



