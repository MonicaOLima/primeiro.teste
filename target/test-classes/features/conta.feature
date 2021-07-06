
#Author: monicaoliveiralimalombardi@gmail.com

@executa
Feature: Cadastro de cliente
  Eu como usuario quero fazer o cadastro de cliente para utilizacao do site
 
  Scenario: Cadastrar conta
    Given que esteja na tela de cadastro de cliente
    When informar todos os dados obrigatorios
    Then cadastro realizado com sucesso

    