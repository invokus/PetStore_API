Feature: Manejar ordenes en la tienda


  @Crear_Orden
  Scenario: Crear una nueva orden con todos los datos válidos
    Given dado que estoy en la tienda
    And hago una solicitud POST con los siguientes datos
    When creo una orden con id "360", petId "0", cantidad 1, envio "2024-06-30T23:21:54.566Z", estado "placed", completo "true"
    Then valido el codigo de respuesta 200

  @Consultar_Orden
  Scenario Outline: Consultar una orden existente por ID
    Given dado que estoy en la tienda
    When hago una consulta con ID
    And inserto el id del producto "<id>"
    Then valido el codigo de respuesta 200
    Examples:
    | id |
    | 1 |