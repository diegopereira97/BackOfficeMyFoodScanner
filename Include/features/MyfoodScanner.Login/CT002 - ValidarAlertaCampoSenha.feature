#language: pt
#encoding: UTF-8
#author: Diego.Pereira
#version 1.0
Funcionalidade: Validar alertas da Tela de Login

  Esquema do Cenario: Validar alertas da tela de Login
    Dado que valido o título da página de Login
    Quando preencho os dados de cadastro com email <email>
    E preencho os dados de cadastro com senha <senha>
    Entao devo clicar no botão login
    E devo visualizar o alerta do campo senha <alertaSenha>

    Exemplos: 
      | email |  | senha |  | alertaEmail |  | alertaSenha                     |
      | root  |  |       |  |             |  | The Password field is required. |
