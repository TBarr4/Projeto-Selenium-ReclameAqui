#language: pt

@Funcional

Funcionalidade: Informações de empresas

  @Regression
  @Smoke
  Cenario: Usuario vai na página inicial, e mesmo não logado, consegue pesquisar uma empresa
    Dado que o usuário esta na pagina inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    Entao deve aparecer um card do lado esquerdo com a reputacao da empresa

  @Regression
  @Smoke
  Cenario: Ao pesquisar uma empresa, deve haver uma sessão "o que estão falando sobre a empresa" com as últimas reclamações
    Dado que o usuário está na página inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    Entao deve aparecer um campo O que estao falando sobre

  @Regression
  @Smoke
  Cenario: Na tela de detalhes da empresa, ao selecionar "Principais problemas" deve exibir os principais problemas da empresa com percentual de cada um em relação ao total
    Dado que o usuário está na página inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    E clicar no icone de principais problemas
    Entao deve exibir o percentual dos principais problemas

  @Regression
  Cenario: Na tela de detalhes da empresa, deve exibir o botão de Reclamar
    Dado que o usuário está na página inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    Entao deve exibir o botao de Reclamar

  @Ignore
  Cenario: Na tela de detalhes da empresa, deve exibir o campo com contatos da empresa
    Dado que o usuário está na página inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    Entao deve aparecer um campo Contatos da empresa

  @Ignore
  Cenario: Na tela de detalhes da empresa, deve exibir o menu de reclamações, com filtros: Últimas, Não respondidas, Respondidas, Avaliadas
    Dado que o usuário está na página inicial
    Quando digitar o nome da empresa {string}
    E clicar enter ou na lupa de pesquisa
    E clicar no card da empresa
    Entao deve aparecer um campo menu de filtro para reclamacoes