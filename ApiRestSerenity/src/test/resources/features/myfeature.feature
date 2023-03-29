Feature: obtener planetas por Id
AS usuario de The Star Wars API
I WANT TO
obtener informacion de un planeta
SO THAT
I ver planetas registrados
@Get
Scenario Outline: buscar planetas
  Given el usuario esta en la pagina de busqueda
  When cuando el usuario envia solicitud de busqueda  por id <id>
  Then la pagina retornara un estatus con codigo <codigo>
  And  nombre <nombre> periodo de rotacion <rotacion> clima <clima>
  Examples:
    | id | codigo | nombre     | rotacion | clima  |
    | 3  | 200    | "Tatooine" | "23"     | "arid" |
    | 1  | 400    | "Tatooine" | "12"     | "arid" |
