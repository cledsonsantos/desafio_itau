<h1 align="center"> Desafio ITAU - The Cap API</h1>


## :hammer: Objetivo do Projeto:
  Criar uma aplicação na linguagem que desejar para coletar as seguintes informações da API de Gatos (https://thecatapi.com/):
  

- `a.`: 	Para cada uma das raças de gatos disponíveis, armazenar as informações de origem, temperamento e descrição em uma base de dados. (se disponível)
- `b.`:	Para cada uma das raças acima, salvar o endereço de 3 imagens em uma base de dados. (se disponível)
- `c.`:	Salvar o endereço de 3 imagens de gatos com chapéu.
- `d.`:	Salvar o endereço de 3 imagens de gatos com óculos.


## :hammer: Funcionalidades do projeto

- `Funcionalidade 1`: Foi cria uma API para consumir a API https://api.thecatapi.com/. 
-  
- Salvando automaticamente na base de dados:

- `` As raças de gatos disponíveis, armazenando as informações de origem, temperamento e descrição em uma base de dados:``
- `` O endereço de 3 imagens de gatos com chapéu.``
- `` O endereço de 3 imagens de gatos com óculos.``

## :hammer: Arquitetura:
Neste trabalho foi usado a arquitetura MVC.
## ✔️ Técnicas e tecnologias utilizadas

- ``Java 8``
- ``Spring Boot``
- ``Eclipse``
- ``PostgreSql``
- ``jUnit``
- ``openfeign``
- ``lombok``
- ``modelmapper``

## ✔️ Documentação de Implantação e USO do sistema:
- ``1.	Baixe os projetos ( serverapicat e clientapicat )``
- ``2.	Importe os dois projetos (serviços) no eclipse``
- ``3.	Tenha instalado na sua máquina local o Postgresql ( username=postgres e password=root)``
- ``4.	Crie um banco de dados chamado: catbreed``
- ``5.	Execute a classe ServerapicatApplication do serviço: serverapicat.
Nesse momento será consumido a https://api.thecatapi.com/ , gravando no banco toda a listagem de gatos, mais de 3 imagens de gatos com chapéu e de 3 imagens de gatos com óculos
- ``6.	Execute a classe ClientapicatApplication do serviço: clientapicat.
Neste momento, as APIS criadas já poderão ser consumidas.

- Endpoints:
- `1.`:	"http://localhost:8081/breeds"
- `2.`:	"http://localhost:8081/breeds/id/{id}"
- `3.`:	"http://localhost:8081/breeds/temp/{temperament}"
- `4.`:	"http://localhost:8081/breeds/ori/{origin}"

