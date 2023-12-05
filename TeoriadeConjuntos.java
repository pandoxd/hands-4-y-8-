import java.util.ArrayList;
import java.util.List;

public class TeoriadeConjuntos {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> b = new ArrayList<>(List.of(2, 4, 6, 8, 10));
        List<Integer> c = new ArrayList<>(List.of(5, 7, 8, 9));
        List<Integer> d = new ArrayList<>(List.of(5, 7, 10, 11, 12));
        List<Integer> f = new ArrayList<>(List.of(2, 5));
        List<Integer> g = new ArrayList<>(List.of(2, 5));
        List<Integer> universo = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println("UNION de A con B: " + Conjuntos.union(a, b));
        System.out.println("INTERSECCION de C con D: " + Conjuntos.interseccion(c, d));
        System.out.println("COMPLEMENTO de A en C: " + Conjuntos.complemento(a, c));
        System.out.println("(A UNION B) INTERSECCION (C INTERSECCION D): " + Conjuntos.combinarOperaciones(a, b, c, d));
        System.out.println("(A UNION B)  (C INTERSECCION D) - (F INTERSECCION G): " + Conjuntos.cOperaciones(a, b, c, d, f, g));
    }
}
