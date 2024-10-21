package Oct2024.trials;

public class trial {

        public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
                if (i == 4) {
                    i++;
                    System.out.printf("Continue loop iteration\n");
                    continue;
                }
                System.out.println(i);
                i++;
            }
        }
    }


