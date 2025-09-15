public class PromedioTemperaturas {

    /**
     * Calcula la temperatura promedio de cada ciudad.
     *
     * @param datos Matriz 3D de temperaturas [ciudad][semana][día]
     * @return Un arreglo con los promedios por ciudad
     */
    public static double[] calcularPromedio(double[][][] datos) {
        int numCiudades = datos.length;
        double[] promedios = new double[numCiudades];

        for (int c = 0; c < numCiudades; c++) {
            double suma = 0;
            int contador = 0;

            for (int s = 0; s < datos[c].length; s++) {
                for (int d = 0; d < datos[c][s].length; d++) {
                    suma += datos[c][s][d];
                    contador++;
                }
            }
            promedios[c] = suma / contador;
        }
        return promedios;
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        // Ejemplo: 3 ciudades, 2 semanas, 3 días cada semana
        double[][][] temperaturas = {
            { {20, 22, 21}, {23, 24, 22} },   // Ciudad 1
            { {18, 19, 20}, {21, 22, 20} },   // Ciudad 2
            { {25, 26, 27}, {24, 23, 26} }    // Ciudad 3
        };

        double[] resultados = calcularPromedio(temperaturas);

        // Mostrar resultados
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("Ciudad " + (i+1) + " -> Promedio: " + resultados[i]);
        }
    }
}
