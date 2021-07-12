object Question1 {
	def main (args: Array[String]) = {
		println(prime(5))
		println(prime(8))
	}

	def prime (number: Int, i: Int = 2): Boolean = {
		if (number <= i) {
			if (number == i) return true
			return false
		}
		if (number % i == 0) {
			return false;
		}
		prime(number, i + 1);
	}
}
