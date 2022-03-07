<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="layout" content="main; charset=UTF-8">
        <title>Área restrita - Restaurante Tô Com Fome</title>
    </head>
    <body>
        
        <sec:ifLoggedIn>
           Olá ${usuario}
           <a href="/Restaurante/j_spring_security_logout">Sair</a>
        </sec:ifLoggedIn>
       
    </body>
</html>
