package com.alirezatayefeh.barbershopreservation.model

enum class ReserveTimes(val number: Int, val text: String?,) {
    H9PART1(1, "9 - 9:30"),
    H9PART2(2, "9:30 - 10"),
    H10PART1(3,"10 - 10:30",),
    H10PART2(4, "10:30 - 11"),
    H11PART1(5, "11 - 11:30"),
    H11PART2(6, "11:30 - 12"),
    H12PART1(7, "12 - 12:30"),
    H12PART2(8, "12:30 - 13"),
    H15PART1(9, "15 - 15:30"),
    H15PART2(10, "15:30 - 16"),
    H16PART1(11, "16 - 16:30"),
    H16PART2(12, "16:30 - 17"),
    H17PART1(13, "17 - 17:30"),
    H17PART2(14, "17:30 - 18"),
    H18PART1(15, "18 - 18:30"),
    H18PART2(16, "18:30 - 19"),
    H19PART1(17, "19 - 19:30"),
    H19PART2(18, "19:30 - 20"),
    H20PART1(19, "20 - 20:30"),
    H20PART2(20, "20:30 - 21");


}