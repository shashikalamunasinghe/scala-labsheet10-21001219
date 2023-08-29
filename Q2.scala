object Q2 {
    def countLetterOccurrences(word: List[String]): Int = {
      val wordLen = word.map(w => w.length)
      val totalCount = wordLen.reduce((x, y) => x + y)

      totalCount
    }
    def main(args: Array[String]): Unit = {

      val inputs = List("apple", "banana", "cherry", "date")
      val output = countLetterOccurrences(inputs)
      println("Total count of letter occurrences:" + output)
    }
}

