package day02

object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("hello java hell python","hello python","hello c#","hello scala")
    //切分压平
    val words = lines.flatMap(_.split(" "))
    println(words)
    val tuples = words.map((_,1))
    print(tuples)
    val gro = tuples.groupBy(_._1)
    println(gro)
    val s = gro.view.mapValues(_.size)
    println(s)
  }
}
