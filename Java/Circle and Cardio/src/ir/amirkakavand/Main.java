package ir.amirkakavand;


public class Main {


    public static void main(String[] args) {

        circle(11);
        cardioidUp(11);
        cardioidDown(11);
        cardioidRight(11);
        cardioidLeft(11);

    }

    static void circle(int r) {

        for (int x = -r; x <= r; x++) {

            for (int y = -r; y <= r; y++) {

                if (x * x + y * y <= r * r) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }

            System.out.println();
        }

        System.out.println("*********************************");

    }


    static void cardioidUp(int r) {

        if (r < 10) {
            System.out.println("please enter number more than 10");
        } else {

            for (int x = -r; x <= 2*r; x++) {

                for (int y = -r; y <= r; y++) {

                    double ra = Math.sqrt(x * x + y * y);
                    double theta = Math.atan2(y, x);


                    if (ra <= (r / 2) * (1 + Math.cos(theta))) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                System.out.println();
            }

        }

        System.out.println("*********************************");
    }

    static void cardioidDown(int r) {

        if (r < 10) {
            System.out.println("please enter number more than 10");
        } else {

            for (int x = -2 * r; x <= r; x++) {

                for (int y = -r; y <= r; y++) {

                    double ra = Math.sqrt(x * x + y * y);
                    double theta = Math.atan2(y, x);


                    if (ra <= (r / 2) * (1 - Math.cos(theta))) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                System.out.println();
            }

        }

        System.out.println("*********************************");
    }

    static void cardioidLeft(int r) {

        if (r < 10) {
            System.out.println("please enter number more than 10");
        } else {

            for (int x = -r; x <= r; x++) {

                for (int y = -r; y <= r; y++) {

                    double ra = Math.sqrt(x * x + y * y);
                    double theta = Math.atan2(y, x);


                    if (ra <= (r / 2) * (1 + Math.sin(theta))) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                System.out.println();
            }

        }

        System.out.println("*********************************");
    }

    static void cardioidRight(int r) {

        if (r < 10) {
            System.out.println("please enter number more than 10");
        } else {

            for (int x = -r; x <= r; x++) {

                for (int y = -r; y <= r; y++) {

                    double ra = Math.sqrt(x * x + y * y);
                    double theta = Math.atan2(y, x);


                    if (ra <= (r / 2) * (1 - Math.sin(theta))) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }

                System.out.println();
            }

        }

        System.out.println("*********************************");
    }

}
