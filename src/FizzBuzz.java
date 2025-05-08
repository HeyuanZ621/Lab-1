/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {

            // Find out which numbers divide i.
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        //my personal findings: the type should be indicated in Java, such as 'boolean', 'int'
        //and is represented by &&
        //{} represents what code is within that line

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
