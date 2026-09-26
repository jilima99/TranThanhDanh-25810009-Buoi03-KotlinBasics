// TranThanhDanh - 25810009
fun main() {
    val tuoi = 65

    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi >= 60) {
        "Vé cao tuổi"
    } else {
        "Vé người lớn"
    }

    println("Loại vé: $loaiVe")
}