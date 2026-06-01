Feature: Pruebas de Regresion API Petstore - Agregar Mascota

  Background:
    * def headers = read('file:src/test/java/bdd/api/header/petstore-header.json')
    * def req = read('file:src/test/java/bdd/api/req/petstore-addpet-req.json')
    * def schema200 = read('file:src/test/java/bdd/api/data/petstore-addpet-schema200.json')

  @regresion @happypath @agregarMascota
  Scenario: Validar agregar mascota exitosamente - OK
    Given url baseUrl + "/pet"
    And headers headers
    * set req.id = 12345
    * set req.name = "Mascota Prueba"
    And request req
    When method POST
    Then status 200
    And match response == schema200
