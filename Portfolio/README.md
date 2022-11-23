# Beatriz Medeiros de Oliveira Santos

## Introdução

Olá, sejam bem-vindos!!

Sou Beatriz Medeiros de Oliveira Santos (mais conhecida por Bea), estudante de Banco de Dados pela FATEC Prof. Jessen Vidal no período noturno. 

Tenho 20 anos e trabalho como estagiária na empresa Sophia, responsável por Gestão de Escolas e Bibliotecas. <br/>

<img src="https://user-images.githubusercontent.com/74321890/200823701-ea0c19fc-e79b-4e1d-9361-1d8fa1cade6a.jpg" width="300"/>

##### *Figura 00. Eu*

### Meus principais conhecimentos

#### Java
<p align="justify">
Na faculdade, ficamos reponsáveis por trabalhar com back-end e uma das principais linguagens aprendidas e requisitadas foi Java.

Utilizamos para o desenvolvolvimento de API's e serviços com o auxílio do framework Spring Boot e também do framework Hibernate. 

Por conta desta experiência, Java e seu ecossistema para desenvolvimento web é onde possuo maior contato. 

#### Javascript
<p align="justify">
JavaScript foi uma linguagem que aprendi ainda antes da graduação. Meu primeiro estágio (técnico em informática) na Embraer possibilitou que eu trabalhasse com JavaScript junto com o framework React.

Trabalhei por 1 ano e 8 meses com UX, front-end e requisições HTTP, desenvolvendo uma plataforma web que tem como objetivo automatizar e facilitar a visualização de
máquinas e processos para os operadores.

#### Projetos Integradores durante a graduação
<p align="justify">
Durante a minha gradução, trabalhei no desenvolvimento de trabalhos chamados de "Projetos integradores". Um projeto integrador tem o objetivo de solucionar um problema
do mundo real, utilizando os conhecimentos adquiridos durante a graduação.<br/>

Abaixo todos estes projetos serão descritos, detalhando o problema, solução proposta (e entregue), e os aprendizados extraídos de cada um deles.

# Projeto 1: 1º Semestre de 2021


### Parceiro Acadêmico
Fatec Prof. Jessen Vidal (proposta realizada pelo docente responsável pela disciplina que ordenou o projeto)


### Visão do Projeto

Desenvolver um sistema de Vending Machine, criando a tela de interface com o cliente, onde seria realizada a seleção e compra de produtos. Após este processo, o aplicativo desenvolvido deveria enviar um sinal ao hardware da máquina de vendas, que liberaria o acesso ao produto adquirido. Fora destes momentos, o acesso aos produtos deveria permanecer restrito, trancado pelos dispositivos.


### Tecnologias adotadas na solução

#### Interface com o usuário - App Inventor

A interface com o cliente foi realizada através de uma tela de smartphone, que simulava o display da vending machine. Um aplicativo desenvolvido através da ferramenta App Inventor, para o sistema operacional Android, provia ao usuário final as telas de seleção de produtos e finalização de compra.

A programação nesta plataforma se dá em blocos. Diversos recursos de linguagens de programação tradicionais (condições, loops e operações) em blocos ilustrativos, que tornam a construção de rotinas e lógicas visuais e, desta forma, mais intuitivas.

