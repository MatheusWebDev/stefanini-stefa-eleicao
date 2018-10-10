Páginas HTML
  - contabilizar os votos => página de votação
  - exibir total de votos => página de resultado

Controller do AngularJS => controlar objetos entre HTML e Rest
  - votacao.controller.js

Service do AngularJS => envar dados para controller java
  - votacao.service.js

Em *VotacaoController.java*
  - Criar o método rest do tipo POST para cadastrar o voto
  - Criar o método rest de retorno dos votos por candidato

Criar o método da camada BO

*DTO* => modelo da entidade
*Banco de Memoria* => ações sobre um DTO (grava,pesquisa,lista...)
*BO* => eviar os dados para as ações para o *Banco de Memoria*
*Controller* => ponte entre a visão (front-end[angular]) e o *BO*