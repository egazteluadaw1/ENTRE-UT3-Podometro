/**
 * La clase modela un sencillo podómetro que registra información
 * acerca de los pasos, distancia, ..... que una persona (hombre o mujer)
 * ha dado en una semana. 
 * 
 * @Elaia Gaztelu
 * 
 */
public class Podometro {

    private final char MUJER = 'M';
    private final char HOMBRE = 'H';
    private final int SABADO = 6;
    private final int DOMINGO = 7;
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    
    private int pasos;
    private int distancia;
    private String marca;
    private double altura;
    private char sexo;
    private double longitudZancada;
    private int tiempo;
    private int totalPasosLaborables;
    private int totalPasosSabado;
    private int totalPasosDomingo;
    private double totalDistanciaSemana;
    private double totalDistanciaFinSemana;
    private int caminatasNoche;
    


    /**
     * Inicializa el podómetro con la marca indicada por el parámetro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(String queMarca) {
        marca = queMarca;
        pasos = 0;
        distancia = 0;

        sexo = MUJER;
        altura = 0;
        longitudZancada = 0;
        tiempo = 0;
        totalPasosLaborables = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalDistanciaSemana = 0;
        totalDistanciaFinSemana = 0;
        caminatasNoche = 0;

    }

    /**
     * accesor para la marca
     *  
     */
    public  String  getMarca() {
        return marca;
        

    }

    /**
     * Simula la configuración del podómetro.
     * Recibe como parámetros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna además el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {
        altura = queAltura;
        sexo = queSexo;

        if (sexo == MUJER){
            longitudZancada = altura * ZANCADA_MUJER;
            
        }
        else {
            longitudZancada = altura * ZANCADA_HOMBRE;
        }

     }

     /**
     *  Recibe cuatro parámetros que supondremos correctos:
     *    pasos - el nº de pasos caminados
     *    dia - nº de día de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - Sábado, 7 - Domingo)
     *    horaInicio – hora de inicio de la caminata
     *    horaFina – hora de fin de la caminata
     *    
     *    A partir de estos parámetros el método debe realizar ciertos cálculos
     *    y  actualizará el podómetro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */

    public void registrarCaminata(int quePasos, int dia, int horaInicio,
                            int horaFin) {

        pasos += quePasos;
        double totalDistancia = (pasos * longitudZancada);
        double minsFinal;
        double minsInicio;

        totalDistanciaSemana += totalDistancia;
        minsFinal = ((horaFin / 100) * 60) + (horaFin % 100);
        minsInicio = ((horaInicio / 100) * 60) +(horaInicio % 100);
        tiempo += minsFinal - minsInicio;

        switch (dia){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5: totalPasosLaborables += totalDistancia;
            break;
            case 6: totalPasosSabado += totalDistancia; 
            totalDistanciaFinSemana += totalDistancia;
            break;
            default: totalPasosDomingo += totalDistancia;
            totalDistanciaFinSemana += totalDistancia;
        }
        if ((horaInicio / 100) >= 21 && (horaInicio / 100) < 9){
            caminatasNoche++;
        }
     }
    
     /**
     * Muestra en pantalla la configuración del podómetro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
     public void printConfiguracion() {
        String sexoPersona;

        if (sexo == HOMBRE){
            sexoPersona = "Hombre";
        }
        else{
            sexoPersona = "Mujer";
        }

        System.out.println("Configuración del podómetro" +
                           "\n*************" +
                           "\nAltura " + (altura / 100) + " mtos" + 
                           "\nSexo " + sexoPersona  + 
                           "\nLongitud zancada: " + longitudZancada);

         

     }

    /**
     * Muestra en pantalla información acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstadísticas() {
        String queDia;
        if (totalDistanciaFinSemana > (totalPasosLaborables / 100)){
            queDia = "Festivo";
        }
        else{
            queDia = "Laborable";
        }

        System.out.println("Estadísticas" +
                           "\n*************" +
                           "\nDistancia recorrida toda la semana: " + (totalDistanciaSemana / 1000) + " Km" + 
                           "\nDistancia recorrida fin de semana: " + (totalDistanciaFinSemana / 1000) + " Km" + 
                           "\n" +
                           "\n" +
                           "\nNº pasos días laborables: " + totalPasosLaborables + 
                           "\nNº pasos SÁBADO: " + totalPasosSabado + 
                           "\nNº pasos DOMINGO: " + totalPasosDomingo + 
                           "\n" +
                           "\n" +
                           "\nNº caminatas realizadas a partir de las 21h.: " + caminatasNoche + 
                           "\n" +
                           "\n" +
                           "\nTiempo total caminado en la semana: " + (tiempo / 100) + "h. y " + (tiempo % 100) + "m." +
                           "\nDía/s con más pasos caminados: " + queDia);                          
        
    }

   

    /**
    *  Calcula y devuelve un String que representa el nombre del día
    *  en el que se ha caminado más pasos - "SÁBADO"   "DOMINGO" o  "LABORABLES"
    */
    public String diaMayorNumeroPasos() {
        if (totalPasosLaborables > totalPasosSabado && totalPasosLaborables > totalPasosDomingo){
            return "LABORABLES";
        } 
        else if (totalPasosLaborables < totalPasosSabado && totalPasosSabado > totalPasosDomingo){
            return "SÁBADO";
        }
        else {
            return "DOMINGO";
        }
        
    }

    /**
     * Restablecer los valores iniciales del podómetro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no varía
     *  
     */    
    public void reset() {

        pasos = 0;
        distancia = 0;
        sexo = MUJER;
        altura = 0;
        longitudZancada = 0;
        tiempo = 0;
        totalPasosLaborables = 0;
        totalPasosSabado = 0;
        totalPasosDomingo = 0;
        totalDistanciaSemana = 0;
        totalDistanciaFinSemana = 0;
        caminatasNoche = 0;

    }

}
