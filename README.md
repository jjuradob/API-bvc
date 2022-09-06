# API-bvc
Se crea API para gestion de eventos digitales

Metodo POST para insertar un evento digital
https://eventos-digitales-bvc.lm.r.appspot.com/operacion

Un json de ejemplo para insertar un evento es el siguiente:
{
   "plataforma": "PACTO",
   "evento": "F004",
   "cantidad": 3,
   "valor": 100   
}

metodo GET para obtener eventos digitales
https://eventos-digitales-bvc.lm.r.appspot.com/operacion

metodo GET para obtener el consolidado
https://eventos-digitales-bvc.lm.r.appspot.com/operacion/query?plataforma
