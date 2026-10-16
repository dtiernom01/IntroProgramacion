public class Actividad05ViajeCoche {

    public static void main(String[] args) {

        /*
         * UT3 - ACTIVIDAD 5: VIAJE EN COCHE
         *
         * Queremos estimar cuánto cuesta el combustible de un viaje.
         */

        double kilometros = 420.0;
        double consumoCada100Km = 6.5;
        double precioLitro = 1.55;
        int personas = 4;

        // ============================================================
        // PARTE 1. LITROS NECESARIOS
        // ============================================================
        // Un coche consume 6.5 litros cada 100 km.
        //
        // Calcula cuántos litros necesita aproximadamente
        // para recorrer 420 km.
        //
        // Pista:
        // piensa primero cuántos grupos de 100 km hay en el viaje.
        double gruposDe100Km = (kilometros/100);
        System.out.println(gruposDe100Km);
        
        double consumototal = gruposDe100Km * consumoCada100Km;
        
        System.out.println(consumototal);


        // ============================================================
        // PARTE 2. COSTE DEL COMBUSTIBLE
        // ============================================================
        // Utiliza los litros calculados anteriormente y precioLitro
        // para obtener el coste total del combustible.
        double costeCombustible = consumototal * precioLitro;
        System.out.println("coste combustible : " + costeCombustible );
        
        

        // ============================================================
        // PARTE 3. REPARTO
        // ============================================================
        // Si viajan 4 personas, calcula cuánto tendría que pagar
        // cada una si reparten el combustible a partes iguales.
         double costeporpersona = costeCombustible / personas;
        System.out.println("Coste por persona: " + costeporpersona);

        // ============================================================
        // PARTE 4. RESUMEN
        // ============================================================
        // Muestra un resumen parecido a:
        //
        // VIAJE DE FIN DE SEMANA
        // Distancia: 420.0 km
        // Consumo: 6.5 L/100 km
        // Litros necesarios: ...
        // Coste combustible: ... €
        // Personas: 4
        // Coste por persona: ... €
        //
        // Modifica después kilometros, consumoCada100Km y personas.
        // ¿El programa sigue calculando correctamente?
        System.out.println("VIAJE DE FIN DE SEMANA");
        System.out.println("Distancia: " + kilometros );
        System.out.println("Consumo: " + consumoCada100Km );
        System.out.println("Litros necesarios: " + consumototal);
        System.out.println("Coste combustible: " + costeCombustible );
        System.out.println("Personas: " + personas);
        System.out.println("Coste por persona: " + costeporpersona );
        
    }

}
