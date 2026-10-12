class ASS6Q5 {
    public static void main(String args[]) {
        String a[] = {"python", "java", "c++", "sql"};
        String b[] = {"MySQL", "sql", "oracle", "java"};

        String c[] = new String[a.length];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    c[k] = a[i];
                    k++;
                }
            }
        }

        System.out.print("Output: ");
        System.out.print("Common element: [");

        for (int i = 0; i < k; i++) {
            System.out.print(c[i]);

            if (i < k - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");
    }
}