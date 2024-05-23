import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resp1, resp2, resp3;
        String formato;
        Accion accion = new Accion();

//      Asignacion de valores al array datosAcciones
//      Los valores de estos strings con datos xml fueron generados por chatGPT

        accion.datosAcciones[0] = "<Stock><Symbol>GOOGL</Symbol><Name>Alphabet Inc. (Google)</Name><Price>2750.0</Price><Volume>1200000</Volume><MarketCap>1920.5</MarketCap></Stock>";
        accion.datosAcciones[1] = "<Stock><Symbol>AMZN</Symbol><Name>Amazon.com Inc.</Name><Price>3250.0</Price><Volume>1500000</Volume><MarketCap>1700.3</MarketCap></Stock>";
        accion.datosAcciones[2] = "<Stock><Symbol>AAPL</Symbol><Name>Apple Inc.</Name><Price>150.0</Price><Volume>2000000</Volume><MarketCap>2300.6</MarketCap></Stock>";
        accion.datosAcciones[3] = "<Stock><Symbol>FB</Symbol><Name>Facebook Inc.</Name><Price>340.0</Price><Volume>800000</Volume><MarketCap>950.2</MarketCap></Stock>";
        accion.datosAcciones[4] = "<Stock><Symbol>MSFT</Symbol><Name>Microsoft Corporation</Name><Price>250.65</Price><Volume>45231200</Volume><MarketCap>1900.21</MarketCap></Stock>";
        accion.datosAcciones[5] = "<Stock><Symbol>TSLA</Symbol><Name>Tesla Inc.</Name><Price>620.0</Price><Volume>1200000</Volume><MarketCap>580.9</MarketCap></Stock>";

        LibreriaAnaliticaTerceros libreriaAnaliticaTerceros = new LibreriaAnaliticaTerceros();
        AdaptadorFormatoDatos adaptadorFormatoDatos = new AdaptadorFormatoDatos(libreriaAnaliticaTerceros);

        System.out.println("\n-------------Bienvenido al sistema de gestión del mercado de acciones-------------\n");
        System.out.println("Seleccione de qué compañía desea conocer los datos de sus acciones:");
        System.out.println("1. Alphabet Inc. (Google)");
        System.out.println("2. Amazon.com Inc.");
        System.out.println("3. Apple Inc.");
        System.out.println("4. Facebook Inc.");
        System.out.println("5. Microsoft Corporation");
        System.out.println("6. Tesla Inc.\n");
        resp1 = input.nextInt();
        // Obtener el nombre de la compañía desde la cadena XML
        String xml = accion.datosAcciones[resp1 - 1];
        int indiceInicioNombre = xml.indexOf("<Name>") + "<Name>".length();
        int indiceFinNombre = xml.indexOf("</Name>");
        String nombreCompania = xml.substring(indiceInicioNombre, indiceFinNombre);
        System.out.println("¿En qué formato desea conocer los datos de la compañía " + nombreCompania);
        System.out.println("1. JSON");
        System.out.println("2. XML");
        input.nextLine();
        resp2 = input.nextInt();
        if (resp2 == 1) {
            adaptadorFormatoDatos.obtenerDatosAccion_JSON(accion.datosAcciones[resp1 - 1]);
        } else {
            System.out.println("Datos en formato XML: \n" + accion.datosAcciones[resp1 - 1] );
        }
    }
}
