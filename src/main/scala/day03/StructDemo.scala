package day03
/*
*主构造器参数放在类名的后面 和类名放在一起
* val 修饰的构造参数具有不可变性，var 修饰的构造参数可以变
* 此时声明 的facevalue INt 只能在本类中调用，伴生对象也无法调用
*
*
 */                                               //没有修饰默认就是val修饰
class StructDemo(val name:String,var age:Int,faceValue:Int = 90) {//括号里面是主构造器
 var gender:String = _
  def getFaceValue():Int = {
   faceValue

}
  //辅助构造器
  def this(name:String ,age:Int,faceValue:Int,gender:String){
    this(name,age,faceValue)//必须先调用主构造器
    this.gender = gender
  }
}
object StructDemo{
  def main(args: Array[String]): Unit = {
//   val  s = new StructDemo("ningning",26,98)
    val s = new StructDemo("ningning",26,98,"女")
   // s.name = "wang" val 不能复值
    s.age = 25
//    s.faceValue = 100//访问不到
    val faceValue = s.getFaceValue()
    println(s.name)
    println(faceValue)
    println(s.age)

  }
}
