package buscar;

public class Programa {

    public void Programa() {

    }

    public int Buscar(int[] a, int num, int inf) {

        if (a[inf] == num) {
            return inf;
        } else if (inf == (a.length - 1)) {
            return -1;

        } else {
            return Buscar(a, num, inf + 1);

        }
    }

    public int[] Array() {

        int n = (int) ((Math.random() * 10000) + 1);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = (int) ((Math.random() * 10000) + 1);
        }

        return a;
    }
}
