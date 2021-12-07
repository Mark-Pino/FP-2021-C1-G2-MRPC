package pe.edu.upeu.app;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import org.fusesource.jansi.Ansi.Color;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnsiConsole.systemInstall();
        Ansi color=new Ansi();
        //System.out.println(color.bgCyan().fg(Color.RED).a("Holassss").newline().reset());
        color=new Ansi();
        //System.out.println(color.render("@|blue Holassss @| |@green VErsdsd |@  "));
        System.out.println(color.render("@|blue Holassss |@ @|green VErsdsd |@  "));
        MenuPrincipal mp=new MenuPrincipal();
        //mp.mainLogin();
    }
}