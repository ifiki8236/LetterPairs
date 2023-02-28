class Main {
  public static void main(String[] args) {
     int firstPosition = 0;
    int nextPosition;
    final char[] letters = { 'a', 'b', 'c', 'd', 'e' };
    for (firstPosition = 0; firstPosition < letters.length; firstPosition++) {
      for (nextPosition = 0; nextPosition < letters.length; nextPosition++) {
        System.out.print(letters[firstPosition]);
        System.out.println(letters[nextPosition]);
      }
    }
  }
}