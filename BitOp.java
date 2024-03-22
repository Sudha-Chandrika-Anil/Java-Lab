public class BitOp {
    public static void main(String[] args) {
        // Bitwise AND (&) operator
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011
        int resultAnd = a & b; // binary: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + resultAnd);

        // Bitwise OR (|) operator
        int resultOr = a | b; // binary: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + resultOr);

        // Bitwise XOR (^) operator
        int resultXor = a ^ b; // binary: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + resultXor);

        // Left shift (<<) operator
        int number = 8; // binary: 1000
        int shiftedLeft = number << 2; // binary: 100000 (32 in decimal)
        System.out.println("Left shift by 2: " + shiftedLeft);

        // Right shift (>>) operator
        int shiftedRight = number >> 2; // binary: 10 (2 in decimal)
        System.out.println("Right shift by 2: " + shiftedRight);
    }
}

