package day03.matchDemo

import scala.util.Random

object MatchStr {
  def main(args: Array[String]): Unit = {
    val arr = Array("z","zh","g","y")
    val name  = arr(Random.nextInt(arr.length))
    println(arr(0))
    println(name)
    name match{
      case "z" => println("周冬雨")
      case "zh"=>println("郑爽")
      case "g"=>println("关晓彤")
      case  "y"=>println("杨紫")
      case _ =>println("无人")
    }
  }
}
