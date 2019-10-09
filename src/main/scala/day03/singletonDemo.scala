package day03

import scala.collection.mutable.ArrayBuffer

/**
 * 在scala 没有静态方法和·字段
 * 但是可以使用object关键字加类名的语法机构实现相同的功能
 * 1.实现工具类，存放常量和工具方法
 * 2.实现单例模式
 */
object singletonDemo {
  def main(args: Array[String]): Unit = {
//    val factory = SessionFactory
    println(SessionFactory.getSession)
    println(SessionFactory.getSession.size)
    println(SessionFactory.getSession(0))
    println(SessionFactory.removeSession)
    println(SessionFactory.getSession.size)

  }
}
object SessionFactory{
  /**
   * 相当于java静态块
   */
  println("SessionFactory被执行了！")
  var  i = 5
  private val session = new  ArrayBuffer[Session]()
  while(i>0){
    session  += new Session
    i -= 1
  }
  def getSession = session
  def removeSession:Unit = {
    val s = session(0)
    session.remove(0)
    println("session被移除" + s)

  }

}
class Session{

}