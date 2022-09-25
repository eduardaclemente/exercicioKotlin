# exercicioKotlin1 - Parte Conceitual 


<h1>PARTE I - Conceitos</h1>

<b>⦁	Explique a diferença entre aplicativos Nativos, Híbridos e Web App (mobile Web).</b>

Os aplicativos nativos formam um ecossistema no qual se adaptam ao sistema operacional ao qual pertencem e fazem interoperabilidade somente entre eles, evoluindo suas features a partir desse ecossistema. Enquanto os aplicativos híbridos são intermediários entre os nativos e aplicativos web, eles fazem o acesso e manipulação entre os componentes para construir a aplicação, de forma, que utilizando ele fazemos um reaproveitamento. 
Por fim, temos os aplicativos web que nada mais são do que uma requisição em forma de interface para o usuário.
No final o que devemos levar em consideração é que os aplicativos nativos nos permitem total acesso as configurações, recursos, features, interface, manipulação da minha aplicação pois vai ter uma cobertura mais ampla na construção dela, enquanto a Web é focada na ponta que quer gerar a alta performance, a interface sendo executada pelo navegador e a experiência do usuário  na construção, sendo o híbrido uma linha tênue entre ambos para necessidades que precisam de requisições que vão ter algumas coisas manipuladas entre esses dois mundos. 

<b>⦁	De um ou mais exemplos onde um aplicativo Mobile Nativo seria mais adequado que um aplicativo mobile web e,  explique por que. </b>

A partir do momento que se tem a necessidade de ter acesso aos recursos da aplicação, ou em outro exemplo é o poder de moldar uma plataforma para ser utilizada para vários tipos de distribuições diferentes. O fato do aplicativo nativo ser mais adequado do que o web nessas situações, se vem do fato dele possibilitar que o desenvolvedor possa acessar dados do sistema operacional por meio do próprio aplicativo, uma vez que aplicação e sistema são compatíveis e possuem a mesma linguagem.

<b>⦁	Explique qual a principal diferença entre uma classe Kotlin e uma classe Android Activity? </b>

Classes Kotlin: Trata o back-end e funcionalidades da aplicação, não necessariamente estão atreladas ao mobile ou telas, podem existir independente para outros fins como classes controller, services, repository, dto.
Classes Activity:  Está atrelado com o mobile e desenvolvimento de telas, o progresso e design do mobile. Ao criar uma Activity estamos automaticamente não só estabelecendo um vínculo com o mobile como uma tela que terá que ter elementos atuando. É uma boa prática sempre nome após o nome identificador da classe adicionar um Activity para que fique de fácil localização. ex: telaLoginActivity.
Sendo assim, a principal diferença entre as classes são suas áreas de atuação. 

<b>⦁	Considerando a organização abaixo, explique de forma geral, como são utilizados os seguintes três grupos de arquivos para um aplicativo Android:</b>

Manifesto: Aqui são as especificações do projeto, tais como package, nome do projeto, enconding do idioma de aceitação de caracteres.
Classe: Aqui é localizado tanto as classes utilitárias quanto as classes Activity, nelas se encontram a composição de construção para que as funcionalidades back-ends conseguissem interoperar, sendo declarado as variáveis e funções dentro dessas classes. Temos as Activity que geram as transições de interoperabilidades das telas, no caso cada Activity contém dentro de si somente as ações necessárias da sua retrospectiva tela, contendo o esqueleto de funcionamento daquela tela.
Resource: Aqui há uma diversificação de manipulação de arquivos .xml. Um dos exemplos são as classes Activity criadas que gerando telas criam arquivoa layout, mas pode haver outras manipulações, seja para design, como para criação de strings, mapeamento de aplicação, atrivuição de values. 
