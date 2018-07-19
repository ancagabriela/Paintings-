public class Shop {
    /*private int Id; (esto es una variable static)
    private static int IdSiguiente=1;*/ //cuando lo llamas en main tienes que poner la clase

    private final String nameShop; //final entonces es constante, no se puede cambiar
    private int capacity;   //con private no se podrà llamar de otra clase, se tendran que usar getters y setters
    private Painting[] shopPaintings = new Painting[capacity];

    public Shop (String name, int capacity) { //constructor, no es nunca void ni return nada
        // super(name, capacity);   se llama al constructor de la clase extends  (public class Furgoneta extends Coche)
        this.nameShop = name;
        this.capacity =capacity;
        Painting[] shopPaintings = new Painting[capacity];


    }

    /* public Shop (String name) {      más de un constructor, cuando no queremos usar todos los atributos, poner una capacity por defecto
    this(name, 25);                     sobrecarga de constructores
    }                                   puede que no haya constructor, constructor por defecto
     */

/*                                      metodos static solo pueden acceder a variables static (IdSiguiente es static)
    public static int getSomething(){   esto es un metodo static, que lo llamamos desde main hay que poner el nombre de la clase + .getSomething
        return IdSiguiente;             metodos static no actuan sobre objetos
    }                                   metodos Math. son todos static
*/
    public Painting[] getShopPaintings(){
        return shopPaintings;
    }

   // public void setShopPaintings(String getName, S){




}
