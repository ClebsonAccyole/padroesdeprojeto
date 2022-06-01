package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * @author ClebsonAccyole
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	//para garantir que ninguem vai instaciar externamente é só criar um construtor privado.
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
