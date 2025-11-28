#Security

Documentación Oficial
https://docs.spring.io/spring-authorization-server/reference/getting-started.html

Videos
https://youtu.be/zDzvuTBrP1I
https://youtu.be/oHiIBkSv3nw
https://youtu.be/LM_Bnhf26Ew


Explicacion del flujo
https://youtu.be/nNVlewjKQEQ
https://youtu.be/V36F6xPaaFU


## PASOS

1. Hacer Login
2. Pegar esto en el navegador o postman
```shell
http://localhost:9000/oauth2/authorize?response_type=code&client_id=client-app&scope=read&redirect_uri=http://127.0.0.1:8080/authorized
```
En el scope=read podes poder los accesos ya sea read, write o incluso ambos

4. Esto devolvera un CODIGO el cual debes copiar

3. Hacer la peticion de postman para pedir el JWT
4. 
http://127.0.0.1:9000/oauth2/token
EL BODY ➡️ form-data
```json
Debes mandar
code
grant_type
redirect_uri
```
EN EL APARTADO DE HEADER

- Basic Auth
- username ➡️ client-app
- password ➡️ 12345