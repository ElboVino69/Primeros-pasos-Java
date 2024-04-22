public class Decisiones{
public static void main(String[] args) {
    int fechaDeLanzamiento = 1999;
    boolean incluidoEnElPlan= true;
    double notaDeLaPelicula = 8.2;
    String tipoPlan ="Plus";
    
    if(fechaDeLanzamiento>2022){
        System.out.println("Peliculas mas populares");
    }
    else{
        System.out.println("Peliculas retro que valen la pena ver");
    }
    if(incluidoEnElPlan &&tipoPlan.equals("Plus")){
        System.out.println("Disfute de su pelicula");
    }
    else{
         System.out.println("Pelicula no disponible para su plan actual");
    }

    }

}
