package horadosistema;

import java.awt.*;

public class ResolucaoTela {
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    System.out.println("A resolução da sua máquina é: " +d.width + " x " +d.height);
}
