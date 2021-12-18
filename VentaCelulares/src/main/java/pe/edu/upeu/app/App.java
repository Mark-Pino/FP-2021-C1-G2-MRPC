package pe.edu.upeu.app;

//import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
//import org.fusesource.jansi.Ansi.Color;

public class App {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main( String[] args ) {
        //System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLUE + "Texto de color azul sobre fondo verde");System.out.println("Como no lo he resetado sigue igual.");System.out.println("¡Reseteo ahora!" + ANSI_RESET);System.out.println("FIN");
        AnsiConsole.systemInstall();
        //Ansi color=new Ansi();
        //System.out.println(color.bgYellow().fg(Color.RED).a("Holassss"));
        //color=new Ansi();
        //System.out.println(color.fg(Color.BLUE).a("Holassss"));
        //System.out.println(color.render("@|blue Holasss |@ @|green VErsdsd |@  "));
        MenuPrincipal mp=new MenuPrincipal();
        mp.mainLogin();
    }
}