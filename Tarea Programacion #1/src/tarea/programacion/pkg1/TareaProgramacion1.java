/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.programacion.pkg1;


public class TareaProgramacion1 {

    
//abstracta
    abstract class Fruta
{
  abstract void sabor();
}
class manzana extends Fruta {
  void sabor() {
    System.out.println("Sweet taste");
    
  }
  
}
public class AbstractDemo {
  public static void main(String[] args) {
    manzana a = new manzana();
    a.taste();
  }
}


//Encapsulamiento

public class Carro
{
 
    public string Marca;
 
    public int AñoSalidaAlMercado { get; set; }
 
    private int Velocidad { get; set; }
 
    public void Acelerar()
    {
        Velocidad += 10;
    }
 
}


//Herencia

public class Vehículo
{
 
    public string Marca;
 
    public int AñoSalidaAlMercado { get; set; }
 
    public int Velocidad { get; private set; }
 
    public void Acelerar()
    {
        Velocidad += 10;
    }
 
    public virtual void Reversa()
    {
 
        Console.WriteLine("Voy de reversa!");
    }
}
 
public class Carro: Vehículo
{
 
   public void EncenderRadio()
 
   {
       Console.WriteLine("Encendiendo la radio");
   }
}
 
public class Camión: Vehículo
{
    public override void Reversa()
 
    {
        base.Reversa();
        Console.WriteLine("BEEP BEEP BEEP!");
    }
}

//Polimorfos

static void Reparar(Vehículo vehículo)
 
{
 
    Console.WriteLine("Iniciando reparación");
 
    Console.WriteLine("Probando acelerador");
 
    Console.WriteLine($"Velocidad inicial {vehículo.Velocidad}");
 
    vehículo.Acelerar();
 
    Console.WriteLine($"Velocidad final {vehículo.Velocidad}");
 
    Console.WriteLine("Probando reversa");
 
    vehículo.Reversa();
 
    Console.WriteLine("Listo!");
 
}
   
    public static void main(String[] args) {
    }
    
}
