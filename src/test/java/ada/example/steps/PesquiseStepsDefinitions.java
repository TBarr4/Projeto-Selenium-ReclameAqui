package ada.example.steps;

import ada.example.Hooks;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class PesquiseStepsDefinitions {

    WebDriver driver = Hooks.getDriver();
    String baseUrl = "https://www.reclameaqui.com.br/";


    @Dado("que o usuário está na página inicial")
    public void usuarioNaPaginaInicial() {
        driver.get(baseUrl);
    }

    @Quando("clica na caixa de busca")
    public void clicarCaixaDeBusca() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("sc-bALXmG eLEBKx")).click();
    }

    @Entao("a categoria {string} de busca aparece")
    public void apareceCategorias(String texto) throws InterruptedException {
        Thread.sleep(4000);
        String mensagem = driver.findElement(By.className("sc-faCEWe hgZYMd react-tabs__tab--selected")).getText();
        Assertions.assertTrue(mensagem.contains(texto));
    }

    @E("digitar 'Banco Santander' na caixa de busca")
    public void digitarAPesquisa() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("sc-bALXmG eLEBKx")).sendKeys("Banco Santander");
    }

    @Entao("aparece card da empresa")
    public void apareceCard() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String mensagem = driver.findElement(By.className("alternative company-title")).getText();
        Assertions.assertTrue(mensagem.contains("Banco Santander"));
    }

    @Entao("aparece a mensagem percentual de problemas resolvidos")
    public void apareceInfo() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String mensagem = driver.findElement(By.className("sc-jJgynQ ehAFOz alternative problem")).getText();
        Assertions.assertTrue(mensagem.contains("Resolve"));
    }

    @E("Mudar para categoria 'Reclamações' para a mesma busca")
    public void mudarCategoria() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(By.id("react-tabs-2")).click();
    }

    @Entao("aparece uma reclamação sobre o banco")
    public void apareceReclamacao() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String mensagem = driver.findElement(By.className("sc-gHyekI kVhiyB")).getText();
        Assertions.assertTrue(mensagem.contains("Banco Santander"));
    }
}
