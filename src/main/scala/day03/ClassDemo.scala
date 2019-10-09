package day03

import java.lang

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val human = new Human()
    println(human.name)
    println(human.climb)
    println(human.fight)
    println(human.fly)
  }
}
/*
 * 特质
 */
trait  Flyable{
  //声明一个没有值的字段
  val distance: Int = 900
  //声明一个没有实现的方法
  def fight:String
  def fly:Unit={
    println("I can Fly")

  }
}
/**
 *抽象类
 *
 */
abstract class Animal{
  val name:String
  def run():String
  def climb:String = {
    "i can climb"
  }
}
class Human extends Animal with Flyable{//只能继承一个父类 和实现多个特质 如果只有一个实现一个特质则用 extend Flyable
  override val name: String = "wang"
//重写了一个抽象类没有实现的方法
  override def run(): String = "I can run"
  override def climb:String ={
    "I can climb"
  }

  //override val distance: Int = 1000
  //实现了特质中没有实现的方法 可以不用override 关键字
  override def fight: String = "I can fight,with 棒子"

  override def fly: Unit = "override fly"
}