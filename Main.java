public class Main {

        public static void main(String[] args) {
            DataSet Datos = new DataSet();
            DiscreteMaths Calculo = new DiscreteMaths();

            double B1 = Calculo.B1(Datos.getAdvertising(), Datos.getSales());
            double B0 = Calculo.B0(Datos.getAdvertising(), Datos.getSales(), B1);

            System.out.println();
            System.out.println("B1 = " + B1);
            System.out.println("B0 = " + B0);

            System.out.println();
            System.out.println("** PREDICCIÓN **");

            double[] datosXDePrediccion = {19, 20, 21};
            double[] predicciones = new double[datosXDePrediccion.length];

            for (int i = 0; i < datosXDePrediccion.length; i++) {
                predicciones[i] = B1 * datosXDePrediccion[i] + B0;
                System.out.println("PREDICCION Para el NUMERO: " + datosXDePrediccion[i]);
                System.out.println(predicciones[i]);
            }
        }
    }
