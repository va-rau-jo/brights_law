public class Main {
    private static int BASE = 10;

    public static void main(String[] args) {
        if (args.length >= 3) {
            if (args.length == 4)
                BASE = Integer.parseInt(args[3]);

            findEquation(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } else {
            for (int i = 1; i < BASE; i++) {
                for (int j = i + 1; j < BASE; j++) {
                    for (int k = j + 1; k < BASE; k++) {
                        findEquation(i, j, k);
                    }
                }
            }
        }
    }

    public static void findEquation(int n1, int n2, int n3) {
        Operation[] ops = new Operation[] {
                new Add(),
                new Subtract(),
                new Multiply(),
                new Divide(),
        };
        boolean possible = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (checkResult(n1, n2, n3, ops[i], ops[j]) ||
                    checkResult(n1, n3, n3, ops[i], ops[j]) ||
                    checkResult(n2, n1, n3, ops[i], ops[j]) ||
                    checkResult(n2, n3, n1, ops[i], ops[j]) ||
                    checkResult(n3, n1, n2, ops[i], ops[j]) ||
                    checkResult(n3, n2, n1, ops[i], ops[j])) {

                    possible = true;
                }
            }
        }
        if (!possible) {
            System.out.println(n1 + ", " + n2 + ", " + n3 + " failed!");
        }

    }

    private static boolean checkResult(int n1, int n2, int n3, Operation op1, Operation op2) {
        float result = op2.invoke(op1.invoke(n1, n2), n3);
        if (result % BASE == 0) {
            System.out.println("(" + n1 + op1.toString() + n2 + ")" + op2.toString() + n3);
            return true;
        }
        return false;
    }
}
