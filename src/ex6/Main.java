package ex6;

import ex6.animals.*;
import ex6.places.Barn;
import ex6.places.Enclosure;
import ex6.places.Farm;
import ex6.places.Henhouse;

public class Main {
    public static void main(String[] args) {

        Farmer paco = new Farmer();
        Farm farm = new Farm();

        Henhouse henhouse = new Henhouse();
        Barn barn = new Barn();
        Enclosure enclosure = new Enclosure();
        //-------------------Creamos el granjero, una granja y unos recintos.

        Cow cow = new Cow("Vaca");
        Chicken chicken = new Chicken("Gallina");
        Horse horse = new Horse("Caballo");
        Turkey turkey = new Turkey("Pavo");
        Ox ox = new Ox("Buey");

        henhouse.animals.add(chicken);
        henhouse.animals.add(turkey);

        barn.addAnimal(cow);
        barn.addAnimal(horse);
        barn.addAnimal(ox);
        //------------------ Creamos los animales y los añadimos a sus recintos.

        farm.enclosure = enclosure;
        farm.henhouse = henhouse;
        farm.barns.add(barn);
        //-------------------- Añadimos los recintos (con los animales ya dentro) a la granja que habíamos creado.

        paco.farm = farm;
        //--------------- A paco le decimos que su granja va a
        // ser la que acabamos de montar, con los recintos y animales ya asignados.

        paco.moveAnimal(cow);
        paco.moveAnimal(chicken);
        paco.farm.enclosure.graze(cow);
        //------ Probamos a mover a un animal a pastar y hacemos que paste.

        Chicken littleChicken = new Chicken("Little");
        paco.farm.henhouse.animals.add(littleChicken);
        paco.farm.henhouse.collectEggs();

        paco.moveAnimal(littleChicken);
        paco.farm.enclosure.countAnimals();
        //---------- Creamos una nueva gallina, probamos lo de recoger huevos, movemos a la nueva gallina a
        //---------- pastar también y contamos los animales pastando.
    }
}
