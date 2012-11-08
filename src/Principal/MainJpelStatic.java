package Principal;
import javax.swing.JFrame;

import jpel.resolver.ConfigurationBuilder;
import jpel.resolver.ConfigurationException;
import jpel.resolver.StaticConfiguration;

public class MainJpelStatic {
	public static void main(String[] args) {
       JFrame tela= new JFrame("teste");
        try {
            StaticConfiguration par;
            par = ConfigurationBuilder.staticConfiguration("/home/pharol/Git/TesteJPEL/src/Principal/Cache.jpel");
            int size = par.getInt("CACHE.SIZE");
           // int flush = par.getInt("CACHE.FLUSH");
           tela.setSize(size, 300);
           tela.setVisible(true);
            //System.out.println(flush);
            //cache.setFlush(flush);
        }
        catch(ConfigurationException exc) {
            System.out.println("Erro no ajuste da cache. "+exc.getMessage());
            return;
        }
        //cache.init();
        // <código do sistema que usa a cache>
        //...
    }
}
