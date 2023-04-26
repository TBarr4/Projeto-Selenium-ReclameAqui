#language: pt

  @Funcional


Funcionalidade: Detector de Sites

  @Regression
  @Smoke
  Cenario: Usuario vai na página Detector de Site Confiável e deve haver uma breve explicação de como realizar a validação
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    Entao aparece a explicação de como realizar a validação

  @Ignore
  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que é confiável
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'uol.com.br' de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Não encontramos informações suspeitas.'

  @Ignore
  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que está fora do ar
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'stonks.com.br' de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'fora do ar'

  @Ignore
  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que recebe mensagem de 1 atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'cascata.com' de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Encontramos 1 informação que pode exigir atenção.'

    @Ignore
  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que recebe mensagem de 2 atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'mandioquinha.com' de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Encontramos 2 informações que podem exigir atenção.'

    @Regression
    @Smoke
  Cenario: Usuario vai na página Detector de Site Confiável e ao pesquisar um site deve exibir detalhes da análise pelos critérios: Tempo de registro, Origem do site e Análise da url que recebe mensagem de atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'odontobrindes.com.br' de um site no campo
    E clicar no botão Analisar site
    Entao deve conter os campos registro de site, origem de site, e análise do endereço de site

    @Regression
    @Smoke
  Cenario: Usuario vai na página Detector de Site Confiável e caso não seja possível analisar o site, deve exibir mensagem informando para o usuário e deve sugerir analisar outro site
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url 'stonks.com.br' de um site no campo
    E clicar no botão Analisar site
    Entao aparece a o botão de Analisar outro site

    @Regression
    @Smoke
  Esquema do Cenario: Login com schema de cenarios
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url <url>
    E clicar no botão Analisar site
    Entao aparece a mensagem <msg>

    Exemplos:
      | url     | msg        |
      | "mandioquinha.com"      | "Encontramos 2 informações que podem exigir atenção."      |
      | "cascata.com"      | "Encontramos 1 informação que pode exigir atenção."      |
      | "uol.com.br"      | "Não encontramos informações suspeitas."      |
      | "stonks.com.br"      | "Atenção! Este site está fora do ar"      |