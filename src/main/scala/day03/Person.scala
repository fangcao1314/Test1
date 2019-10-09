package day03

/**
 * 申明雷士不需要加public 默认为public
 * 一个文件可以声明多个类
 */
class Person {
  val id: String = "100"
  //用val 声明的对象是只读的，只有一个get方法没有set方法·
  var name:String = _
  //var 修饰相当于既有get 又有set方法
  private var age:Int =_
  //private 修饰的属性，该属性属于对象私有变量，只有本类中可以访问，伴生对象也访问到
  private[this] val gender = "男"
  //private[this]访问的对象，只有本类访问，伴生对象也访问不到

}

object Person {
  def main(args: Array[String]): Unit = {
    val p = new Person()
    //println(p.id ="123")
    p.name = "caozhi"
    p.age = 24
    println(p.name)
    println(p.age)


  }
}

object Test1 {
  def main(args: Array[String]): Unit = {
    val p = new Person()
    print(p.id)
  }
}
