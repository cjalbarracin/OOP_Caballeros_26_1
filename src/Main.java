
public class Main {
    public static void main(String[] args) {


        Persona p1 = new Persona("Yonaiker");
        Persona p2 = new Persona("Rekianoy");
        Persona p3 = new Persona("Mihamandado");

        Caballero c1 = new Caballero("Mu");
        c1.constelacion="Aries";
        c1.material=Material.ORO;
        c1.dios=Dios.ATENEA;
        Caballero c2 = new Caballero("Aldebaran",Material.ORO,"Tauro",Dios.ATENEA);
        System.out.println(c2.material+" ");

       System.out.println(c1.getVida());
       System.out.println(c2.getVida());

       c2.setVida(500);
        System.out.println(c2.getVida());
        //System.out.println(c2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        //c1.persona=p1;
        //c2.persona=p2;

        System.out.println(c2);
        System.out.println(c1);
    }
}