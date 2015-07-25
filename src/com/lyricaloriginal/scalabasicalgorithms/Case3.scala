package com.lyricaloriginal.scalabasicalgorithms

/**
 * ２つの整数の最大公約数を計算するプログラムです。
 */
object Case3 {

  def main(args: Array[String]): Unit = {
    val v = println(gcd(108, 42));
    println(v);
  }
  
  def gcd(a:Int, b:Int):Int = {
    if(a > b) {
      if(a % b == 0){
        return b;
      }else{
        return gcd(b, a % b);
      }
    }else if(a < b){
      if(b % a == 0){
        return a;
      }else{
        return gcd(a, b % a);
      }
    }
    return a;
  }

  
}