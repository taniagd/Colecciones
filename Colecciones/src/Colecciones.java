import java.util.*; 

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*La colecci�n SET no puede contener elementos duplicados.
		 Solo tiene los m�todos heredados de Colection.
		 Existen diferentes tipos de implementaciones: 
		 HashSet: Esta implementaci�n almacena los elementos en una tabala hash.
		 Es la que mejor rendimiento tiene.
		 Los elementos no tienen un orden.
		 Implementaciones de colecci�n set son: TreeSet y LinkHashSet, adem�s de HashSet*/
		
		/*Set <String> fruits = new HashSet();//Declaro la colecci�n set
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuy�");
		fruits.add("Pl�tano");
		
		for(String fruit:fruits) { //Recorrer� el set y me devolver� una fruta.
			System.out.println(fruit);*/
			/*---------------------------------------------*/
		
		/*TreeSeet es la implementaci�n m�s lenta y arroja los datos ordenados
		de manera alfab�tica y en el caso de los n�meros de mayor a menor*/
			
		/*Set <String> fruits = new TreeSet();//Declaro la colecci�n set con implementaci�n TreeSet.No olvidar hacer las importaciones.
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuy�");
		fruits.add("Pl�tano");
			
		for(String fruit:fruits) { //Recorrer� el set y me devolver� los datos.
		System.out.println(fruit);
		System.out.println(fruits.contains("Guayaba")); //Para preguntar por la existencia de equis fruta.
		*/
			/*---------------------------------------------*/
	
		/*LinkHashSet nos mostrar� los datos seg�n fueron ingresados*/
		
		/*Set <String> fruits = new LinkedHashSet(); //Declaro la colecci�n set con implementaci�n LinkHashSet.
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuy�");
		fruits.add("Pl�tano");
	
		for(String fruit:fruits) { //Recorrer� el set y me devolver� los datos.
		System.out.println(fruit);
		*/
	
			/*La interface LIST define una sucesi�n de elementos.
			 * S� admite elementos duplicados
			 * A�ade nuevos m�todos que podemos usar
			 * Acceso posicional a elementos: Manipula elementos en funci�n de su posici�n en la lista.
			 * B�squeda de elementos: Busca un elemento concreto de la lista y devuelve su posici�n.
			 * Rango de operaci�n:Permite realizar ciertas operaciones sobre rangos de elementos dentro de la propia lista*/
			
			List<String> fruits2 = new ArrayList();
			fruits2.add("Mango");
			fruits2.add("Manzana");
			fruits2.add("Durazno");
			fruits2.add("Pera");
			fruits2.add("Cereza");
			fruits2.add("Mandarina");
			fruits2.add("Carambola");
			fruits2.add("Maracuy�");
			fruits2.add("Pl�tano");
			fruits2.add("Mango");
				
			for(String f:fruits2) { //Recorrer� el set y me devolver� los datos.
			System.out.println(f);
			}
			
			int pera = fruits2.indexOf("Pera");//Para buscar elementos
			System.out.println(pera);
			System.out.println(fruits2.get(pera));//Para obtener un elemento espec�fico.
			
			/*int dato primitivo.
			Integer es un objeto
			*/
			
			//LinkedList
			List<String> animals = new LinkedList<String>();
			animals.add("Perro");
			animals.add("Gato");
			animals.add("Conejo");
			animals.add("Tortuga");
			animals.add("Oso");
			animals.add("Quetzal");
			
			int oso = animals.indexOf("Oso");
			animals.add(oso, "Vaca");
			
			for(String an: animals) {
				System.out.println(an);
			}
			/* Interface MAP asocia claves a valores. Tambi�n se les conoce como diccionarios.
			 No puede contener claves duplicadas y cada clave solos puede tener
			 un valor asociado
			 Implementaciones: 
			 * HashMap-
			 * TreeMap- Ordena seg�n las claves
			 * LinkedHashMap- Ordena seg�n la inserci�n de los datos*/
			
			/*-----------------------------------------------*/
			/*Hashmap: Mejor rendimiento, pero no garantiza ning�n orden */
			Map<String, String> diccionario = new HashMap();
			diccionario.put("elemento1", "Carlos Eduardo");
			diccionario.put("tel�fono", "121212");
			diccionario.put("�ndice", "lsldkds");
			
			System.out.println(diccionario.get("elemento1"));
			
			/*Con list o arreglos accedemos a un elemento a trav�s de un �ndice num�rico, por ejemplo en get se accede a trav�s de la posici�n.
			En Map tenemos pares de clave y valor. ("elemento1"=clave y "Carlos Eduardo"=valor)
			L�nea125. Para acceder al valor "Carlos Eduardo" debo hacerlo a trav�s de la clave "elemento1".
			*/
			
			for (Map.Entry<String, String> entry: diccionario.entrySet()) {
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
			
			/*-------------------------------------------------
			 Implementaci�n TreeMap
			 Ordena los elementos de menor a mayor dependiendo de las claves*/
			Map<String, String> diccionario2 = new HashMap();
			diccionario.put("elemento1", "Carlos Eduardo");
			diccionario.put("tel�fono", "121212");
			diccionario.put("�ndice", "lsldkds");
			
			
			/*-----------------------------------------------------
			 * Implementaci�n LINKEDHASHMAP
			 *Guarda por orden de inserci�n*/
			
			
			
	}
			
}

