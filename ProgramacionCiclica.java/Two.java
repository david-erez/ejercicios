//2. Calcular la suma de los primeros N números naturales.

public class Two {
	
    public static long sumaIterativa(long n) {
		long suma = 0;
		for (long i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}

	public static void main(String[] args) {
		long n = 10; // valor por defecto
	

		System.out.println("calcular la suma de los primeros " + n + " numeros naturales:");
		System.out.println("usando iterativa: " + sumaIterativa(n));
	}
}
