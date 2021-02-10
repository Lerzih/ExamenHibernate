package aed.examen.main;

import java.sql.Date;
import java.util.Scanner;

import org.hibernate.Session;

import aed.examen.util.Estudiantes;
import aed.examen.util.HibernateUtil;
import aed.examen.util.Titulaciones;

/* Alexis Francisco Díaz Fajardo */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insercionAutomatica();
		System.out.println("------------------------------ \n"
				+ "\n" + "Alexis Francisco Diaz Fajardo \n\n"
				+ "------------------------------ \n\n"
				+ "Menu \n\n"
				+ " 1) Insertar una graduacion \n"
				+ " 2) Eliminar una graduacion \n"
				+ " 3) Modificar una nota \n"
				+ " 4) Visualizar graduaciones \n\n"
				+ "Elige una opcion: ");
		
		Scanner sn = new Scanner(System.in);
		int opcion = Integer.parseInt(sn.nextLine());
		
		switch(opcion) {
		
		case 1:
			insertarGraduacion();
		
		case 2:
			eliminarGraduacion();
		
		case 3:
			modificarNota();
			
		case 4:
			visualizarGraduaciones();
			
		default:
			break;
		}
	}

	private static void insercionAutomatica() {
		// TODO Auto-generated method stub
		
		Session  miSession  = HibernateUtil.getSessionFactory().openSession(); 

		try {
			miSession.beginTransaction();
			
			Estudiantes estudiante1 = new Estudiantes();
			estudiante1.setDNI("111222333A");
			estudiante1.setNombre("Prueba1 Examen");
			estudiante1.setTelefono("999888777");
			
			Estudiantes estudiante2 = new Estudiantes();
			estudiante2.setDNI("222333444A");
			estudiante2.setNombre("Prueba2 Examen");
			estudiante2.setTelefono("888888777");
			
			Titulaciones titulacion1 = new Titulaciones();
			titulacion1.setCodTit(1);
			titulacion1.setNombre("Titulacion Prueba1 Examen");
			titulacion1.setNivel('E');
			
			Titulaciones titulacion2 = new Titulaciones();
			titulacion2.setCodTit(2);
			titulacion2.setNombre("Titulacion Prueba2 Examen");
			titulacion2.setNivel('A');
			
			miSession.save(estudiante1);
			miSession.save(estudiante2);
			miSession.save(titulacion1);
			miSession.save(titulacion2);
			
			miSession.getTransaction().commit();
			
			System.out.println("Componentes inicializados correctamente\n");
			
		}catch(Exception e) {
			System.out.println("Ha ocurrido un error en la inserción automatica");
		}finally {
			miSession.close();
		}
	}

	private static void insertarGraduacion(String DNI, int codTit, Date fecha, char nota) {
		// TODO Auto-generated method stub
		
		
	}

	private static void eliminarGraduacion() {
		// TODO Auto-generated method stub
		
	}

	private static void modificarNota() {
		// TODO Auto-generated method stub
		
	}

	private static void visualizarGraduaciones() {
		// TODO Auto-generated method stub
		
	}

	

}
