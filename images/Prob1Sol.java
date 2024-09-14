public class Prob1Sol {
    public int addNumbers(int A, int B) {
        while (B != 0) {
        int carry = (A & B) << 1;  // Calculate carry
        A = A ^ B;  // Calculate the sum without carry
        B = carry;  // Update b to the carry value
    }
    return A;
    }
}
