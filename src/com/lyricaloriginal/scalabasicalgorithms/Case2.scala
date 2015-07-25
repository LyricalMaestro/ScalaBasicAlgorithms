package com.lyricaloriginal.scalabasicalgorithms

object Case2 {

  def main(args: Array[String]): Unit = {
    println("素数カウントアルゴリズム その2");
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
   * エラトステネスの櫛を用いた方法。
   */
  def printPrimes(num : Int): Unit = {
    //	1以下の整数は素数を持たないので除外。
    if(num <= 1){
      println("NULL");
      return;
    }

    val queue = new scala.collection.mutable.Queue[Int];
    queue ++= Range(2, num + 1).toList;
    while(!queue.isEmpty){
    	val v : Int = queue.dequeue();
    	queue.dequeueAll((p:Int) => p % v == 0);
    	print(v);
    	print(",");
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