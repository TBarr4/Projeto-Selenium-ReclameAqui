#language: pt

Funcionalidade: Detector de Sites

  Cenario: Usuario vai na página Detector de Site Confiável e deve haver uma breve explicação de como realizar a validação
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    Entao aparece a explicação de como realizar a validação

  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que é confiável
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Não encontramos informações suspeitas.'

  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que está fora do ar
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Atenção! Este site está fora do ar'

  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que recebe mensagem de atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Encontramos 1 informação que pode exigir atenção.'

  Cenario: Usuario vai na página Detector de Site Confiável e pesquisa um site que recebe mensagem de atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao aparece a mensagem 'Encontramos 2 informações que podem exigir atenção.'

  Cenario: Usuario vai na página Detector de Site Confiável e ao pesquisar um site deve exibir detalhes da análise pelos critérios: Tempo de registro, Origem do site e Análise da url que recebe mensagem de atenção
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao deve conter os campos registro de site, origem de site, e análise do endereço de site

  Cenario: Usuario vai na página Detector de Site Confiável e caso não seja possível analisar o site, deve exibir mensagem informando para o usuário e deve sugerir analisar outro site
    Dado que o usuário está na página inicial
    Quando clicar no Detector de Site Confiável
    E digitar a url de um site no campo
    E clicar no botão Analisar site
    Entao aparece a o botão de Analisar outro site