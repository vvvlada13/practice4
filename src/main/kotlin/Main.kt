
   //задание 1
    fun printFullName(firstName: String, lastName: String) {
        val fullName = "$firstName $lastName"
        println("Полное имя: $fullName")
    }
    fun main() {
        val myFirstName = "Владислава"
        val myLastName = "Горгун"
        printFullName(firstName = "Vladislava", lastName = "Gorgun")

        printFullName(myFirstName, myLastName)

        //задание 2
        fun printFullName(firstName: String, lastName: String) {
            val fullName = "$firstName $lastName"
            println("Полное имя: $fullName")
        }

        //задание 3
        fun calculateFullName(firstName: String, lastName: String): String {
            return "$firstName $lastName"
        }
        val fullName = calculateFullName("Влада", "Горгун")
        println(fullName)
        //возвращает полное имя в виде строки

        //задание 4
        fun calculateFullName1(firstName: String, lastName: String): Pair<String, Int> {
            val fullName = "$firstName $lastName"
            val fullNameLength = fullName.length
            return Pair(fullName, fullNameLength)
        }
        val result = calculateFullName1("Владислава", "Горгун")
        val myFullName = result.first
        val fullNameLength = result.second
            //Используя эту функцию, мы можем определить длину полного имени

        println("Мое полное имя: $myFullName")
        println("Длина моего полного имени: $fullNameLength")

       //задание 5
        fun isPrime(number: Int): Boolean {
            if (number <= 1) {
                return false
                //проверка является ли число меньше или = 1
            }
            for (i in 2 until number) {
                if (number % i == 0) {
                    //перебирает все числа от 2 до -1, если так, то число не является простым
                    //мы возвращаем фолз, затем проверяем делится ли намбер на какое либо из них без остатка
                    return false
                }
            }
            return true
        }
        val number = 13
        if (isPrime(number)) {
            println("$number является простым числом")
        } else {
            println("$number не является простым числом")
        }

        //задание 6
        fun fibonacci(n: Int): Int {
            if (n <= 0) return 0
            if (n == 1 || n == 2) return 1
//обработка краевых случаев, когда n меньше или = 0, или когда n = 1 или 2
            var a = 1
            var b = 1
            var result = 0
            //объявила 3 переменных, затем фор для того чтобы вычислить n значение в послед.
            for (i in 3..n) {
                result = a + b
                a = b
                b = result
            }
            return result //ретурн - возвращает значание
        }
        val result1 = fibonacci(6)
        println("6е значение в последовательности Фибоначчи: $result")
// Вывод: 6е значение в последовательности Фибоначчи: 8

    }

