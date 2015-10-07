package mx.iteso.decorator;

import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args) {
        Taco taco = new TacoNormal(Taco.MEGA);
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("Tamaño: "+taco.getSize());
        System.out.println("$" + taco.cost() + " MXN");

        //VOLCAN
        Taco tacoVolcan = new Volcan(Taco.REGULAR);

        tacoVolcan = new TortillaHarina(tacoVolcan);
        tacoVolcan = new Bistec(tacoVolcan);
        tacoVolcan = new Cebolla(tacoVolcan);

        System.out.println();
        System.out.println();
        System.out.println(tacoVolcan.getDescription());
        System.out.println("Tamaño: "+tacoVolcan.getSize());
        System.out.println("$" + tacoVolcan.cost() + " MXN");


        //QUESADILLA
        Taco tacoQuesadilla = new Quesadilla(Taco.MINI);

        tacoQuesadilla = new TortillaHarina(tacoQuesadilla);

        System.out.println();
        System.out.println();
        System.out.println(tacoQuesadilla.getDescription());
        System.out.println("Tamaño: "+tacoQuesadilla.getSize());
        System.out.println("$" + tacoQuesadilla.cost() + " MXN");

        Taco tacoQuesadilla2 = new Quesadilla(Taco.REGULAR);

        tacoQuesadilla2 = new TortillaMaiz(tacoQuesadilla2);

        System.out.println();
        System.out.println();
        System.out.println(tacoQuesadilla2.getDescription());
        System.out.println("Tamaño: " + tacoQuesadilla2.getSize());
        System.out.println("$" + tacoQuesadilla2.cost() + " MXN");

        //TACO PESCADO
        Taco tacoPescado = new TacoNormal(Taco.MEGA);

        tacoPescado= new TortillaHarina(tacoPescado);
        tacoPescado= new Pescado(tacoPescado);
        tacoPescado= new Cilantro(tacoPescado);

        System.out.println();
        System.out.println();
        System.out.println(tacoPescado.getDescription());
        System.out.println("Tamaño: "+tacoPescado.getSize());
        System.out.println("$" + tacoPescado.cost() + " MXN");

        //TACO CAMARÓN
        Taco tacoCamaron = new TacoNormal(Taco.MEGA);

        tacoCamaron= new TortillaMaiz(tacoCamaron);
        tacoCamaron= new Camaron(tacoCamaron);
        tacoCamaron= new Cilantro(tacoCamaron);
        tacoCamaron= new Cebolla(tacoCamaron);

        System.out.println();
        System.out.println();
        System.out.println(tacoCamaron.getDescription());
        System.out.println("Tamaño: " + tacoCamaron.getSize());
        System.out.println("$" + tacoCamaron.cost() + " MXN");

        //TACO LENGUA
        Taco tacoLengua= new TacoNormal(Taco.REGULAR);

        tacoLengua= new TortillaMaiz(tacoLengua);
        tacoLengua= new Lengua(tacoLengua);
        tacoLengua= new Cilantro(tacoLengua);

        System.out.println();
        System.out.println();
        System.out.println(tacoLengua.getDescription());
        System.out.println("Tamaño: " + tacoLengua.getSize());
        System.out.println("$" + tacoLengua.cost() + " MXN");

    }
}
