public class AdaptadorFormatoDatos implements AnalizadorDatos{
    private LibreriaAnaliticaTerceros libreriaAnaliticaTerceros;

    public AdaptadorFormatoDatos(LibreriaAnaliticaTerceros libreriaAnaliticaTerceros){
        this.libreriaAnaliticaTerceros = libreriaAnaliticaTerceros;
    }
    @Override
    public void obtenerDatosAccion_JSON(String accionXML) {
        String accionJSON = adaptarFormatoAccion(accionXML);
        libreriaAnaliticaTerceros.llamadoMetodos(accionJSON);
    }

    public String adaptarFormatoAccion(String accionXML) {
        String[] datoAccion = {"Symbol", "Name", "Price", "Volume", "MarketCap"};
        String[] valoresAccion = new String[5];
        for (int i = 0; i < datoAccion.length; i++) {
//          Construcción de etiquetas de inicio y fin
            String etiquetaI = "<" + datoAccion[i] + ">";
            String etiquetaF = "</" + datoAccion[i] + ">";
//          Buscar posiciones de las etiquetas
            int indiceI = accionXML.indexOf(etiquetaI) + etiquetaI.length();
            int indiceF = accionXML.indexOf(etiquetaF);
//          substring() obtiene un string entre dos strings
            String valorAccion = accionXML.substring(indiceI, indiceF);
            valoresAccion[i] = valorAccion;
        }
        String accionJSON = "{\n" +
                "  \"Stock\": {\n" +
                "    \"Symbol\": \"" + valoresAccion[0] + "\",\n" +
                "    \"Name\": \"" + valoresAccion[1] + "\",\n" +
                "    \"Price\": " + valoresAccion[2] + ",\n" +
                "    \"Volume\": " + valoresAccion[3] + ",\n" +
                "    \"MarketCap\": " + valoresAccion[4] + "\n" +
                "  }\n" +
                "}";
        return accionJSON;
    }
}

