package scalatraining.lab2

object Lab2 {
  //error("fixed me")
  def firstElementInList[T](l: List[T]): T = {
    l.head
  }

  def lastElementInList[T](l: List[T]): T = {
    l.last
  }

  def concatLists(list1: List[String], list2: List[String]): List[String] = {
//    list1 flatMap( x => )
    list1 ::: list2
  }

  def sortList(list: List[String]):List[String] = {
//    list.sortBy{ (x,y) => x > y }
    list.sortWith(_ < _)
  }
  
  def elementExists(theList: List[String], elementToSearchFor: String): Boolean = {
    theList.exists( x => x == elementToSearchFor)
    //theList.exists(_ == elementToSearchFor)
  }

  def oddElements(listOfInts: List[Int]): List[Int] = {
    listOfInts.filter( x => x % 2 == 1)
    //listOfInts.filter(_ % 2 != 0)
  }
}


