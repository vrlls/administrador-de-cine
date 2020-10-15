/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author usuario
 */
public class Metodos {

    static File pelin;

    public void mostartabla(File arch, JTable Tabla) throws FileNotFoundException, IOException {
        Tabla.removeAll();
        if (arch.exists()) {
            DefaultTableModel table = (DefaultTableModel) Tabla.getModel();
            table.setRowCount(0);
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);
            String y;

            while ((y = br.readLine()) != null) {

                if (y.contains(",")) {

                    String[] campos = y.split(",");
                    String horaI = campos[0];
                    String horaF = campos[1];
                    String pelicula = campos[2];
                    String dispo = campos[3];
                    table.addRow(new Object[]{horaI, horaF, pelicula, dispo});
                }

            }
            br.close();
            fr.close();
        }
    }

    public Nodo agregarnodos(File arch) throws FileNotFoundException, IOException {
        if (arch.exists()) {
            if (arch.canRead()) {
                Nodo ptr = null;
                Nodo p;
                Nodo ult = null;
                FileReader fr = new FileReader(arch);
                BufferedReader br = new BufferedReader(fr);
                String y;
                p = ptr;
                while ((y = br.readLine()) != null) {

                    if (y.contains(",")) {

                        String[] campos = y.split(",");
                        Nodo q = new Nodo(campos[0], campos[1], campos[2], campos[3]);
                        if (ptr == null) {
                            ptr = q;
                            p = q;
                            ult = p;
                            p.Llink = null;
                            ptr.Llink = null;
                            p.Rlink = null;
                            ptr.Rlink = null;
                            ult.Rlink = null;
                            ult.Llink = null;
                        } else {
                            q.Llink = p;
                            q.Rlink = null;
                            p.Rlink = q;
                            p = q;
                            ult = p;

                        }
                    }
                }
                br.close();
                fr.close();
                return ptr;
            }
        }
        return null;
    }

    public Nodo agregarNodosDescripcion(File arch) throws IOException {
        if (arch.exists()) {
            if (arch.canRead()) {
                Nodo ptr = null;
                Nodo p;
                Nodo ult = null;
                FileReader fr = new FileReader(arch);
                BufferedReader br = new BufferedReader(fr);
                String y;
                p = ptr;
                while ((y = br.readLine()) != null) {

                    if (y.contains(",")) {

                        String[] campos = y.split(",");
                        Nodo q = new Nodo(campos[0], campos[1]);
                        if (ptr == null) {
                            ptr = q;
                            p = q;
                            ult = p;
                            p.Llink = null;
                            ptr.Llink = null;
                            p.Rlink = null;
                            ptr.Rlink = null;
                            ult.Rlink = null;
                            ult.Llink = null;
                        } else {
                            q.Llink = p;
                            q.Rlink = null;
                            p.Rlink = q;
                            p = q;
                            ult = p;

                        }
                    }
                }
                br.close();
                fr.close();
                return ptr;
            }
        }
        return null;
    }

    public Nodo buscarDescripcion(String nombre, Nodo ptr) {
        Nodo p = ptr;
        int sw = 0;
        while (p != null && sw == 0) {
            if (p.pelicula.equals(nombre)) {
                sw = 1;
                return p;
            } else {
                p = p.Rlink;
            }
        }
        return null;
    }

    public void insertarDescripciones(File arch, Nodo q, Nodo ptr) throws IOException {
        Nodo s = ptr;
        Nodo p = ptr;
        if (p != null) {
            if (buscarDescripcion(q.pelicula, s) == null) {

                q.Rlink = p;
                p.Llink = q;
                ptr = q;
            } else {

                int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog(null, "Esta pelicula ya tiene otra descripción, desea conservar la anterior o cambiarla a esta?", "Warning", dialogButton);
                if (dialogButton == JOptionPane.YES_OPTION) {
                    p.descripcion = q.descripcion;
                }
            }
        } else {

            ptr = q;
            p = q;
        }
        guardarDescripcion(arch, ptr);

    }

    public void guardarDescripcion(File arch, Nodo ptr) throws IOException {
        if (arch.exists()) {

            FileWriter fw = new FileWriter(arch);
            BufferedWriter bw = new BufferedWriter(fw);
            Nodo p = ptr;
            while (p != null) {

                bw.write(p.pelicula + "," + p.descripcion);
                bw.newLine();
                p = p.Rlink;
            }
            bw.close();
            fw.close();
        }
    }

    public JComboBox ComboboxPeliculas(Nodo ptr, JComboBox combobox) {
        Nodo p = ptr;
        combobox.removeAllItems();
        combobox.addItem("Escoja una pelicula");
        while (p != null) {
            combobox.addItem(p.pelicula);
            p = p.Rlink;
        }
        return combobox;
    }

    public Nodo agregarnodosReserva(File arch) throws FileNotFoundException, IOException {
        if (arch.exists()) {
            if (arch.canRead()) {
                Nodo ptr = null;
                Nodo p;
                Nodo ult = null;
                FileReader fr = new FileReader(arch);
                BufferedReader br = new BufferedReader(fr);
                String y;
                p = ptr;
                while ((y = br.readLine()) != null) {

                    if (y.contains(",")) {

                        String[] campos = y.split(",");
                        Nodo q = new Nodo(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5]);
                        if (ptr == null) {
                            ptr = q;
                            p = q;
                            ult = p;
                            p.Llink = null;
                            ptr.Llink = null;
                            p.Rlink = null;
                            ptr.Rlink = null;
                            ult.Rlink = null;
                            ult.Llink = null;
                        } else {
                            q.Llink = p;
                            q.Rlink = null;
                            p.Rlink = q;
                            p = q;
                            ult = p;

                        }
                    }
                }
                br.close();
                fr.close();
                return ptr;
            }
        }
        return null;
    }

    public Nodo crearMultilista(Nodo ptrS1, Nodo ptrS2) {
        Nodo ptr = null;
        if (ptrS1 != null) {
            ptr = ptrS1;
            ptr.Link1 = ptrS2;
        }
        return ptr;
    }

    public void mostrarTablaReservas(JTable jTable1, Nodo ptr) {
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        jTable1.removeAll();
        Nodo p = ptr;
        while (p != null) {
            while (p.Rlink != null) {

                table.addRow(new Object[]{"S1", p.horaI, p.HoraF, p.pelicula, p.dispo});
                p = p.Rlink;
            }
            table.addRow(new Object[]{"S1", p.horaI, p.HoraF, p.pelicula, p.dispo});
            if (ptr.Link1 != null) {
                p = ptr.Link1;
                while (p.Rlink != null) {
                    table.addRow(new Object[]{"S2", p.horaI, p.HoraF, p.pelicula, p.dispo});
                    p = p.Rlink;
                }
                table.addRow(new Object[]{"S2", p.horaI, p.HoraF, p.pelicula, p.dispo});
                p = p.Rlink;
            } else {
                p = p.Rlink;
            }
        }
    }

    public void insertarreserva(File arch, Nodo nodo, Nodo ptr) throws IOException {
        if (ptr != null) {
            Nodo p = ptr;
            if (p == ptr) {
                nodo.Rlink = p;
                nodo.Llink = null;
                p.Llink = nodo;
                ptr = nodo;
                p = ptr;
            } else {
                nodo.Rlink = p;
                p = nodo;
                ptr = nodo;
            }

            guardarReservas(arch, ptr);

        } else {
            guardarReservas(arch, nodo);
        }
    }

    public void EliminarReserva(File arch, Nodo q, Nodo ptr) throws IOException {
        Nodo p = ptr;
        while (p != null) {
            if (q.horaI.equals(p.horaI) && q.HoraF.equals(p.HoraF) && q.pelicula.equals(p.pelicula) && q.id.equals(p.id) && p != null) {
                if (p.Rlink != null && p.Llink != null) {
                    p.Llink.Rlink = p.Rlink;
                    p.Rlink.Llink = p.Llink;
                    Nodo s = p.Rlink;
                    p = null;
                    p = s;
                } else {
                    if (p.Llink == null) {
                        ptr = p.Rlink;
                        p = null;
                        p = ptr;
                    } else {

                        p.Llink.Rlink = null;
                        p = null;
                    }
                }
            } else {

                p = p.Rlink;
            }
        }
        guardarReservas(arch, ptr);
    }

    public void eliminarPelicula(File arch, Nodo q, Nodo ptr) throws IOException {
        Nodo p = ptr; int sw=0;
        while (p != null && sw==0) {
            if (q.horaI.equals(p.horaI) && q.HoraF.equals(p.HoraF) && q.pelicula.equals(p.pelicula) && p != null) {
                sw=0; System.out.println("hola");
                if (p.Rlink != null && p.Llink != null) {
                    p.Llink.Rlink = p.Rlink;
                    p.Rlink.Llink = p.Llink;
                    Nodo s = p.Rlink;
                    p = null;
                    p = s;
                } else {
                    if (p.Llink == null) {
                        ptr = p.Rlink;
                        p = null;
                        p = ptr;
                    } else {
                        p.Llink.Rlink = null;
                        p=null;
                    }
                }
            } else {
                System.out.println("1");
                p = p.Rlink;
            }
        }
        guardar(arch, ptr);
    }

    public Nodo buscarPelicula(Nodo ptr, String nombre) {
        Nodo p = ptr;
        while (p != null) {
            if (p.pelicula.equals(nombre)) {
                return p;
            } else {
                p = p.Rlink;
            }
        }
        return p;
    }

    public void eliminarDescripcion(String nombre, Nodo ptr, File arch) throws IOException {
        System.out.println("d"+buscarDescripcion(nombre, ptr));
        System.out.println(" p"+buscarPelicula(ptr, nombre) );Nodo ptrD = agregarNodosDescripcion(arch);
        if (buscarDescripcion(nombre, ptrD) != null && buscarPelicula(ptr, nombre) == null) {
            
            Nodo p = ptrD;int sw=0;
            while (p != null && sw==0) {
                System.out.println("al menos");
                if (nombre.equals(p.pelicula) && p != null) {
                    System.out.println("aja");
                    if (p.Rlink != null && p.Llink != null) {
                        p.Llink.Rlink = p.Rlink;
                        p.Rlink.Llink = p.Llink;
                        Nodo s = p.Rlink;
                        p = null;
                        p = s;
                    } else {
                        if (p.Llink == null) {
                            ptrD = p.Rlink;
                            p = null;
                            p = ptrD;
                        } else {
                            p.Llink.Rlink = null;
                            p=null;
                        }
                    }
                } else {
                    p = p.Rlink;
                    
                }
            }
            guardarDescripcion(arch, ptrD);

        }
    }

    public void insertar(File arch, Nodo nodo, Nodo ptr, String nombre) throws IOException {
        if (ptr != null) {
            Nodo p = ptr;
            if (consultarHora(arch, nodo.horaI, nodo.HoraF) != -1 && consultarHora(arch, nodo.horaI, nodo.HoraF) != -2) {
                creararchivo(nombre, nodo.horaI);
                int i1 = Integer.parseInt(nodo.horaI.substring(0, 2));
                int i2 = Integer.parseInt(p.horaI.substring(0, 2));
                while (i1 > i2 && p.Rlink != null) {
                    p = p.Rlink;
                    i2 = Integer.parseInt(p.horaI.substring(0, 2));
                }

                if (i1 < i2) {
                    if (p == ptr) {
                        nodo.Rlink = p;
                        nodo.Llink = null;
                        p.Llink = nodo;
                        ptr = nodo;
                        p = ptr;
                    } else {
                        nodo.Rlink = p;
                        nodo.Llink = p.Rlink;
                        p.Llink.Rlink = nodo;
                        p.Llink = nodo;
                    }
                } else {
                    nodo.Llink = p;
                    nodo.Rlink = null;
                    p.Rlink = nodo;
                }
                guardar(arch, ptr);
            }
        } else {
            guardar(arch, nodo);
        }

    }

    public int consultarHora(File arch, String horaI, String horaF) throws FileNotFoundException, IOException {
        if (arch.exists()) {
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);
            String y;
            while ((y = br.readLine()) != null) {
                if (y.contains(",")) {
                    String[] campos = y.split(",");
                    if (hora(horaI, horaF, campos) == -1) {
                        br.close();
                        JOptionPane.showMessageDialog(null, "Esta hora esta ocupada con otra funcion");
                        return -1;
                    }
                }
            }
            br.close();
            fr.close();
            return 1;
        }
        return -2;
    }

    public int hora(String horaI, String horaF, String campos[]) {
        int i1 = Integer.parseInt(horaI.substring(0, 2));
        int i2 = Integer.parseInt(campos[0].substring(0, 2));
        int f1 = Integer.parseInt(horaF.substring(0, 2));
        int f2 = Integer.parseInt(campos[1].substring(0, 2));
        if (i1 < i2 && (f1 - i1) > (f2 - i2)) {

            return -1;
        } else {
            if (i1 > i2 && f1 <= f2) {
                return -1;
            } else {
                if (i1 > f1) {
                    return -1;
                } else {
                    if (i1 == i2 && f1 == f2) {
                        return -1;
                    }
                }
            }
        }
        return 1;
    }

    public void guardarReservas(File arch, Nodo ptr) throws IOException {
        if (arch.exists()) {
            FileWriter fw = new FileWriter(arch);
            BufferedWriter bw = new BufferedWriter(fw);
            Nodo p = ptr;
            while (p != null) {
                bw.write(p.Sala + "," + p.pelicula + "," + p.horaI + "," + p.HoraF + "," + p.cantidad + "," + p.id);
                bw.newLine();
                p = p.Rlink;
            }
            bw.close();
            fw.close();
        }
    }

    public void guardar(File arch, Nodo ptr) throws IOException {
        if (arch.exists()) {
            FileWriter fw = new FileWriter(arch);
            BufferedWriter bw = new BufferedWriter(fw);
            Nodo p = ptr;
            while (p != null) {
                bw.write(p.horaI + "," + p.HoraF + "," + p.pelicula + "," + p.dispo);
                bw.newLine();
                p = p.Rlink;
            }
            bw.close();
            fw.close();
        }
    }

    public void agregarcombobox(File arch, JComboBox combobox) throws FileNotFoundException, IOException {
        if (arch.exists()) {
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);
            String y;
            combobox.removeAllItems();
            combobox.addItem("Escoja pelicula");
            while ((y = br.readLine()) != null) {
                String c[] = y.split(",");
                combobox.addItem(c[2]);
            }
            br.close();
            fr.close();
        }
    }

    public void agregarhora(File arch, JComboBox cb, String pelicula) throws FileNotFoundException, IOException {
        if (arch.exists()) {
            FileReader fr = new FileReader(arch);
            BufferedReader br = new BufferedReader(fr);
            String y;
            cb.removeAllItems();
            cb.addItem("Escoja horario");
            while ((y = br.readLine()) != null) {
                String c[] = y.split(",");
                if (c[2].equals(pelicula)) {
                    cb.addItem(c[0]);
                }
            }
        }
    }

    public Nodo comprar(Nodo ptr, String HoraI, String pelicula, String cantidad) throws IOException {
        if (ptr != null) {
            Nodo p = ptr;
            int cant = Integer.parseInt(cantidad);
            while (p != null) {
                int cantN = Integer.parseInt(p.dispo);
                if (p.horaI.equals(HoraI) && p.pelicula.equals(pelicula) && cantN >= cant) {
                    cantN = cantN - cant;
                    p.dispo = String.valueOf(cantN);
                    return ptr;
                }
                p = p.Rlink;
            }
        }
        return null;
    }

    public Nodo consultarReserva(Nodo ptr, String id) {
        if (ptr != null) {
            Nodo p = ptr;
            int sw = 0;
            while (p != null && sw == 0) {
                if (p.id.equals(id)) {
                    sw = 1;
                    return p;
                } else {
                    p = p.Rlink;
                }
            }
        }
        return null;
    }

    public File creararchivo(String nombre, String horaI) throws IOException {
        pelin = new File(nombre + horaI.substring(0, horaI.length() - 3) + ".txt");

        if (!pelin.exists()) {

            pelin.createNewFile();
            FileWriter fw = new FileWriter(pelin);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                bw.write("libre,libre,libre,libre,libre,libre,libre");
                bw.newLine();
            }
            bw.close();
            fw.close();
        }

        return pelin;
    }

    public void llenarSillas(File pelin, JTable tabla) throws FileNotFoundException, IOException {
        DefaultTableModel table = (DefaultTableModel) tabla.getModel();
        if (pelin.exists()) {
            FileReader fr = new FileReader(pelin);
            BufferedReader br = new BufferedReader(fr);
            String y;
            while ((y = br.readLine()) != null) {
                if (y.contains(",")) {
                    String[] campos = y.split(",");
                    Object[] campo2 = new Object[7];
                    Object l = new JButton((new ImageIcon(getClass().getResource("libre.png"))));
                    Object r = new JButton((new ImageIcon(getClass().getResource("reservado.png"))));
                    Object o = new JButton((new ImageIcon(getClass().getResource("ocupado.png"))));
                    for (int i = 0; i < 7; i++) {
                        if (campos[i].equals("libre")) {
                            campo2[i] = l;
                        } else {
                            if (campos[i].equals("ocupado")) {
                                campo2[i] = o;
                            } else {
                                if (campos[i].equals("reservado")) {
                                    campo2[i] = r;
                                }
                            }
                        }
                    }
                    table.addRow(new Object[]{campo2[0], campo2[1], campo2[2], campo2[3], campo2[4], campo2[5], campo2[6]});
                }

            }
            br.close();
            fr.close();
        }
    }

    public Nodo agregarNodosSillas(JTable tabla) throws IOException {
        DefaultTableModel table = (DefaultTableModel) tabla.getModel();
        Nodo ptr = null;
        Nodo p;
        p = ptr;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                JButton jb = (JButton) table.getValueAt(i, j);
                if (jb.getIcon().toString().contains("ocupado.png")) {

                    Nodo q = new Nodo(i, j, "ocupado");
                    if (ptr == null) {
                        ptr = q;
                        p = q;
                        p.Llink = null;
                        ptr.Llink = null;
                        p.Rlink = null;
                        ptr.Rlink = null;
                    } else {
                        q.Llink = p;
                        q.Rlink = null;
                        p.Rlink = q;
                        p = q;
                    }
                } else {
                    if (jb.getIcon().toString().contains("reservado.png")) {

                        Nodo q = new Nodo(i, j, "reservado");
                        if (ptr == null) {
                            ptr = q;
                            p = q;
                            p.Llink = null;
                            ptr.Llink = null;
                            p.Rlink = null;
                            ptr.Rlink = null;
                        } else {
                            q.Llink = p;
                            q.Rlink = null;
                            p.Rlink = q;
                            p = q;
                        }
                    } else {
                        if (jb.getIcon().toString().contains("libre.png")) {

                            Nodo q = new Nodo(i, j, "libre");
                            if (ptr == null) {
                                ptr = q;
                                p = q;
                                p.Llink = null;
                                ptr.Llink = null;
                                p.Rlink = null;
                                ptr.Rlink = null;
                            } else {
                                q.Llink = p;
                                q.Rlink = null;
                                p.Rlink = q;
                                p = q;
                            }

                        }
                    }

                }
            }
        }

        return ptr;
    }

    public void guardarSillas(Nodo ptr, String nombre, String HoraI) throws IOException {
        File Pelin = new File(nombre + HoraI.substring(0, HoraI.length() - 3) + ".txt");

        if (Pelin.exists()) {

            RandomAccessFile raf = new RandomAccessFile(Pelin, "rw");
            raf.close();
            Pelin.delete();
            Pelin.createNewFile();
        }
        if (Pelin.canWrite()) {

            Nodo p = ptr;
            FileWriter fw = new FileWriter(Pelin);
            BufferedWriter bw = new BufferedWriter(fw);
            while (p != null) {
                String n = "";
                int sw = 0;
                while (p != null && sw == 0) {
                    if (p.c == 6) {

                        sw = 1;
                        n = n.concat(p.estado);

                    } else {
                        n = n.concat(p.estado + ",");
                    }
                    p = p.Rlink;
                }

                bw.write(n);
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
    }

}
