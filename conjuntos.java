//hands 8

import java.util.ArrayList;
import java.util.List;

public class Conjuntos {
    public static List<Integer> union(List<Integer> a, List<Integer> b) {
        List<Integer> union = new ArrayList<>(a);
        for (Integer x : b) {
            if (!union.contains(x)) {
                union.add(x);
            }
        }
        return union;
    }

    public static List<Integer> interseccion(List<Integer> a, List<Integer> b) {
        List<Integer> interseccion = new ArrayList<>();
        for (Integer x : a) {
            if (b.contains(x)) {
                interseccion.add(x);
            }
        }
        return interseccion;
    }

    public static List<Integer> complemento(List<Integer> a, List<Integer> c) {
        List<Integer> complemento = new ArrayList<>(c);
        complemento.removeAll(a);
        return complemento;
    }

    public static String combinarOperaciones(List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d) {
        return null;
    }

    public static String cOperaciones(List<Integer> a, List<Integer> b, List<Integer> c, List<Integer> d,
            List<Integer> f, List<Integer> g) {
        return null;
    }

    // Otras operaciones se mantienen sin cambios
}
