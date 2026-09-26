// TranThanhDanh - 25810009
//đủ
fun binhPhuongDayDu(so: Int): Int {
    return so * so
}

//gọn
fun binhPhuongRutGon(so: Int) = so * so


//đủ
fun chuViDayDu(canh: Double): Double {
    return canh * 4
}

//gọn
fun chuViRutGon(canh: Double) = canh * 4


//đủ
fun soChanDayDu(so: Int): Boolean {
    return so % 2 == 0
}

//gọn
fun soChanRutGon(so: Int) = so % 2 == 0


println("Bình phương đầy đủ: ${binhPhuongDayDu(5)}")
println("Bình phương rút gọn: ${binhPhuongRutGon(5)}")

println("Chu vi đầy đủ: ${chuViDayDu(4.0)}")
println("Chu vi rút gọn: ${chuViRutGon(4.0)}")

println("Số chẵn đầy đủ: ${soChanDayDu(6)}")
println("Số chẵn rút gọn: ${soChanRutGon(6)}")