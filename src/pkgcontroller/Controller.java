package pkgcontroller;

import pkgmodel.Principal;
import pkgmodel.PrincipalDAO;
import pkgview.NewJFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private NewJFrame view;
    private PrincipalDAO model;

    public Controller(NewJFrame view, PrincipalDAO model) {
        this.view = view;
        this.model = model;
        this.view.btncalcular.addActionListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String[] filas = view.txtfdatos.getText().split("\\n");
                Principal[] object = new Principal[filas.length];

                for (int i = 0; i < filas.length; i++) {
                    String[] datos = filas[i].split("\\s+"); 

                    double codestudent = Double.parseDouble(datos[0]);
                    double codegenre = Double.parseDouble(datos[1]);
                    double codematt = Double.parseDouble(datos[2]);
                    double notas = Double.parseDouble(datos[3]);

                    object[i] = new Principal(codestudent, codegenre, codematt, notas);
                }

                view.lblnumaprobados.setText(String.format("%.2f", model.passrate(object)));
                view.lblnumnotaregular.setText(Integer.toString(model.regularclass(object)));
                view.lblbestmatter.setText(model.bestmatter(object));
                view.lblbeststudent.setText(model.beststudent(object));

            } catch (NumberFormatException ex) {
                view.displayErrorMessage("Por favor, ingresa un número válido para la dimensión de la lista.");
            }
        }
    }
}
