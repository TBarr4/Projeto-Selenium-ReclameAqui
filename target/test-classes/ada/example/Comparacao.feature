#language: pt

@Funcional

Funcionalidade: Informações de empresas

  @Ignore
  Cenario: Usuario vai na pagina de Compare, e mesmo não logado, aparece o botão adicionar empresa para comparar
    Dado que o usuário esta na pagina inicial
    Quando clica no botao Compare
    Entao aparece o botão Adicionar para comparar empresas

  @Regression
  @Smoke
  Esquema do Cenario: Na página de Compare, é possível adicionar até 3 empresas para comparação
    Dado que o usuário está na página inicial
    Quando clica no botao Compare
    E digitar a empresa {string}
    E confirmar a empresa na lista que aparece
    E clicar no botão Adicionar
    Entao finaliza o processo exibindo as 3 empresas

    Exemplos:
      | url     |
      | "CVC"   |
      | "HURB"      |
      | "Decolar"   |

  @Regression
  Cenario: Em um card deve ter informações básicas sobre a empresa como nota, percentual de respostas, entre outros
  Esquema do Cenario: Na página de Compare, é possível adicionar até 3 empresas para comparação
    Dado que o usuário está na página inicial
    Quando clica no botao Compare
    E digitar a empresa 'Claro'
    E confirmar a empresa na lista que aparece
    E clicar no botão Adicionar
    Entao deve aparecer o card da empresa com as informacoes

  @Regression
  Cenario: Na parte inferior de um card deve exibir lista de principais reclamações da empresa
  Esquema do Cenario: Na página de Compare, é possível adicionar até 3 empresas para comparação
    Dado que o usuário está na página inicial
    Quando clica no botao Compare
    E digitar a empresa 'CVC'
    E confirmar a empresa na lista que aparece
    E clicar no botão Adicionar
    Entao na parte inferior do card deve aparecer a lista Principais Problemas
