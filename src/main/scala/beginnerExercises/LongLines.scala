package beginnerExercises

import scala.io.Source

object LongLines {
  def processFile(filename: String, width: Int): Unit = {
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(filename +": " + line.trim)
    }
    val source = Source.fromFile(filename)
    for (line <- source.getLines)
      processLine(line)
  }
}

object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}