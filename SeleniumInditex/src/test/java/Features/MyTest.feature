@Feature
Feature: Funcionalidad de ejemplo


  Scenario: Buscar info de automatización

    Given Buscar "automatización" en google
    When Hacer click en el enlace de Wikipedia
    And Hacer click en el menú "Historia"
    Then el primer proceso automático se realizó en el año "270 a. C."

