class Account(x: Int, y: Int) {
  def id: Int = x;
  var bal = y;

  def transfer(amount: Int, a: Account): Unit = {
    this.bal = this.bal - amount;
    a.bal = a.bal + amount;
    println("Succesfully finished the transaction");
  }

  override def toString: String = "id: " + this.id + "\n" + "balance: " + this.bal;
}

object Question3 {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1, 200);
    val account2 = new Account(2, 300);
    println("Before transaction:");
    println(account1);
    println(account2);
    account1.transfer(100, account2);
    println("After transaction:");
    println(account1);
    println(account2);
  }
}
