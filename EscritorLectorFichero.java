package PF_final_proyect;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class EscritorLectorFichero {  
		
		static Scanner entrada=new Scanner(System.in);
		
		static final int[][] butacas= new int [10][12];
		
		static int cantButacasReserva;
		
		static final int []idButacasReservaSala1=new int[164];
		static final int []idButacasReservaSala2=new int[164];
		static final int []idButacasReservaSala3=new int[164];
		static final int []idButacasReservaSala4=new int[164];
		
		
		static File archivoButacas=new File("Butaca.txt");
		
		static File archivoReservaSala1=new File("ReservaSala1.txt");
		static File archivoReservaSala2=new File("ReservaSala2.txt");
		static File archivoReservaSala3=new File("ReservaSala3.txt");
		static File archivoReservaSala4=new File("ReservaSala4.txt");
		
		
		static int numReservaSala1=0;
		static int numReservaSala2=0;
		static int numReservaSala3=0;
		static int numReservaSala4=0;
		
		
		static int cantReservaSala1=0;
		static int cantReservaSala2=0;
		static int cantReservaSala3=0;
		static int cantReservaSala4=0;
		
		
		static int aux1=0;
		static int aux2=0;
		static int aux3=0;
		static int aux4=0;
		
		static int contador;
		static int butaca;
		
		
		
		public static void CrearReservaSala1() {
			
			numReservaSala1++;
		
			contador=0;
			
			System.out.println("Seleccione:\n 1.Butaca manual\n 2.Butaca aleatoria");
			int eleccion=entrada.nextInt();
			
			if(eleccion==1) {
				
				do {
					
					contador=0;
				
					System.out.println("Introduce el numero de butaca");
					butaca=entrada.nextInt(); 
					
					idButacasReservaSala1[aux1]=butaca; 
					
					idButacasReservaSala1[aux1+1]=butaca-1; 
					idButacasReservaSala1[aux1+2]=butaca+1; 
					idButacasReservaSala1[aux1+3]=butaca-12; 
					idButacasReservaSala1[aux1+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala1.length;i++) {
						
						
						if(idButacasReservaSala1[i]==idButacasReservaSala1[aux1] ) {
							
							contador++;
							
							if(contador==2) {
								
								System.out.println("Butaca ocupada, seleciona otra");
								System.out.println();
							}
							
						}
						
					}
				
				}while(contador==2);		
			}
				
			
			
			if(eleccion==2) {
				
				do {
					
					
					contador=0;
					
					butaca=(int)(Math.random()*(120-1+1)+1); 
					
					idButacasReservaSala1[aux1]=butaca; 
					
					idButacasReservaSala1[aux1+1]=butaca-1; 
					idButacasReservaSala1[aux1+2]=butaca+1; 
					idButacasReservaSala1[aux1+3]=butaca-12; 
					idButacasReservaSala1[aux1+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala1.length;i++) {
						
						
						if(idButacasReservaSala1[i]==idButacasReservaSala1[aux1] ) {
							
							contador++;
							
						}
							
					}
					
				}while(contador==2);
					
			}
					
				
			System.out.println("Reserva realizada con exito\n");
			 	 
		}
		
		public static void CrearReservaSala2() {//ESTOS ESTAN REPETIDOS PARA SACAR LA CANTIDAD DE RESERVAS A PARTIR DEL TAMA�O DEL ARRAY, PODRAI BORRARLOS Y SACARLO LEYENDO LAS LINEAS DEL ARCHIVO
				

			numReservaSala2++;
		
			contador=0;
			
			System.out.println("Seleccione:\n 1.Butaca manual\n 2.Butaca aleatoria");
			int eleccion=entrada.nextInt();
			
			if(eleccion==1) {
				
				do {
					
					contador=0;
				
					System.out.println("Introduce el numero de butaca");
					butaca=entrada.nextInt(); 
					
					idButacasReservaSala2[aux2]=butaca; 
					
					idButacasReservaSala2[aux2+1]=butaca-1; 
					idButacasReservaSala2[aux2+2]=butaca+1; 
					idButacasReservaSala2[aux2+3]=butaca-12; 
					idButacasReservaSala2[aux2+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala2.length;i++) {
						
						
						if(idButacasReservaSala2[i]==idButacasReservaSala2[aux2] ) {
							
							contador++;
							
							if(contador==2) {
								
								System.out.println("Butaca ocupada, seleciona otra");
								System.out.println();
							}
							
						}
						
					}
				
				}while(contador==2);		
			}
				
			
			
			if(eleccion==2) {
				
				do {
					
					
					contador=0;
					
					butaca=(int)(Math.random()*(120-1+1)+1);
					
					idButacasReservaSala2[aux2]=butaca; 
					
					idButacasReservaSala2[aux2+1]=butaca-1; 
					idButacasReservaSala2[aux2+2]=butaca+1; 
					idButacasReservaSala2[aux2+3]=butaca-12; 
					idButacasReservaSala2[aux2+4]=butaca+12;  
						
					
					for(int i=0;i<idButacasReservaSala2.length;i++) {
						
						
						if(idButacasReservaSala2[i]==idButacasReservaSala2[aux2] ) {
							
							contador++;
							
						}
							
					}
					
				}while(contador==2);
					
			}
					
				
			System.out.println("Reserva realizada con exito\n");
			 	 
		}
		
		public static void CrearReservaSala3() {//ESTOS ESTAN REPETIDOS PARA SACAR LA CANTIDAD DE RESERVAS A PARTIR DEL TAMA�O DEL ARRAY, PODRAI BORRARLOS Y SACARLO LEYENDO LAS LINEAS DEL ARCHIVO
			
			numReservaSala3++;
			
			contador=0;
			
			System.out.println("Seleccione:\n 1.Butaca manual\n 2.Butaca aleatoria");
			int eleccion=entrada.nextInt();
			
			if(eleccion==1) {
				
				do {
					
					contador=0;
				
					System.out.println("Introduce el numero de butaca");
					butaca=entrada.nextInt(); 
					
					idButacasReservaSala3[aux3]=butaca; 
					
					idButacasReservaSala3[aux3+1]=butaca-1; 
					idButacasReservaSala3[aux3+2]=butaca+1; 
					idButacasReservaSala3[aux3+3]=butaca-12; 
					idButacasReservaSala3[aux3+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala3.length;i++) {
						
						
						if(idButacasReservaSala3[i]==idButacasReservaSala3[aux3] ) {
							
							contador++;
							
							if(contador==2) {
								
								System.out.println("Butaca ocupada, seleciona otra");
								System.out.println();
							}
							
						}
						
					}
				
				}while(contador==2);		
			}
				
			
			
			if(eleccion==2) {
				
				do {
					
					
					contador=0;
					
					butaca=(int)(Math.random()*(120-1+1)+1); 
					
					idButacasReservaSala3[aux3]=butaca; 
					
					idButacasReservaSala3[aux3+1]=butaca-1; 
					idButacasReservaSala3[aux3+2]=butaca+1; 
					idButacasReservaSala3[aux3+3]=butaca-12; 
					idButacasReservaSala3[aux3+4]=butaca+12;  
						
					
					for(int i=0;i<idButacasReservaSala3.length;i++) {
						
						
						if(idButacasReservaSala3[i]==idButacasReservaSala3[aux3] ) {
							
							contador++;
							
						}
							
					}
					
				}while(contador==2);
					
			}
					
				
			System.out.println("Reserva realizada con exito\n");
			 	 
		}
		
		public static void CrearReservaSala4() {//ESTOS ESTAN REPETIDOS PARA SACAR LA CANTIDAD DE RESERVAS A PARTIR DEL TAMA�O DEL ARRAY, PODRAI BORRARLOS Y SACARLO LEYENDO LAS LINEAS DEL ARCHIVO
			
			numReservaSala4++;
			
			contador=0;
			
			System.out.println("Seleccione:\n 1.Butaca manual\n 2.Butaca aleatoria");
			int eleccion=entrada.nextInt();
			
			if(eleccion==1) {
				
				do {
					
					contador=0;
				
					System.out.println("Introduce el numero de butaca");
					butaca=entrada.nextInt(); 
					
					idButacasReservaSala4[aux4]=butaca; 
					
					idButacasReservaSala4[aux4+1]=butaca-1; 
					idButacasReservaSala4[aux4+2]=butaca+1; 
					idButacasReservaSala4[aux4+3]=butaca-12; 
					idButacasReservaSala4[aux4+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala4.length;i++) {
						
						
						if(idButacasReservaSala4[i]==idButacasReservaSala4[aux4] ) {
							
							contador++;
							
							if(contador==2) {
								
								System.out.println("Butaca ocupada, seleciona otra");
								System.out.println();
							}
							
						}
						
					}
				
				}while(contador==2);		
			}
				
			
			
			if(eleccion==2) {
				
				do {
					
					
					contador=0;
					
					butaca=(int)(Math.random()*(120-1+1)+1); 
					
					idButacasReservaSala4[aux4]=butaca; 
					
					idButacasReservaSala4[aux4+1]=butaca-1; 
					idButacasReservaSala4[aux4+2]=butaca+1; 
					idButacasReservaSala4[aux4+3]=butaca-12; 
					idButacasReservaSala4[aux4+4]=butaca+12; 
						
					
					for(int i=0;i<idButacasReservaSala4.length;i++) {
						
						
						if(idButacasReservaSala4[i]==idButacasReservaSala4[aux4] ) {
							
							contador++;
							
						}
							
					}
					
				}while(contador==2);
					
			}
					
				
			System.out.println("Reserva realizada con exito\n");
			 	 
		}

		
		
		public static void EscribirArchivoReservaSala1() {//ESCRIBE EN EL ARCHIVO "ButacasReserva.txt"
			
			try {
				
				FileWriter fw=new FileWriter(archivoReservaSala1,true);//true hace que las nuevas reervas se alamcenen junto a las anteriores evitando que las sobreescriba
				
				fw.write("Num.Reserva:"+numReservaSala1+"\t");
				fw.write("Id butacas:"+idButacasReservaSala1[aux1]);
				fw.write("\n");
				fw.close();
				
				aux1=+5;
				
			} catch (IOException e) {
				
				System.out.println("Ha ocurrido un problema con la escritura del archivo Reserva");
			}
			
		}
		
		public static void EscribirArchivoReservaSala2() {//ESCRIBE EN EL ARCHIVO "ButacasReserva.txt"
				
			try {
				
				FileWriter fw=new FileWriter(archivoReservaSala2,true);//true hace que las nuevas reervas se alamcenen junto a las anteriores evitando que las sobreescriba
					
				fw.write("Num.Reserva:"+numReservaSala2+"\t");
				fw.write("Id butacas:"+idButacasReservaSala2[aux2]);
				fw.write("\n");
				fw.close();
				
				aux2=+5;
				
			} catch (IOException e) {
				
				System.out.println("Ha ocurrido un problema con la escritura del archivo Reserva");
			}
			
		}
			
		public static void EscribirArchivoReservaSala3() {//ESCRIBE EN EL ARCHIVO "ButacasReserva.txt"
		
			try {
				
				FileWriter fw=new FileWriter(archivoReservaSala3,true);//true hace que las nuevas reervas se alamcenen junto a las anteriores evitando que las sobreescriba
					
				fw.write("Num.Reserva:"+numReservaSala3+"\t");
				fw.write("Id butacas:"+idButacasReservaSala3[aux3]);
				fw.write("\n");
				fw.close();
				
				aux3=+5;
				
			} catch (IOException e) {
				
				System.out.println("Ha ocurrido un problema con la escritura del archivo Reserva");
			}
			
		}
		
		public static void EscribirArchivoReservaSala4() {//ESCRIBE EN EL ARCHIVO "ButacasReserva.txt"
			
			try {
				
				FileWriter fw=new FileWriter(archivoReservaSala4,true);//true hace que las nuevas reervas se alamcenen junto a las anteriores evitando que las sobreescriba
					
				fw.write("Num.Reserva:"+numReservaSala4+"\t");
				fw.write("Id butacas:"+idButacasReservaSala4[aux4]);
				fw.write("\n");
				fw.close();
				
				aux4=+5;
				
			} catch (IOException e) {
				
				System.out.println("Ha ocurrido un problema con la escritura del archivo Reserva");
			}
			
		}
		
		
		public static void LeerArchivoReservaSala1() {//LEE EL ARCHIVO "ButacasReserva.txt"
			
			File ficheroReservas=new File("ReservaSala1.txt");
			Scanner lectura;
			try {
				lectura = new Scanner(ficheroReservas);
				
				while(lectura.hasNextLine()) {
					
					System.out.println(lectura.nextLine());
					
				}
				
				System.out.println("\n");
				
				lectura.close();
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Ha ocurrido un problema con la lectura del archivo Reserva");
			}
			
		}
		
		public static void LeerArchivoReservaSala2() {//LEE EL ARCHIVO "ButacasReserva.txt"
				
				File ficheroReservas=new File("ReservaSala2.txt");
				Scanner lectura;
				try {
					lectura = new Scanner(ficheroReservas);
					
					while(lectura.hasNextLine()) {
						
						System.out.println(lectura.nextLine());
						
					}
					
					System.out.println("\n");
					
					lectura.close();
					
				} catch (FileNotFoundException e) {
					
					System.out.println("Ha ocurrido un problema con la lectura del archivo Reserva");
				}
				
			}
		
		public static void LeerArchivoReservaSala3() {//LEE EL ARCHIVO "ButacasReserva.txt"
			
			File ficheroReservas=new File("ReservaSala3.txt");
			Scanner lectura;
			try {
				lectura = new Scanner(ficheroReservas);
				
				while(lectura.hasNextLine()) {
					
					System.out.println(lectura.nextLine());
					
					
				}
				
				System.out.println("\n");
				
				lectura.close();
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Ha ocurrido un problema con la lectura del archivo Reserva");
			}
			
		}
			
		public static void LeerArchivoReservaSala4() {//LEE EL ARCHIVO "ButacasReserva.txt"
			
			File ficheroReservas=new File("ReservaSala4.txt");
			Scanner lectura;
			try {
				lectura = new Scanner(ficheroReservas);
				
				while(lectura.hasNextLine()) {
					
					System.out.println(lectura.nextLine());
					
					
				}
				
				System.out.println("\n");
				
				lectura.close();
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Ha ocurrido un problema con la lectura del archivo Reserva");
			}
			
		}	
		
		
		public static void ContadorReservaSala1() {
			
			try{
					FileReader fr = new FileReader("ReservaSala1.txt");
					BufferedReader bf = new BufferedReader(fr);
					
				
					while ((bf.readLine())!=null) {
						cantReservaSala1++;
					}
					
					bf.close();
				
				} catch (FileNotFoundException fnfe){
				  fnfe.printStackTrace();
				} catch (IOException ioe){
				  ioe.printStackTrace();
				}
			
				System.out.println("Tiene "+cantReservaSala1+" reservas");
		}
		
		public static void ContadorReservaSala2() {
					
			try{
					FileReader fr = new FileReader("ReservaSala2.txt");
					BufferedReader bf = new BufferedReader(fr);
					
				
					while ((bf.readLine())!=null) {
						cantReservaSala2++;
					}
					
					bf.close();
				
				} catch (FileNotFoundException fnfe){
				  fnfe.printStackTrace();
				} catch (IOException ioe){
				  ioe.printStackTrace();
				}
			
				System.out.println("Tiene "+cantReservaSala2+" reservas");
			
		}
		
		public static void ContadorReservaSala3() {
			
			try{
					FileReader fr = new FileReader("ReservaSala3.txt");
					BufferedReader bf = new BufferedReader(fr);
					
				
					while ((bf.readLine())!=null) {
						cantReservaSala3++;
					}
					
					bf.close();
				
				} catch (FileNotFoundException fnfe){
				  fnfe.printStackTrace();
				} catch (IOException ioe){
				  ioe.printStackTrace();
				}
			
				System.out.println("Tiene "+cantReservaSala3+" reservas");
			
		}
		
		public static void ContadorReservaSala4() {
			
			try{
					FileReader fr = new FileReader("ReservaSala4.txt");
					BufferedReader bf = new BufferedReader(fr);
					
				
					while ((bf.readLine())!=null) {
						cantReservaSala4++;
					}
					
					bf.close();
				
				} catch (FileNotFoundException fnfe){
				  fnfe.printStackTrace();
				} catch (IOException ioe){
				  ioe.printStackTrace();
				}
			
				System.out.println("Tiene "+cantReservaSala4+" reservas");
			
		}
		
		
		public static void Comparador() {
			
			if(cantReservaSala1>cantReservaSala2 && cantReservaSala1>cantReservaSala3 && cantReservaSala1>cantReservaSala4) {
				
				System.out.println("La sala mas con mas reservas es la 1 con: "+cantReservaSala1);
				System.out.println();
			}
			
			 if(cantReservaSala1==cantReservaSala2 ) {
				 
				System.out.println("La Sala 1 y Sala 2 tienen: "+cantReservaSala1+" reservas");
				System.out.println();
		 
			 }
			 
			if(cantReservaSala1==cantReservaSala3) {
				
				System.out.println("La Sala 1 y Sala 3 tienen: "+cantReservaSala1+" reservas");
				System.out.println();
			}
			
			if(cantReservaSala1==cantReservaSala4) {
				
				System.out.println("La Sala 1 y Sala 4 tienen: "+cantReservaSala1+" reservas");
				System.out.println();
			}
				
				
			
			if(cantReservaSala2>cantReservaSala1 && cantReservaSala2>cantReservaSala3 && cantReservaSala2>cantReservaSala4) {
								
				System.out.println("La sala mas con mas reservas es la 2 con: "+cantReservaSala2);
				System.out.println();
			}
			
			if(cantReservaSala2==cantReservaSala3) {
				
				System.out.println("La Sala 2 y Sala 3 tienen: "+cantReservaSala2+" reservas");
				System.out.println();
			}
			 
			
			if(cantReservaSala2==cantReservaSala4) {
				 
				System.out.println("La Sala 2 y Sala 4 tienen: "+cantReservaSala2+" reservas");
				System.out.println();
				  
			}
			 
			 
			if(cantReservaSala3>cantReservaSala1 && cantReservaSala3>cantReservaSala2 && cantReservaSala3>cantReservaSala4) {
				
				System.out.println("La sala mas con mas reservas es la 3 con: "+cantReservaSala3);
				System.out.println();
			}
			
			 if(cantReservaSala3==cantReservaSala4) {
				
				System.out.println("La Sala 3 y Sala 4 tienen: "+cantReservaSala3+" reservas");
				System.out.println();
			}
			
			if(cantReservaSala4>cantReservaSala1 && cantReservaSala4>cantReservaSala2 && cantReservaSala4>cantReservaSala3) {
				
				System.out.println("La sala mas con mas reservas es la 4 con: "+cantReservaSala4);
				System.out.println();
			}
		}

		
		public static void Menu() {
			
		
		int eleccion;
		
		System.out.println("Introduce la accion a realizar\n 1:Crear reserva\n 2:Visualizar reservas\n 3:Comprobar la sala mas llena");//COMABIAR LLENA, NO ME GUSTA
		
		eleccion=entrada.nextInt();
	
		switch(eleccion) {
		
			case 1://Crear reserva
				
				System.out.println("�Que peli quieres ver?\n Sala 1:Get Out\n Sala 2:The Thing\n Sala 3:Evil Dead\n Sala 4:Hell Raiser");
				
				eleccion=entrada.nextInt();
				
				switch(eleccion) {
				
					case 1://Peli 1
						
						CrearReservaSala1();
						EscribirArchivoReservaSala1();
						
						break;
						
					case 2://Peli 2
						
						CrearReservaSala2();
						EscribirArchivoReservaSala2();
						
						break;
						
					case 3://Peli 3
						
						CrearReservaSala3();
						EscribirArchivoReservaSala3();
						
						break;
						
					case 4://Peli 4
						
						CrearReservaSala4();
						EscribirArchivoReservaSala4();
						
						break;
				
				}
				
			break;
				
			case 2://ver todas las reservas y la cantidad
				
				System.out.println("//RESERVAS SALA 1//");
				LeerArchivoReservaSala1();
				System.out.println();
				
				System.out.println("//RESERVAS SALA 2//");
				LeerArchivoReservaSala2();
				System.out.println();
				
				System.out.println("//RESERVAS SALA 3//");
				LeerArchivoReservaSala3();
				System.out.println();
				
				System.out.println("//RESERVAS SALA 4//");
				LeerArchivoReservaSala4();
				System.out.println();
	
				break;
			
			case 3://ver la sala mas llena
				
				ContadorReservaSala1();
				ContadorReservaSala2();
				ContadorReservaSala3();
				ContadorReservaSala4();
				
				System.out.println();
				
				Comparador();
				
				break;	
				
			default:
				
				System.out.println("Introduzca la accion a realizar\n 1:Introducir opcion\n 2:Cerrar programa");
				eleccion=entrada.nextInt();
			
			}
		
			
		
			
		}
		
		public static void main (String [] args) {
			
			int eleccion;
			
			do {
				
				Menu();
				
				System.out.println("Introduzca la accion a realizar\n 1:Volver al menu\n 2:Cerrar programa");
				eleccion=entrada.nextInt();
				
				System.out.println("------------------------");
				
			}while(eleccion==1);
			
			entrada.close();
			
			System.out.println("Cerrando programa...");
			
		}

	}



