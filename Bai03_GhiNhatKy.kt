// TranThanhDanh - 25810009
fun ghiNhatKy1(hanhDong: String): Unit {
    println("Nhật ký: $hanhDong")
}

fun ghiNhatKy2(hanhDong: String) {
    println("Nhật ký: $hanhDong")
}

// Hai cách viết tương đương vì Kotlin tự hiểu kiểu trả về là Unit.
ghiNhatKy1("Đăng nhập")
ghiNhatKy2("Đăng xuất")