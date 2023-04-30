#language: pt

  @Funcional


Funcionalidade: Pesquisar Sites

  @Regression
  @Smoke
  Cenario: Ao clicar na caixa de busca deve haver opções de categorias para busca
    Dado que o usuário está na página inicial
    Quando clicar na caixa de busca
    Entao aparece categoria de busca <categoria>

 Exemplos:
      | categoria     |
      | "Empresas"      |
      | "Reclamações"      |
      | "Descontos"      |
      | "Blog"      |

  @Regression   
  @Smoke
  Esquema do Cenario: Ao apenas digitar "Banco Santander" na caixa de busca, deve retornar card sobre essa empresa com algumas informações básicas 
    Dado que o usuário está na página inicial
    Quando clicar na caixa de busca
    E digitar "Banco Santander"
    Entao aparece a mensagem percentual de problemas resolvidos "Resolve % dos problemas


  @Regression
  @Smoke
  Cenario: Mudar categoria para mesma busca e identificar Reclamações sobre o Banco Santander
    Dado que o usuário está na página inicial
    Quando clicar na caixa de busca
    E digitar "Banco Santander"
    E mudar para categoria "Reclamações"
    Entao aparece uma reclamação sobre o banco