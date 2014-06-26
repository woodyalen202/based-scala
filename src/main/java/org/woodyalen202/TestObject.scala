package org.woodyalen202
import scala.collection.mutable.Map;
import scala.collection.mutable.Set;
import scala.io.Source;


/**
 * Created by lichuansun on 14-6-24.
 */
object TestObject {

    def main(args: Array[String]) {
        if (args.length > 0){
            for (x <- Source.fromFile(args(0)).getLines() ) {
                println("x = " + x)
            }
        } else {
            Console.err.println("please enter filename")
        }
    }





    def mainMap(args: Array[String]) {
        val traceMap = Map[Int, String]();
        traceMap += (1 -> "Go to island.");
        traceMap += (2 -> "Find big X on ground.");
        traceMap += (3 -> "Pig.");
        println("traceMap = " + traceMap);
        for (i <- traceMap ) {
            println("i._2 = " + i._2);
        }
        println("traceMap(2) = " + traceMap(2))
    }

    def mainSet(args: Array[String]) {
        //set
        val jetSet = Set("One", "Two");
        jetSet += ("Three");
        jetSet += ("Three");
        println(jetSet);
        println(jetSet.contains("Three"));
        println(jetSet.contains("consona"));
    }

    def mainTuple(args: Array[String]) {
        //Tuple
        var pair = (99, "Luftballons");//Tuple2[Int, String]
        println(pair._1);
        println(pair._2);
    }


    def mainList(args: Array[String]) {
        var oneTwo = List(1, 2);
        var threeFour = List(3, 4);
        var oneTwoThreeFour = oneTwo ::: threeFour;
        println(oneTwo + " and " + threeFour + " was not mutated.");
        println("thus. " + oneTwoThreeFour  + " is a new list.");

        var twoThree = List(2, 3);
        var oneTwoThree = 1 :: twoThree;
        println(oneTwoThree);

        oneTwoThree = 1 :: 2 :: 3 :: Nil;
        println(oneTwoThree);
        //
        var tmp = List("Cool", "tools", "rule");
        var thill = "will" :: "fill" :: "until" :: Nil;
        var tmp1 = List("a", "b") ::: List("c", "d");
        println(tmp);
        println(thill(2));
        println(thill.count(p => p.length == 4));//统计方法,very important
        println(thill.drop(2));//去掉前两个元素的集合
        println(thill.dropRight(2));//去掉后两个元素集合
        println(thill.dropWhile(p => p.length == 4));//去掉长度为4的元素
        println(thill.exists(p => p.length == 4));//判断是否存在元素
        println(thill.filter(p => p.length == 4));//过滤元素
        println(thill.forall(p => p.endsWith("l")));//所有元素进行处理
        println(thill.foreach(f=>print(f)));//对每个元素进行处理
        println(thill.foreach(println));//对每个元素进行处理
        println(thill.head);//列表的第一个元素
        println(thill.last);//列表的最后一个元素
        println(thill.tail);//列表的后N-1个元素
        println(thill.init);//列表的前N-1个元素

        println(thill.isEmpty);//列表是否为null
        println(thill.length);//返回列表的长度
        println(thill.mkString(","));//返回字符串,使用，分割
        println(thill.reverse);//倒叙排列
        println(thill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower));
    }

    def factorial(x: BigInt): BigInt =
        if (x == 0) 1 else x * factorial(x-1);
}
