package day02

object Execise {
  def main(args: Array[String]): Unit = {
    val list0 = List(15, 7, 3, 6, 4, 6, 34, 72, 4, 7, 4, 9)
    val list1 = list0.map(_ * 2)
    val list2 = list0.filter(_ % 2 == 0)
    val list3 = list0.sorted
    val list4 = list3.reverse
    val list5 = list0.grouped(4)

    //List(list0)
    //    print(list1)
    //    print(list2)
    //print(list5)
    //    println(list5)
    val list6 = list5.toList
    val flatten = list6.flatten
    println(flatten)
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    val res = arr.fold(3)(_ + _)
    println(res)


  }

}
