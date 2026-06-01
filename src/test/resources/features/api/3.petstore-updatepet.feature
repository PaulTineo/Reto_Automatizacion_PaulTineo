Feature: Pruebas de Regresion API Petstore - Actualizar Mascota

  Background:
    * def headers = read('file:src/test/java/bdd/api/header/petstore-header.json')
    * def req = read('file:src/test/java/bdd/api/req/petstore-addpet-req.json')
    * def schema200 = read('file:src/test/java/bdd/api/data/petstore-addpet-schema200.json')
    * def responseAdd = call read('file:src/test/java/bdd/api/payload/petstore-addpet-payload.feature@agregarMascota')
    * def idPet = responseAdd.idpet

  @regresion @happypath @actualizarMascota
  Scenario: Validar actualizar mascota exitosamente - OK
    Given url baseUrl + "/pet"
    And headers headers
    * set req.id = idPet
    * set req.name = "Mascota Prueba Actualizada"
    * set req.status = "sold"
    And request req
    When method PUT
    Then status 200
    And match response == schema200