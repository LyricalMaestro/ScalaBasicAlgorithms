package com.lyricaloriginal.scalabasicalgorithms

/**
 * ベタなやりかたで素数を計算するプログラム。
 */
object Case1 {

  def main(args: Array[String]): Unit = {
    println("素数カウントアルゴリズム その1");
    printExecutionTime{
        val num = 20;
    	println("input = " + num)
    	printPrimes(num);
    }
    printExecutionTime{
        val num = 100;
    	println("input = " + num)
    	printPrimes(num);
    }
    printExecutionTime{
        val num = 2000;
    	println("input = " + num)
    	printPrimes(num);
    }
    printExecutionTime{
        val num = 100000;
    	println("input = " + num)
    	printPrimes(num);
    }
  }
  
  /**
   * ベタに小さい順に素数かどうかを判定しながらプリントしていく方法
   */
  def printPrimes(num : Int): Unit = {
    //	1以下の整数は素数を持たないので除外。
    if(num <= 1){
      println("NULL");
      return;
    }
    
    var primes = scala.collection.immutable.List.empty[Int];
    for(i <- 2 to num){
    	var isPrime = true;
    	for(p <- primes){
    	  if(i % p == 0){
    	    isPrime = false;
    	  }
    	}
    	if(isPrime){
    	  primes = i :: primes;
    	  print(i);
    	  print(",");
    	}
    }
    println();
  }
  
  /** 引数の処理の実行時間を表示 */
  def printExecutionTime(proc: => Unit) = {
	  val start = System.currentTimeMillis
      proc
      println((System.currentTimeMillis - start) + "msec");
  }
}