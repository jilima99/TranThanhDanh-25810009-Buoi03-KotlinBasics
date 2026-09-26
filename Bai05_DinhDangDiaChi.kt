// TranThanhDanh - 25810009
fun dinhDangDiaChi(
    soNha: String,
    duong: String,
    phuong: String = "Phường 1",
    thanhPho: String = "TP.HCM"
): String {
    return "$soNha $duong, $phuong, $thanhPho"
}

val diaChi = dinhDangDiaChi(
    soNha = "99",
    duong = "Số 9",
    phuong = "Phường Thủ Đức",
    thanhPho = "TP.HCM"
)

println(diaChi)