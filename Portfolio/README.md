# Beatriz Medeiros de Oliveira Santos

## Introdução

Olá, sejam bem-vindos!!

Sou Beatriz Medeiros de Oliveira Santos (mais conhecida por Bea), estudante de Banco de Dados pela FATEC Prof. Jessen Vidal no período noturno. 

Tenho 20 anos e trabalho como estagiária na empresa Sophia, responsável por Gestão de Escolas e Bibliotecas. <br/>

<img src="https://user-images.githubusercontent.com/74321890/200823701-ea0c19fc-e79b-4e1d-9361-1d8fa1cade6a.jpg" width="300"/>

### Meus principais conhecimentos

#### Java
<p align="justify">
Na faculdade, ficamos reponsáveis por trabalhar com back-end e uma das principais linguagens aprendidas e requisitadas foi Java.

Utilizamos para o desenvolvolvimento de API's e serviços com o auxílio do framework Spring Boot e também do framework Hibernate. 

Por conta desta experiência, Java e seu ecossistema para desenvolvimento web é onde possuo maior contato. 

#### Javascript
<p align="justify">
JavaScript foi uma linguagem que aprendi ainda antes da graduação. Meu primeiro estágio (técnico em informática) na Embraer possibilitou que eu trabalhasse com JavaScript junto com o framework React.

Trabalhei por 1 ano e 8 meses com UX, front-end e requisições HTTP, desenvolvendo uma plataforma web que tem como objetivo automatizar e facilitar a visualização de máquinas e processos para os operadores.

Atualmente trabalho com desenvolvimento web utilizando o framework VueJS.

#### Projetos Integradores durante a graduação
<p align="justify">
Durante a minha gradução, trabalhei no desenvolvimento de trabalhos chamados de "Projetos integradores". Um projeto integrador tem o objetivo de solucionar um problemado mundo real, utilizando os conhecimentos adquiridos durante a graduação.<br/>

Abaixo todos estes projetos serão descritos, detalhando o problema, solução proposta (e entregue), e os aprendizados extraídos de cada um deles.

# Projeto 1: 1º Semestre de 2021


### Parceiro Acadêmico

Fatec Prof. Jessen Vidal (proposta realizada pelo docente responsável pela disciplina que ordenou o projeto)

