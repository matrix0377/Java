package horadosistema;

import java.util.Locale;

    public class IdiomaSistema {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    }

}
