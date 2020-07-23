package kotlin和java的区别/*
fun main(){
    val java = JavaTest()
    val name:String? = java.name;
    println(name?.length)

    loadData(Impl())
    loadData(object: KotlinReq{
        override fun onSuccess() {
            println("下载成功")
        }
    })

    load {
        println("$it")
    }
}

fun load(req:(String)->Unit){

}
fun loadData(req: KotlinReq){
    req.onSuccess()
}

interface KotlinReq{
    fun onSuccess()
}

class Impl:KotlinReq{
    override fun onSuccess() {
        println("下载成功")
    }
}

class KotlinClass(val name:String){
    fun show(){
        println("name is $name")
    }
}

*/