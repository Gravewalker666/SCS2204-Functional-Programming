object Question extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  val singleCharacterEncryptor = (c: Char, key: Int, a: String) => a((a.size + a.indexOf(c.toUpper) + key) % a.size)
  val singleCharacterDecryptor = (c: Char, key: Int, a: String) => a((a.size + a.indexOf(c.toUpper) - key) % a.size)

  val cipher = (algorithm: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algorithm(_, key, a))

  val result = cipher(singleCharacterEncryptor, "string", 5, alphabet)
  println(result)
  println(cipher(singleCharacterDecryptor, result, 5, alphabet))
}
