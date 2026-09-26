// TranThanhDanh - 25810009
fun datBan(tenKhach: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("$tenKhach đặt $loaiBan cho $soLuongKhach khách")
}

//mặc định
datBan("Nguyễn An", 4)

//thứ tự
datBan("Trần Bình", 6, "Bàn VIP")

//tham số
datBan(tenKhach = "Lê Minh", soLuongKhach = 2, loaiBan = "Bàn riêng")