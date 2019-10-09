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
    private final double ZANCADA_HOMBRE = 5.5;
    private int pasos;
    private int distancia;
    private String marca;
    private double altura;
    private char sexo;
    private double longitudZancada;
    private int inicio;
    private int fin;

    /**
     * Inicializa el podómetro con la marca indicada por el parámetro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(String queMarca) {
        marca = queMarca;
        pasos = 0;
        distancia = 0;
        sexo = 'M';
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
        pasos = quePasos;
        String nombreDia = "";
        switch (dia) {
           case 1: nombreDia = "Lunes";
           break;
           case 2: nombreDia = "Martes";
           break;
           case 3: nombreDia = "Miercoles";
           break;
           case 4: nombreDia = "Jueves";
           break;
           case 5: nombreDia = "Viernes";
           break;
           case 6: nombreDia = "Sabado";
           break;
           case 7: nombreDia = "Domingo";
           break;
        }        
        horaInicio = inicio;
        horaFin = fin;
        

    }
    
     /**
     * Muestra en pantalla la configuración del podómetro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {
        System.out.println("Altura: " + altura +
                            "\nSexo: " + sexo +
                            "\nLongitud de la zancada: " + longitudZancada);
        

    }

    /**
     * Muestra en pantalla información acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstadísticas() {

        

    }

   

    /**
     *  Calcula y devuelve un String que representa el nombre del día
     *  en el que se ha caminado más pasos - "SÁBADO"   "DOMINGO" o  "LABORABLES"
     */
    public String diaMayorNumeroPasos() {

        return marca;

    }

    /**
     * Restablecer los valores iniciales del podómetro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no varía
     *  
     */    
    public void reset() {
        
        

    }

}
