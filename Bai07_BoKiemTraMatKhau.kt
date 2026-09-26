// TranThanhDanh - 25810009
val kiemTraDoDai: (String) -> Boolean = {
    it.length >= 8
}

println(kiemTraDoDai("1234567"))
println(kiemTraDoDai("12345678"))
println(kiemTraDoDai("43245324634"))