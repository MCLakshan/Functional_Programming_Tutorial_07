object tute_07 extends App{	

	def filterPrime(list:List[Int]):List[Int] = {
		list.filter(num => num match {
			case x if x < 2 => false
			case 2 => true
			case x => !(2 to (num -1)).exists(x % _ == 0)
		})
	}

	var list = List(1, -2, 3, 4, 5, 6, 7, 8, 9, 10)
	println(filterPrime(list))

}
