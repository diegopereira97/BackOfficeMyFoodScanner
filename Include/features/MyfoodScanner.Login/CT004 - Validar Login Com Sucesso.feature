#language: pt
#encoding: UTF-8
#author: Diego.Pereira
#version 1.0
Funcionalidade: Validar Login

  Esquema do Cenario: Validar Login com Sucesso
    Dado que valido o título da página de Login
    Quando preencho os dados de cadastro com email <email>
    E preencho os dados de cadastro com senha <senha>
    Entao devo clicar no botão login
    E visualizo a tela Home do MyFoodScanner
    E fecho navegador

    Exemplos: 
      | email |  | senha                    |
      | root  |  | l+893ldgBQc6lUnZGG0ANg== |
