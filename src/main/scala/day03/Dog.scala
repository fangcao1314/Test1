package day03

/**
 * 与类名相同并且用object修饰的对象叫做伴生对象
 *类和器伴生对象之间可以相互访问其私有方法和属性
 */
class Dog {
  private var name = "二哈"
  def  printName():Unit={
    println(Dog.CONSTANT + name)
  }
}
object Dog{
  private val CONSTANT = "汪汪汪"

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.name)
    println(dog.printName())
    dog.name = "wwwww"
    println(dog.name)
  }

}
