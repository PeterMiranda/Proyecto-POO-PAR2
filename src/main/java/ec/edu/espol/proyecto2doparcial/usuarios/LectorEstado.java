/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial.usuarios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author irvin
 */
public class LectorEstado {
    public static ArrayList<String> generarListaEstado(){
        ArrayList<String> Estados = new ArrayList<>();
        try(BufferedReader escribir = new BufferedReader(new FileReader(Constantes.rutaEstado))){
            String line;
            while((line = escribir.readLine()) != null)
                
                Estados.add(line);
        }catch(FileNotFoundException e){
            System.out.println("No existe");
        }catch(IOException e){
            e.printStackTrace();
        } return Estados;
    }
}
