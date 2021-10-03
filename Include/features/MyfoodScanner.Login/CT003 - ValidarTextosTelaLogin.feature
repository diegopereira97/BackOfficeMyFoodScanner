#language: pt
#encoding: UTF-8
#author: Diego.Pereira
#version 1.0
Funcionalidade: Validar Textos da Tela de Login

  Esquema do Cenario: Validar Textos da tela de Login
    Dado que valido o título da página de Login
    E valido nome do campo email <validarTextoEmailDoLogin>
    E valido nome do campo senha <validarTextoSenhaDoLogin>
    E valido nome do botão login <validarTextoDoBotaoDoLogin>
    E valido nome do checkBox Lembre me <validarTextoLembremeDoLogin>
    E valido o link esqueceu sua senha <validarTextoEsqueceuSuaSenhaDoLogin>
   
   
    Exemplos: 
      | validarTextoEmailDoLogin |  | validarTextoSenhaDoLogin |  | validarTextoDoBotaoDoLogin |  | validarTextoLembremeDoLogin |  | validarTextoEsqueceuSuaSenhaDoLogin |
      | Email                    |  | Password                 |  | Login                      |  | Lembre me?                  |  | Esqueceu sua senha?                 |
