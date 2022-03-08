package exercise

object OopsEx {

}
class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name,newYear, author)
}

class Writer(firstName: String, surname: String, val year: Int) {

  def fullName: String = firstName + " " + surname
}
