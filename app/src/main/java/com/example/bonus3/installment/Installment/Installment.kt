package com.example.bonus3.installment.Installment

import java.time.Period


data class Installment(var name: String = "Kaspi",
                        var type: String = "Installment payment",
                        var timePeriod: Period = Period.ofMonths(6))


fun main(args: Array<String>) {
    val installment = Installment()
    val customInstallment = installment.copy(timePeriod = Period.ofMonths(12))
    print(customInstallment)
}