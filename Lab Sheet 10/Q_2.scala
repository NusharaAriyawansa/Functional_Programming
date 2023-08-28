object WordLetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
    val letterCounts = words.map(word => word.length)
    val totalLetterCount = letterCounts.reduce((total, count) => total + count)
    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }
}
