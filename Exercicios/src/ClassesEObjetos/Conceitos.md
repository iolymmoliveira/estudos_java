.Classe => Definição do Tipo de Dado. A classe descreve o tipo.
          Toda classe é uma definição, é uma estrutura que armazena valores. Essas variáveis que compõe um tipo de dado, que compõe a classe são chamados de atributos. Esta estrutura que armazena as informações é composta de atributos e todas essas operações que se pode fazer com esses atributos são chamadas de métodos. Cada operação é um novo método.

.Objeto => É a realização, a criação, a instanciação (variável) daquele tipo que irei usar no meu programa.

  Uma função(método) pode e deve mexer com os atributos.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

- Modificadores de acesso a membros (atributos ou métodos):
  Pode-se especificar o quão acessível é um atributo ou método de um objeto a partir de outros objetos.
  Utiliza-se exclusivamente para dar um grau de proteção da classe.
  
  Os valores possíveis são:
  - public => visibilidade externa local;
  - protected => visibilidade externa limitada;
  - private => nenhuma visibilidade externa;
  - default => todo mundo que está na mesma pasta consegue acessar os atributos dessa classe;

- Encapsulamento é quando se pega a estrutura de um determinado objeto, de uma determinada classe e faz uma proteção da sua estrutura interna, permitindo que apenas os métodos ou as funcionalidades ou como uso aquela classe seja efetivamente importante. Encapsular atributos e métodos em um objeto, em uma classe é esconder a estrutura interna para que o programador que irá utilizar essa estrutura no programa dele não tenha acesso a estrutura interna, porém ele saberá perfeitamente como utilizar, pois tem-se os métodos/as funcionalidades do objeto.
Implementa-se utilizando os modificadores.

- Como modificar os atributos que receberam um modificador(ex.:private)? 
  Se há atributos que são de acesso restrito apenas a classe como faço para modificar e /ou acessar esse atributo:
  O modelo mais comum e que é o padrão é criar métodos que acessam e métodos que modificam. 
    - GET => Método para acesso, para consulta;
    - SET => Método para modificar;

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -     

- Static => Indica que existe somente uma instância do atributo associado a classe. O atributo do tipo static não está associado ao objeto, está associado à classe. Ele existe porque existe uma classe.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -   

- POJO => Plain Old Java Object => É um objeto simplificado, ou seja, um objeto que só possui atributos e métodos para acesso dos atributos da classe. Não há nenhuma funcionalidade extra.

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

- Sintase Sugar 

for (Refrigerante r: lista) {
  str += "| " + r.getNome() + " R$ " + r.getPreco() + "\n";
}

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

Aplicação ORIENTADA A OBJETO => é uma MAIN que usa/que faz interação com o usuário. A MAIN é que irá receber dados e exibir informação para o usuário. 