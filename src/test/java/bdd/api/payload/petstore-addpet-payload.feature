Feature: Agregar Mascota al servicio /pet

  Background:
    * def headers = read('file:src/test/java/bdd/api/header/petstore-header.json')
    * def req = read('file:src/test/java/bdd/api/req/petstore-addpet-req.json')
    * def schema200 = read('file:src/test/java/bdd/api/data/petstore-addpet-schema200.json')

  @agregarMascota
  Scenario: Validar agregar mascota exitosamente - OK
    Given url baseUrl + "/pet"
    And headers headers
    * set req.id = 123456
    * set req.name = "Mascota Prueba Id"
    And request req
    When method POST
    Then status 200
    And match response == schema200
    * def idpet = response.id
