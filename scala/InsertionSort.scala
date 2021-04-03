object InsertionSort {

  def insertionSort(ArrayToSort:Array[Int]):Array[Int]={
    for(i<-1 until ArrayToSort.length)
    {
      var Until:Int = i;
      val workingElement:Int = ArrayToSort(i);
      println("working on element:\t"+workingElement+"\n");
      while(Until>0  && ArrayToSort(Until-1) > workingElement) {
          ArrayToSort(Until) = ArrayToSort(Until-1);
          Until = Until -1;
      }
      ArrayToSort(Until) = workingElement;
      println(ArrayToSort.mkString(","))
    }
    ArrayToSort;
  }

     def main(args: Array[String]): Unit = {

       val  myArray: Array[Int] = Array.apply(9, 1, 3, 11, 7, 4, 2, 8, 10, 5, 6);

       val sortedList = insertionSort(myArray);
       println("after sorting:\n")
       println(sortedList.mkString(","));
     }
}