package Tp1;

public class Ejercicio01 {

	public static float promedioArrayInt (int[] array)
		{
			int i=0, suma=0, cant=array.length;
			while(i<cant)
			{
				suma = suma + array[i];
				i++;
			}
			return (float)suma/(float)cant;

		}
		public static float promedioArrayFloat (float[] array)
		{
			int i=0, cant=array.length;
			float suma=0;
			while(i<cant)
			{
				suma = suma + array[i];
				i++;
			}
			return (float)suma/(float)cant;
	}

		public static void main(String[] args) {
			int[] arreglo = { 1, 2, 3, 4, 5 };
			float prom = promedioArrayInt(arreglo);
			System.out.println("Promedio del total del arreglo :"+prom);}
		
}

