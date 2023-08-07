object tute_07 extends App{	

	def filterEvenNumbers(list:List[Int]):List[Int] = {
		list.filter(x => x % 2 == 0)
	}

	var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	println(filterEvenNumbers(list))

}
