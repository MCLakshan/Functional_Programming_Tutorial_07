object tute_07 extends App{	

	def calculateSquare(list:List[Int]):List[Int] = {
		list.map(x => x * x)
	}

	var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	println(calculateSquare(list))

}
