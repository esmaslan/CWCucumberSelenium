Feature: Google arama testi feature

  Background:  Kullanici her senoryoda google sitesinde olacaktir
    Given Kullanici google sayfasindadir

  Scenario: Kullanici samsung aradginda samsung gormelidir

    When Kullanici samsung kelimesini arar
    Then Kullanici sayfada samsung kelimesi gectigini dogrular


  Scenario: Kullanici samsung aradginda samsung gormelidir
    When Kullanici cucumber kelimesini arar
    Then Kullanici sayfada cucumber kelimesi gectigini dogrular


  Scenario: Kullanici samsung aradginda samsung gormelidir
    When Kullanici selenium kelimesini arar
    Then Kullanici sayfada selenium kelimesi gectigini dogrular