![image](https://user-images.githubusercontent.com/74321890/221617740-afbc3809-af92-43e8-bc11-698eeffb4bf4.png)

A Fatec é uma Faculdade Pública Estadual e todos os cursos oferecidos são gratuitos.

### Visão do Projeto

Desenvolver uma aplicação em python que conseguisse reconhecer voz e atuar conforme os comandos do usuário.
Com o propósito de trazer para os estudantes em geral uma forma mais centralizada e organizada de cuidar da vida acadêmica e se manter atualizado em suas atividades, 
criamos a Athena- Assistente Pessoal de Estudos. O seu diferencial é reunir diversas ferramentas úteis em um único lugar.

[<img src="https://user-images.githubusercontent.com/74321890/221615575-d2721589-5e18-438c-b8f3-4e6dfe50d199.png" width="40%">](https://www.youtube.com/watch?v=E_I9MvQs9BE "Athena vídeo Demonstração")

Link do repositório do projeto: https://github.com/silvercod3/Athena

### Tecnologias adotadas na solução

<details><summary>Python</summary>
<p align="justify">

>O Python é uma linguagem de programação amplamente usada em aplicações da Web, desenvolvimento de software, ciência de dados e machine learning (ML). Os 
desenvolvedores usam o Python porque é eficiente e fácil de aprender e pode ser executada em muitas plataformas diferentes. O software Python pode ser baixado 
gratuitamente, integra-se bem a todos os tipos de sistema e agiliza o desenvolvimento.

Os desenvolvedores de software geralmente usam o Python para diferentes tarefas de desenvolvimento e aplicações de software, no caso do nosso projeto criamos as 
seguintes funcionalidades:
- Cronograma de aulas: armazena horários de aulas cadastrados pelo(a) estudante, para facilitar controle e organização de sua agenda;
- Calendário acadêmico: permite cadastro de datas de provas, trabalhos e qualquer ocasião importante para o estudante, com notificações prévias;
- Planos de estudos: a Athena fornece planos de estudos editáveis, de acordo com a meta do estudante;
- Notificações de estudos: alertas lembrando o(a) estudante que chegou a hora de estudar (via pop-up e e-mail);
- Cálculo de médias: permite o(a) estudante conferir de forma fácil como estão indo suas notas no semestre;
- Controle de faltas: para evitar uma reprovação, alerta o(a) estudante sobre quantas faltas ainda podem ser registradas (com contagem regressiva, de acordo com valor previamente cadastrado pelo(a) estudante);
- Dicas: dicas sobre como melhorar a efetividade dos estudos, concentração, absorção de conteúdo e organização;
- Metas de estudos e gráficos de desempenho: planejamento de horas a estudar semanal ou mensal, que auxilia no progresso, juntamente com visualização do desempenho através de gráficos.
</details>

<details><summary>PyAudio e Pydub</summary>
<p align="justify">

>Bem similar ao que temos no nosso celular por exemplo, que ele consegue entender o que falou e fazer uma pesquisa, mas no nosso caso ele vai entender e vai poder printar essa mensagem.

>A biblioteca Pydub, foi criada para manipulação de áudio de forma simples e alto nível. Com ela podemos fazer conversões de formatos, juntar ou dividir arquivos de áudio entre outras atividades.

Utilizamos PyAudio e Pydub junto com a biblioteca SpeechRecognition para a transcrição de voz, você vai poder falar no seu microfone e o código vai fazer o reconhecimento de frases no Python e vai escrever o que falou.
</details>

<details><summary>Tkinter</summary>
<p align="justify">  

>Tkinter é uma biblioteca da linguagem Python que acompanha a instalação padrão e permite desenvolver interfaces gráficas. Isso significa que qualquer computador que tenha o interpretador Python instalado é capaz de criar interfaces gráficas usando o Tkinter, com exceção de algumas distribuições Linux, exigindo que seja feita o download do módulo separadamente.

As interfaces gráficas do usuário (GUI – Graphic User Interface) são bastante populares no uso de softwares em geral, e os programadores devem estar aptos a trabalhar com a criação de interfaces, já que torna o uso mais fácil além de aumentar a produtividade.
  
Utilizamos o Tkinter para montar a interface do usuário, mais especificamente mostrar o gráfico de horas estudadas por matéria.
</details>
  
### Contribuições pessoais

No reconhecimento de voz, implementei a biblioteca SpeechRecognition, para o reconhecimento de voz do usuário/ estudante.
<details><summary>Código</summary>

>A função record_audio é responsável por gravar o áudio do usuário usando o microfone e, em seguida, converter o áudio em texto. Dentro da função, é inicializado um objeto Recognizer da biblioteca SpeechRecognition, que é responsável por reconhecer a fala a partir do áudio gravado. O método listen do objeto Recognizer é usado para gravar o áudio do usuário, e os parâmetros duration e timeout definem, respectivamente, a duração máxima da gravação e o tempo máximo que o método deve esperar antes de retornar uma exceção. O método adjust_for_ambient_noise é usado para ajustar o nível de ruído de fundo antes de iniciar a gravação do áudio. Em seguida, o áudio é convertido em texto usando o serviço de reconhecimento de fala da Google, especificado pelo método recognize_google.
  
```
import speech_recognition as sr

engine = pyttsx3.init()
r = sr.Recognizer()  # inicializa o reconhecedor

# ouve o áudio e converte para texto:
def record_audio(ask=""):
    try:
        with sr.Microphone() as source:
            if ask:
                speak(ask)
            audio = r.listen(source, 5, 5)
            r.adjust_for_ambient_noise(source, duration=1)
            voice_data = ''
            try:
                voice_data = r.recognize_google(audio, language='pt-BR')
            except sr.UnknownValueError:
                time.sleep(10)
                print('Deu erro aquiiiiiii')
                speak(error)
                exit()
            except sr.RequestError:
                speak('Desculpe, serviço indisponível no momento')
            except sr.WaitTimeoutError:
                print('Serviço indisponível no momento, tente novamente !')
                exit()
            print(">>", voice_data.lower())
            return voice_data.lower()
    except TypeError:
        speak('tem alguém aí ?')
        time.sleep(6)
        exit()
    except sr.WaitTimeoutError:
        speak('tem alguém aí ?')
        time.sleep(5)
        exit()

```
</details>

Também fui encarregada de desenvolver a interface, utilizando gráficos, para que o usuário conseguisse observar sua evolução nas metas.

<details><summary>Interface</summary>

>O código define duas listas de strings, horas e horas2, que contêm as legendas e valores das barras do gráfico.  As listas são então passadas para a função plt.bar do Matplotlib, que cria um gráfico de barras com as horas pretendidas e cumpridas. O resultado é um gráfico simples de barras que mostra a quantidade de horas pretendidas e cumpridas de estudo. A barra correspondente às horas pretendidas é exibida em roxo, enquanto a barra correspondente às horas cumpridas é exibida em azul.

```
horas_pretendidas = int(input('Quantas horas você pretende estudar? '))
horas_cumpridas = int(input('Quantas horas você estudou? '))

import numpy as np
import matplotlib.pyplot as plt

horas = ['Horas Pretendidas', 'Horas Cumpridas']
horas2 = [horas_pretendidas, horas_cumpridas]

plt.bar(horas, horas2, color='purple')

plt.xticks(horas) #define as etiquetas do eixo x do gráfico para serem as horas pretendidas e cumpridas
plt.ylabel('HORAS') #rótulo do eixo y do gráfico, que é "HORAS"
plt.xlabel('HORAS DE ESTUDO') #rótulo do eixo x do gráfico, que é "HORAS DE ESTUDO"
plt.title('METAS DE ESTUDO') #título do gráfico como "METAS DE ESTUDO".
plt.show() #exibe o gráfico
```

A imagem abaixo mostra a disposição de informações e resultado do gráfico.
<img src="https://user-images.githubusercontent.com/74321890/234713583-e0115e73-e159-4742-b333-a15939ba2bf2.png">

</details>

### Aprendizados Efetivos HS

Neste projeto obtive meu primeiro contato com Python e documentações. Esta experiência me ensinou a buscar informações nas fontes primárias, que são as documentações técnicas geralmente realizadas pelos próprios criadores e responsáveis pelas mais diversas tecnologias. Este aprendizado é de grande valia até hoje em minha trajetória acadêmica e profissional.

Além disso, o desafio de observar um problema prático e ter como tarefa criar uma solução até então inexistente naquele contexto específico, exercitou habilidades que considero importantes para todo analista e desenvolvedor de software. 

Com este desafio, realizei minha primeira decisão de qual tecnologia e tática utilizar em uma solução, e também os detalhes de como implementá-las. Estas decisões são frequentes na carreira de soluções tecnológicas, onde diversas vezes optar pela solução mais eficiente no curto, médio e longo prazo são extremamente necessárias.

Além disso, consegui distinguir a velocidade de profundidade e velocidade em diferentes métodos de pesquisa e estudo. Diversos tutoriais estão disponíveis ensinando a realizar grande partes das etapas de projetos deste tipo, e estes conteúdos possuem sua importância. 

No mais, temos os pontos específicos abaixo de aprendizados efetivos:

- Reconhecimento de voz: sei fazer com autonomia.
- Envio de e-mail automático: sei fazer com autonomia.
- Desenvolvimento de scripts em Python: sei fazer com autonomia.


# Projeto 2: 2º semestre de 2021

### Parceiro Acadêmico
Necto Systems <br/>
![image](https://user-images.githubusercontent.com/74321890/200952858-ff867019-d4c6-49cf-9c2a-9508546a5ed9.png)

Desenvolvimento estratégico de software para necessidades específicas.

### Visão do Projeto

Aplicação de monitoramento voltada somente à SGBDs, focada na performance e desempenho. Através da coleta de dados do SGBD (memória, tempo de consultas, espaço em disco, transações, evolução da memória, caches e registros) que influenciam na saúde e manutenção periódica.

[<img src="https://user-images.githubusercontent.com/74321890/200989611-49f7bac0-fb95-4efd-a935-5c38141a6458.png" width="40%">](https://www.youtube.com/watch?v=zVTsaxL_-l4&list=PLUOBqJKbljZvQtu2OXq071Id11zidSJNS "SGBD Health vídeo Demonstração")

Link do repositório do projeto: https://github.com/DolphinDatabase/SGBD_Health

### Tecnologias adotadas na solução

<details><summary>PostgreSQL</summary>
<p align="justify">  

>PostgreSQL é um sistema gerenciador de banco de dados objeto relacional (SGBD), desenvolvido como projeto de código aberto.

No nosso projeto utilizamos PostgreSQL para realizar a conexão e efetuar a coleta de métricas.
</details>

<details><summary>Java</summary>
<p align="justify">  
  
>Utilizamos a linguagem de programação orientada a objetos conhecida por Java. Para a criação dessa linguagem, utilizaram do C++ como base, mas seu principal objetivo 
era ser uma linguagem de fácil aprendizagem. Seu código é escrito em uma classe onde tudo é objeto, porém números reais e ordinais, valores booleanos e caracteres não 
são considerados objetos já que não participam de classes por questões de funcionamento.  

SGBD Health utilizou Java para:
- Tratamento das métricas (histórico, registro, relatórios, disponibilidade, alertas e valores atingidos durante a operação);
- Tratamento de métricas de forma tabular;
- Salvar consultas em CSV;
- Tabular métricas;
- Coleta periódica de métricas;
- Histórico de métricas;
- Relatórios de métricas;
- Alertas por email;
- Funcionamento do BD (tempo e quantidade de queries e uso de índices).
- Ativar ou Desativar Interface Gráfica;
- Cadastro de dados de conexão dos SGBDs (acesso à estastítica por tabelas).
</details>

### Contribuições pessoais

Como tinha pouco conhecimento com PostgreSQL, na primeira sprint fui encarregada de estudar para que nas próximas pudesse trabalhar com mais autonomia, assim, fiquei responsável e contribui com o desenvolvimento e conexão com o banco de dados.

Desenvolvi em java o código que cria um arquivo csv com as informações sobre o banco.

<details><summary>Código csv</summary>
<p align="justify">  

>O código apresentado é uma implementação em Java para manipulação e exibição de dados em formato CSV. Ele possui uma classe Csv que contém métodos para definir configurações de exibição, adicionar dados e exibir o conteúdo em formato de tabela.
  
```
public class Csv {
	
	  private static final String HORIZONTAL_SEP = "-";
    private String verticalSep;
    private String joinSep;
    private String[] headers;
    private List<String[]> rows = new ArrayList<>();
    private boolean rightAlign;
	static String filepath = "armazenamento.csv";
	static String filepath2 = "query.csv";
	static String filepath3 = "indices.csv";
	static String filepath4 = "transacao.csv";	
[...]

    private void printRow(String[] cells, int[] maxWidths) {
        for (int i = 0; i < cells.length; i++) {
            String s = cells[i];
            String verStrTemp = i == cells.length - 1 ? verticalSep : "";
            if (rightAlign) {
                System.out.printf("%s %" + maxWidths[i] + "s %s", verticalSep, s, verStrTemp);
            } else {
                System.out.printf("%s %-" + maxWidths[i] + "s %s", verticalSep, s, verStrTemp);
            }
        }
        System.out.println();
    }
```
                                         
>O método selecionar que recebe uma consulta SQL, uma conexão com um banco de dados, informações sobre as colunas que devem ser selecionadas, um título para o arquivo CSV a ser salvo, um título para a exibição no console, um caminho para o arquivo CSV, um parâmetro de exibição na console e um parâmetro de salvamento em arquivo.
  
```
if (i == 4 && j == 6) {
	quantidadeColuna[i - 4] = (result.getString(i - 3));
	quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", "").substring(0, 25)
			+ "...");
	quantidadeColuna[i - 2] = (result.getString(i - 1));
	quantidadeColuna[i - 1] = (result.getString(i));
	st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
			quantidadeColuna[i - 1]);

} else if (i == 4 && j == 7) {
	quantidadeColuna[i - 4] = (result.getString(i - 3));
	quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", ""));
	quantidadeColuna[i - 2] = (result.getString(i - 1));
	quantidadeColuna[i - 1] = (result.getString(i));
	st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
			quantidadeColuna[i - 1]);
				
```
>Esse método executa a consulta SQL e, dependendo dos parâmetros, exibe os resultados no console e salva em um arquivo CSV. Ele utiliza a classe Csv para formatar e exibir os resultados.
  
</details>  

### Aprendizados Efetivos

Esse projeto foi o primeiro com que tivemos contato com clientes e empresas reais, o que possibilitou aprimorar habilidades sociais.

Além disso, foi quando coloquei em prática as aulas de banco de dados e utilizei para criar um projeto baseado em situações reais do dia a dia da empresa/ cliente.

- Trabalhar com SGBD: sei fazer com autonomia.
- Criar tabelas, relacionamentos e modelagem: sei fazer com autonomia.
- Desenvolvimento de scripts em Java: sei fazer com autonomia.

# Projeto 3: 1º semestre de 2022

## Parceiro Acadêmico
MidAll <br/>
![midall](https://user-images.githubusercontent.com/74321890/191144569-593506c4-b02e-41bf-830d-9f6e88a57278.jpeg)

<p align="justify">
A MidAll nasceu para simplificar a jornada de evolução do seu negócio, visando atingir qualquer visão estratégica. Nossa missão é preparar as empresas para o futuro em uma nova era de disrupções de mercado somadas aos desafios pós-pandemia. Acreditamos que Tecnologia, Dados e Inovação voltados à geração de valor para o cliente são o ambiente de negócios perfeito para resultados promissores.

### Visão do Projeto
<p align="justify">
Ferramenta para criar promoções de E-commerce, onde as mecânicas de promoções são feitas de forma flexível e de rápida atualização no sistema. As regras de promoções são cadastradas e posteriormente aplicadas no momento em que os itens são adicionados ao carrinho. Atualmente implementamos e apresentaremos o cadastro dos produtos em várias promoções no servidor/ banco de dados, utilizando operadores lógicos para criar diferentes mecânicas de promoções, o desconto é aplicado na sacola de compra e possui uma visualização dedicada para conferência e escolha de possíveis promoções. Além disso, há a autonomia fornecida ao usuário para editar, remover, arquivar ou desarquivar seus produtos e para editar, deletar, interromper ou ativar promoções e da visualização prática e intuitiva dos produtos e promoções cadastradas através da listagem que possui um filtro para que seja possível diferenciar quais os status de produtos e promoções.

[<img src="https://github.com/DolphinDatabase/DescontOn/blob/main/Imagens/DescontOn-Youtube.png" width="40%">](https://www.youtube.com/watch?v=n5GK4uJpNkk&list=PLUOBqJKbljZsrdWoo8YF8GLvADBIIRMPV "DescontOn vídeo Demonstração")

Link do repositório do projeto: https://github.com/DolphinDatabase/DescontOn

### Tecnologias adotadas na solução

<details><summary>Spring Boot</summary>
<p align="justify">

>O Spring Boot é um framework Java open source que tem como objetivo facilitar esse processo em aplicações Java. Trazendo mais agilidade para o processo de 
desenvolvimento com uma infinidade de ferramentas surge todos os dias visando justamente acelerar o processo de criação e implantação de soluções nos mais variados 
ambientes.

Utilizamos Spring Boot para desenvolver Java com uma interface gráfica, sendo o primeiro projeto que trabalhamos com desenvolvimento web.
</details>

<details><summary>Oracle</summary>
<p align="justify">
  
>O Banco de dados Oracle (Oracle DB) é um sistema de gerenciamento de banco de dados relacional (RDBMS, Relational Database Management System) da Oracle Corporation. 
Oracle DB é um dos mais utilizados no mercado devido a sua capacidade de orientar aplicativos corporativos no processamento de transações online (OLTP, Online 
Transaction Processing), em data warehouse e na análise de negócios. Equipes de TI também precisam de desempenho sob demanda desses bancos de dados para as 
necessidades de desenvolvimento, teste, análise e continuidade de negócios.

Utilizamos o SGBD Oracle para poder armazenar os dados da aplicação, como cadastro, remoção e edição.

Aqui está um **exemplo** do modelo relacional:

<img src="https://github.com/DolphinDatabase/DescontOn/raw/ebf0051ea024984c038dce84c2d153560b996701/Documenta%C3%A7%C3%A3o/SPRINT3/Imagens/Modelo_Relacional.jpeg">
</details>

<details><summary>HTML</summary>
<p align="justify">
  
>O HTML (HyperText Markup Language) é uma linguagem voltada para a web que foi feita para você montar sua própria estrutura de texto e outros elementos para publicá-
los. Tal linguagem se trabalha em camadas divididas em 3: o próprio HTML, CSS e JavaScript. Estes elementos permitem ao usuário a criação de um website contendo 
diversas variações de textos, imagens, vídeos, botões, entre outros.

Utilizamos o HTML para desenvolver o front-end da aplicação, onde montamos uma interface para que haja a interativadade com o cliente.
</details>

<details><summary>CSS</summary>
<p align="justify">
  
>O CSS (Cascading Style Sheet) é uma folha de estilo que trabalha em conjunto com a linguagem HTML e serve para compor a parte visual do site, deixando-a mais atraente. 
Sua principal função é separar e organizar o site, como exemplo, separar a parte escrita da parte visual. É possível fazer uma comparação com um editor de fotos, já 
que essa style sheet permite a edição, alinhamento, remover, acrescentar ou até mesmo trabalhar com os elementos de uma página web. De acordo com o site WebLink, o CSS 
também permite fazer animações, efeitos visuais, sites dinâmicos e landings pages.

No projeto, utilizamos CSS juntamente com o HTML para dar uma estilização da interface e torná-la mais agradável para o usuário.

</details>

<details><summary>JavaScript</summary>
<p align="justify">
  
>JavaScript é uma linguagem de programação que permite a você implementar itens complexos em páginas web — toda vez que uma página da web faz mais do que simplesmente 
mostrar a você informação estática — mostrando conteúdo que se atualiza em um intervalo de tempo, mapas interativos ou gráficos 2D/3D animados, entre outros, há 
JavaScript envolvido.
  
Utilizamos JavaScript e requisições HTTP, para desenvolver as seguintes funcionalidades no front-end:
- Cadastro de Produtos
- Listar Produtos
- Remover Produtos Cadastrados
- Arquivar e Desarquivar Produtos Cadastrados (para armazenar dados dos produtos que já foram comprados)
- Filtrar a Listagem de Produtos (produtos disponíveis ou arquivados)
- Editar um Produto Cadastrado
- Adicionar Produtos na Sacola
- Alterar a Quantidade de Produtos na Sacola
- Remover Produtos da Sacola
- Finalizar Compra
- Cadastro de Promoções
- Listar Promoções
- Remover Promoções
- Ativar ou Interromper Promoções
- Filtrar a Listagem de Promoções (promoções ativas ou interrompidas)
- Editar uma Promoção
- Aplicar Descontos na Sacola de Compras
- Criar Mecânicas com Modelos Lógicos
- Cadastrar Produtos em (N) Promoções
- Listar desconto por produto na Sacola de Compras
- Visualizar promoções por produto na Sacola de Compras
</details>

### Contribuições pessoais
<p align="justify">
No código, além de trabalhar com o front-end, trabalhei na criação de DTOs (Data Transfer Object), um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.
	
<details><summary>DTO</summary>
<p align="justify">
	
>A ideia consiste basicamente em agrupar um conjunto de atributos numa classe simples de forma a otimizar a comunicação. Além disso, muitas vezes os dados usados na comunicação não refletem exatamente os atributos do seu modelo. Então, um DTO seria uma classe que provê exatamente aquilo que é necessário para um determinado 
processo.
  
Abaixo está um exemplo de ProdutoDTO:

>O código apresenta a classe "ProdutoDTO", que é uma classe de transferência de dados (DTO) usada para representar informações sobre um produto em um sistema. Ela possui cinco campos: "id" (identificador do produto), "nome" (nome do produto), "valor" (valor do produto), "categoria" (categoria do produto) e "status" (status do produto). A classe é anotada com "@Data" para gerar automaticamente métodos básicos, como getters e setters, e "@AllArgsConstructor" para gerar um construtor que aceita todos os parâmetros. Essa classe facilita o transporte e manipulação dos dados do produto em diferentes partes do sistema.
  
  ```
  @Data
  @AllArgsConstructor
  public class ProdutoDTO {
    private Long id;
    private String nome;
    private Double valor;
    private String categoria;
    private Integer status;
  }
  ```
  
Abaixo apresento um exemplo da chamada do DTO dentro de ProdutoController:
	
>Esse trecho de código representa um método que trata uma requisição POST para criar um novo produto. Ele recebe um objeto "Produto" como parâmetro, salva esse objeto no repositório de produtos,"ProdutoDTO" é preenchido com os dados salvos e retorna esse objeto como resposta da requisição. O uso de um DTO permite encapsular e transportar as informações relevantes do produto para a camada de apresentação ou comunicação com outros sistemas, evitando expor diretamente a entidade de domínio "Produto".
	
 ```
  @PostMapping
  public ProdutoDTO create(@RequestBody Produto produto){
    Produto save = produtoRepositorio.save(produto);
    ProdutoDTO res = new ProdutoDTO(save.getId(),save.getNome(),save.getValor(),save.getCategoria(),save.getStatus());
    return res;
  }
 ```
  
</details>

Na parte de usabilidade, desenvolvi os Wireframes no Figma e fiz cada tela prezando pela experiência do usuário (UX - user experience). Utilizamos template 
do Bootstrap e trabalhamos com HTML/ CSS e JavaScript para o desenvolvimento da aplicação web.
<details><summary>Página inicial</summary>
A imagem abaixo mostra a página inicial da aplicação, a usabilidade das cores (o que transmite para o usuário) e a forma como a barra de navegação é organizada.
<img src="https://user-images.githubusercontent.com/74321890/203669780-f534d9e9-698e-4341-8459-e819e880ea0a.png">

>O código HTML fornecido é a estrutura de uma página web para o DescontOn. A página apresenta um cabeçalho com um menu de navegação, um banner de boas-vindas com uma breve descrição do DescontOn, seções de benefícios e funcionalidades do sistema, e um rodapé com um link para o repositório do projeto no GitHub. O código faz uso de bibliotecas como Bootstrap e Boxicons para estilização e funcionalidades adicionais, além de referenciar arquivos CSS e JavaScript específicos. No geral, o código estrutura de forma organizada as diferentes seções e funcionalidades do DescontOn, fornecendo uma experiência intuitiva para os usuários.

O trecho de código a seguir mostra como montamos o componente de boas-vindas à aplicação.

```
  <!-- ======= Sobre Section ======= -->
  <section id="hero" class="d-flex flex-column justify-content-center align-items-center">
    <div class="container text-center text-md-left" data-aos="fade-up">
      <h1>Bem-Vindo ao&nbsp; <span>DescontOn</span></h1>
      <h2>Ferramenta para criar promoções de E-commerce, onde as mecânicas de promoções são feitas de forma flexível e
        de rápida atualização no sistema.</h2>
      <a href="#saiba-mais" class="btn-get-started scrollto">Saiba Mais</a>
    </div>
  </section>
  <!-- End Sobre -->
```
</details>
	
Atuei como Scrum Master, gerenciando e ajudando com impedimentos do time. Como ferramenta de apoio utilizamos o Jira para ter mais visualização e controle sobre as tarefas e suas divisões para cada membro da equipe.
<details><summary>Jira - DescontOn</summary>
Para mostrar melhor a usabilidade do Jira e divisão de histórias, abaixo está o roadmap do projeto. 

<img src="https://user-images.githubusercontent.com/74321890/203658630-474dbc4f-a670-470a-836e-d75cd28cf59a.jpeg">
</details>

Documentei o projeto, sendo no Github algumas descrições mais específicas e menos teóricas, já no documento em .pdf falo melhor sobre a teoria das cores, descrição sobre linguagens e frameworks usados e explico trechos de código.
<details><summary>Documentação</summary>
Abaixo está o ínicio da documentação feita no Github, para mais detalhes acesse o nosso github.

<img src="https://user-images.githubusercontent.com/74321890/203660418-1ba84ed7-a534-48b1-9335-eb8598f4ce4e.png">
</details>
	
### Aprendizados Efetivos
<p align="justify">
  
No desenvolvimento dos serviços do DescontOn, aprendi mais sobre desenvolvimento web. Foi a primeira vez na faculdade em que trabalhei de fato com uma aplicação 
front-end separada dos serviços chamados de back-end.

Por conta desta experiência, fui inserida a um novo nível de exigência para a construção de um sistema web, tendo que me preocupar com o formato e conteúdo específico 
das requisições possíveis de entrada no serviço desenvolvido.

Além disso, foi minha primeira vez atuando no papel de Scrum Master e colocando a metodologia ágil em prática.

- Criação de wireframes, desenvolvimento web e ux: sei fazer com autonomia.
- Utilização da metodologia ágil e atuação como SM: sei fazer com autonomia.
- Utilização de DTO em códigos: sei fazer com autonomia.

<br/>

# Projeto 4: 2º semestre de 2022
## Empresa parceira:
Subiter

<img src="https://user-images.githubusercontent.com/74321890/200832569-795e2fa6-0fc6-4b1e-8547-d7b2abf82c0b.jpg" height="300"/>

<p align="justify">
A Subiter é uma empresa de base tecnológica especializada em visão infravermelha. Sua missão é ajudar a indústria a alcançar excelência em seus processos produtivos. Por meio de sistemas inteligentes de inspeção e monitoramento, podemos observar fenômenos que estão além da capacidade dos olhos humanos.

### Visão do Projeto
<p align="justify">
Sistema ERP que visa gerenciar e controlar dados, afim de reduzir custos, facilitar tomadas de decisão, otimizar o tempo de atendimento de chamados e aprimorar o 
solucionamento destes. É composta por níveis de usuários, onde o administrador terá controle sobre todas as funcionalidades existentes, dentre elas o cadastro, edição e exclusão de outros usuários; o suporte ficará responsável pelo CRUD de falhas e soluções genéricas e CRUD de equipamentos; o cliente trará o problema para o suporte e, este ficará responsável por gerenciar o chamado e resolvê-los.

A MCS (Management and Control System) trouxe de uma forma fácil e rápida o mais importante: o mapeamento gráfico de anomalias nas silhuetas.
  
<p align="justify">
O Mapemamento de anomalias consiste em durante ou após uma inspeção, o suporte conseguirá fazer o upload da silhueta e adicionar as falhas (específicas do chamado) encontradas em formas e tamanhos diferentes para uma melhor identificação da posição e tamanho, facilitando na identificação de quantidade e quais materiais serão utilizados para a solução dessas falhas e também no cálculo do orçamento.

Sua interface web facilita a gestão de dados e dá autonomia aos usuários dessa aplicação para que possam atuar com desenvoltura dentro das permissões concedidas. 

[<img src="https://github.com/DolphinDatabase/MCS/blob/main/Imagens/MCS_Youtube.png" width="40%">](https://www.youtube.com/watch?v=omSyXxA3AYI&list=PLUOBqJKbljZv85QQ4B3ExV93PQVVf8n2o "MCS vídeo Demonstração")

Link do repositório do projeto: https://github.com/DolphinDatabase/MCS

## Tecnologias utilizadas:
<p align="justify">
Assim como no projeto anterior, a aplicação teve desenvolvimento web, a única diferença foi utilização o framework VueJS para a construção do front-end da aplicação.
<details><summary>VueJS</summary>
<p align="justify">
	
>Vue.js é um framework JavaScript de código aberto utilizado para construir interfaces de usuário interativas e dinâmicas. Ele é baseado em componentes reutilizáveis e adota uma abordagem de programação reativa, permitindo a criação de aplicativos web de uma única página (SPA) de forma eficiente. O Vue.js combina recursos modernos do JavaScript com uma sintaxe simples e intuitiva, facilitando o desenvolvimento de aplicativos web complexos. Ele é amplamente utilizado na comunidade de desenvolvimento web devido à sua flexibilidade, desempenho e curva de aprendizado suave.
</details>

<details><summary>Konva</summary>
<p align="justify">
	
>Konva.js é uma biblioteca JavaScript de código aberto que facilita a criação de gráficos interativos e de alto desempenho em aplicativos da web. Ela é especialmente projetada para trabalhar com elementos gráficos bidimensionais, como desenhos, animações e manipulação de objetos em um ambiente de tela HTML5. Konva.js fornece uma API simples e poderosa que permite criar e gerenciar facilmente elementos gráficos, aplicar transformações, adicionar interatividade, detectar eventos, fazer desenhos vetoriais e muito mais. Com a ajuda do Konva.js, os desenvolvedores podem criar aplicativos visualmente ricos, como editores de imagem, jogos, mapas interativos e ferramentas de desenho.
</details>
	
Para a programação das rotas HTTP, os serviços e API do back-end foram feitas em Java.
	
Um diferencial do banco de dados, como requisito da FATEC, foi a utilização do OracleCloud.
<details><summary>OracleBD</summary>

 > É o SGBD da Oracle, o mais utilizado em aplicações corporativas, lançado em meados dos anos 70, é multiplataforma e possui licença comercial.

Foi usado para estruturar o modelo de dados relacional da aplicação, além disso foram criadas procedures e triggers no SGBD.
Para acessar a documentação sobre como conectar Autonomous Database da Oracle Cloud com Spring Boot JDBC do clique [aqui.](https://github.com/DolphinDatabase/MCS/blob/main/Documenta%C3%A7%C3%A3o/Como%20conectar%20Autonomous%20Database%20da%20Oracle%20Cloud%20com%20Spring%20Boot%20JDBC.pdf)

</details>

### Contribuições pessoais
<p align="justify">

Neste projeto minha principal responsabilidade no código foi o desenvolvimento das telas no front-end, utilizando a biblioteca Element+ para ícones, tabelas, entre outros e konva para o desenho do mapeamento de anomalias. 

Trabalhando com o VueJS, a separação de código acontece por meio de views, components, entre outros.

Abaixo mostro alguns exemplos do desenvolvimento do **front-end** em VueJS.
<details><summary>Tela - Home</summary>
<p align="justify">

<img src="https://github.com/pdrMottaS/Portifolio/assets/74321890/12f0fd7e-760f-4b28-bac5-a8e88a573b2f">
	
>Nesse trecho de código, mostro como é estruturado a HomeView.vue. Esse template define a estrutura de uma página de login com elementos e conteúdos específicos, usando a sintaxe do Vue.js para criar componentes reutilizáveis e interativos.

```
<template>
  <div id="page">
    <div id="loginBackgorund">
      <div>
        <img src="../assets/Logo.svg">
        <p style="margin-top: auto;">da Subiter.</p>
      </div>
      <div>
        <p>Bem-vindo</p>
        <p>De volta!</p>
      </div>
      <div>
        <p>Alcance o invisível, Subiter</p>
      </div>
    </div>
    <div id="loginMain">
      <div id="loginContent">
        <section id="welcome">
          <h1>Login</h1>
          <div>
            <img src="../assets/Icons/Info.svg" style="width: 12px; margin:1px 7px;"/>
            <span>
              <p>Olá, amigo! Por favor entre no</p>
              <p>Sistema de Gerenciamento de Controle.</p>
            </span>
          </div>
        </section>
        <LoginForm/>
      </div>
    </div>
  </div>
</template>
```

>Esse código também contém a importação de um componente "LoginForm" que conta com a identificação de email, senha e tipo de usuário, onde conseguimos identificar na seção de script:

```
<script> 
import LoginForm from '../components/form/LoginForm.vue'
export default {
  name:"Login",
  components:{
    LoginForm
  }
}
</script>
```

>Para lidar com o design e estilização com CSS, o Vue contém também uma seção onde é possível utilizar com class e ids:
```
<style scoped>

#loginBackgorund {
  background-image: url("../assets/BgLogin.svg");
  width: 50%;
  height: 100%;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  padding: 3rem;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  color: #fff;
  font-size: 70px;
  font-weight: bold;
}

.loginBackground div:first-child{
  display: flex;
}
</style>
```

>O uso do modificador scoped garante que essas regras de estilo sejam aplicadas somente aos elementos dentro do escopo do componente atual, evitando que sejam afetados por estilos definidos em outros componentes ou estilos globais da aplicação.
</details>

<details><summary>Tela - Desenho de Anomalias</summary>
<p align="justify">
	
 > A cada vez que o usuário clicava dentro da tag canvas uma função era disparada para adicionar as coordenadas do formato desenhado para uma array local e em seguida ser armazenada no banco de dados:
 ```
 draw(evt){
  const stage = evt.target.getStage();
  const pos = stage.getPointerPosition();
  const nl = {
    x:pos.x,
    y:pos.y,
    height: this.tamanho,
    width: (this.forma=="alongado")?(this.tamanho*3):this.tamanho,
    fill:this.color,
    type:this.forma,
    info:{
        w:null,
        h:null,
        d:null
    }
  }
  if(this.forma=="isolado"){
      nl['radius']=this.tamanho/2
  }
  this.layers[this.forma].push(nl)
}
 ```
 > A função "draw" recebe um evento (evt) como parâmetro. Dentro da função, é obtida a referência ao stage a partir do evento. Em seguida, é obtida a posição do ponteiro (pos) no stage. Com base nessa posição, são definidas as propriedades de um novo objeto (nl) que será desenhado. As propriedades incluem as coordenadas x e y, altura e largura, cor de preenchimento, tipo de forma e informações adicionais. Se a forma for "isolado", é definido também o raio com base no tamanho. O novo objeto é então adicionado a uma camada específica (this.layers[this.forma]) para armazenamento.

<img src="https://github.com/DolphinDatabase/MCS/assets/74321890/53243fd2-ffcd-4a47-b175-77c65ae08ff5">
	
</details>

No **back-end**, participei do desenvolvimento das rotas HTTP na linguagem Java.
<details><summary>Rota de Orçamento</summary>
<p align="justify">

<img src="https://github.com/DolphinDatabase/Cloud-In/assets/74321890/37241191-d331-4ae5-81df-281e1e79af07">
	
>Realizei o CRUD de orçamento, porém abaixo mostro o método de uma solicitação GET para listar orçamentos. Ele verifica a permissão do usuário, recupera os resumos de orçamento e retorna uma resposta com o resultado da operação, incluindo mensagens informativas em caso de sucesso ou mensagens de erro em caso de exceção.
```
    @GetMapping
    @PreAuthorize("hasRole('ADM')")
    public ResponseEntity<ResponseSummaryModel> listBudget(){
        ResponseSummaryModel res = new ResponseSummaryModel();
        try{
            List<BudgetSummaryModel> all = bRepository.findAll().stream().map(this::toBudgetSummaryModel).collect(Collectors.toList());
            res.setAll(200, true, "Todos os Orçamentos listados", all);
            logger.info(res.getMessage());
            return ResponseEntity.status(HttpStatus.OK).body(res);
        }catch(Exception err){
            res.setAll(500, false, err.getMessage(), null);
            logger.error(res.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(res);
        }
    }	
```

</details>

Na parte de design, ajudei na criação de wireframes.
<details><summary>Wireframes</summary>
	
Para acessar nossos *Wireframes*, clique [aqui.](https://www.figma.com/file/MM0pLqbdpFde9cqt9upsWx/MCS-Dolphin?node-id=0%3A1).

<img src="https://github.com/DolphinDatabase/Cloud-In/assets/74321890/a2e5f9ff-2b5e-4270-b66e-678b0ecf13e4">

</details>	

Atuando no papel de Scrum Master, fiquei responsável pelo gerenciamento de impedimentos e organização de tarefas.
<details><summary>Jira - MCS</summary>
Para mostrar melhor a usabilidade do Jira e divisão de histórias, abaixo está o roadmap do projeto. 

<img src="https://github.com/pdrMottaS/Portifolio/assets/74321890/bd665fe3-0d36-41cf-8b72-760a2207bd60">
</details>
	
Documentei o projeto no GitHub, desenvolvi documentos sobre o manual do usuário e como está a organização do código e suas funcionalidades.
<details><summary>Documentação</summary>

Para acessar nosso *manual do usuário*, clique [aqui](https://github.com/DolphinDatabase/MCS/blob/main/Manual/MCS_ManualdoUsu%C3%A1rio.pdf)
	
<img src="https://github.com/DolphinDatabase/Cloud-In/assets/74321890/978b4f38-bb0a-466d-bef1-500825c504de">

</details>
	
Minhas áreas de atuação:
- Home: front-end
- CRUD de Usuários: front-end
- CRUD de Equipamentos: front-end 
- CRUD Falhas e Soluções genéricas: front-end
- Orçamento: front-end e back-end
- Mapeamento gráfico: front-end

## Aprendizados Efetivos
Durante o projeto participei de um Hackathon organizado pela empresa Soluções Sophia, junto com os outros integrantes do grupo Dolphin Database.
Nesse evento, unimos tecnologia e educação onde nosso objetivo foi aperfeiçoar as ideias e implementá-las em um aplicativo feito para professores, pais e alunos. Meu grupo ficou responsável pelo tópico de frequência de alunos, então desenvolvi um protótipo no figma e a aplicação front-end utilizando o VueJS.

Como aluna destaque, fui contratada como estagiária na Soluções Sophia, onde trabalho atualmente com o desenvolvimento web e design.

- Desenvolvimento de serviços CRUD: sei fazer com autonomia.
- Desenvolvimento utilizando VueJS: sei fazer com autonomia.
- Utilização de OracleCloud: sei fazer com autonomia.

# Projeto 5 - 2º semestre de 2021
## Empresa parceira:
MidAll<br/>
![midall](https://user-images.githubusercontent.com/74321890/191144569-593506c4-b02e-41bf-830d-9f6e88a57278.jpeg)

<p align="justify">
A MidAll nasceu para simplificar a jornada de evolução do seu negócio, visando atingir qualquer visão estratégica. Nossa missão é preparar as empresas para o futuro em uma nova era de disrupções de mercado somadas aos desafios pós-pandemia. Acreditamos que Tecnologia, Dados e Inovação voltados à geração de valor para o cliente são o ambiente de negócios perfeito para resultados promissores.

### Visão do Projeto

O software Cloud-In é um aplicativo orquestrador para transferência automática de arquivos entre sistemas de armazenamento online. Através de sua interface minimalista e interativa, o usuário pode cadastrar suas credenciais e configurar as transferências conforme sua necessidade, iniciando a jornada de download e upload entre os storages.

[<img src="https://user-images.githubusercontent.com/74321890/228991716-687c07f9-3b6a-4cea-b855-677b51b2b20a.svg" width="60%" height="60%">](https://www.youtube.com/watch?v=AGRvBq9Xq4U&list=PLUOBqJKbljZsvHbaHWKrQ3z0l9l2Uo_f0 "Cloud-in vídeo Demonstração")

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
