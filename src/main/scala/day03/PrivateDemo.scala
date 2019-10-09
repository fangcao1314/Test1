package day03

import sun.text.UCompactIntArray

/**
 * 类名前加private[包名]是指访问权限，只有day03 这个包有访问权限
 * 构造器前加private 是指伴生对象的权限，只有伴生对象才能访问
 */
private [day03] class PrivateDemo  private (val gender:Int,var faceValue:Int) {
  //变量前加private，此时该字段被称为私有字段
  private val name = "jingjing"
  //表示只能在本类中访问
  private [this] val age = 24
  private def sayHello():Unit={
    println(s"jingjing's name is $age")

  }

}
object PrivateDemo{
  def main(args: Array[String]): Unit = {
    val privateDem = new PrivateDemo(0 , 90)
    privateDem.sayHello()

  }

}
object Test031{
  def main(args: Array[String]): Unit = {
//    val privateDemo = new PrivateDemo(0,98)
//    println(privateDemo.faceValue)
//    println(privateDemo.sayHello())
  }
}