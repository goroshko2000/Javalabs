package main

import scala.annotation.tailrec
import scala.collection.mutable
import scala.Console

object Obj{
  def main(args: Array[String]): Unit = {
    println("Enter 1st num: ")
    val x = scala.io.StdIn.readInt()
    println("Enter 2nd num: ")
    val y = scala.io.StdIn.readInt()
    println("Enter 3rd num: ")
    val z = scala.io.StdIn.readInt()
    println("the arithmetic mean is:")
    println(func(x,y,z))

  }

  val func = (x: Int, y: Int, z: Int) => (x + y + z)/3
}