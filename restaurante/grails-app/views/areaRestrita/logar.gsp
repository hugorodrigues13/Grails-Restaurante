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
        <form action='${request.contextPath}/j_spring_security_check' method='POST' id='ajaxLoginForm' name='frml'>
            <p>
                Email
                <input type='text' name='j_username' id='username'/>
                </p>
                <p>
                Senha
                <input type='password' name='j_password' id='password' />
                </p>
                <input type="submit" value="Entrar"/>
        </form>
         
    </body>
</html>
