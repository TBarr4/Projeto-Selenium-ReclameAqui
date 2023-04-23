package ada.example.steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


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
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
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
    public void apareceAExplicaçãoDeComoRealizarAValidação() {
        //Assertions.assertEquals(driver.getCurrentUrl(), "https://www.reclameaqui.com.br/detector-site/");
        String mensagem = driver.findElement(By.className("go3852279214")).getText();
        Assertions.assertEquals( mensagem, "Cole aqui o link da loja ou site e descubra se ele é confiável");
    }



    @E("digitar a url de um site no campo")
    public void digitarAUrlDeUmSiteNoCampo() {
    }

    @E("clicar no botão Analisar site")
    public void clicarNoBotãoAnalisarSite() {
    }

    @Entao("aparece a mensagem {string}")
    public void apareceAMensagemNãoEncontramosInformaçõesSuspeitas() {
    }

    @Entao("deve conter os campos registro de site, origem de site, e análise do endereço de site")
    public void deveConterOsCamposRegistroDeSiteOrigemDeSiteEAnáliseDoEndereçoDeSite() {
    }

    @Entao("aparece a o botão de Analisar outro site")
    public void apareceAOBotãoDeAnalisarOutroSite() {
    }
}






/**

    @E("digitar a url de um site no campo")
    public void digitarAUrlDeUmSiteNoCampo() {
    }
    @E("clicar no botão Analisar site")
    public void clicarNoBotãoAnalisarSite() {
    }
    @Entao("aparece a mensagem {string}")
    public void apareceAMensagemNãoEncontramosInformaçõesSuspeitas() {
    }

    @Entao("aparece a explicação de como realizar a validação")
    public void apareceAExplicaçãoDeComoRealizarAValidação() {
    }

    @Entao("deve conter os campos registro de site, origem de site, e análise do endereço de site")
    public void deveConterOsCamposRegistroDeSiteOrigemDeSiteEAnáliseDoEndereçoDeSite() {
    }



*/