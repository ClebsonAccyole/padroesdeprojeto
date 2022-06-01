package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregui�oso".
 * @author ClebsonAccyole
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	//para garantir que ninguem vai instaciar externamente � s� criar um construtor privado.
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
