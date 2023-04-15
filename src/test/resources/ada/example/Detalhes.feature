/**
HG6R1 - Pesquise uma empresa
Como usuário, mesmo que não esteja logado,
Quero pesquisar por empresas
Para encontrar reclamações e avaliações da mesma
r1: Ao clicar no item de busca e não digitar um texto, deve exibir uma sugestão de categorias para o resultado da busca: empresas, reclamações, descontos e blog
r2: Ao buscar por uma empresa, deve retornar cards com empresas relacionadas ao texto buscado como nome, percentual de resolução de reclamações e nota da empresa
r3: Ao efetuar busca em uma categoria (ex: empresas) deve ser possível alternar para outra categoria (ex: reclamações) sem a necessidade digitar a busca novamente

HG6R2 - Detector de sites
Como usuário, mesmo que não esteja logado
Quero realizar validação de sites
Para validar se site é confiável ou não
r1: Na tela de detecção de sites deve haver uma breve explicação de como realizar a validação
r2: Ao analisar site, deve exibir detalhes da análise pelos critérios: Tempo de registro, Origem do site e Análise da url
r3: Caso não seja possível analisar o site, deve exibir mensagem informando para o usuário(Ex: "facebook.com") e deve sugerir analisar outro site

HG6R3 - Comparação de empresas
Como usuário, mesmo que não esteja logado
Quero comparar empresas
Para saber qual é mais confiável
r1: Deve ser possível adicionar até 3 empresas
r2: Em cada card deve ter informações básicas sobre a empresa como nota, percentual de respostas, entre outros
r3: Na parte inferior do card deve exibir lista de principais reclamações da empresa

HG6R4 - Informações de empresas
Como usuário, mesmo que não esteja logado
Quero visualizar informações detalhadas sobre a empresa
Para avaliar a empresa
r1: Na tela de detalhes da empresa deve ter um card do lado esquerdo com a reputação da empresa
r2: Deve haver uma sessão "O que estão falando sobre a empresa" com as ultimas reclamações
r3: Na tela de detalhes da empresa, ao selecionar "Principais problemas" deve exibir os principais problemas da empresa com percentual de cada um em relação ao total

*/

Feature: An example

  Scenario: The example
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes
