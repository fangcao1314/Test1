package day02

class ScalaLazyDemo {

}
object ScalaLazyDemo1{
  def init():Unit={
    println("call init()")
  }

  def main(args: Array[String]): Unit = {
    val  property = init()
    println("after init()")
    print(property)
  }
}

object ScalaLazyDemo2{
  def init():Unit={
    println("call init()")
  }

  def main(args: Array[String]): Unit = {
    lazy val  property = init()//创建单例模式的时候会用到
    println("after init()")
    print(property)
  }
}
