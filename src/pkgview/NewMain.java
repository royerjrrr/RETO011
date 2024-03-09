package pkgview;

import pkgcontroller.Controller;
import pkgmodel.PrincipalDAO;
import pkgview.NewJFrame;

public class NewMain {

    public static void main(String[] args) {
        NewJFrame view = new NewJFrame();

        PrincipalDAO model = new PrincipalDAO();

        Controller controller = new Controller(view, model);

        view.setVisible(true);
        view.setResizable(false);
    }
}
