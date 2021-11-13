package es.iestriana.ejerciciosbucles.datos;
import javax.swing.JOptionPane;
public class Ejercicio1 {
public static void main(String[] args) {
int n1=0;
int n2=0;
int c=0;
int cs=0;
int cp=0;
int sp=0;
JOptionPane.showMessageDialog(null, "Ingrese dos valores donde el segundo sea mayor");
while(n1>=n2){
n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1er valor"));
n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 2do valor"));
}
while(n1<n2){
cs++;
if(cs==7){
JOptionPane.showMessageDialog(null, "Numero separado en 7 unidades es:"+n1);
cs=0;c++;
if(n1%2==0){
cp++;
} else{
sp+=n1;
}
}
n1++;
}
JOptionPane.showMessageDialog(null, "La cantidad de numeros separados 7 unidades es:"+c+"\nLa cantidad de numeros pares es: "+cp+"\nLa sumatoria de los numeros impares es:"+sp);
}
}