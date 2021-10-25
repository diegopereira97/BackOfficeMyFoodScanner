#language: pt
#encoding: UTF-8
#author: Diego.Pereira
#version 1.0
Funcionalidade: Validar Cadastro do Produto

  Esquema do Cenario: Validar cadastro preenchendo o campo obrigatório do produto
    Dado que valido o título da página de Login
    Quando preencho os dados de cadastro com email <email>
    	E preencho os dados de cadastro com senha <senha>
    Entao devo clicar no botão login
    	E visualizo a tela Home do MyFoodScanner
    	E clico no submenu Produto
    	E valido título da página
    	E clico no botão adicionar produto
    	E valido o título da página
    	E informo o nome do produto
    	E clico no botão salvar do produto
    	E valido alerta do produto criado com sucesso
    	E fecho navegador
    

    Exemplos: 
      | email |  | senha                    |
      | root  |  | l+893ldgBQc6lUnZGG0ANg== |