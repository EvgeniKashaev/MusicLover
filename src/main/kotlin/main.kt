fun main() {

    var purchaseAmount = 200 // сумма покупок (Все цены указаны в рублях.)
    var purchase = 100000 //  цена за покупку (Все цены указаны в рублях.)
    val vip = true // Сообщает о наличие доп. скидки

    purchaseAmount += purchase //сумму текущий покупки добавляем к общей сумме за месяц..


    if (purchaseAmount in 1001..10000) {
        purchase -= 100
        println("С учетом скидки с Вас $purchase рублей.")
    } else if (purchaseAmount >= 10_001) {
        purchase -= (purchase * 5 / 100).toInt()
        println("С учетом скидки с Вас $purchase рублей.")
    } else {
        val salle = 1000 - purchaseAmount
        println("Вам скоро доступна скидка. Приобрети на сумму $salle рублей")
    }

    if (vip == true) {
        purchase -= (purchase * 1 / 100).toInt()
        println("Доп скидка при наличии подписки (VIP) $purchase рублей к оплате!")
    } // Применение доп скидки если она есть.

    println("Чем больше покупок тем больше скидка!\nСпасибо за покупку! ")
}