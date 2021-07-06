#Author: monicaoliveiralimalombardi@gmail.com

@executa
Feature: Acessar o login
  Eu como usuario quero fazer login para acessar os dados

  Scenario: Fazer login com dados invalidos
    Given que eu esteja na tela de login
    When informar usuario valido
    But senha invalida
    Then visualizo a mensagem Invalid credentials
