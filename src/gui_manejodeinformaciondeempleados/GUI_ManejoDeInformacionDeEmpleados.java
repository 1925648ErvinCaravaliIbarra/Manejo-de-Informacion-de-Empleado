/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui_manejodeinformaciondeempleados;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import peraciones.Operaciones;


public class GUI_ManejoDeInformacionDeEmpleados extends JFrame {
    private JButton ingresarEmpleado,mostrarEmpleados,
            buscarPorCargo,buscarEmpleado;
    private JLabel nombre,id,cargo,edad,sueldo,resultados,icono;
    private JTextField nombre1,id1,edad1,sueldo1;
    private JComboBox <String>combo1;
    private JTextArea area;
    private JPanel pSuperior,pOccidente,pOrientes,pOrientei,oriente;
    
    
    
    public void initGUI(){
    pOrientes=  new JPanel (new GridLayout(2,2,2,2));
    ingresarEmpleado= new JButton("Ingrezar Empleado");
    mostrarEmpleados= new JButton("Mostrar Empleado");
    buscarPorCargo= new JButton("Buscar por Cargo");
    buscarEmpleado= new JButton("Buscar Empleado");
    pOrientes.add(ingresarEmpleado);pOrientes.add(mostrarEmpleados);
    pOrientes.add(buscarPorCargo);pOrientes.add(buscarEmpleado);
    pOrientei=  new JPanel ();   
    icono= new JLabel();
    icono.setIcon(new ImageIcon("src/Recursos/trabajador.jpg"));
    icono.setBounds(170,10,200,70);
    oriente=  new JPanel (new GridLayout(3,2,2,2));
    oriente.add(pOrientes);oriente.add(icono);
    add(oriente,BorderLayout.EAST);
    
    


   

    

    pOccidente=  new JPanel ();
    area= new JTextArea(100,100);
    pOccidente.add(area);
    add(pOccidente,BorderLayout.WEST);
    
    nombre= new JLabel("Nombre :");
    nombre1= new JTextField(20);
    id= new JLabel("id :");
    id1= new JTextField(20);
    cargo= new JLabel("Cargo :");
    String[] C= {"Seleccione una opcion","Operario","Conductor"
             ,"Administrativo"};
    combo1= new JComboBox<>(C);
    edad= new JLabel("Edad :");
    edad1= new JTextField(20);
    sueldo= new JLabel("Sueldo :");
    sueldo1= new JTextField(20);
    pSuperior=  new JPanel(new GridLayout(5,2));
    pSuperior.add(nombre);pSuperior.add(nombre1);pSuperior.add(id);
    pSuperior.add(id1);pSuperior.add(cargo);pSuperior.add(combo1);
    pSuperior.add(edad);pSuperior.add(edad1);pSuperior.add(sueldo);
    pSuperior.add(sueldo1);
    pSuperior.setBorder(BorderFactory.createTitledBorder(null, "Datos del Trabajador",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,new Font("Calibri",Font.PLAIN,15),Color.BLACK));
    add(pSuperior,BorderLayout.NORTH);
    
    resultados = new JLabel("Resultados :");
    add(resultados,BorderLayout.SOUTH);
    
      ManejadoraDeventos evento= new ManejadoraDeventos();
      ingresarEmpleado.addActionListener(evento);
      mostrarEmpleados.addActionListener(evento);
      nombre1.addFocusListener(evento);
      id1.addFocusListener(evento);
      edad1.addFocusListener(evento);
      sueldo1.addFocusListener(evento);
    
    };
    
     class ManejadoraDeventos implements ActionListener,FocusListener{
        Operaciones op;
        public ManejadoraDeventos(){
         op = new Operaciones();
        }
          String  v1, v2,v3,v4,v5;
        @Override
        public void actionPerformed(ActionEvent e) {
           v1 =  nombre1.getText();
           v2 =  combo1.getSelectedItem().toString();
           v3 =  id1.getText();
           v4 =  edad1.getText();
           v5 =  sueldo1.getText();
           
            
            if(e.getSource()==ingresarEmpleado){
            
             String   m =op.IngresarDato(v1,v2);
                resultados.setText(m);
                nombre1.setText("");
             String   l=op.IngresarDato(v3,v2);
                resultados.setText(l);
                id1.setText("");
             String   n=op.IngresarDato(v4,v2);
                resultados.setText(n);
                edad1.setText("");
             String   p=op.IngresarDato(v5,v2);
                resultados.setText(p);
                sueldo1.setText("");
             
            } if(e.getSource()==mostrarEmpleados){
            
              String  t =(op.MostrarDato(combo1.getSelectedItem().toString()));
              area.setText(t);
            }   
        }

        @Override
        public void focusGained(FocusEvent e) {
             resultados.setText("Resultado:");
          area.setText("");
        }

        @Override
        public void focusLost(FocusEvent e) {
            
        }
     
     }
    
    
    GUI_ManejoDeInformacionDeEmpleados(){
    initGUI();
    this.setTitle("Manejo de Informacion de Empleados");
    this.setSize(600,540);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    };
    public static void main(String[] args) {
       GUI_ManejoDeInformacionDeEmpleados E= new GUI_ManejoDeInformacionDeEmpleados();

    };

   
}