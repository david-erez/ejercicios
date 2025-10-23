// Evaluar si un estudiante aprueba (nota ≥ 3.0 y asistencia ≥ 80%).

import java.util.Scanner;

public class EjercicioCuatro {
    private double nota;
    private byte asistencia;

    public double getNota() 
    {
        return nota;
    }
    public void setNota(double nota) 
    {
        this.nota = nota;
    }
    public byte getAsistencia()
     {
        return asistencia;
    }
    public void setAsistencia(byte asistencia)
     {
        this.asistencia = asistencia;
    }
    public void calificacion()
    {
        if (nota >= 3.0 && asistencia >= 80)
        {
            System.out.println("el estudiante aprueba");
        }
        else{
            System.out.println("el estudiante no aprueba");
        }
    }
    public static void main(String[] args) {
        EjercicioCuatro eje4 = new EjercicioCuatro();

        System.out.println("ingrese la nota de el estudiante:");
        Scanner cs = new Scanner(System.in);
        eje4.setNota(cs.nextDouble());
        System.out.println("ingrese el porcentage de acistencia de el estudiante:");
        eje4.setAsistencia(cs.nextByte());
        eje4.calificacion();
    }
}
