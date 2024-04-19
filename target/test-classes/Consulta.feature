Feature: Consulta de Curso (19/04/2024)

  Scenario: Caminho feliz
    Given cliente acessa site Iterasys
    When clicar no card do curso "Inicio rapido em teste e QA"
    Then apresenta pagina do curso na Udemy