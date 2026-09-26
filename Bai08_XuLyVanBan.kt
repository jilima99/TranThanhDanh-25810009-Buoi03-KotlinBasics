// TranThanhDanh - 25810009
fun xuLyVanBan(
    vanBan: String,
    hamXuLy: (String) -> String
): String {
    return hamXuLy(vanBan)
}

fun vietHoa(text: String): String {
    return text.uppercase()
}

// Cách 1: truyền lambda trực tiếp
val ketQua1 = xuLyVanBan("xin chao") {
    it.uppercase()
}

println(ketQua1)


// Cách 2: truyền function reference ::
val ketQua2 = xuLyVanBan("kotlin") {
    vietHoa(it)
}

println(ketQua2)


// Cách 3: đưa lambda ra ngoài dấu ngoặc
val ketQua3 = xuLyVanBan("hello") {
    "[$it]"
}

println(ketQua3)