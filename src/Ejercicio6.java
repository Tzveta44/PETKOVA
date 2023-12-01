
import java.time.LocalDate;
import java.time.Period;

public class Ejercicio6 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(1992, 8, 30);
        LocalDate FechainicioCurso = LocalDate.of(2023,10,9);

        System.out.println("La edad del señor que nació el 30 de agosto de 1992 es : "+CalcularEdad(fechaActual,fechaNacimiento)+ " años");
        System.out.println("La fecha de hoy es : "+fechaActual);
        System.out.println("Sumemos dos meses a la fecha de inicio de curso "+FechainicioCurso+" + 2 meses = "+FechainicioCurso.plusMonths(2));




    }


    public static int CalcularEdad(LocalDate actual,LocalDate fecha_Nacimiendo)
    {
        int edad;
        Period periodo = Period.between(fecha_Nacimiendo, actual);
        edad = periodo.getYears();

        return edad;
    }




}
