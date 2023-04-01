@Sepulsa
Feature: Sepulsa
  @Login @NormalPositive @LoginSepulsaSuccess
  Scenario: User can login with valid username and valid password
    Given user is on sepulsa home page
    When user click on the masuk button
    And user input valid sepulsa username "jewmvcbiczgwmhbmia@bbitj.com"
    And user input valid sepulsa password "kkHjiJCwmqy6zV@"
    And user click on the submit login button
    And user click on the akun button on navbar
    Then user can see their profile page and this text "Lihat & ubah profil"

  @Login @NormalNegative @LoginSepulsaFailed
  Scenario: User can't login with invalid username and invalid password
    Given user is on sepulsa home page
    When user click on the masuk button
    And user input invalid sepulsa username "invalidusername"
    And user input invalid sepulsa password "invalidpassword"
    And user click on the submit login button
    Then user see this "Coba ingat-ingat lagi alamat e-mail/ nomor handphone dan password kamu. Masih ada yang salah nih." alert message invalid account

  @Product @NormalPositive @ProductSepulsaTelkomsel
  Scenario: User can choose Pulsa Telkomsel 20 ribu
    Given user is on sepulsa home page
    When user click on the pulsa button on menu
    And user input nomor handphone "082134567899"
    And user choose nominal 20 ribu
    Then user can see "Total Pembayaran" checkout page

  @Product @NormalPositive @ProductSepulsaGoPay
  Scenario: User can choose GoPay Top Up Nominal 25 ribu
    Given user is on sepulsa home page
    When user click on the uang elektronik button on menu
    And user click on the Go-Pay button
    And user input nomor handphone "082134567899"
    And user choose nominal 25 ribu
    Then user can see "Total Pembayaran" checkout page

  @Payment @NormalPositive @PaymentSepulsaWithGopay
  Scenario: User can checkout ShopeePay Top Up with GoPay Payment
    Given user is logged in on sepulsa with username "jewmvcbiczgwmhbmia@bbitj.com" and password "kkHjiJCwmqy6zV@"
    When user click on the uang elektronik button on menu
    And user click on the ShopeePay button
    And user input nomor handphone "082134567899"
    And user choose nominal 15 ribu
    And user can see "Total Pembayaran" checkout page
    And user click on the GoPay payment method
    Then user click on the Bayar Sekarang button
