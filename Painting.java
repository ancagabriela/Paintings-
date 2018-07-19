import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Painting {
    private String namePainting;
    private String author;
    private double price;
    private  Date registerDate;

    public Painting (String name, String author, double price, int agno, int mes, int dia) {
        this.namePainting = name;
        this.author =author;
        this.price= price;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        registerDate= calendario.getTime();
    }
    public String getName(){ //GETTER
        return namePainting;
    }

    public String getAuthor(){ //GETTER
        return author;
    }
    public double getPrice(){ //GETTER
        return price;
    }

    public Date getRegisterDate(){ //GETTER
        return registerDate;
    }

}
