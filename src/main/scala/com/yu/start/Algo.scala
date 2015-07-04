package com.yu.start

/**
 * Created by Administrator on 2015/7/4.
 */
class Algo {
  def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
  }
}
