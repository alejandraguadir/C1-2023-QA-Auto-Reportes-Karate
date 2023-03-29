Feature: crear comentarios en JSONPlaceholder
  AS  usuario de API de JSONPlaceholder
  I WANT TO
  agregar comentarios
  SO THAT
  I ver el comentario creado

  Scenario Outline: Post comentario
    Given   url "https://jsonplaceholder.typicode.com/comments"
    And request   {  "postId": <id>,  "name": <name>, "email": <email>, "body": <body>}
    When method post
    Then status <code>
    And response.name != null
    And response.email != null
    Examples:
      | id  | name   | email         | body    | code |
      | "1" | "Samy" | "s@gmail.com" | "body1" | 201  |