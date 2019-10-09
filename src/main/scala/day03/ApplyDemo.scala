package day03

/**
 * apply方法通常称为注入方法，在伴生对象李做一些初始化的操作
 * apply方法的参数列表不需要和构造器的参数列表统一
 * unapply通常被称为提取方法，使用unapply方法来提取固定数量的对象
 * unapply方法会返回一个序列（option）内部产生的Some对象来存放一些值
 * apply 和 unapply 会被隐式的调用
 * @param name
 * @param age
 * @param faceValue
 */
class ApplyDemo(val name:String,val age:Int,var faceValue:Int) {

}
object ApplyDemo{
  def apply(name:String,age:Int,gender:Int,faceValue:Int):ApplyDemo =
    new ApplyDemo(name,age,faceValue)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] = {
  if(applyDemo==null){
    None
  }else{
    Some(applyDemo.name,applyDemo.age,applyDemo.faceValue)
  }
  }
}
object Test03{
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo("jingjing",0,24,90)//调用apply方法
    applyDemo match {
      case ApplyDemo("jingjing",age,faceValue)=>println(s"age:$age")
      case _=>println("No match")
    }
  }
}