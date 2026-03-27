
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

        Caballero c3 = new Caballero("Saga");
        c3.constelacion = "Geminis";
        c3.material = Material.ORO;
        c3.dios = Dios.ATENEA;

        Caballero c4 = new Caballero("DeathMask");
        c4.constelacion = "Cancer";
        c4.material = Material.ORO;
        c4.dios = Dios.ATENEA;

        Caballero c5 = new Caballero("Aiolia");
        c5.constelacion = "Leo";
        c5.material = Material.ORO;
        c5.dios = Dios.ATENEA;

        Caballero c6 = new Caballero("Shaka");
        c6.constelacion = "Virgo";
        c6.material = Material.ORO;
        c6.dios = Dios.ATENEA;

        Caballero c7 = new Caballero("Dohko");
        c7.constelacion = "Libra";
        c7.material = Material.ORO;
        c7.dios = Dios.ATENEA;

        Caballero c8 = new Caballero("Milo");
        c8.constelacion = "Escorpio";
        c8.material = Material.ORO;
        c8.dios = Dios.ATENEA;

        Caballero c9 = new Caballero("Aiolos");
        c9.constelacion = "Sagitario";
        c9.material = Material.ORO;
        c9.dios = Dios.ATENEA;

        Caballero c10 = new Caballero("Shura");
        c10.constelacion = "Capricornio";
        c10.material = Material.ORO;
        c10.dios = Dios.ATENEA;

        Caballero c11 = new Caballero("Camus");
        c11.constelacion = "Acuario";
        c11.material = Material.ORO;
        c11.dios = Dios.ATENEA;

        Caballero c12 = new Caballero("Afrodita");
        c12.constelacion = "Piscis";
        c12.material = Material.ORO;
        c12.dios = Dios.ATENEA;

        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        System.out.println(c10);
        System.out.println(c11);
        System.out.println(c12);


    }
}