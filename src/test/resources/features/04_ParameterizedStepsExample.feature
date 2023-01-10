Feature: PArametreli step kullanimi

  Scenario: Cucumber step definition (Cucumber Edition )
    Given Ilk sayi 5
    And Ikinci sayi 3
    When Bu sayilari + operatorune sokarsam
    Then Sonuc 8 olmalidir

    Scenario Outline: Cucumber Step Definition (Cucumber Edition)
      Given Ilk sayi 5
      And Ikinci sayi 3
      When Bu sayilari + operatorune sokarsam
      Then Sonuc 8 olmalidir
      Examples:
        | sayi1 |sayi2|operator|sonuc|
      |    10   | 15    |  +      |  25   |
      |    5     |   2    |   -      |   3    |
      |   4       |   7     |     *     |   26     |
      |         9  |   2      |       /    |    4      |

  Scenario : Cucumber Step Definition (RegEx Edition)
    Given Ismim "Esma"
    And Soyismim "Aslan"
    When Ehliyet Aldigimda
    Then Ehliyetimde "Esma Aslan" yazmali

