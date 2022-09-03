Feature: usuario de uTest quiere crear un nuevo registro para acceder como usuario registrado

  Scenario: creación de usuario exitosa

    Given usuario en la página de inicio

    When usuario crea una cuenta llenando todos los campos

    Then usuario visuzaliza su nombre de usuario