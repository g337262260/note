//密封类:更强大的枚举类，相对于枚举类里的类型不能携带，处理数据
sealed class LicenseStatus{
    object UnQualified:LicenseStatus()
    object Learning:LicenseStatus()
    class Qualified(val licenseId:String):LicenseStatus()
}


class Diver(var status: LicenseStatus){
    fun checkLicense():String{
        return when(status){
            LicenseStatus.UnQualified -> "没资格"
            LicenseStatus.Learning -> "学习"
            is LicenseStatus.Qualified -> (this.status as LicenseStatus.Qualified).licenseId
        }
    }
}

fun main() {
    val qualified = LicenseStatus.Qualified("222222")
    val diver = Diver(qualified)
    val diver2= Diver(LicenseStatus.Learning)
    println(diver.checkLicense())
    println(diver2.checkLicense())
}
