Feature: Add a new address to an account

  Scenario Outline: user can add an address to his account
    Given an open browser with HotelTestlabCoderslab
    When the form is filled in with an email <emailLogin> and a password <passwordLogin>
    Then the form is filled in with an address <address> and a postcode <postcode> and a city <city> and a mobile number <mobile> and an address name <addressReference>

    Examples:
      |emailLogin             |passwordLogin |address            |postcode   |city |mobile   |addressReference|
      |helena.kowalska5@op.pl |akslawok      |Flower Street 3    |60000      |Warsaw|898989890|Address1       |
      |olek.nowak5@gmail.com  |kawonkelO     |Pretty Street 3/5  |63001      |Poznan|904675576|Address1       |
      |joanna.parnas5@ukr.net |SanraP10      |Heel Street 345    |64098      |Gdansk|675489323|Address1       |
      |marek.bajorek095@op.pl |Kerojab87     |Friends Street 98/1|45678      |Kracow|898989890|Address1       |
