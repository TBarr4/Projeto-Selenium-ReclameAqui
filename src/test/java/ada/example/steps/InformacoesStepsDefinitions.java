package ada.example.steps;

import ada.example.Hooks;
import org.openqa.selenium.WebDriver;

/**
 * HG6R4 - Informações de empresas
 * Como usuário, mesmo que não esteja logado, quero visualizar informações detalhadas sobre a empresa, para avaliar a empresa.
 *
 * r1: Na tela de detalhes da empresa deve ter um card do lado esquerdo com a reputação da empresa
 * r2: Deve haver uma sessão "O que estão falando sobre a empresa" com as ultimas reclamações
 * r3: Na tela de detalhes da empresa, ao selecionar "Principais problemas" deve exibir os principais problemas da empresa com percentual de cada um em relação ao total
 *
 */

public class InformacoesStepsDefinitions {

    WebDriver driver = Hooks.getDriver();
    String baseUrl = "https://www.reclameaqui.com.br/";

}
