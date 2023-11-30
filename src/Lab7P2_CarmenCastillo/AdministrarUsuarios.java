/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7P2_CarmenCastillo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author casti
 */
public class AdministrarUsuarios {

    ArrayList<Usuario> listaUser = new ArrayList();
    File archivo = null;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUser() {
        return listaUser;
    }

    public void setListaUser(ArrayList<Usuario> listaUser) {
        this.listaUser = listaUser;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaUser) {
                bw.write("[nombre:" + t.getNombre() + ",usuario:" + t.getUsuario() + ",contra:" + t.getContra() + ",saldo:" + t.getSaldoCompra() + "]\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUser = new ArrayList();
        if (archivo.exists()) {
//            System.out.println("ya por favor");
            try {
                sc = new Scanner(archivo); // 
                String token = "";
                token += sc.nextLine();
//                token = token.replace("[", "");
                token = token.replace("[nombre:", "");
                token = token.replace("usuario:", "");
                token = token.replace("contra:", "");
                token = token.replace("saldo:", "");
                token = token.replace("]", "");
                //token = token.replace(":", "");
                String[] arreglo = token.split(",");
//                System.out.println(token);

                while (sc.hasNext()) {
                    token += sc.next();
                    listaUser.add(new Usuario(arreglo[0], arreglo[1], arreglo[2], 0));
//                    System.out.println("ojala me mate");

                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
