public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b < a; b++) {
                for (int c = b; c < a; c++) {
                    for (int d = c; d < a; d++) {
                        int cube = a * a * a;
                        int triple = b * b * b + c * c * c + d * d * d;
                        if (cube == triple) {
                            sb.append("Cube = ").append(a).append(", Triple = (").append(b).append(",").append(c)
                                    .append(",").append(d).append(")").append("\n");
                        }
                    }
                }
            }
        }

        System.out.print(sb);
    }
}