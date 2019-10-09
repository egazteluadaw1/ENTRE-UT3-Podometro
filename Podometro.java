/**
 * La clase modela un sencillo pod�metro que registra informaci�n
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
     * Inicializa el pod�metro con la marca indicada por el par�metro.
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
     * Simula la configuraci�n del pod�metro.
     * Recibe como par�metros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna adem�s el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {
        altura = queAltura;
        sexo = queSexo;
        
    }

     /**
     *  Recibe cuatro par�metros que supondremos correctos:
     *    pasos - el n� de pasos caminados
     *    dia - n� de d�a de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - S�bado, 7 - Domingo)
     *    horaInicio � hora de inicio de la caminata
     *    horaFina � hora de fin de la caminata
     *    
     *    A partir de estos par�metros el m�todo debe realizar ciertos c�lculos
     *    y  actualizar� el pod�metro adecuadamente  
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
     * Muestra en pantalla la configuraci�n del pod�metro
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
     * Muestra en pantalla informaci�n acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstad�sticas() {

        

    }

   

    /**
     *  Calcula y devuelve un String que representa el nombre del d�a
     *  en el que se ha caminado m�s pasos - "S�BADO"   "DOMINGO" o  "LABORABLES"
     */
    public String diaMayorNumeroPasos() {

        return marca;

    }

    /**
     * Restablecer los valores iniciales del pod�metro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no var�a
     *  
     */    
    public void reset() {
        
        

    }

}
