package formas;

class Formas {
    protected String color;

    public void establecerColor(String color) {
        this.color = color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

class Circulo extends Formas {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularRadio() {
        return this.radio;
    }

    @Override
    public void dibujar() {
   
        System.out.println("\u001B[31mDibujando un Círculo\u001B[0m");
        System.out.println("Radio del círculo: " + calcularRadio());
        System.out.println("---------------------------------");
    }
}

class Linea extends Formas {
    private final double largo;

    public Linea(double largo) {
        this.largo = largo;
    }

    @Override
    public void dibujar() {
  
        System.out.println("\u001B[32mDibujando una Línea\u001B[0m");
        System.out.println("Largo de la línea: " + largo);
        System.out.println("---------------------------------");
    }
}

class Triangulo extends Formas {
    private final double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(angulo, 2);
    }

    @Override
    public void dibujar() {
  
        System.out.println("\u001B[34mDibujando un Triángulo\u001B[0m");
        System.out.println("Área del triángulo: " + calcularArea());
        System.out.println("---------------------------------");
    }
}

class Cuadrado extends Formas {
    private final double area;

    public Cuadrado(double area) {
        this.area = area;
    }

    public double calcularArea() {
        return this.area;
    }

    @Override
    public void dibujar() {
   
        System.out.println("\u001B[35mDibujando un Cuadrado\u001B[0m");
        System.out.println("Área del cuadrado: " + calcularArea());
        System.out.println("---------------------------------");
    }
}

public class FormasMain {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Linea linea = new Linea(10.0);
        Triangulo triangulo = new Triangulo(4.0);
        Cuadrado cuadrado = new Cuadrado(16.0);

        circulo.dibujar();
        linea.dibujar();
        triangulo.dibujar();
        cuadrado.dibujar();
    }
}