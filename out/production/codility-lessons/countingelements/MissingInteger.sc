object MissingInteger {

  // 100%
  def solution(A: Array[Int]): Int = {
    def findMissing(in: Int, l: List[Int]): Int = {
      if (l.isEmpty || l.head != in) in
      else findMissing(in + 1, l.tail)
    }
    findMissing(1, A.toList.filter(_ > 0).distinct.sorted)
  }

  solution(Array(1,3,6,4,1,2))
  solution(Array(1))
  solution(Array(3))
  solution(Array(0))
  solution(Array(-2))
  solution(Array(-5, 0, -2, 1))
  solution(Array(-2147483648, 2147483647))

  /*

  Write a function:

  object Solution { def solution(A: Array[Int]): Int }

  that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

    For example, given:

    A[0] = 1
  A[1] = 3
  A[2] = 6
  A[3] = 4
  A[4] = 1
  A[5] = 2
  the function should return 5.

  Assume that:

    N is an integer within the range [1..100,000];
  each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
  Complexity:

    expected worst-case time complexity is O(N);
  expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
  Elements of input arrays can be modified.

    */
}