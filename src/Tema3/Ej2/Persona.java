package Tema3.Ej2;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo); //para aplicar bien la comprobacion use chatgpt
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
    }
    public int calcularIMC(){
        if (peso == 0 || altura == 0){
            return 2;
        }
        if (peso / (altura * altura) < 20){
            return -1;
        }if (peso / (altura * altura) >= 20 && peso / (altura * altura) <= 25){
            return 0;
        }
        return 1;
    }
    public boolean esMayorDeEdad(){
        if (edad > 17){
            return true;
        }
        return false;
    }
    private char comprobarSexo(char sexo){
        if (sexo == 'H' || sexo == 'M'){
            return sexo;
        }else {
            return 'H';
        }
    }
    public String toString(){
        return "el nombre es: "+ nombre + " edad: "+ edad + " sexo: "+ sexo + " peso: "  + peso + " altura: "+ altura + " DNI: "+ dni;
    }
    private String generarDNI(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8 ; i++) {
            int digito = (int) (Math.random() * 10);
            sb.append(digito);
        }
        int numero = Integer.parseInt(sb.toString());
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        sb.append(letras.charAt(numero%23));
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}