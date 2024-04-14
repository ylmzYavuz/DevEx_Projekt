Feature: AnmeldeFunktion

  @login @smoke @regression
  Scenario Outline: Uberprufe die Anmelde funktion mit gultigen Zugangsdaten
    Given Der Benutzer befindet sich auf der Login-Seite.
    When Der Benutzer gibt "<gultiger BenutzerEmail>" und "<gultiges Passwort>" ein.
    Then Der Benutzer sollte sich auf der Website anmelden konnen.
    Examples:
      | gultiger BenutzerEmail | gultiges Passwort |
      | batch11test@gmail.com  | Yilmaz.1234       |
