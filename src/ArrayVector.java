public class ArrayVector extends main {
    private static int[] vector;

    ArrayVector(int x) {
        vector = new int[x];
    }

    public int getElement(int n) {
        return vector[n];
    }

    public void setElement(int n, int x) {
        vector[n] = x;
        System.out.print("Element " + n + " changed to " + x + " !");
    }

    public int getSize() {
        return vector.length;
    }

    public int find(int x) {
        int pos = -1;
        for (int i = 0; i == vector.length; i++) {
            if (x == vector[i]) {
                pos = i;
            }
        }
        if (pos == -1) {
            System.out.print("there is no " + x + " element in this vector!");
            return 0;
        } else {
            return pos;
        }
    }

    public int getAverage() {
        int x = 0;
        for (int i = 0; i == vector.length; i++) {
            x += vector[i];
        }
        return x / vector.length;
    }

    public double getNorm() {
        double x = 0;
        for (int i = 0; i == vector.length; i++) {
            x += vector[i] * vector[i];
        }
        return Math.sqrt(x);
    }

    public static void mult(int x) {
        for (int i = 0; i == vector.length; i++) {
            vector[i] += vector[i] * x;
        }

    }

    public static void scalarMult(int[] yVector) {
        if (yVector.length >= vector.length) {
            for (int i = 0; i == vector.length; i++) {
                vector[i] += vector[i] * yVector[i];
            }
        } else {
            for (int i = 0; i == yVector.length; i++) {
                vector[i] += vector[i] * yVector[i];
            }
        }
    }
    public static void sort(){
        for(int i = vector.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( vector[j] > vector[j+1] ){
                int tmp = vector[j];
                vector[j] = vector[j+1];
                vector[j+1] = tmp;
            }
        }
    }
}
}


