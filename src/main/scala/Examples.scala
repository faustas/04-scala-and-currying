object Examples {

  /**
   * Display the sum of the two provided numbers and make a nice string of it.
   *
   * @param stringA Prefix string
   * @param stringB Middle string
   * @param stringC Suffix string
   * @param numA    First numerical value
   * @param numB    Second numerical value
   * @return String with the sum.
   */
  def appendAndSum(stringA: String, stringB: String, stringC: String, numA: Int, numB: Int): String =
    s"$stringA $numA $stringB $numB $stringC ${numA + numB}"

  /**
   * Display the sum of the two provided numbers and make a nice string of it.
   * Currying version.
   *
   * @param stringA Prefix string
   * @param stringB Middle string
   * @param stringC Suffix string
   * @param numA    First numerical value
   * @param numB    Second numerical value
   * @return String with the sum.
   */
  def appendAndSumCurried(stringA: String, stringB: String, stringC: String)(numA: Int, numB: Int): String =
    s"$stringA $numA $stringB $numB $stringC ${numA + numB}"

}
