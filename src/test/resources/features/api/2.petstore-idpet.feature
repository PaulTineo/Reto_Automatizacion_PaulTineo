Feature: Pruebas de Regresion API Petstore - Obtener Mascota por ID

  Background:
    * def headers = read('file:src/test/java/bdd/api/header/petstore-header.json')
    * def responseAdd = call read('file:src/test/java/bdd/api/payload/petstore-addpet-payload.feature@agregarMascota')
    * def idPet = responseAdd.idpet
    * def schema200 = read('file:src/test/java/bdd/api/data/petstore-addpet-schema200.json')

  @regresion @happypath @obtenerMascota
  Scenario: Validar obtener mascota por ID - OK
    Given url baseUrl + "/pet/" + idPet
    And headers headers
    When method GET
    Then status 200
    And match response == schema200
    And match response.id == idPet