Feature: Pruebas de Regresion API Petstore - Obtener Mascota por status

  Background:
    * def headers = read('file:src/test/java/bdd/api/header/petstore-header.json')

  @regresion @happypath @obtenerMascotaStatus
  Scenario: Validar obtener mascota por status "sold" - OK
    Given url baseUrl + "/pet/findByStatus?status=sold"
    And headers headers
    When method GET
    Then status 200
    * def ids = $[*].id
    * match ids contains 123456