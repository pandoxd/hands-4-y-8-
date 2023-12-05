public class DiscreteMaths {

    public DiscreteMaths() {
    }

    public double sumarArray(double array[]) {
        double total = 0;
        for (double valor : array) {
            total += valor;
        }
        return total;
    }

    public double calcularMedia(double array[]) {
        return sumarArray(array) / array.length;
    }

    public double calcularSumaDePotencias(double array[]) {
        double resultado = 0;
        for (double valor : array) {
            resultado += valor * valor;
        }
        return resultado;
    }

    public double calcularProducto(double array1[], double array2[]) {
        double resultado = 0;
        for (int i = 0; i < array1.length; i++) {
            resultado += array1[i] * array2[i];
        }
        return resultado;
    }

    public double B1 (double x[], double y[]) {
        double n = x.length;
        double sumaXY = calcularProducto(x, y);
        double sumaX = sumarArray(x);
        double sumaY = sumarArray(y);
        double sumaXAlCuadrado = calcularSumaDePotencias(x);
        return (sumaXY - (sumaX * sumaY) / n) / (sumaXAlCuadrado - (sumaX * sumaX) / n);
    }

    public double B0 (double x[], double y[], double b1) {
        return calcularMedia(y) - b1 * calcularMedia(x);
    }
}
