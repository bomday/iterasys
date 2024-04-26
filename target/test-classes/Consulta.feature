Feature: Caminho Feliz (19/04/2024)

  Scenario: Acessar pagina curso "Inicio rapido em teste e QA"
    Given cliente acessa site Iterasys
    When clicar no card do curso "Inicio rapido em teste e QA"
    Then apresenta pagina do curso na Udemy
    
  Scenario: Abrir aba "Exames"
    Given cliente acessa site Iterasys
    When clicar no item "Exames" no navbar
    Then apresenta pagina "exames"

	Scenario: Abrir aba "Conhecer, Competir, Crescer"
	  Given cliente acessa site Iterasys
	  When clicar no item "Eventos" no navbar
	  And clicar no item "Conhecer, Competir, Crescer"
	  Then apresenta pagina "conhecer-competir-crescer"

	Scenario: Abrir aba "Eventos Anteriores"
	  Given cliente acessa site Iterasys
	  When clicar no item "Eventos" no navbar
	  And clicar no item "Eventos Anteriores"
	  Then apresenta pagina "eventos"

  Scenario: Abrir aba "Comunidade"
    Given cliente acessa site Iterasys
    When clicar no item "Comunidade" no navbar
    Then apresenta pagina "comunidade"
    
    
  Scenario: Abrir aba "Sobre"
    Given cliente acessa site Iterasys
    When clicar no item "Sobre" no navbar
    Then apresenta pagina "sobre"
    
  Scenario: Abrir aba "Contato"
    Given cliente acessa site Iterasys
    When clicar no item "Contato" no navbar
    Then apresenta pagina "contato"