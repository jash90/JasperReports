/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ZimnY
 */
public class Generowanieraportow {

    public static void generowanieraportu1pdf(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report1.jasper";

            ArrayList<Post> dataList = Dane.raport1();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report1.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu1html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report1.jasper";

            ArrayList<Post> dataList = Dane.raport1();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report1.html");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu2html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report2.jasper";

            ArrayList<Post> dataList = Dane.raport2();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report2.html");
            }

        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu2pdf(String destinationFileName) {
        try {
            String sourceFileName = System.getProperty("user.dir") + "\\jasperreports\\report2.jasper";

            ArrayList<Post> dataList = Dane.raport2();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report2.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu3html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report3.jasper";

            ArrayList<Znajomosc> dataList = Dane.raport3();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report3.html");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu3pdf(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report3.jasper";

            ArrayList<Znajomosc> dataList = Dane.raport3();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report3.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }

    }

    public static void generowanieraportu4html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report4.jasper";

            ArrayList<Czat> dataList = Dane.raport4();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report4.html");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }

    }

    public static void generowanieraportu4pdf(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report4.jasper";

            ArrayList<Czat> dataList = Dane.raport4();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report4.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu5html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report5.jasper";

            ArrayList<Uzytkownik> dataList = Dane.raport5();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report5.html");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu5pdf(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report5.jasper";

            ArrayList<Uzytkownik> dataList = Dane.raport5();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();
                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report5.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void generowanieraportu6html(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report6.jasper";

            ArrayList<Faktura> dataList = Dane.raport6();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToHtmlFile(jp, destinationFileName + "\\report6.html");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }

    }

    public static void generowanieraportu6pdf(String destinationFileName) {
        try {
            String sourceFileName
                    = System.getProperty("user.dir") + "\\jasperreports\\report6.jasper";

            ArrayList<Faktura> dataList = Dane.raport6();
            if (dataList.size() > 0) {
                JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(dataList);

                Map parameters = new HashMap();

                JasperPrint jp = JasperFillManager.fillReport(sourceFileName, parameters, bean);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
                JasperExportManager.exportReportToPdfFile(jp, destinationFileName + "\\report6.pdf");
            }
        } catch (JRException ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        } catch (Exception ex) {
            String s = "";
            if (ex.getLocalizedMessage() == null) {
                s = "";
            } else {
                s = ex.getLocalizedMessage();
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z generowanie raportu. " + s);
            alert.showAndWait();
            System.out.println("Problem z generowanie raportu. " + s);
        }
    }

    public static void main(String[] args) throws SQLException {
        //  generowanieraportu3html("");
    }

}
