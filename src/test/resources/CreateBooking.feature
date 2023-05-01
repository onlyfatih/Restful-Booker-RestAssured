Feature: Kullanici olarak otel rezervasyonu olusturabilirim.

  Scenario: Kullanici bir otel rezervasyonu olusturabilir ve rezervasyonu silebilir
    Given Kullanici yeni bir rezervasyon olusturuyor
    And Kullanici rezervasyon icin gerekli bilgileri veriyor
    When Kullanici otel rezervasyonu olusturuyor
    Then Rezervasyon basarili sekilde olusturuldu
    And Kullanici olusturulan rezervasyonu iptal ediyor