/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado2;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Colegiado2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Spotyfi2 song[] = new Spotyfi2[10];
        
        String titulo2;
        String autor2;
        int id2;
        int duracion2;
        int anio2;
        int tempI;
        int tempII;
        String tempS;
        int cancion = 2;
        
        int dur[] = new int[10];
        
        
        for (int i = 0; i < cancion; i++) {
            titulo2= JOptionPane.showInputDialog("Introduzca el nombre de la cancion n° "+(i+1));
            autor2 = JOptionPane.showInputDialog("Introduzca el autor de la canción "+titulo2);
            id2= Integer.parseInt(JOptionPane.showInputDialog("Introduzca la identificación de la canción (posición en top) "+titulo2));
            duracion2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la duración de la canción "+ titulo2 + " (en segundos)"));
            anio2= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año de la canción "+titulo2));
            song[i] = new Spotyfi2(id2,titulo2,autor2,duracion2,anio2);
        }
        
        
       
        tempS = "Canciones anteriores al año actual: \n\n";
        tempI = 0;
        for (int i = 0; i < cancion; i++) {
            anio2= song[i].getAnio();
            if(anio2<2023){
                tempI = tempI + 1;
                tempS = tempS + tempI + ". "+song[i].getTitulo()+"\n";
            }           
        }
        JOptionPane.showMessageDialog(null, tempS);
        
        tempS = "Canciones del año actual: \n\n";
        tempI = 0;
        for (int i = 0; i < cancion; i++) {
            anio2 = song[i].getAnio();
            if(anio2==2023){
                tempI = tempI + 1;
                tempS = tempS + tempI + ". "+song[i].getTitulo()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, tempS);
      
        tempS = "Canciones posteriores al año actual: \n\n";
        tempI = 0;
        for (int i = 0; i < cancion; i++) {
            anio2= song[i].getAnio();
            if(anio2>2023){
                tempI = tempI + 1;
                tempS = tempS + tempI + ". "+song[i].getTitulo()+"\n";
            }          
        }
        JOptionPane.showMessageDialog(null, tempS);
        
        
        
        tempI = 0;
        tempII = 0;
        
        for (int i = 0; i < cancion; i++) {
            if(song[i].getDuracion()>tempI){
                tempII = 0;
                dur[tempII] = i;
                tempII = tempII + 1;
            }else if(song[i].getDuracion()==tempI){
                dur[tempII] = i;
                tempII = tempII + 1;
            }
        }
        
       
        tempS = "Cancion(es) de mayor duración: \n\n";
        tempI = 0;
        for (int i = 0; i < tempII; i++) {
            tempI = tempI + 1;
            tempS = tempS + tempI + ". "+song[dur[i]].getTitulo()+" "+song[dur[i]].getDuracion()+"\n";         
        }
        JOptionPane.showMessageDialog(null, tempS);
        
        
        
        for (int i = 0; i < cancion; i++) {
            if(song[i].getId()==1){
                tempS = "El autor de la canción top 1 es " + song[i].getAutor();
            }
        }
        JOptionPane.showMessageDialog(null, tempS);
        
        tempS = "Top 10: \n";
        tempI = 1;
        while(tempI<11){
            for (int i = 0; i < cancion; i++) {
                if (song[i].getId()==tempI) {
                    tempS = tempS + tempI + ". "+song[i].getTitulo()+"\n";
                }
            }
            tempI = tempI + 1;
        }
        JOptionPane.showMessageDialog(null, tempS);
    }
    
}
