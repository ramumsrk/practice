fun add( firstNumber : Int , secondNumber : Int ) : Int {
  return firstNumber + secondNumber;
}

fun main() {
  val ten = 10;
  val twenty = 20;
  println( "Sum of '${ten}' and '${twenty}' is '${ add( ten , twenty ) }'" );
}

main()
