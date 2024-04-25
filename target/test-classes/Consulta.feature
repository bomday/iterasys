Feature: Caminho Feliz (19/04/2024)

  Scenario: Acessar pagina curso "Inicio rapido em teste e QA"
    Given cliente acessa site Iterasys
    When clicar no card do curso "Inicio rapido em teste e QA"
    Then apresenta pagina do curso na Udemy
    
  Scenario: Abrir aba "Exames"
    Given cliente acessa site Iterasys
    When clicar no item "Exames" no navbar
    Then apresenta pagina "exames"

# Trabalhando em cenário    
# Scenario: Abrir aba "Eventos"
#   Given cliente acessa site Iterasys
#   When clicar no item "Eventos" no navbar
#   Then apresenta pagina "Eventos"

# Trabalhando em cenário   
#  Scenario: Abrir aba "Comunidade"
#    Given cliente acessa site Iterasys
#    When clicar no item "Comunidade" no navbar
#    Then apresenta pagina "comunidade"
    
    
  Scenario: Abrir aba "Sobre"
    Given cliente acessa site Iterasys
    When clicar no item "Sobre" no navbar
    Then apresenta pagina "sobre"
    
  Scenario: Abrir aba "Contato"
    Given cliente acessa site Iterasys
    When clicar no item "Contato" no navbar
    Then apresenta pagina "contato"