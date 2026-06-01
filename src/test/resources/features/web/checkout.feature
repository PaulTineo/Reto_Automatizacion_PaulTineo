Feature: Compra de Productos Ecommerce

  @regresion @happyPath
  Scenario Outline: Validar compra de producto correctamente
    Given ingreso a la pagina web DemoBlaze
    When selecciono los productos al carrito:
      | Samsung galaxy s6 |
      | Nexus 6           |
    And visualizo mi carrito de compras
    And lleno mis datos de compra con name "<name>", Country "<country>", City "<city>", Month "<month>", Year "<year>"
    Then valido que la compra se haya realizado correctamente con el mensaje "Thank you for your purchase!"

    Examples:
      | name       | country | city | month | year |
      | Paul Tineo | Peru    | Lima | 12    | 2026 |


