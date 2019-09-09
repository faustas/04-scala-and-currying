import Examples._

object Main {

  def main(args: Array[String]): Unit = {
    // we have to define all parameters for every call
    println(appendAndSum("Sum of", "and", "is:", 1, 1))
    println(appendAndSum("Sum of", "and", "is:", 1, 2))

    // We create a new function that expects two integer values
    // we only have to provide the strings once
    val newFunc: (Int, Int) => String = appendAndSumCurried("Sum of", "and", "is:")
    // We can pass this function to parts of the code, where the required parameters are available.
    val result = newFunc(3, 3)
    println(newFunc(1, 1))
    println(newFunc(1, 2))

  }
}
