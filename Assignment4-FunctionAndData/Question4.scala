import scala.collection.mutable.ListBuffer

class Account(x: Int, y: Double) {
  def id: Int = x;
  var bal = y;

  def interest = {
    if (bal < 0) {
      bal = bal + bal*0.1;
    } else {
      bal = bal + bal*0.05;
    }
  }

  override def toString: String = "id: " + this.id + "\n" + "balance: " + this.bal;
}

class Bank(x: List[Account]) {
  def accounts = x;
  // 4.1
  def negAccounts = {
    var negative = new ListBuffer[Account]();
    for (account <- accounts) {
      if (account.bal < 0) {
        negative += account;
      }
    }
    negative.toList;
  }
  // 4.2
  def calcSum = {
    var sum: Double = 0;
    for (account <- accounts) {
      sum += account.bal;
    }
    sum
  }
  // 4.3
  def calcInterest = {
    for (account <- accounts) {
      account.interest;
    }
  }
}

object Question4 {
  def main(args: Array[String]): Unit = {
    val x = List(new Account(1, 200.0), new Account(2, -100.0), new Account(3, -50.0));
    println("neg accounts");
    val bank = new Bank(x);
    for (n <- bank.negAccounts) {
      println(n);
    }
    println("sum of all account balances");
    println(bank.calcSum);
    println("accounts after applying interest")
    bank.calcInterest;
    for (a <- bank.accounts) {
      println(a);
    }
  }
}
