import java.util.*; 

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*La colección SET no puede contener elementos duplicados.
		 Solo tiene los métodos heredados de Colection.
		 Existen diferentes tipos de implementaciones: 
		 HashSet: Esta implementación almacena los elementos en una tabala hash.
		 Es la que mejor rendimiento tiene.
		 Los elementos no tienen un orden.
		 Implementaciones de colección set son: TreeSet y LinkHashSet, además de HashSet*/
		
		/*Set <String> fruits = new HashSet();//Declaro la colección set
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuyá");
		fruits.add("Plátano");
		
		for(String fruit:fruits) { //Recorrerá el set y me devolverá una fruta.
			System.out.println(fruit);*/
			/*---------------------------------------------*/
		
		/*TreeSeet es la implementación más lenta y arroja los datos ordenados
		de manera alfabética y en el caso de los números de mayor a menor*/
			
		/*Set <String> fruits = new TreeSet();//Declaro la colección set con implementación TreeSet.No olvidar hacer las importaciones.
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuyá");
		fruits.add("Plátano");
			
		for(String fruit:fruits) { //Recorrerá el set y me devolverá los datos.
		System.out.println(fruit);
		System.out.println(fruits.contains("Guayaba")); //Para preguntar por la existencia de equis fruta.
		*/
			/*---------------------------------------------*/
	
		/*LinkHashSet nos mostrará los datos según fueron ingresados*/
		
		/*Set <String> fruits = new LinkedHashSet(); //Declaro la colección set con implementación LinkHashSet.
		fruits.add("Mango");
		fruits.add("Manzana");
		fruits.add("Durazno");
		fruits.add("Pera");
		fruits.add("Cereza");
		fruits.add("Mandarina");
		fruits.add("Carambola");
		fruits.add("Maracuyá");
		fruits.add("Plátano");
	
		for(String fruit:fruits) { //Recorrerá el set y me devolverá los datos.
		System.out.println(fruit);
		*/
	
			/*La interface LIST define una sucesión de elementos.
			 * Sí admite elementos duplicados
			 * Añade nuevos métodos que podemos usar
			 * Acceso posicional a elementos: Manipula elementos en función de su posición en la lista.
			 * Búsqueda de elementos: Busca un elemento concreto de la lista y devuelve su posición.
			 * Rango de operación:Permite realizar ciertas operaciones sobre rangos de elementos dentro de la propia lista*/
			
			List<String> fruits2 = new ArrayList();
			fruits2.add("Mango");
			fruits2.add("Manzana");
			fruits2.add("Durazno");
			fruits2.add("Pera");
			fruits2.add("Cereza");
			fruits2.add("Mandarina");
			fruits2.add("Carambola");
			fruits2.add("Maracuyá");
			fruits2.add("Plátano");
			fruits2.add("Mango");
				
			for(String f:fruits2) { //Recorrerá el set y me devolverá los datos.
			System.out.println(f);
			}
			
			int pera = fruits2.indexOf("Pera");//Para buscar elementos
			System.out.println(pera);
			System.out.println(fruits2.get(pera));//Para obtener un elemento específico.
			
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
			/* Interface MAP asocia claves a valores. También se les conoce como diccionarios.
			 No puede contener claves duplicadas y cada clave solos puede tener
			 un valor asociado
			 Implementaciones: 
			 * HashMap-
			 * TreeMap- Ordena según las claves
			 * LinkedHashMap- Ordena según la inserción de los datos*/
			
			/*-----------------------------------------------*/
			/*Hashmap: Mejor rendimiento, pero no garantiza ningún orden */
			Map<String, String> diccionario = new HashMap();
			diccionario.put("elemento1", "Carlos Eduardo");
			diccionario.put("teléfono", "121212");
			diccionario.put("índice", "lsldkds");
			
			System.out.println(diccionario.get("elemento1"));
			
			/*Con list o arreglos accedemos a un elemento a través de un índice numérico, por ejemplo en get se accede a través de la posición.
			En Map tenemos pares de clave y valor. ("elemento1"=clave y "Carlos Eduardo"=valor)
			Línea125. Para acceder al valor "Carlos Eduardo" debo hacerlo a través de la clave "elemento1".
			*/
			
			for (Map.Entry<String, String> entry: diccionario.entrySet()) {
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
			
			/*-------------------------------------------------
			 Implementación TreeMap
			 Ordena los elementos de menor a mayor dependiendo de las claves*/
			Map<String, String> diccionario2 = new HashMap();
			diccionario.put("elemento1", "Carlos Eduardo");
			diccionario.put("teléfono", "121212");
			diccionario.put("índice", "lsldkds");
			
			
			/*-----------------------------------------------------
			 * Implementación LINKEDHASHMAP
			 *Guarda por orden de inserción*/
			
			
			
	}
			
}

