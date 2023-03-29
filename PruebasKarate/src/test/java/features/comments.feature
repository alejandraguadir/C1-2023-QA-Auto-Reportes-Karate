Feature: Post comentario en JSONPlaceholder
  Scenario: Post comentario
    Given   url "https://jsonplaceholder.typicode.com/comments"
    And request   {  "postId": 1,  "name": "id", "email": "Eliseo@gardner.biz", "body": "accusantium"}
    When method post
    Then status 201