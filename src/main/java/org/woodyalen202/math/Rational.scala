package org.woodyalen202.math

/**
 * Created by lichuansun on 14-6-25.
 * used by math compox
 */
class Rational (n: Int, d: Int){

    require(d != 0)//检查创建对象的先绝条件

    val g: Int = gcd(n, d)
    val number: Int = n % g//分子
    val denom: Int = d % g//分母

    println("created " + n + "/" + d)//创建时打印日志

    /** add 方法 **/
    def add(that: Rational): Rational = new Rational(
        number * that.denom + that.number * denom,
        denom * that.denom)

    /** 判断是否大于制定分数 **/
    def lessThan(that: Rational) : Boolean = number * that.denom < that.number * denom

    override def toString = n + "/" + d

    /**获取最大公约数**/
    private def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)
}
