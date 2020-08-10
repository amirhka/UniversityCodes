package sample;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Hamilton {
    public static final int N = 8;


    public static final int[] cx = {1, 1, 2, 2, -1, -1, -2, -2};
    public static final int[] cy = {2, -2, 1, -1, 2, -2, 1, -1};


    boolean limits(int x, int y) {
        return ((x >= 0 && y >= 0) &&
                (x < N && y < N));
    }


    boolean isEmpty(int[] a, int x, int y) {
        return (limits(x, y)) && (a[y * N + x] < 0);
    }


    int getDegree(int a[], int x, int y) {
        int count = 0;
        for (int i = 0; i < N; ++i)
            if (isEmpty(a, (x + cx[i]),
                    (y + cy[i])))
                count++;

        return count;
    }


    Element nextMove(int a[], Element element) {
        int min_deg_idx = -1, c,
                min_deg = (N + 1), nx, ny;

        // Try all N adjacent of (*x, *y) starting
        // from a random adjacent. Find the adjacent
        // with minimum degree.
        int start = ThreadLocalRandom.current().nextInt(1000) % N;
        for (int count = 0; count < N; ++count) {
            int i = (start + count) % N;
            nx = element.x + cx[i];
            ny = element.y + cy[i];
            if ((isEmpty(a, nx, ny)) &&
                    (c = getDegree(a, nx, ny)) < min_deg) {
                min_deg_idx = i;
                min_deg = c;
            }
        }

        // IF we could not find a next cell
        if (min_deg_idx == -1)
            return null;

        // Store coordinates of next point
        nx = element.x + cx[min_deg_idx];
        ny = element.y + cy[min_deg_idx];

        // Mark next move
        a[ny * N + nx] = a[(element.y) * N +
                (element.x)] + 1;

        // Update next point
        element.x = nx;
        element.y = ny;

        return element;
    }


    void print(int[] a) {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j)
                System.out.printf("[%02d]\t", a[j * N + i]);
            System.out.printf("\n");
        }
    }


    boolean neighbour(int x, int y, int xx, int yy) {
        for (int i = 0; i < N; ++i)
            if (((x + cx[i]) == xx) &&
                    ((y + cy[i]) == yy))
                return true;

        return false;
    }


    boolean findClosedTour(int iPos,int jPos) {

        int a[] = new int[N * N];
        for (int i = 0; i < N * N; ++i)
            a[i] = -1;


        int sx = jPos - 1;
        int sy = iPos - 1;


        Element element = new Element(sx, sy);

        a[element.y * N + element.x] = 1;


        Element ret = null;
        for (int i = 0; i < N * N - 1; ++i) {
            ret = nextMove(a, element);
            if (ret == null)
                return false;
        }


        if (!neighbour(ret.x, ret.y, sx, sy))
            return false;

        print(a);
        return true;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your knight X coordinate: (1-8)");
        int inputX = scanner.nextInt();
        System.out.println("Enter your knight Y coordinate: (1-8)");
        int inputY = scanner.nextInt();


        while (!new Hamilton().findClosedTour(inputX, inputY)) {

        }
    }
}

class Element {
    int x;
    int y;

    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
