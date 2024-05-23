import java.util.InputMismatchException;
import java.util.Scanner;

public class LibreriaAnaliticaTerceros {
    Scanner input = new Scanner(System.in);

    public void analizarDatos(String accionJSON) {
        System.out.println(accionJSON + "\n");
        System.out.println("Analizando datos en formato JSON de la acción...\n");
    }

    public void generarDiagrama() {
        String[] diagramaDispersion = {
                "⭡                       ",
                "╵            *          ",
                "╵    *            *     ",
                "╵  *      *             ",
                "╵                *      ",
                "╵     *   *             ",
                "╵─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ⭢"
        };
        System.out.println("Generando diagrama del análisis de la acción...\n");
        System.out.println("Diagrama generado:\n");
        for (String line : diagramaDispersion) {
            System.out.println(line);
        }
    }
    public void generarGrafico() {
        String[] json = {
                "* * * *  * * * *  * * * *  *       *",

                "      *  *        *     *  * *     *",
                "      *  * * * *  *     *  *   *   *",
                "*     *        *  *     *  *     * *",
                "* * * *  * * * *  * * * *  *       *"
        };
        System.out.println("Generando gráfico del análisis de la acción...\n");
        System.out.println("Gráfico generado:\n");
        for (String line : json) {
            System.out.println(line);
        }
    }

    public void llamadoMetodos(String accionJSON){
        analizarDatos(accionJSON);
        int resp;
        do {
            try {
                System.out.println("¿Desea generar alguna de las siguientes opciones?");
                System.out.println("1.Diagrama");
                System.out.println("2.Gráfico");
                resp = input.nextInt();
                if (resp == 1) {
                    generarDiagrama();
                } else if (resp == 2) {
                    generarGrafico();
                } else {
                    System.out.println("Por favor seleccione una respuesta válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                input.nextLine();
                resp = -1; //
            }
        } while (resp < 1 || resp  > 2);
    }
}
