#language: pt

Funcionalidade: Searcher de Sites

Como usuário, mesmo que eu não esteja logado,
Quero poder pesquisar por empresas
Para encontrar avaliações e notas sobre elas.

Contexto:
Dado que estou na página inicial

Cenário: Sugestões de pesquisa devem aparecer quando nenhum texto for inserido
Quando clico no item de pesquisa
E não digito nenhum texto
Então devo ver uma sugestão de categorias para o resultado da busca
E as categorias devem incluir empresas, reclamações, descontos e blog

Cenário: Pesquisar por uma empresa
Quando pesquiso por uma empresa
Então devo ver cards com empresas relacionadas ao texto pesquisado
E os cards devem incluir o nome, percentual de resolução de reclamações e nota da empresa

Cenário: Alternar categorias sem precisar pesquisar novamente
Dado que realizei uma pesquisa em uma categoria
Quando alterno para outra categoria
Então devo ver os resultados para a nova categoria
E não preciso digitar o texto de pesquisa novamente