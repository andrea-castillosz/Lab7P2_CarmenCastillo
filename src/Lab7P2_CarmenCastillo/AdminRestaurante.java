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
public class AdminRestaurante {
    
    ArrayList<Restaurante> listRest = new ArrayList();
    File archivo = null;

    public AdminRestaurante(String path) {
        archivo = new File(path);
    }

    public ArrayList<Restaurante> getListRest() {
        return listRest;
    }

    public void setListRest(ArrayList<Restaurante> listRest) {
        this.listRest = listRest;
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
            for (Restaurante t : listRest) {
                bw.write("[nombre:" + t.getNombre() + ",ubicacion:" + t.getUbicacion() + ",saldo:" + t.getSaldoV() + "]\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listRest = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                String token = "";
                token += sc.next();
                //token = token.replace("[", "");
                token = token.replace("[nombre:", "");
                token = token.replace("ubicacion:", "");
                token = token.replace("saldo:", "");
                token = token.replace("]", "");
                String[] arreglo = token.split(",");
                while (sc.hasNext()) {
                    token += sc.next();
                    listRest.add(new Restaurante(arreglo[0], arreglo[1], 0));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
    
}
