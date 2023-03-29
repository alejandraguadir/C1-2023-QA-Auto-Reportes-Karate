Feature: Post comentario en JSONPlaceholder
  AS  usuario de API JSONPlaceholder
  I WANT TO
  crear comentarios
  SO THAT
  I ver comentarios

  Scenario Outline: Post comentario
    Given   url "https://jsonplaceholder.typicode.com/comments"
    And request   {  "postId": <id>,  "name": <name>, "email": <email>, "body":<body>}
    When method post
    Then status <code>
    And match response.name != null
    And match response.body != null
    Examples:
      | id  | code | name   | email                     | body    |
      | "1" | 201  | "mary" | "john.doe123@example.com" | "body1" |
      | "3" | 201  | "juan" | "ajJegmail.com"           | "body2" |