package ada.example.steps;

import ada.example.Hooks;
import org.openqa.selenium.WebDriver;

/**
 * Comparação de empresas
 * Como usuário, mesmo que não esteja logado, quero comparar empresas, para saber qual é mais confiável.
 *
 * r1: Deve ser possível adicionar até 3 empresas
 * r2: Em cada card deve ter informações básicas sobre a empresa como nota, percentual de respostas, entre outros
 * r3: Na parte inferior do card deve exibir lista de principais reclamações da empresa
 */

public class ComparacaoStepsDefinitions {

    WebDriver driver = Hooks.getDriver();
    String baseUrl = "https://www.reclameaqui.com.br/";


}