Por conta desta natureza da ferramenta - [App Inventor](https://appinventor.mit.edu/) - não há código fonte a ser disponibilizado.



#### Arduino 

O funcionamento da vending machine foi construído utilizando o Arduino, com a placa central e dois periféricos. Um servo motor e um módulo Bluetooth HC-05.

O Arduino é uma plataforma de prototipagem. Usualmente, ao falar em "Arduino", nos remetemos a placa central que liga diversos dispositivos que são interligados por ela.

Entretanto, o Arduino como plataforma vai um pouco além, pois também fornece diversos recursos - comunicação Serial, alimentação elétrica, periféricos da propria plataforma, etc - que facilitam a prototipagem de sistemas embarcados, e que podem servir às mais diversas finalidades específicas.

Estes recursos facilitam a construção de protótipos das mais diversas finalidades. A programação simples e direta de periféricos como motores, luzes e sensores, tornam quase que ilimitadas as possibilidades de protótipos que podem ser construídas utilizando o Arduino.

O Servo Motor ou o módulo HC-05, dentre outros, fazem parte desta plataforma e foram utilizados neste projeto. Estes dispositivos em conjunto possibilitam a prototipagem de sistemas embarcados. E, neste exemplo, de um que seria responsável apenas por receber instruções para abrir e trancar uma porta.



##### Módulo Bluetooth HC-05

A conexão entre o app Android criado e o sistema da máquina de vendas foi realizada via Bluetooth. Para isso, utilizamos o módulo Bluetooth HC-05.

O módulo HC-05 é um dispositivo serial de comunicação Bluetooth. [ver mais](https://www.gme.cz/data/attachments/dsh.772-148.1.pdf)

Este módulo possui 4 pinos principais de conexão com a placa Arduino. Dois pinos são responsáveis pela comunicação serial (RXD e TXD), e dois pinos de alimentação (VCC) e o que fecha o curto para garantir a corrente elétrica, o GND. 

Na prática, a conexão destes pinos fica da seguinte forma:

![image](https://user-images.githubusercontent.com/45850297/132968177-13fa8c56-ff56-4bd2-9ccc-b75e205529e5.png)
##### *Figura 01. Ilustração dos conectores Arduino*

O módulo possui versões 5V e 3.3V. Como a alimentação padrão mais próxima no Arduino é de 5V, caso o módulo seja de 3.3V, é necessário utilizar resistências para evitar danos elétricos ao módulo. No caso atual, este preparo não foi necessário, pois utilizamos uma versão 5V.

Os dispositivos internos da máquina eram compostos de uma placa Arduino e um Servo Motor. Este último era responsável por abrir a porta que liberava acesso ao produto selecionado e trancá-lo novamente após isso.



##### Servo Motor

O servo motor é um periférico que pode ser utilizado no Arduino. Ele possibilita a geração de movimentos rotacionais controlados.
Por exemplo: com um servo motor, podemos realizar rotações limitadas, porém com maior precisão. Suas versões mais comuns não permitem uma rotação contínua, como uma roda de carro, por exemplo.

Entretanto, caso seja necessário realizar rotações específicas, determinando até mesmo a quantidade de graus que o movimento deve ter, o servo motor é o ideal para esta demanda. Como necessitávamos de uma tranca automática, ele atendeu à necessidade do projeto.

A montagem deste dispositivo é similar a do módulo HC-05. Temos uma demonstração de como ela ficaria na prática:

![image](https://user-images.githubusercontent.com/45850297/132969607-4f0f0591-94f9-4d43-9529-ef4265b4aa02.png)
##### *Figura 02. Esquema de conexão dos periféricos à placa Arduino*

Como pode ser visto, a alimentação ainda é realizada conectando as saídas de 5V e GND, que fecham o circuito de alimentação, e um pino é escolhido para recebimento das 
instruções de rotação. Neste exemplo, o de número 6.

### Contribuições pessoais

Fui responsável pela programação do script que gerenciava a integração do Arduino com o Servo Motor e o módulo bluetooth.

Por estar focado nesta parte do projeto, pesquisei por diversas plataformas que pudessem construir o protótipo. 
Uma alternativa ao Arduino, a NodeMCU [ver mais](https://nodemcu.readthedocs.io/en/release/), foi estudada e testada para uso. Entretando, como os requisitos do projeto eram atendidos por uma plataforma de uso mais amplo e conhecido como a Arduino, ela foi escolhida para ser utilizada no projeto.

O processo de estudo e implementação do código em testes práticos necessitou de consultas à [documentação oficial do Arduino](https://www.arduino.cc/en/main/docs). Em poucas semanas, a implementação foi finalizada, realizando as etapas explicadas nos capítulos anteriores. 

### Aprendizados Efetivos HS

Neste projeto obtive meu primeiro contato com documentações. Esta experiência me ensinou a buscar informações nas fontes primárias, que são as publicações técnicas geralmente realizadas pelos próprios criadores e responsáveis pelas mais diversas tecnologias. Este aprendizado é de grande valia até hoje em minha trajetória acadêmica e profissional.

Além disso, o desafio de observar um problema prático e ter como tarefa criar uma solução até então inexistente naquele contexto específico, exercitou habilidades que considero importantes para todo analista e desenvolvedor de software. 

Com este desafio, realizei minha primeira decisão de qual tecnologia e tática utilizar em uma solução, e também os detalhes de como implementá-las. Estas decisões são frequentes na carreira de soluções tecnológicas, onde diversas vezes optar pela solução mais eficiente no curto, médio e longo prazo são extremamente necessárias.

Além disso, consegui distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. Entretanto, a consulta na documentação das tecnologias se mostrou muito mais completa, rápida e confiável do que qualquer fonte terceira. Experiência e aprendizado valiosos até hoje. 

No mais, temos os pontos específicos abaixo de aprendizados efetivos:

- Integração Bluetooth entre dispositivos e placa Arduino: Sei fazer com autonomia

- Integração entre placa Arduino e dispositivos periféricos: Sei fazer com autonomia

- Desenvolvimento de scripts em C: Sei fazer com autonomia


# Projeto 2: 2º semestre de 2021


### Parceiro Acadêmico
Necto Systems <br/>
![image](https://user-images.githubusercontent.com/74321890/200952858-ff867019-d4c6-49cf-9c2a-9508546a5ed9.png)
##### *Figura 03. Necto Systems*

### Visão do Projeto

Aplicação de monitoramento voltada somente à SGBDs, focada na performance e desempenho. Através da coleta de dados do SGBD (memória, tempo de consultas, espaço em disco, transações, evolução da memória, caches e registros) que influenciam na saúde e manutenção periódica.

[<img src="https://user-images.githubusercontent.com/74321890/200989611-49f7bac0-fb95-4efd-a935-5c38141a6458.png" width="40%">](https://www.youtube.com/watch?v=zVTsaxL_-l4&list=PLUOBqJKbljZvQtu2OXq071Id11zidSJNS "SGBD Health vídeo Demonstração")
##### *Figura 04. Demonstração SGBD Health*

Link do repositório do projeto: https://github.com/DolphinDatabase/SGBD_Health

### Tecnologias adotadas na solução

#### PostgreSQL

PostgreSQL é um sistema gerenciador de banco de dados objeto relacional (SGBD), desenvolvido como projeto de código aberto.

Saiba mais sobre o PostgreSQL em sua [página oficial.](https://www.postgresql.org/)

#### Java
<p align="justify">
Utilizamos a linguagem de programação orientada a objetos conhecida por Java. Para a criação dessa linguagem, utilizaram do C++ como base, mas seu principal objetivo 
era ser uma linguagem de fácil aprendizagem. Seu código é escrito em uma classe onde tudo é objeto, porém números reais e ordinais, valores booleanos e caracteres não 
são considerados objetos já que não participam de classes por questões de funcionamento.  

### Contribuições pessoais

Como tinha pouco conhecimento com PostgreSQL, na primeira sprint fui encarregada de estudar para que nas próximas pudesse trabalhar com mais autonomia, assim, fiquei responsável e contribui com o desenvolvimento do banco de dados.

### Aprendizados Efetivos

Esse projeto foi o primeiro com que tivemos contato com clientes e empresas reais, o que possibilitou aprimorar habilidades sociais.

Além disso, foi quando coloquei em prática as aulas de banco de dados e utilizei para criar um projeto baseado em situações reais do dia a dia da empresa/ cliente.

- Trabalhar com SGBD: sei fazer com ajuda.

- Criar tabelas, relacionamentos e modelagem: sei fazer com ajuda.

# Projeto 3: 1º semestre de 2022

## Parceiro Acadêmico
MidAll <br/>
![midall](https://user-images.githubusercontent.com/74321890/191144569-593506c4-b02e-41bf-830d-9f6e88a57278.jpeg)
##### *Figura 05. MidAll*


### Visão do Projeto
<p align="justify">
Ferramenta para criar promoções de E-commerce, onde as mecânicas de promoções são feitas de forma flexível e de rápida atualização no sistema. As regras de promoções
são cadastradas e posteriormente aplicadas no momento em que os itens são adicionados ao carrinho. Atualmente implementamos e apresentaremos o cadastro dos produtos em
várias promoções no servidor/ banco de dados, utilizando operadores lógicos para criar diferentes mecânicas de promoções, o desconto é aplicado na sacola de compra e
possui uma visualização dedicada para conferência e escolha de possíveis promoções. Além disso, há a autonomia fornecida ao usuário para editar, remover, arquivar ou 
desarquivar seus produtos e para editar, deletar, interromper ou ativar promoções e da visualização prática e intuitiva dos produtos e promoções cadastradas através da 
listagem que possui um filtro para que seja possível diferenciar quais os status de produtos e promoções.

[<img src="https://github.com/DolphinDatabase/DescontOn/blob/main/Imagens/DescontOn-Youtube.png" width="40%">](https://www.youtube.com/watch?v=n5GK4uJpNkk&list=PLUOBqJKbljZsrdWoo8YF8GLvADBIIRMPV "DescontOn vídeo Demonstração")
##### *Figura 06. Demontração DescontOn*


Link do repositório do projeto: https://github.com/DolphinDatabase/DescontOn

### Tecnologias adotadas na solução

<details><summary>Spring Boot</summary>
<p align="justify">

O Spring Boot é um framework Java open source que tem como objetivo facilitar esse processo em aplicações Java. Trazendo mais agilidade para o processo de 
desenvolvimento com uma infinidade de ferramentas surge todos os dias visando justamente acelerar o processo de criação e implantação de soluções nos mais variados 
ambientes.

Para saber mais sobre o Spring Boot, acesse sua [página oficial.](https://spring.io/projects/spring-boot)
</details>

<details><summary>Oracle</summary>
<p align="justify">
O Banco de dados Oracle (Oracle DB) é um sistema de gerenciamento de banco de dados relacional (RDBMS, Relational Database Management System) da Oracle Corporation. 

Oracle DB é um dos mais utilizados no mercado devido a sua capacidade de orientar aplicativos corporativos no processamento de transações online (OLTP, Online 
Transaction Processing), em data warehouse e na análise de negócios. Equipes de TI também precisam de desempenho sob demanda desses bancos de dados para as 
necessidades de desenvolvimento, teste, análise e continuidade de negócios.

Saiba mais sobre Oracle em sua [página oficial.](https://www.oracle.com/br/)
</details>

<details><summary>HTML</summary>
<p align="justify">
O HTML (HyperText Markup Language) é uma linguagem voltada para a web que foi feita para você montar sua própria estrutura de texto e outros elementos para publicá-
los. Tal linguagem se trabalha em camadas divididas em 3: o próprio HTML, CSS e JavaScript. Estes elementos permitem ao usuário a criação de um website contendo 
diversas variações de textos, imagens, vídeos, botões, entre outros.
</details>

<details><summary>CSS</summary>
<p align="justify">
O CSS (Cascading Style Sheet) é uma folha de estilo que trabalha em conjunto com a linguagem HTML e serve para compor a parte visual do site, deixando-a mais atraente. 

Sua principal função é separar e organizar o site, como exemplo, separar a parte escrita da parte visual. É possível fazer uma comparação com um editor de fotos, já 
que essa style sheet permite a edição, alinhamento, remover, acrescentar ou até mesmo trabalhar com os elementos de uma página web. De acordo com o site WebLink, o CSS 
também permite fazer animações, efeitos visuais, sites dinâmicos e landings pages.
</details>

<details><summary>JavaScript</summary>
<p align="justify">
JavaScript é uma linguagem de programação que permite a você implementar itens complexos em páginas web — toda vez que uma página da web faz mais do que simplesmente 
mostrar a você informação estática — mostrando conteúdo que se atualiza em um intervalo de tempo, mapas interativos ou gráficos 2D/3D animados, entre outros, há 
JavaScript envolvido.
</details>

### Contribuições pessoais
<p align="justify">
Trabalhei com o papel de Scrum Master, gerenciando e ajudando com impedimentos do time. Como ferramenta de apoio utilizamos o Jira para ter mais visualização e controle 
sobre as tarefas e suas divisões para cada membro da equipe.
<details><summary>Jira - DescontOn</summary>
Para mostrar melhor a usabilidade do Jira e divisão de histórias, abaixo está o roadmap do projeto. 
</details>

Fiquei responsável também pela parte de documentar o projeto, sendo no Github algumas descrições mais específicas e menos teóricas, já no documento em .pdf falo melhor 
sobre a teoria das cores, descrição sobre linguagens e frameworks usados e explico trechos de código.
<details><summary>Documentação</summary>
Conheça um pouco mais sobre a aplicação e acesse a documentação.
</details>

Na parte de usabilidade, fiquei responsável pelos Wireframes no Figma e fiz cada tela prezando pela experiência do usuário (UX - user experience). Utilizamos template 
do Bootstrap e trabalhamos com HTML/ CSS e JavaScript para o desenvolvimento da aplicação web.

No código, fiquei responsável pela criação de DTOs (Data Transfer Object), um padrão de projetos bastante usado em Java para o transporte de dados entre 
diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

A ideia consiste basicamente em agrupar um conjunto de atributos numa classe simples de forma a otimizar a comunicação. Além disso, muitas vezes os dados usados na 
comunicação não refletem exatamente os atributos do seu modelo. Então, um DTO seria uma classe que provê exatamente aquilo que é necessário para um determinado 
processo.

### Aprendizados Efetivos
<p align="justify">
No desenvolvimento dos serviços do DescontOn, aprendi mais sobre desenvolvimento web. Foi a primeira vez na faculdade em que trabalhei de fato com uma aplicação 
front-end separada dos serviços chamados de "back-end".

Por conta desta experiência, fui inserida a um novo nível de exigência para a construção de um sistema web, tendo que me preocupar com o formato e conteúdo específico 
das requisições possíveis de entrada no serviço desenvolvido.

Além disso, foi minha primeira vez atuando no papel de Scrum Master e colocando a metodologia ágil em prática.

- Criação de wireframes, desenvolvimento web e ux: sei fazer com autonomia.

- Utilização da metodologia ágil e atuação como SM: sei fazer com autonomia.

<br/>

# Projeto 4: 2º semestre de 2022
## Empresa parceira:
Subiter

<img src="https://user-images.githubusercontent.com/74321890/200832569-795e2fa6-0fc6-4b1e-8547-d7b2abf82c0b.jpg" height="300"/>

##### *Figura 06. Subiter*
<p align="justify">
A Subiter é uma empresa de base tecnológica especializada em visão infravermelha. Sua missão é ajudar a indústria a alcançar excelência em seus processos produtivos. 

Por meio de sistemas inteligentes de inspeção e monitoramento, podemos observar fenômenos que estão além da capacidade dos olhos humanos.

### Visão do Projeto
<p align="justify">
Sistema ERP que visa gerenciar e controlar dados, afim de reduzir custos, facilitar tomadas de decisão, otimizar o tempo de atendimento de chamados e aprimorar o 
solucionamento destes. É composta por níveis de usuários, onde o administrador terá controle sobre todas as funcionalidades existentes, dentre elas o cadastro, edição 
e exclusão de outros usuários; o suporte ficará responsável pelo CRUD de falhas e soluções genéricas e CRUD de equipamentos; o cliente trará o problema para o suporte e, este ficará responsável por gerenciar o chamado e resolvê-los.

A MCS (Management and Control System) trouxe de uma forma fácil e rápida o mais importante: o mapeamento gráfico de anomalias nas silhuetas.
  
<p align="justify">
O Mapemamento de anomalias consiste em durante ou após uma inspeção, o suporte conseguirá fazer o upload da silhueta e adicionar as falhas (específicas do chamado) 
encontradas em formas e tamanhos diferentes para uma melhor identificação da posição e tamanho, facilitando na identificação de quantidade e quais materiais serão 
utilizados para a solução dessas falhas e também no cálculo do orçamento.

Sua interface web facilita a gestão de dados e dá autonomia aos usuários dessa aplicação para que possam atuar com desenvoltura dentro das permissões concedidas. 

[<img src="https://github.com/DolphinDatabase/MCS/blob/main/Imagens/MCS_Youtube.png" width="40%">](https://www.youtube.com/watch?v=omSyXxA3AYI&list=PLUOBqJKbljZv85QQ4B3ExV93PQVVf8n2o "MCS vídeo Demonstração")

##### *Figura 07. Demonstração MCS*

Link do repositório do projeto: https://github.com/DolphinDatabase/MCS

## Tecnologias utilizadas:
<p align="justify">
Assim como no projeto anterior, a aplicação teve desenvolvimento web, a única diferença foi utilização o framework VueJS para a construção do front-end da aplicação.
Para a programação das rotas HTTP, os serviços e API do back-end foram feitas em Java.
  
Um diferencial do banco de dados, como requisito da FATEC, foi a utilização do OracleCloud.

#### Contribuições pessoais
<p align="justify">
Atuando no papel de Scrum Master, fiquei responsável pelo gerenciamento de impedimentos e organização de tarefas, criação de wireframes e documentação do projeto.

Neste projeto minha principal responsabilidade no código foi o desenvolvimento das telas no front-end, utilizando a biblioteca Element+ para ícones, tabelas, entre outros e konva para o desenho do mapeamento de anomalias e desenvolvi no back-end algumas rotas HTTP. 

Minhas áreas de atuação:
- Home: front-end
- CRUD de Usuários: front-end
- CRUD de Equipamentos: front-end 
- CRUD Falhas e Soluções genéricas: front-end
- Orçamento: front-end e back-end
- Mapeamento gráfico: front-end

## Aprendizados Efetivos
- Desenvolvimento de serviços CRUD: Sei fazer com ajuda.

- Desenvolvimento utilizando VueJS: Sei fazer com autonomia.

- Utilização de OracleCloud: Sei fazer com autonomia.


# Projeto 5 - 2º semestre de 2021
## Empresa parceira:
GSW

<img src="https://user-images.githubusercontent.com/54003876/142731143-f3afb070-80b4-442d-ba68-ddd77247dc5b.png" height="150"/>

##### *Figura 09. GSW (Fonte: https://www.gsw.com.br/)*

A GSW é uma empresa brasileira. No mercado desde 1991, sua atuação é focada em produzir soluções para gerenciamento e controle de processos e negócios. 

### Visão do Projeto

A empresa apresentou a necessidade de uma extensão de um produto já existente, que consiste em um portal de anúncio e vendas de imóveis.<br/>
Tal extensão deveria consistir em um marketplace para anúncio e vendas de automóveis, que permitisse que comprador e vendedor se encontrem, conversem e negociem os processos de compra e venda.

Além disso, a ferramenta deveria possibilitar a carga de alguns dados, como de novos usuários e anúncios.

Como solução ao problema, foi criada a plataforma [OneCar](https://github.com/OneCar-API). A OneCar é uma aplicação Web e mobile para anúncio de veículos à venda.
A OneCar possui diversas funcionalidades, como:

- Cadastro de usuários e anúncios automatizados por meio de cargas;
- App mobile para visualização e busca de anúncios;
- Comunicação em tempo real com o vendedor, assim como acesso ao seu contato em casos onde isso é desejado pelas partes;
- Busca pelos anúncios por palavras-chaves e itens dos veículos.


<img src="https://user-images.githubusercontent.com/54003876/142731498-cf7ccb60-cc0a-4bce-a24e-a82d8b916d17.png" height="500"/>

##### *Figura 10. OneCar*

## Tecnologias utilizadas:
- NodeJS <br/>
- Typescript <br/>
- Express <br/>
- PostgreSQL <br/>
- ReactJS <br/>
- Docker <br/>

Mantendo a linha dos dois projetos anteriores, utilizamos React para o front-end, inclusive com o Reactive Native para as telas mobile.
No backend, as mesmas linguagens e ferramentas foram usadas em relação ao projeto anterior.

#### Contribuições pessoais
Desenvolvimento do backend da aplicação, em especial serviços CRUD e o chat da ferramenta. <br/>
Fui responsável pelo desenvolvimento da feature de comunicação em tempo real entre comprador e vendedor foi desenvolvida utilizando web socket, com a biblioteca [Socket.Io](https://socket.io/). A inclusão desta tecnologia foi de grande desafio e valia no projeto, pois é a primeira vez que utilizamos este tipo de comunicação entre cliente e servidor em um projeto integrador, então foi necessário um aprendizado ágil para sua implementação.<br/>


## Aprendizados Efetivos HS
- Desenvolvimento de serviços CRUD: Sei fazer com autonomia; 
- Desenvolvimento utilizando Typescript: Sei fazer com autonomia; 
- Utilização de ORM's com banco relacional: Sei fazer com autonomia; 
- Utilização de banco NoSQL: Sei fazer com autonomia;
- Comunicação em tempo real entre cliente e servidor com web socket: Sei fazer com autonomia.


# Projeto 6 - 1º semestre de 2022
## Empresa parceira:
UOL

<img src="https://conteudo.imguol.com.br/c/home/layout/vueland/icons/brand/uol-logo-full.svg?v4" height="150"/>

##### *Figura 11. UOL (Fonte: https://www.uol.com.br/)*

A UOL é uma companhia brasileira, fundada em 1996. Pioneira no mercado online nacional, foi a dona do primeiro portal de conteúdos no país. O portal de UOL, que carrega o nome da empresa, segue sendo o maior do Brasil.

### Visão do Projeto

Nosso parceiro deste projeto solicitou a criação de uma ferramenta que pudesse prever a indisponibilidade de seus serviços online. O produto desenvolvido deveria ser capaz de monitorar a saúde da aplicação e prever que num futuro breve um problema pode ocorrer, caso o cenário seja este.

Considerando a larga escala de utilização dos produtos do nosso parceiro, prever possíveis indisponibilidades futuras seria um ótimo mecanismo de garantir disponibilidade máxima para seus usuários. 

Para atender às demandas solicitas, a [Orbit](https://github.com/orbit-api) foi desenvolvida. A Orbit é uma ferramenta de monitoramento que tem como objetivo coletar os dados de saúde de um serviço e, com base nos dados coletados de cenários de indisponibilidade, pode prever um novo cenário de queda do serviço monitorado. Caso um evento deste tipo seja previsto, os responsáveis pela aplicação são notificados de que um possível problema deverá ocorrer.


<img src="https://user-images.githubusercontent.com/56441318/160112708-193a18fe-2241-427c-8fe0-2dc23324b48a.png" height="500"/>

##### *Figura 12. Orbit*

## Tecnologias utilizadas:
- Java <br/>
- Spring Boot <br/>
- Hibernate <br/>
- PostgreSQL <br/>
- Vue Js <br/>
- Docker <br/>
- Locust.io <br/>
- Prometheus <br/>
- Scikit-learn <br/>

Neste semestre houve uma mudança na stack de tecnologias. O Vue JS foi a biblioteca utilizada na construção de páginas, e a linguagem Java, junto com o Spring e Hibernate, foram utilizadas no desenvolvimento das API's e serviços.
Isso proporcionou uma mudança na arquitetura da ferramenta. 

#### Contribuições pessoais
Minha atuação neste projeto foi focada nas criações de cenários de indisponibilidade e testes para geração de dados.
A serviço oferecido pela Orbit se baseia no aprendizado de máquina proporcionado por estes testes, onde diferentes características da saúde do serviço monitorado devem ser considerados. <br>
Utilizei ferramentas de teste em carga, como o Locust.io, e ao mesmo tempo aplicações de monitoramento para relacionar estados como (consumo de recursos como CPU, memória, tempo de resposta, latência considerando a rede, etc) com o nível de estresse da aplicação monitorada. Além do trabalho de relacionar estes dados em estruturas que pudessem ser utilizadas por modelos de aprendizado de máquina.<br>
Com isso, minhas contribuições foram focadas na criação dos testes, para que pudessem representar o funcionamento de uma aplicação em diferentes cenários. Em coletar os dados do monitoramento da aplicação durante os testes, incluindo informações de monitoramente que pudessem medir diferentes aspectos da saúde da aplicação, e em armazenar estas métricas para alimentar de forma útil nosso modelo de maching learning, que se baseará na extrapolação dos dados no tempo para prever possíveis indisponibilidades. <br> <br>
O Scikit-learn foi utilizado realizando duas tarefas principais:<br>
- Utilizar os dados de saúde da aplicação e extrapolá-los no tempo, para que se pudesse ter uma estimativa no futuro de como estas métricas estariam.<br>
- Com os dados extrapolados, aplicar uma árvore de decisão para definir se naquele ponto no tempo, haveria risco futuro próximo de cenários de indisponibilidade. 

## Aprendizados Efetivos HS
- Monitoramento de atributos de performance de aplicações web: Sei fazer com autonomia; 
- Coleta e tratamento de dados para uso em bibliotecas de aprendizado de máquina: Sei fazer com autonomia; 
- Desenvolvimento de API's com Spring Boot: Sei fazer com autonomia.

## Contatos:

- [LinkedIn;](https://www.linkedin.com/in/bea-medeiros/)
- [GitHub.](https://github.com/beamedeiros) 
